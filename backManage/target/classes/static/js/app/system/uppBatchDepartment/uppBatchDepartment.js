$(function() {
	var setting = {
        id: 'departmentId',
        code: 'departmentId',
        url: ctx + 'uppBatchDepartment/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
       queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                departmentId: $(".dayUppBatchDepartment-table-form").find("input[name='departmentId']").val().trim()
                
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '通道Id',
                field: 'departmentId'
            },
            {
                title: '创建时间',
                field: 'gmtCreate'
            },
            {
                title: '修改时间',
                field: 'gmtModified'
            },
            {
                title: '通道名称',
                field: 'departmentName'
            },
            {
                title: '通道状态',
                field: 'departmentStatus',
                formatter: function (value, row, index) {
                    if (value === '0') return '开启';
                    else if (value === '1') return '关闭';
                    else return '';
                }
            },
            {
                title: '机构类型',
                field: 'departmentType'
            },
            {
                title: '记录下一清算日期',
                field: 'departmentNextdate'
            },
            {
                title: '清算日期',
                field: 'departmentDate'
            },
            {
                title: '清算标识',
                field: 'sett23flag',
                formatter: function (value, row, index) {
                    if (value === '1') return '是';
                    else if (value === '0') return '否';
                    else return '';
                }
            },
            {
                title: '客户签约',
                field: 'isSign',
                formatter: function (value, row, index) {
                    if (value === '1') return '需要';
                    else if (value === '0') return '不需要';
                    else return '';
                }
            },
            {
                title: '通道类型',
                field: 'transType'
            },
            
        ]
    };

    $MB.initTable('dayUppBatchDepartmentTable', setting);
	$MB.calenders('input[name="departmentNextdate"]', false, false, true);
	$MB.calenders('input[name="departmentDate"]', false, false, true);
});

function search() {
	$MB.refreshTable('dayUppBatchDepartmentTable');
}

function refresh() {
    $(".dayUppBatchDepartment-table-form")[0].reset();
    search();
}

function deleteScore() {
    var ids = $("#dayUppBatchDepartmentTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的项目信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中项目信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'uppBatchDepartment/delete', { "departmentId": ids[0].departmentId }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
$(function() {
	var setting = {
        id: 'bpDepartmentid',
        code: 'bpDepartmentid',
        url: ctx + 'uppBatchctrl/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
       queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                bpDepartmentid: $(".dayUppBatchctrl-table-form").find("input[name='bpDepartmentid']").val().trim()
                
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '机构编号',
                field: 'bpDepartmentid'
            },
            {
                title: '模值',
                field: 'shardingKey'
            },
            {
                title: '清算日期',
                field: 'bpCleardate'
            },
            {
                title: '步骤',
                field: 'bpPhase'
            },
            {
                title: '状态',
                field: 'bpStatus',
                formatter: function (value, row, index) {
                    if (value === 'S') return '开启';
                    else if (value === 'E') return '关闭';
                    else return '';
                }
            },
            {
                title: '创建时间',
                field: 'gmtCreate'
            },
            {
                title: '修改时间',
                field: 'gmtModified'
            }
        ]
    };

    $MB.initTable('dayUppBatchctrlTable', setting);
	$MB.calenders('input[name="gmtModified"]', false, false, true);
	$MB.calenders('input[name="bpCleardate"]', false, false, true);
});

function search() {
	$MB.refreshTable('dayUppBatchctrlTable');
}

function refresh() {
    $(".dayUppBatchctrl-table-form")[0].reset();
    search();
}

function deleteScore() {
    var ids = $("#dayUppBatchctrlTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的项目信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中项目信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'uppBatchctrl/delete', { "bpDepartmentid": ids[0].bpDepartmentid,"shardingKey": ids[0].shardingKey }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
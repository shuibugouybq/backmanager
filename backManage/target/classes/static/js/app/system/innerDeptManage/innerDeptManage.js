$(function() {
	var setting = {
        id: 'deptnbr',
        code: 'deptnbr',
        url: ctx + 'innerDeptManage/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                deptnbr: $(".innerDeptManage-table-form").find("input[name='deptnbr']").val().trim(),
                deptname: $(".innerDeptManage-table-form").find("input[name='deptname']").val().trim()

            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '机构号',
                field: 'deptnbr'
            },
            {
                title: '机构名称',
                field: 'deptname'
            },
            {
                title: '机构级别',
                field: 'deptlevel'
            },
            {
                title: '上级部门',
                field: 'superdeptnbr'
            },
            {
                title: '打开日期',
                field: 'opendate',
            },
            {
                title: '打开人员编号',
                field: 'openusernbr',
            },
            {
                title: '关闭日期',
                field: 'closedate'
            },
            {
                title: '关闭人员编号',
                field: 'closeusernbr',
            },
            {
                title: '修改日期',
                field: 'modifydate',
            },
            {
                title: '修改人编号',
                field: 'modifyusernbr',
            },
            {
                title: '部门状态',
                field: 'deptstatus',
            }
        ]
    };

    $MB.initTable('innerDeptManageTable', setting);
});

function search() {
	$MB.refreshTable('innerDeptManageTable');
}

function refresh() {
    $(".innerDeptManage-table-form")[0].reset();
    search();
}

function deleteInnerDeptManages() {
    var ids = $("#innerDeptManageTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的机构信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中机构信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'innerDeptManage/delete', { "deptnbr": ids[0].deptnbr,"deptname": ids[0].deptname }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
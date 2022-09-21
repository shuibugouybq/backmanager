$(function() {
	var setting = {
        id: 'busDepartmentid',
        code: 'busDepartmentid',
        url: ctx + 'uppBatchBussetting/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                busDepartmentid: $(".uppBatchBussetting-table-form").find("input[name='busDepartmentid']").val().trim(),
                shardingKey: $(".uppBatchBussetting-table-form").find("input[name='shardingKey']").val().trim()
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '通道编号',
                field: 'busDepartmentid'
            },
            {
                title: '模值',
                field: 'shardingKey'
            },
            {
                title: '前一清算日期',
                field: 'busPrecleardate'
            },
            {
                title: '清算日期',
                field: 'busCleardate'
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

    $MB.initTable('uppBatchBussettingTable', setting);
});

function search() {
	$MB.refreshTable('uppBatchBussettingTable');
}

function refresh() {
    $(".uppBatchBussetting-table-form")[0].reset();
    search();
}

function deleteUppBatchBussettings() {
    var ids = $("#uppBatchBussettingTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的业务参数信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中业务参数信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'uppBatchBussetting/delete', { "busDepartmentid": ids[0].busDepartmentid,"shardingKey": ids[0].shardingKey }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
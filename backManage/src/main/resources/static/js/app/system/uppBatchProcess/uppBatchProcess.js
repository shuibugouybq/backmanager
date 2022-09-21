$(function() {
	var setting = {
        id: 'departmentId',
        code: 'departmentId',
        url: ctx + 'uppBatchProcess/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                departmentId: $(".uppBatchProcess-table-form").find("input[name='departmentId']").val().trim(),
                shardingKey: $(".uppBatchProcess-table-form").find("input[name='shardingKey']").val().trim()
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '通道号',
                field: 'departmentId'
            },
            {
                title: '分库分表的值',
                field: 'shardingKey'
            },
            {
                title: '状态',
                field: 'bpStatus',
                formatter: function (value, row, index) {
                    if (value === '0') return '待清算';
                    else if (value === '1') return '清算完成';
                    else if (value === '2') return '清算异常';
                    else if (value === '3') return '清算完成';
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

    $MB.initTable('uppBatchProcessTable', setting);
});

function search() {
	$MB.refreshTable('uppBatchProcessTable');
}

function refresh() {
    $(".uppBatchProcess-table-form")[0].reset();
    search();
}

function deleteUppBatchProcesss() {
    var ids = $("#uppBatchProcessTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的进程控制信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中进程控制信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'uppBatchProcess/delete', { "departmentId": ids[0].departmentId,"shardingKey": ids[0].shardingKey }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
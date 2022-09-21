$(function() {
	var setting = {
        id: 'transSettseqno',
        code: 'transSettseqno',
        url: ctx + 'uppBatchFeeSett/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                beginDate: $(".uppBatchFeeSett-table-form").find("input[name='beginDate']").val().trim(),
                endDate: $(".uppBatchFeeSett-table-form").find("input[name='endDate']").val().trim()
            };
        },
        columns: [
            {
                title: '流水号',
                field: 'transSettseqno'
            },
            {
                title: '模值',
                field: 'shardingKey'
            },
            {
                title: '结算日期',
                field: 'transCleardate'
            },
            {
                title: '结算状态',
                field: 'transSettstatus'
            },
            {
                title: '付款账号',
                field: 'transPayacctno'
            },
            {
                title: '付款账号名称',
                field: 'transPayacctname'
            },
            {
                title: '收款账号',
                field: 'transRcvacctno'
            },
            {
                title: '收款账号名称',
                field: 'transRcvacctname'
            },
            {
                title: '金额',
                field: 'transAmt'
            },
            {
                title: '对账状态',
                field: 'transCheckstatus'
            },
            {
                title: '收取方式',
                field: 'sendFlag'
            }
        ]
    };

    $MB.initTable('uppBatchFeeSettTable', setting);
    $MB.calenders('input[name="beginDate"]', false, false);
    $MB.calenders('input[name="endDate"]', false, false);
});

function search() {
	$MB.refreshTable('uppBatchFeeSettTable');
}

function refresh() {
    $(".uppBatchFeeSett-table-form")[0].reset();
    search();
}
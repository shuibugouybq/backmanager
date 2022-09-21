$(function() {
	var setting = {
        id: 'feeSeqno',
        code: 'feeSeqno',
        url: ctx + 'uppBatchFeeTrans/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                transMerseqno: $(".uppBatchFeeTrans-table-form").find("input[name='transMerseqno']").val().trim(),
                merId: $(".uppBatchFeeTrans-table-form").find("input[name='merId']").val().trim(),
                beginDate: $(".uppBatchFeeTrans-table-form").find("input[name='beginDate']").val().trim(),
                endDate: $(".uppBatchFeeTrans-table-form").find("input[name='endDate']").val().trim()
            };
        },
        columns: [
            {
                title: '流水号',
                field: 'feeSeqno'
            },
            {
                title: '模值',
                field: 'shardingKey'
            },
            {
                title: '结算日期',
                field: 'transSettdate'
            },
            {
                title: '订单号',
                field: 'transMerseqno'
            },
            {
                title: '商户号',
                field: 'merId'
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
                title: '状态',
                field: 'transSettStatus'
            },
            {
                title: '手续方式',
                field: 'sendFlag'
            }
        ]
    };

    $MB.initTable('uppBatchFeeTransTable', setting);
    $MB.calenders('input[name="beginDate"]', false, false);
    $MB.calenders('input[name="endDate"]', false, false);
});

function search() {
	$MB.refreshTable('uppBatchFeeTransTable');
}

function refresh() {
    $(".uppBatchFeeTrans-table-form")[0].reset();
    search();
}
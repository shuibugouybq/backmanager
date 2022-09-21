$(function() {
	var setting = {
        id: 'transSeqno',
        code: 'transSeqno',
        url: ctx + 'uppBatchMerTrans/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                merId: $(".uppBatchMerTrans-table-form").find("input[name='merId']").val().trim(),
                transMerseqno: $(".uppBatchMerTrans-table-form").find("input[name='transMerseqno']").val().trim(),
                beginDate: $(".uppBatchMerTrans-table-form").find("input[name='beginDate']").val().trim(),
                endDate: $(".uppBatchMerTrans-table-form").find("input[name='endDate']").val().trim()
            };
        },
        columns: [
            {
                title: '流水号',
                field: 'transSeqno'
            },
            {
                title: '模值',
                field: 'shardingKey'
            },
            {
                title: '清算日期',
                field: 'transCleardate'
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
                title: '台账类型',
                field: 'transMeraccttype'
            }
        ]
    };

    $MB.initTable('uppBatchMerTransTable', setting);
    $MB.calenders('input[name="beginDate"]', false, false);
    $MB.calenders('input[name="endDate"]', false, false);
});

function search() {
	$MB.refreshTable('uppBatchMerTransTable');
}

function refresh() {
    $(".uppBatchMerTrans-table-form")[0].reset();
    search();
}
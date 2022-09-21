$(function() {
	var setting = {
        id: 'feeSeqno',
        code: 'feeSeqno',
        url: ctx + 'uppMarketingOrder/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                transSeqno: $(".uppMarketingOrder-table-form").find("input[name='transSeqno']").val().trim(),
                merId: $(".uppMarketingOrder-table-form").find("input[name='merId']").val().trim(),
                beginDate: $(".uppMarketingOrder-table-form").find("input[name='beginDate']").val().trim(),
                endDate: $(".uppMarketingOrder-table-form").find("input[name='endDate']").val().trim()
            };
        },
        columns: [
            {
                title: '原支付流水',
                field: 'transSeqno'
            },
            {
                title: '支付类型',
                field: 'transMeraccttype'
            },
            {
                title: '清算日期',
                field: 'transCleardate'
            },
            {
                title: '交易日期',
                field: 'transDate'
            },
            {
                title: '商户流水',
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
                title: '抵扣金额',
                field: 'pointAmt'
            },
            {
                title: '抵扣数',
                field: 'pointNo'
            },
            {
                title: '营销通道',
                field: 'pointChannel'
            },
            {
                title: '交易状态',
                field: 'transStatus'
            },
            {
                title: '结算步骤',
                field: 'transStep'
            },
            {
                title: '清结算状态',
                field: 'transProcstatus'
            }
        ]
    };

    $MB.initTable('uppMarketingOrderTable', setting);
    $MB.calenders('input[name="beginDate"]', false, false);
    $MB.calenders('input[name="endDate"]', false, false);
});

function search() {
	$MB.refreshTable('uppMarketingOrderTable');
}

function refresh() {
    $(".uppMarketingOrder-table-form")[0].reset();
    search();
}
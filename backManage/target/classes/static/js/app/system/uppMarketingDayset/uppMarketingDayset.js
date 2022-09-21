$(function() {
	var setting = {
        id: 'feeSeqno',
        code: 'feeSeqno',
        url: ctx + 'uppMarketingDayset/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                transSettseqno: $(".uppMarketingDayset-table-form").find("input[name='transSettseqno']").val().trim()
            };
        },
        columns: [
            {
                title: '结算流水',
                field: 'transSettseqno'
            },
            {
                title: '清算日期',
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
                title: '收款账号',
                field: 'transRcvacctno'
            },
            {
                title: '抵扣金额',
                field: 'transAmt'
            },
            {
                title: '营销渠道',
                field: 'pointChannel'
            },
            {
                title: '付款账户名',
                field: 'transPayacctname'
            },
            {
                title: '收款账户名',
                field: 'transRcvacctname'
            }
        ]
    };

    $MB.initTable('uppMarketingDaysetTable', setting);
});

function search() {
	$MB.refreshTable('uppMarketingDaysetTable');
}

function refresh() {
    $(".uppMarketingDayset-table-form")[0].reset();
    search();
}
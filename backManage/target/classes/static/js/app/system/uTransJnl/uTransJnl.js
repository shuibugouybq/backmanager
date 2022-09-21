$(function() {
	var setting = {
        id: 'seqNo',
        code: 'seqNo',
        url: ctx + 'uTransJnl/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                seqNo: $(".uTransJnl-table-form").find("input[name='seqNo']").val().trim(),
                merId: $(".uTransJnl-table-form").find("input[name='merId']").val().trim(),
                beginDate: $(".uTransJnl-table-form").find("input[name='beginDate']").val().trim(),
                endDate: $(".uTransJnl-table-form").find("input[name='endDate']").val().trim()
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '平台流水号',
                field: 'seqNo'
            },
            {
                title: '商户号',
                field: 'merId'
            },
            {
                title: '交易日期',
                field: 'transDate'
            },
            {
                title: '交易时间',
                field: 'transTime'
            },
            {
                title: '交易类型',
                field: 'trxTp'
            },
            {
                title: '金额',
                field: 'trxAmt'
            },
            {
                title: '收款账户号',
                field: 'rcverAcctId'
            },
            {
                title: '收款账户名称',
                field: 'rcverNm'
            },
            {
                title: '交易状态',
                field: 'trxStatus'
            }
        ],
        onDblClickRow: function(row,$el){
        	uTransJnlDetail(new Array(row));
        }
    };

    $MB.initTable('uTransJnlTable', setting);
    $MB.calenders('input[name="beginDate"]', false, false);
    $MB.calenders('input[name="endDate"]', false, false);
});

function search() {
	$MB.refreshTable('uTransJnlTable');
}

function refresh() {
    $(".uTransJnl-table-form")[0].reset();
    search();
}
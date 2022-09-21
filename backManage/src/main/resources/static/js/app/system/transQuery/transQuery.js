$(function() {
	var setting = {
        id: 'transSeqNo',
        code: 'transSeqNo',
        url: ctx + 'transQuery/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                transSeqNo: $(".transQuery-table-form").find("input[name='transSeqNo']").val().trim(),
                transMerSeqNo: $(".transQuery-table-form").find("input[name='transMerSeqNo']").val().trim(),
                merId: $(".transQuery-table-form").find("input[name='merId']").val().trim(),
                beginDate: $(".transQuery-table-form").find("input[name='beginDate']").val().trim(),
                endDate: $(".transQuery-table-form").find("input[name='endDate']").val().trim()
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '支付平台流水号',
                field: 'transSeqNo'
            },
            {
                title: '商户交易流水号',
                field: 'transMerSeqNo'
            },
            {
                title: '商户号',
                field: 'merId'
            },
            {
                title: '收款账户',
                field: 'transRcvAcctNo'
            },
            {
                title: '付款账户',
                field: 'userAcctNo'
            },
            {
                title: '渠道编号',
                field: 'fundChannel',
                formatter: function (value, row, index) {
                    if (value === '01') return 'pc';
                    else if (value === '02') return 'wap';
                    else if (value === '03') return 'app';
                    else return '';
                }
            },
            {
                title: '平台交易时间',
                field: 'transDateTime'
            },
            {
                title: '商户交易时间',
                field: 'transMerDateTime'
            },
            {
                title: '清算日期',
                field: 'transClearDate'
            },
            {
                title: '交易类型',
                field: 'transType',
                formatter: function (value, row, index) {
                    if (value === '00') return '支付';
                    else if (value === '01') return '退货';
                    else if (value === '02') return '提现';
                    else if (value === '03') return '代收';
                    else return '';
                }
            },
            {
                title: '交易状态',
                field: 'transStatus'
            },
            {
                title: '清算状态',
                field: 'fundChannel'
            },
            {
                title: '清算步骤',
                field: 'transStep'
            },
            {
                title: '交易金额',
                field: 'transAmt'
            }
        ],
        onDblClickRow: function(row,$el){
        	transQueryDetail(new Array(row));
        }
    };

    $MB.initTable('transQueryTable', setting);
    $MB.calenders('input[name="beginDate"]', false, false);
    $MB.calenders('input[name="endDate"]', false, false);
});

function search() {
	$MB.refreshTable('transQueryTable');
}

function refresh() {
    $(".transQuery-table-form")[0].reset();
    search();
}
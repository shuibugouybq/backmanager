$(function() {
	var setting = {
        id: 'transSeqNo',
        code: 'transSeqNo',
        url: ctx + 'cusTransDetail/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                accNoTemp: $(".cusTransDetail-table-form").find("input[name='accNoTemp']").val().trim(),
                beginDate: $(".cusTransDetail-table-form").find("input[name='beginDate']").val().trim(),
                endDate: $(".cusTransDetail-table-form").find("input[name='endDate']").val().trim()
            };
        },
        columns: [
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
                title: '平台交易时间',
                field: 'transDateTime'
            },
            {
                title: '商户交易时间',
                field: 'transMerDateTime'
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
                title: '交易金额',
                field: 'transAmt'
            }
        ]
    };

    $MB.initTable('cusTransDetailTable', setting);
    var startDate = moment().subtract('months', 1).format('YYYY/MM/DD');
    $MB.calenders('input[name="beginDate"]', false, false, true, startDate);
    $MB.calenders('input[name="endDate"]', false, false, true);
});

function search() {
	var beginDate = $(".cusTransDetail-table-form").find("input[name='beginDate']").val().trim();
    var endDate = $(".cusTransDetail-table-form").find("input[name='endDate']").val().trim();
    var tempDate = moment(beginDate).add(3, 'months');
    if(tempDate.isBefore(endDate)){
		$MB.n_warning('请查询三个月间交易记录！');
		return;
    }
	$MB.refreshTable('cusTransDetailTable');
}

function refresh() {
    $(".cusTransDetail-table-form")[0].reset();
    search();
}
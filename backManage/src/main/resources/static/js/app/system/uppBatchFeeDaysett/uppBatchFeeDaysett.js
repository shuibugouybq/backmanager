$(function() {
	var setting = {
        id: 'transSettseqno',
        code: 'transSettseqno',
        url: ctx + 'uppBatchFeeDaysett/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                beginDate: $(".uppBatchFeeDaysett-table-form").find("input[name='beginDate']").val().trim(),
                endDate: $(".uppBatchFeeDaysett-table-form").find("input[name='endDate']").val().trim()
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
                title: '付款账户名称',
                field: 'transPayacctname'
            },
            {
                title: '收款账号',
                field: 'transRcvacctno'
            },
            {
                title: '收款账户名称',
                field: 'transRcvacctname'
            },
            {
                title: '金额',
                field: 'transAmt'
            },
            {
                title: '提取类型',
                field: 'sendFlag'
            },
            {
                title: '台账类型',
                field: 'transMeraccttype'
            }
        ]
    };

    $MB.initTable('uppBatchFeeDaysettTable', setting);
    $MB.calenders('input[name="beginDate"]', false, false);
    $MB.calenders('input[name="endDate"]', false, false);
});

function search() {
	$MB.refreshTable('uppBatchFeeDaysettTable');
}

function refresh() {
    $(".uppBatchFeeDaysett-table-form")[0].reset();
    search();
}
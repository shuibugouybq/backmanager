$(function() {
	var setting = {
        id: 'transSeqno',
        code: 'transSeqno',
        url: ctx + 'uppBatchHostTrans/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                transSeqno: $(".uppBatchHostTrans-table-form").find("input[name='transSeqno']").val().trim(),
                transPayAcctNo: $(".uppBatchHostTrans-table-form").find("input[name='transPayAcctNo']").val().trim(),
                transRcvAcctNo: $(".uppBatchHostTrans-table-form").find("input[name='transRcvAcctNo']").val().trim(),
                transHostDate: $(".uppBatchHostTrans-table-form").find("input[name='transHostDate']").val().trim(),
                transStatus: $(".uppBatchHostTrans-table-form").find("input[name='transStatus']").val().trim()
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '平台流水',
                field: 'transSeqno'
            },
            {
                title: '付款账号',
                field: 'transPayAcctNo'
            },
            {
                title: '收款账号',
                field: 'transRcvAcctNo'
            },
            {
                title: '交易金额',
                field: 'transAmt'
            },
            {
                title: '对账状态',
                field: 'transCheckStatus',
            },
            {
                title: '通道号',
                field: 'departmentId',
            },
            {
                title: '通道流水',
                field: 'transHostSeqno',
            },
            {
                title: '通道日期',
                field: 'transHostDate',
            },
            {
                title: '状态',
                field: 'transStatus',
            }
        ]
    };

    $MB.initTable('uppBatchHostTransTable', setting);
});

function search() {
	$MB.refreshTable('uppBatchHostTransTable');
}

function refresh() {
    $(".uppBatchHostTrans-table-form")[0].reset();
    search();
}


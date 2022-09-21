$(function() {
	var setting = {
        id: 'parentMerchantId',
        code: 'parentMerchantId',
        url: ctx + 'subOrder/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                parentMerchantId: $(".subOrder-table-form").find("input[name='parentMerchantId']").val().trim(),
                orderNo: $(".subOrder-table-form").find("input[name='orderNo']").val().trim(),
                transSeqNo: $(".subOrder-table-form").find("input[name='transSeqNo']").val().trim(),
                startOrderDate: $(".subOrder-table-form").find("input[name='startOrderDate']").val().trim(),
                endOrderDate: $(".subOrder-table-form").find("input[name='endOrderDate']").val().trim()
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '商户号',
                field: 'parentMerchantId'
            },
            {
                title: '商户流水号',
                field: 'orderNo'
            },
            {
                title: '订单流水',
                field: 'transSeqNo'
            },
            {
                title: '付款机构号',
                field: 'payerDepartmentId'
            },
            {
                title: '收款机构号',
                field: 'payeeDepartmentId',
            },
            {
                title: '订单状态',
                field: 'transStatus',
            },
            {
                title: '交易日期',
                field: 'orderDate',
            },
            {
                title: '金额',
                field: 'transAmt',
            }
        ]
    };

    $MB.initTable('subOrderTable', setting);
});

function search() {
	$MB.refreshTable('subOrderTable');
}

function refresh() {
    $(".subOrder-table-form")[0].reset();
    search();
}


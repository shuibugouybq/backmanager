$(function() {
	var setting = {
        id: 'merId',
        code: 'merId',
        url: ctx + 'merAccumulatedAmount/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                merId: $(".merAccumulatedAmount-table-form").find("input[name='merId']").val().trim(),
                beginDate: $(".merAccumulatedAmount-table-form").find("input[name='beginDate']").val().trim(),
                endDate: $(".merAccumulatedAmount-table-form").find("input[name='endDate']").val().trim()
            };
        },
        columns: [
            {
                title: '商户号',
                field: 'merId'
            },
            {
                title: '结算日期',
                field: 'merSetdate'
            },
            {
                title: '结算方式',
                field: 'merSetmode'
            },
            {
                title: '累计金额',
                field: 'accumulatedAmount'
            },
            {
                title: '更新日期',
                field: 'modifyDate'
            }
        ]
    };

    $MB.initTable('merAccumulatedAmountTable', setting);
    $MB.calenders('input[name="beginDate"]', false, false);
    $MB.calenders('input[name="endDate"]', false, false);
});

function search() {
	$MB.refreshTable('merAccumulatedAmountTable');
}

function refresh() {
    $(".merAccumulatedAmount-table-form")[0].reset();
    search();
}
$(function() {
	var setting = {
        id: 'userAcctNo',
        code: 'userAcctNo',
        url: ctx + 'userTransctrl/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                userAcctNo: $(".userTransctrl-table-form").find("input[name='userAcctNo']").val().trim(),
                transId: $(".userTransctrl-table-form").find("input[name='transId']").val().trim()
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '客户号',
                field: 'userCifNo'
            },
            {
                title: '账号',
                field: 'userAcctNo'
            },
            {
                title: '交易码',
                field: 'transId'
            },
            {
                title: '单笔限额',
                field: 'usertcPerTransLimit'
            },
            {
                title: '单日限额',
                field: 'usertcPerDayLitmit'
            },
            {
                title: '单日交易额',
                field: 'usertcDayAmt'
            },
            {
                title: '单月限额',
                field: 'usertcPerMonthLimit'
            },
            {
                title: '当月交易金额',
                field: 'usertcMonthAmt'
            },
            {
                title: '年交易限额',
                field: 'usertcPerYearLimit'
            },
            {
                title: '当年交易额',
                field: 'usertcYearAmt'
            }
        ]
    };

    $MB.initTable('userTransctrlTable', setting);
});

function search() {
	$MB.refreshTable('userTransctrlTable');
}

function refresh() {
    $(".userTransctrl-table-form")[0].reset();
    search();
}

function deleteUserTransctrl() {
    var ids = $("#userTransctrlTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的用户交易限额信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中用户交易限额信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'userTransctrl/delete', { "userAcctNo": ids[0].userAcctNo,"transId": ids[0].transId }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
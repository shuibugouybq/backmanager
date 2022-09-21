$(function() {
	var setting = {
        id: 'signId',
        code: 'signId',
        url: ctx + 'customerSign/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                signAcctNo: $(".customerSign-table-form").find("input[name='signAcctNo']").val().trim(),
                userMobile: $(".customerSign-table-form").find("input[name='userMobile']").val().trim()
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '签约编号',
                field: 'token'
            },
            {
                title: '签约状态',
                field: 'signStatus',
                formatter: function (value, row, index) {
                    if (value === '0') return '已签约';
                    else if (value === '1') return '已解约';
                    else if (value === '2') return '预签约';
                    else if (value === '3') return '初始状态';
                    else return '';
                }
            },
            {
                title: '签约名称',
                field: 'signAcctName'
            },
            {
                title: '用户编号',
                field: 'merUserId'
            },
            {
                title: '签约手机号',
                field: 'userMobile'
            },
            {
                title: '签约银行卡号',
                field: 'signAcctNo'
            },
            {
                title: '签约类型',
                field: 'signType',
                formatter: function (value, row, index) {
                    if (value === '00') return '协议支付';
                    else if (value === '02') return '借记转账';
                    else return '';
                }
            },
            {
                title: '签约日期',
                field: 'signDate'
            }
        ]
    };

    $MB.initTable('customerSignTable', setting);
});

function search() {
	$MB.refreshTable('customerSignTable');
}

function refresh() {
    $(".customerSign-table-form")[0].reset();
    search();
}

function deleteCustomerSign() {debugger;
    var ids = $("#customerSignTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的签约信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中签约信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'customerSign/delete', { "merId": ids[0].merId,"signId": ids[0].signId,"signAcctNo": ids[0].signAcctNo }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
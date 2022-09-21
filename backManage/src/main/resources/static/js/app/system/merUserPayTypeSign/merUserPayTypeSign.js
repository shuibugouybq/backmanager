$(function() {
	var setting = {
        id: 'signnbr',
        code: 'signnbr',
        url: ctx + 'merUserPayTypeSign/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                merplatformcd: $(".merUserPayTypeSign-table-form").find("input[name='merplatformcd']").val().trim(),
                usernbr: $(".merUserPayTypeSign-table-form").find("input[name='usernbr']").val().trim(),
                useracctnbr: $(".merUserPayTypeSign-table-form").find("input[name='useracctnbr']").val().trim()
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '签约编号',
                field: 'signnbr'
            },
            {
                title: '签约手机号',
                field: 'signmobile'
            },
            {
                title: '签约状态',
                field: 'signstatus'
            },
            {
                title: '协议编码',
                field: 'signcode'
            },
            {
                title: '协议类型',
                field: 'signtypcd'
            },
            {
            	title: '商户平台号',
            	field: '商户平台号'
            },
            {
            	title: '柜员号',
            	field: 'tellernbr'
            },
            {
            	title: '用户编号',
            	field: 'usernbr'
            },
            {
            	title: '商户客户号',
            	field: 'mercustnbr'
            },
            {
            	title: '用户账号',
            	field: 'useracctnbr'
            },
            {
            	title: '账户性质',
            	field: 'acctkindcd'
            },
            {
            	title: '支付产品',
            	field: 'paytypcd'
            },
            {
            	title: '签约日期',
            	field: 'signdate'
            }
            
        ]
    };

    $MB.initTable('merUserPayTypeSignTable', setting);
});

function search() {
	$MB.refreshTable('merUserPayTypeSignTable');
}

function refresh() {
    $(".merUserPayTypeSign-table-form")[0].reset();
    search();
}

function deleteMerUserPayTypeSigns() {
    var ids = $("#merUserPayTypeSignTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的用户商户平台支付产品签约信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中用户商户平台支付产品签约信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'merUserPayTypeSign/delete', { "channelId": ids[0].channelId }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
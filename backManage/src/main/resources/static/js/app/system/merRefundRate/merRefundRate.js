$(function() {
	var setting = {
        id: 'merId',
        code: 'merId',
        url: ctx + 'merRefundRate/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                merId: $(".merRefundRate-table-form").find("input[name='merId']").val().trim(),
                merType: $(".merRefundRate-table-form").find("input[name='merType']").val().trim(),                
                beginDate: $(".merRefundRate-table-form").find("input[name='beginDate']").val().trim(),
                endDate: $(".merRefundRate-table-form").find("input[name='endDate']").val().trim()
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '商户编号',
                field: 'merId'
            },
            {
                title: '商户名称',
                field: 'merName'
            },
            {
                title: '退单率',
                field: 'refundRate'
            },
            {
                title: '退单笔数',
                field: 'refundNum'
            }
        ]
    };

    $MB.initTable('merRefundRateTable', setting);
    $MB.calenders('input[name="beginDate"]', false, false);
    $MB.calenders('input[name="endDate"]', false, false);
});

function search() {
	$MB.refreshTable('merRefundRateTable');
}

function refresh() {
    $(".merRefundRate-table-form")[0].reset();
    search();
}

/*function deleteChannelLimitCtrls() {
    var ids = $("#channelLimitCtrlTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的通道限额信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中通道限额信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'channelLimitCtrl/delete', { "channelId": ids[0].channelId,"channelType": ids[0].channelType }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}*/
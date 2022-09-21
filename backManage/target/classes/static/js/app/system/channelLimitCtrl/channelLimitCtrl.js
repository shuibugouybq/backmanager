$(function() {
	var setting = {
        id: 'channelId',
        code: 'channelId',
        url: ctx + 'channelLimitCtrl/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                channelId: $(".channelLimitCtrl-table-form").find("select[name='channelId']").val().trim(),
                channelType: $(".channelLimitCtrl-table-form").find("select[name='channelType']").val().trim()

            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '通道号',
                field: 'channelId'
            },
            {
                title: '通道类型',
                field: 'channelType',
            	formatter: function (value, row, index) {
            		return constMap["channelType"][value] || value;
            	}
            },
            {
                title: '单笔限额',
                field: 'perTransLimit'
            },
            {
                title: '日累计',
                field: 'dayTransAmt'
            },
            {
                title: '日限额',
                field: 'dayTransLimitAmt',
            },
            {
                title: '月累计',
                field: 'monthTransAmt',
            },
            {
                title: '月限额',
                field: 'monthTransLimitAmt',
            },
            {
                title: '年限额',
                field: 'yearTransLimitAmt',
            },
            {
                title: '货币',
                field: 'currency',
            }
        ]
    };

    $MB.initTable('channelLimitCtrlTable', setting);
});

function search() {
	$MB.refreshTable('channelLimitCtrlTable');
}

function refresh() {
    $(".channelLimitCtrl-table-form")[0].reset();
    search();
}

function deleteChannelLimitCtrls() {
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
}
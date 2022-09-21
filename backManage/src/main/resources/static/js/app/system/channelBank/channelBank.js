$(function() {
	var setting = {
        id: 'merId',
        code: 'merId',
        url: ctx + 'channelBank/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                bankId: $(".channelBank-table-form").find("input[name='bankId']").val().trim(),
                bankName: $(".channelBank-table-form").find("input[name='bankName']").val().trim()
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '机构编号',
                field: 'bankId'
            },
            {
                title: '机构名称',
                field: 'bankName'
            },
            {
                title: '状态',
                field: 'status'/*,
                formatter: function (value, row, index) {
                    if (value === '1') return '借记卡';
                    else if (value === '2') return '贷记卡';
                    else if (value === '3') return '准贷记卡';
                    else return '预付费卡';
                }*/
            }
        ]
    };

    $MB.initTable('channelBankTable', setting);
});

function search() {
	$MB.refreshTable('channelBankTable');
}

function refresh() {
    $(".channelBank-table-form")[0].reset();
    search();
}

function deletechannelBanks() {
    var ids = $("#channelBankTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的机构信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中机构信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'channelBank/delete', { "bankId": ids[0].bankId }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
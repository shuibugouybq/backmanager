$(function() {
	var setting = {
        id: 'channelId',
        code: 'channelId',
        url: ctx + 'channelBankSupport/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                channelId: $(".channelBankSupport-table-form").find("select[name='channelId']").val().trim(),
                channelType: $(".channelBankSupport-table-form").find("select[name='channelType']").val().trim(),
                bankId: $(".channelBankSupport-table-form").find("input[name='bankId']").val().trim()
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '渠道编号',
                field: 'channelId'
            },
            {
                title: '通道业务',
                field: 'channelType',
            	formatter: function (value, row, index) {
            		return constMap["channelType"][value] || value;
            	}
            },
            {
                title: '银行编号',
                field: 'bankId'
            },
            {
                title: '联行号',
                field: 'cnaps'
            },
            {
                title: '卡类型',
                field: 'cardTypeSupported',
                formatter: function (value, row, index) {
                    if (value === '1') return '借记卡';
                    else if (value === '2') return '贷记卡';
                    else if (value === '3') return '准贷记卡';
                    else return '预付费卡';
                }
            },
            {
            	title: '单日限额',
            	field: 'dayLimit'
            },
            {
            	title: '单笔限额',
            	field: 'perLimit'
            },
            {
            	title: '年限额',
            	field: 'yearLimit'
            },
            {
            	title: '状态',
            	field: 'openFlag'
            }
        ]
    };

    $MB.initTable('channelBankSupportTable', setting);
});

function search() {
	$MB.refreshTable('channelBankSupportTable');
}

function refresh() {
    $(".channelBankSupport-table-form")[0].reset();
    search();
}

function deleteChannelBankSupports() {
    var ids = $("#channelBankSupportTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的通道支持银行信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中通道支持银行信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'channelBankSupport/delete', { "channelId": ids[0].channelId,"channelType": ids[0].channelType,"bankId": ids[0].bankId }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
$(function() {
	var setting = {
        id: 'channelId',
        code: 'channelId',
        url: ctx + 'channelMerchant/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                merId: $(".channelMerchant-table-form").find("input[name='merId']").val().trim(),
                bankId: $(".channelMerchant-table-form").find("input[name='bankId']").val().trim()
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
                title: '银行号',
                field: 'bankId'
            },
            {
                title: '商户状态',
                field: 'merStatus',
                formatter: function (value, row, index) {
                    if (value === '0') return '正常';
                    else if (value === '1') return '冻结';
                    else if (value === '2') return '销户';
                    else return '';
                }
            },
            {
                title: '指定路由的编码',
                field: 'channelId'
            },
            {
                title: '指定通道业务',
                field: 'channelType',
            	formatter: function (value, row, index) {
            		return constMap["channelType"][value] || value;
            	}
            }
        ]
    };

    $MB.initTable('channelMerchantTable', setting);
});

function search() {
	$MB.refreshTable('channelMerchantTable');
}

function refresh() {
    $(".channelMerchant-table-form")[0].reset();
    search();
}

function deleteChannelMerchants() {
    var ids = $("#channelMerchantTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的指定通道信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中指定通道信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'channelMerchant/delete', { "merId": ids[0].merId, "bankId": ids[0].bankId }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
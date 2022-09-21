$(function() {
	var setting = {
        id: 'channelId',
        code: 'channelId',
        url: ctx + 'channelPayType/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
       queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                channelId: $(".dayFractions-table-form").find("select[name='channelId']").val().trim()
                
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
                title: '通道业务',
                field: 'channelType',
            	formatter: function (value, row, index) {
            		return constMap["channelType"][value] || value;
            	}
            },
            {
                title: '通道业务名称',
                field: 'channelName'
            },
            {
                title: '通道开放起始时间',
                field: 'channelBeginTime'
            },
            {
                title: '通道开放结束时间',
                field: 'channelEndTime'
            },
            {
                title: '支持银行卡类型',
                field: 'cardType'
            },
            {
                title: '支持的地区',
                field: 'area'
            },
            {
                title: '优先级',
                field: 'priority'
            },
            {
                title: '支持银行列表 ',
                field: 'bankList',
                formatter: function (value, row, index) {
            		return channelBankMap[value] || value;
            	}
            }
        ]
    };

    $MB.initTable('dayChannelPayTypeTable', setting);
	$MB.calenders('input[name="channelBeginTime"]', false, false, true);
	$MB.calenders('input[name="channelEndTime"]', false, false, true);
});

function search() {
	$MB.refreshTable('dayChannelPayTypeTable');
}

function refresh() {
    $(".dayFractions-table-form")[0].reset();
    search();
}

function deleteFractions() {
    var ids = $("#dayChannelPayTypeTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的通道限额信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中通道限额信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'channelPayType/delete', { "channelId": ids[0].channelId }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
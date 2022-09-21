$(function() {
	var setting = {
        id: 'marketActiveID',
        code: 'marketActiveID',
        url: ctx + 'marketactivectrl/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                marketActiveID: $(".marketactivectrl-table-form").find("input[name='marketActiveID']").val().trim(),
                userCardTypCd: $(".marketactivectrl-table-form").find("input[name='userCardTypCd']").val().trim(),
                /*cardRank: $(".marketactivectrl-table-form").find("input[name='cardRank']").val().trim(),*/
                payProduct: $(".marketactivectrl-table-form").find("input[name='payProduct']").val().trim(),
                /*channelNBR: $(".marketactivectrl-table-form").find("input[name='channelNBR']").val().trim()*/

            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '营销活动ID',
                field: 'marketActiveID'
            },
            {
                title: '用户卡类型',
                field: 'userCardTypCd'
            },
            {
                title: '卡等级',
                field: 'cardRank'
            },
            {
                title: '支付产品',
                field: 'payProduct'
            },
            {
                title: '渠道',
                field: 'channelNBR',
            }
        ]
    };

    $MB.initTable('marketactivectrlTable', setting);
});

function search() {
	$MB.refreshTable('marketactivectrlTable');
}

function refresh() {
    $(".marketactivectrl-table-form")[0].reset();
    search();
}

function deleteMarketactivectrls() {
    var ids = $("#marketactivectrlTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的营销控制信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中营销控制信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'marketactivectrl/delete', { "marketActiveID": ids[0].marketActiveID,
        	                                      "userCardTypCd": ids[0].userCardTypCd,
        	                                      "cardRank": ids[0].cardRank,
        	                                      "payProduct": ids[0].payProduct,
        	                                      "channelNBR": ids[0].channelNBR }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
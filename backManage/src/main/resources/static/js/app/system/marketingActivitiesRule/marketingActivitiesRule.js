$(function() {
	var setting = {
        id: 'marketActiveID',
        code: 'marketActiveID',
        url: ctx + 'marketingActivitiesRule/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                marketActiveID: $(".marketingActivitiesRule-table-form").find("input[name='marketActiveID']").val().trim(),
                merNBR: $(".marketingActivitiesRule-table-form").find("input[name='merNBR']").val().trim(),
                marketActiveType: $(".marketingActivitiesRule-table-form").find("input[name='marketActiveType']").val().trim(),
                marketActivesStartDate: $(".marketingActivitiesRule-table-form").find("input[name='marketActivesStartDate']").val().trim(),
                marketActivesEndDate: $(".marketingActivitiesRule-table-form").find("input[name='marketActivesEndDate']").val().trim()

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
                title: '商户号',
                field: 'merNBR'
            },
            {
                title: '门店号',
                field: 'shopNumber'
            },
            {
                title: '商品号',
                field: 'productId'
            },
            {
                title: '营销活动名称',
                field: 'marketActiveName',
            },
            {
                title: '营销活动类型',
                field: 'marketActiveType',
            },
            {
                title: '营销活动开始时间',
                field: 'marketActivesStartDate'
            },
            {
                title: '营销活动结束时间',
                field: 'marketActivesEndDate',
            }
        ]
    };

    $MB.initTable('marketingActivitiesRuleTable', setting);
});

function search() {
	$MB.refreshTable('marketingActivitiesRuleTable');
}

function refresh() {
    $(".marketingActivitiesRule-table-form")[0].reset();
    search();
}

function deleteMarketingActivitiesRules() {
    var ids = $("#marketingActivitiesRuleTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的营销管理信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中营销管理信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'marketingActivitiesRule/delete', { "marketActiveID": ids[0].marketActiveID}, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
function updateMarketingActivitiesRule() {
    var selected = $("#marketingActivitiesRuleTable").bootstrapTable("getSelections");
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的营销管理信息！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能修改一个营销管理信息！');
        return;
    }
    var marketActiveID = selected[0].marketActiveID;
    $.post(ctx + "marketingActivitiesRule/getMarketingActivitiesRule", {"marketActiveID": marketActiveID}, function (r) {
        if (r.code === 0) {debugger;
            var $form = $('#marketingActivitiesRule-add');
            $form.modal();
            var marketingActivitiesRule = r.msg;
            $("#marketingActivitiesRule-add-modal-title").html('修改营销管理信息');
            $form.find("input[name='marketActiveID']").val(marketingActivitiesRule.marketActiveID).attr("readonly",true);
            $form.find("input[name='merNBR']").val(marketingActivitiesRule.merNBR);
            $form.find("input[name='shopNumber']").val(marketingActivitiesRule.shopNumber);
            $form.find("input[name='productId']").val(marketingActivitiesRule.productId);
            $form.find("input[name='marketActiveName']").val(marketingActivitiesRule.marketActiveName);
            $form.find("input[name='marketActiveType']").val(marketingActivitiesRule.marketActiveType);
            $form.find("input[name='marketActivesStartDate']").val(marketingActivitiesRule.marketActivesStartDate);
            $form.find("input[name='marketActivesEndDate']").val(marketingActivitiesRule.marketActivesEndDate);
            $("#marketingActivitiesRule-add-button").attr("name", "update");
        } else {
            $MB.n_danger(r.msg);
        }
    });
}
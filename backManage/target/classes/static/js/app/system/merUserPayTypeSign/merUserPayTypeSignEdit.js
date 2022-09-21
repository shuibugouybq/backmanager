function updateMerUserPayTypeSign() {
    var selected = $("#merUserPayTypeSignTable").bootstrapTable("getSelections");
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的用户商户平台支付产品签约信息！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能修改一个用户商户平台支付产品签约信息！');
        return;
    }
    var merUserPayTypeSign = selected[0];
    $.post(ctx + "merUserPayTypeSign/getMerUserPayTypeSign", {"channelId": merUserPayTypeSign.channelId }, function (r) {
        if (r.code === 0) {
            var $form = $('#merUserPayTypeSign-add');
            $form.modal();
            var merUserPayTypeSign = r.msg;
            $("#merUserPayTypeSign-add-modal-title").html('修改用户商户平台支付产品签约信息');
            $form.find("input[name='channelId']").attr("readOnly",true);
            $MB.setFormValues( $form, merUserPayTypeSign);
            $("#merUserPayTypeSign-add-button").attr("name", "update");
        } else {
            $MB.n_danger(r.msg);
        }
    });
}
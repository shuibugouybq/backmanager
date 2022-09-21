function updateChannelMerchant() {
    var selected = $("#channelMerchantTable").bootstrapTable("getSelections");
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的指定通道信息！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能修改一个指定通道信息！');
        return;
    }
    var channelMerchant = selected[0];
    $.post(ctx + "channelMerchant/getChannelMerchant", {"merId": channelMerchant.merId,"bankId":channelMerchant.bankId }, function (r) {
        if (r.code === 0) {
            var $form = $('#channelMerchant-add');
            $form.modal();
            var channelMerchant = r.msg;
            $("#channelMerchant-add-modal-title").html('修改指定通道支持银行信息');
            $form.find("input[name='merId']").attr("readOnly",true);
            $form.find("input[name='bankId']").attr("readOnly",true);
            $MB.setFormValues( $form, channelMerchant);
            $("#channelMerchant-add-button").attr("name", "update");
        } else {
            $MB.n_danger(r.msg);
        }
    });
}
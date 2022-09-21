function updateChannelBankSupport() {
    var selected = $("#channelBankSupportTable").bootstrapTable("getSelections");
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的通道支持银行信息！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能修改一个通道支持银行信息！');
        return;
    }
    var channelBankSupport = selected[0];
    $.post(ctx + "channelBankSupport/getChannelBankSupport", {"channelId": channelBankSupport.channelId,"channelType": channelBankSupport.channelType,"bankId": channelBankSupport.bankId }, function (r) {
        if (r.code === 0) {debugger;
            var $form = $('#channelBankSupport-add');
            $form.modal();
            var channelBankSupport = r.msg;
            $("#channelBankSupport-add-modal-title").html('修改通道支持银行信息');
            $form.find("select[name='channelId']").attr("disabled",true);
            $form.find("select[name='channelType']").attr("disabled",true);
            $form.find("input[name='bankId']").attr("readOnly",true);
            $MB.setFormValues( $form, channelBankSupport);
            $("#channelBankSupport-add-button").attr("name", "update");
        } else {
            $MB.n_danger(r.msg);
        }
    });
}
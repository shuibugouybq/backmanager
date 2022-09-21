function updatechannelBank() {
    var selected = $("#channelBankTable").bootstrapTable("getSelections");
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的机构信息！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能修改一个机构信息！');
        return;
    }
    var channelBank = selected[0];
    var $form = $('#channelBank-add');
    $form.modal();
    $("#channelBank-add-modal-title").html('修改机构信息');
    $("#channelBank-add-button").attr("name", "update");
    $MB.setFormValues( $form, channelBank);
    $form.find("input[name='bankId']").val(channelBank.bankId).attr("readOnly",true);
}
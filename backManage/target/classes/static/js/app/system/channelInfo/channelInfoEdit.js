function updateChannelInfo() {debugger;
    var selected = $("#channelInfoTable").bootstrapTable("getSelections");
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的通道信息！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能修改一个通道信息！');
        return;
    }
    var channelInfo = selected[0];
    var $form = $('#channelInfo-add');
    $form.modal();
    $("#channelInfo-add-modal-title").html('修改通道支持银行信息');
    $form.find("input[name='channelId']").attr("readOnly",true);
    $form.find("select[name='channelType']").attr("disabled",true);
    $MB.setFormValues( $form, channelInfo);
    $("#channelInfo-add-button").attr("name", "update");
}
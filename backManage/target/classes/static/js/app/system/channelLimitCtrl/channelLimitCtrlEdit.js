function updateChannelLimitCtrl() {
    var selected = $("#channelLimitCtrlTable").bootstrapTable("getSelections");
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的通道限额信息！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能修改一个通道限额信息！');
        return;
    }
    var channelId = selected[0].channelId;
    var channelType = selected[0].channelType;
    $.post(ctx + "channelLimitCtrl/getChannelLimitCtrl", {"channelId": channelId,"channelType": channelType}, function (r) {
        if (r.code === 0) {debugger;
            var $form = $('#channelLimitCtrl-add');
            $form.modal();
            var channelLimitCtrl = r.msg;
            $("#channelLimitCtrl-add-modal-title").html('修改通道限额信息');
            $form.find("select[name='channelId']").val(channelLimitCtrl.channelId).attr("disabled",true);
            $form.find("select[name='channelType']").val(channelLimitCtrl.channelType).attr("disabled",true);
            $form.find("input[name='perTransLimit']").val(channelLimitCtrl.perTransLimit);
            $form.find("input[name='dayTransAmt']").val(channelLimitCtrl.dayTransAmt);
            $form.find("input[name='dayTransLimitAmt']").val(channelLimitCtrl.dayTransLimitAmt);
            $form.find("input[name='monthTransAmt']").val(channelLimitCtrl.monthTransAmt);
            $form.find("input[name='monthTransLimitAmt']").val(channelLimitCtrl.monthTransLimitAmt);
            $form.find("input[name='yearTransLimitAmt']").val(channelLimitCtrl.yearTransLimitAmt);
            $form.find("input[name='currency']").val(channelLimitCtrl.currency);
            $("#channelLimitCtrl-add-button").attr("name", "update");
        } else {
            $MB.n_danger(r.msg);
        }
    });
}
function updateChannelResult() {
    var selected = $("#channelResultTable").bootstrapTable("getSelections");
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的择优排序信息！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能修改一个择优排序信息！');
        return;
    }
    var channelResult = selected[0];
    $.post(ctx + "channelResult/getChannelResult", {"channelId": channelResult.channelId,"channelType": channelResult.channelType }, function (r) {
        if (r.code === 0) {
            var $form = $('#channelResult-add');
            $form.modal();
            var channelResult = r.msg;
            $("#channelResult-add-modal-title").html('修改择优排序信息');
            $form.find("select[name='channelId']").attr("disbaled",true);
            $form.find("select[name='channelType']").attr("disbaled",true);
            $MB.setFormValues( $form, channelResult);
            $("#channelResult-add-button").attr("name", "update");
        } else {
            $MB.n_danger(r.msg);
        }
    });
}
function updateDetpTransCtrl() {
    var selected = $("#detpTransCtrlTable").bootstrapTable("getSelections");
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的机构交易控制信息！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能修改一个机构交易控制信息！');
        return;
    }
    var deptnbr = selected[0].deptnbr;
    var payTypeCd = selected[0].payTypeCd;
    var channelNBR = selected[0].channelNBR;
    $.post(ctx + "detpTransCtrl/getDetpTransCtrl", {"deptnbr": deptnbr,"payTypeCd": payTypeCd,"channelNBR": channelNBR}, function (r) {
        if (r.code === 0) {debugger;
            var $form = $('#detpTransCtrl-add');
            $form.modal();
            var detpTransCtrl = r.msg;
            $("#detpTransCtrl-add-modal-title").html('修改机构交易控制信息');
            $form.find("input[name='deptnbr']").val(detpTransCtrl.deptnbr).attr("readonly",true);
            $form.find("input[name='payTypeCd']").val(detpTransCtrl.payTypeCd).attr("readonly",true);
            $form.find("input[name='channelNBR']").val(detpTransCtrl.channelNBR).attr("readonly",true);
            $form.find("input[name='pertranslimit']").val(detpTransCtrl.pertranslimit);
            $form.find("input[name='perdaylimit']").val(detpTransCtrl.perdaylimit);
            $form.find("input[name='dayamtdate']").val(detpTransCtrl.dayamtdate);
            $form.find("input[name='dayamt']").val(detpTransCtrl.dayamt);
            $form.find("input[name='status']").val(detpTransCtrl.status);
            $("#detpTransCtrl-add-button").attr("name", "update");
        } else {
            $MB.n_danger(r.msg);
        }
    });
}
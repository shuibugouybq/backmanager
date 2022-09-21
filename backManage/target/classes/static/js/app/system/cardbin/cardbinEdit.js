function updateCardbin() {
    var selected = $("#cardbinTable").bootstrapTable("getSelections");
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的卡BIN信息！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能修改一个卡BIN信息！');
        return;
    }
    var cardBin = selected[0].cardBin;
    var bankId = selected[0].bankId;
    $.post(ctx + "cardbin/getCardbin", {"cardBin": cardBin,"bankId": bankId}, function (r) {
        if (r.code === 0) {debugger;
            var $form = $('#cardbin-add');
            $form.modal();
            var cardbin = r.msg;
            $("#cardbin-add-modal-title").html('修改卡BIN信息');
            $form.find("input[name='cardBin']").val(cardbin.cardBin).attr("readOnly",true);
            $form.find("input[name='bankName']").val(cardbin.bankName);
            $form.find("input[name='bankId']").val(cardbin.bankId).attr("readOnly",true);
            $form.find("input[name='cardLength']").val(cardbin.cardLength);
            $form.find("select[name='cardType']").val(cardbin.cardType);
            $("#cardbin-add-button").attr("name", "update");
        } else {
            $MB.n_danger(r.msg);
        }
    });
}
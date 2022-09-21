function updateUppBatchProfit() {
    var selected = $("#uppBatchProfitTable").bootstrapTable("getSelections");
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的分润比例信息！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能修改一个分润比例信息！');
        return;
    }
    var uppBatchProfit = selected[0];
    $.post(ctx + "uppBatchProfit/getUppBatchProfit", {"profitSeqno": uppBatchProfit.profitSeqno,"profitOrder": uppBatchProfit.profitOrder }, function (r) {
        if (r.code === 0) {debugger;
            var $form = $('#uppBatchProfit-add');
            $form.modal();
            var uppBatchProfit = r.msg;
            $("#uppBatchProfit-add-modal-title").html('修改分润比例信息');
            $form.find("input[name='profitSeqno']").attr("readOnly",true);
            $form.find("input[name='profitOrder']").attr("readOnly",true);
            $MB.setFormValues( $form, uppBatchProfit);
            $("#uppBatchProfit-add-button").attr("name", "update");
        } else {
            $MB.n_danger(r.msg);
        }
    });
}
function uTransJnlDetail() {
	var selected = $("#uTransJnlTable").bootstrapTable("getSelections");
	if(!!arguments.length){
		selected = arguments[0];
	}
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要查看的交易详情！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能查看一笔交易详情！');
        return;
    }
    var $form = $('#uTransJnl-detail');
    var uTransJnl = selected[0];
    $MB.setFormValues( $form, uTransJnl);
    $("#uTransJnl-detail").modal();
}

$(".btn-close").click(function () {
    closeModal();
});

function closeModal() {
    $MB.closeAndRestModal("uTransJnl-detail");
}
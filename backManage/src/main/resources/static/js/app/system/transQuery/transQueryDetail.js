function transQueryDetail() {
    var selected = $("#transQueryTable").bootstrapTable("getSelections");
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
    var $form = $('#transQuery-detail');
    var transQuery = selected[0];
    $MB.setFormValues( $form, transQuery);
    $("#transQuery-detail").modal();
}

$(".btn-close").click(function () {
    closeModal();
});

function closeModal() {
    $MB.closeAndRestModal("transQuery-detail");
}
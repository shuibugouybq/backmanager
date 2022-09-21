function updateCardbin() {
    var selected = $("#dayUppBatchctrlTable").bootstrapTable("getSelections");
    if(!!arguments.length){
		selected = arguments[0];
	}
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的清算控制！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能勾选一条清算控制！');
        return;
    }
    $("#uppBatchctrl-add-modal-title").html('添加清算控制');
//    debugger;
    var $form = $('#uppBatchctrl-add');
    $form.find("input[name='bpDepartmentid']").attr("readonly",true);
    $form.find("input[name='shardingKey']").attr("readonly",true);
    var transQuery = selected[0];
    $MB.setFormValues( $form, transQuery);
    $("#uppBatchctrl-add").modal();
    $("#uppBatchctrl-add-button").attr("name", "update");
    
}


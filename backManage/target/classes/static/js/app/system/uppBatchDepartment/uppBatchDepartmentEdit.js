function updateCardbin() {
    var selected = $("#dayUppBatchDepartmentTable").bootstrapTable("getSelections");
    if(!!arguments.length){
		selected = arguments[0];
	}
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的通道项目！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能勾选一条通道项目！');
        return;
    }
    $("#uppBatchDepartment-add-modal-title").html('添加通道');
//    debugger;
    var $form = $('#uppBatchDepartment-add');
    $form.find("input[name='departmentId']").attr("readonly",true);
    var transQuery = selected[0];
    $MB.setFormValues( $form, transQuery);
    $("#uppBatchDepartment-add").modal();
    $("#uppBatchDepartment-add-button").attr("name", "update");
    
}


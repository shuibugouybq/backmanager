function updateCardbin() {
    var selected = $("#daypayTypeTable").bootstrapTable("getSelections");
    if(!!arguments.length){
		selected = arguments[0];
	}
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的产品基本信息！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能勾选一条产品基本信息！');
        return;
    }
    $("#channelItemScore-add-modal-title").html('修改产品基本信息');
//    debugger;
    var $form = $('#payType-add');
    $form.find("input[name='paytypcd']").attr("readonly",true);
    var transQuery = selected[0];
  //  console.log(transQuery)
    $MB.setFormValues( $form, transQuery);
    $("#payType-add").modal();
    $("#channelRate-add-button").attr("name", "update");
    
}


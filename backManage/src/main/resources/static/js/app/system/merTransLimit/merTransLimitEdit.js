function updateCardbin() {
	 debugger;
    var selected = $("#daymerTransLimitTable").bootstrapTable("getSelections");
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
    $("#merTransLimit-add-modal-title").html('修改商户交易控制');
//    debugger;
    var $form = $('#merTransLimit-add');
    $form.find("input[name='channelId']").attr("readonly",true);
    $(".row").hide();
    var transQuery = selected[0];
  //  console.log(transQuery)
    $MB.setFormValues( $form, transQuery);
    $("#merTransLimit-add").modal();
    $("#merTransLimit-add-button").attr("name", "update");
    
}


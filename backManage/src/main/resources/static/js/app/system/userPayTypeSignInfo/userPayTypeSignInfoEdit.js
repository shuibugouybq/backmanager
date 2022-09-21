function updateSignInfo() {
    var selected = $("#dayuserPayTypeSignInfoTable").bootstrapTable("getSelections");
    if(!!arguments.length){
		selected = arguments[0];
	}
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的用户支付产品签约！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能勾选一条通道项目！');
        return;
    }
    $("#userPayTypeSignInfo-add-modal-title").html('修改用户支付产品签约');
//    debugger;
    var $form = $('#userPayTypeSignInfo-add');
    $form.find("input[name='signnbr']").attr("readonly",true);
    var transQuery = selected[0];
  //  console.log(transQuery)
    $MB.setFormValues( $form, transQuery);
    $("#userPayTypeSignInfo-add").modal();
    $("#userPayTypeSignInfo-add-button").attr("name", "update");
    
}
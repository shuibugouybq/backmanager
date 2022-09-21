function updateCardbin() {
    var selected = $("#dayChannelTable").bootstrapTable("getSelections");
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
    $("#channelItemScore-add-modal-title").html('修改通道项目打分信息');
//    debugger;
    var $form = $('#channelItemScore-add');
    $form.find("select[name='channelId']").attr("disabled",true);
    $form.find("input[name='scoreType']").attr("readonly",true);
    $form.find("select[name='channelType']").attr("disabled",true);
    var transQuery = selected[0];
  //  console.log(transQuery)
    $MB.setFormValues( $form, transQuery);
    $("#channelItemScore-add").modal();
    $("#channelItemScore-add-button").attr("name", "update");
    
}


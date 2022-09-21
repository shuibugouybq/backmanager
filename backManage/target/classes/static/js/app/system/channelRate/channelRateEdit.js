function updateCardbin() {
    var selected = $("#dayChannelRateTable").bootstrapTable("getSelections");
    if(!!arguments.length){
		selected = arguments[0];
	}
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的通道费率！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能勾选一条通道费率！');
        return;
    }
    $("#channelItemScore-add-modal-title").html('修改通道费率');
//    debugger;
    var $form = $('#channelRate-add');
    $form.find("input[name='rateId']").attr("readonly",true);
    var transQuery = selected[0];
  //  console.log(transQuery)
    $MB.setFormValues( $form, transQuery);
    $("#channelRate-add").modal();
    $("#channelRate-add-button").attr("name", "update");
    
}


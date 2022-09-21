function updateFractions() {
    var selected = $("#dayChannelPayTypeTable").bootstrapTable("getSelections");
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
    $("#channelPayType-add-modal-title").html('通道业务信息');
    var $form = $('#channelPayType-add');
    $form.find("select[name='channelId']").attr("disabled",true);
    var transQuery = selected[0];
    $MB.setFormValues( $form, transQuery);
    $("#channelPayType-add").modal();
    $("#channelPayType-add-button").attr("name", "update");
    
}


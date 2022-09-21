function updateItemWeightSupport() {
    var selected = $("#itemWeightSupportTable").bootstrapTable("getSelections");
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的服务项目权重！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能修改一个服务项目权重！');
        return;
    }
    var channelId = selected[0].channelId;
    var id = selected[0].id;
    $.post(ctx + "itemWeightSupport/getItemWeightSupport", {"id":id,"channelId":channelId}, function (r) {
        if (r.code === 0) {debugger;
            var $form = $('#itemWeightSupport-add');
            $form.modal();
            var itemWeightSupport = r.msg;
            $("#itemWeightSupport-add-modal-title").html('修改服务项目权重');
            $form.find("input[name='id']").val(itemWeightSupport.id).attr("readonly",true);
            $form.find("select[name='channelId']").val(itemWeightSupport.channelId).attr("disabled",true);
            $form.find("input[name='itemId']").val(itemWeightSupport.itemId);
            $form.find("input[name='itemWeight']").val(itemWeightSupport.itemWeight);
            $form.find("input[name='score']").val(itemWeightSupport.score);
            $form.find("input[name='remark1']").val(itemWeightSupport.remark1);
            $form.find("input[name='remark2']").val(itemWeightSupport.remark2);
            $form.find("input[name='remark3']").val(itemWeightSupport.remark3);
            $form.find("input[name='remark4']").val(itemWeightSupport.remark4);
            $form.find("input[name='remark5']").val(itemWeightSupport.remark5);
            $("#itemWeightSupport-add-button").attr("name", "update");
        } else {
            $MB.n_danger(r.msg);
        }
    });
}
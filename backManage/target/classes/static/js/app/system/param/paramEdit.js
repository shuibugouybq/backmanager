function updateParam() {
    var selected = $("#paramTable").bootstrapTable("getSelections");
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的字典数据信息！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能修改一个字典数据信息！');
        return;
    }
    var param = selected[0];
    $.post(ctx + "param/getParam", {"id": param.id }, function (r) {
        if (r.code === 0) {debugger;
            var $form = $('#param-add');
            $form.modal();
            var param = r.msg;
            $("#param-add-modal-title").html('修改字典数据信息');
            $MB.setFormValues( $form, param);
            $("#param-add-button").attr("name", "update");
        } else {
            $MB.n_danger(r.msg);
        }
    });
}
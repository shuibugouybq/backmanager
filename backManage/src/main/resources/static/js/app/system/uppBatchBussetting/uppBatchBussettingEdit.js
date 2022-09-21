function updateUppBatchBussetting() {
    var selected = $("#uppBatchBussettingTable").bootstrapTable("getSelections");
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的业务参数信息！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能修改一个业务参数信息！');
        return;
    }
    var uppBatchBussetting = selected[0];
    $.post(ctx + "uppBatchBussetting/getUppBatchBussetting", {"busDepartmentid": uppBatchBussetting.busDepartmentid,"shardingKey": uppBatchBussetting.shardingKey,"bankId": uppBatchBussetting.bankId }, function (r) {
        if (r.code === 0) {debugger;
            var $form = $('#uppBatchBussetting-add');
            $form.modal();
            var uppBatchBussetting = r.msg;
            $("#uppBatchBussetting-add-modal-title").html('修改业务参数信息');
            $form.find("input[name='busDepartmentid']").attr("readOnly",true);
            $form.find("input[name='shardingKey']").attr("readOnly",true);
            $MB.setFormValues( $form, uppBatchBussetting);
            $("#uppBatchBussetting-add-button").attr("name", "update");
        } else {
            $MB.n_danger(r.msg);
        }
    });
}
function updateUppBatchProcess() {
    var selected = $("#uppBatchProcessTable").bootstrapTable("getSelections");
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的进程控制信息！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能修改一个进程控制信息！');
        return;
    }
    var uppBatchProcess = selected[0];
    $.post(ctx + "uppBatchProcess/getUppBatchProcess", {"departmentId": uppBatchProcess.departmentId,"shardingKey": uppBatchProcess.shardingKey }, function (r) {
        if (r.code === 0) {debugger;
            var $form = $('#uppBatchProcess-add');
            $form.modal();
            var uppBatchProcess = r.msg;
            $("#uppBatchProcess-add-modal-title").html('修改进程控制信息');
            $form.find("input[name='departmentId']").attr("readOnly",true);
            $form.find("input[name='shardingKey']").attr("readOnly",true);
            $MB.setFormValues( $form, uppBatchProcess);
            $("#uppBatchProcess-add-button").attr("name", "update");
        } else {
            $MB.n_danger(r.msg);
        }
    });
}
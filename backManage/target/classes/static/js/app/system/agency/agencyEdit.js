function updateAgency() {
    var selected = $("#agencyTable").bootstrapTable("getSelections");
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的代理商信息！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能修改一个代理商信息！');
        return;
    }
    var agency = selected[0];
    $.post(ctx + "agency/getAgency", {"agencynbr": agency.agencynbr }, function (r) {
        if (r.code === 0) {debugger;
            var $form = $('#agency-add');
            $form.modal();
            var agency = r.msg;
            $("#agency-add-modal-title").html('修改代理商信息');
            $form.find("input[name='agencynbr']").attr("readOnly",true);
            $MB.setFormValues( $form, agency);
            $("#agency-add-button").attr("name", "update");
        } else {
            $MB.n_danger(r.msg);
        }
    });
}
function updateDeptAcctInfo() {
    var selected = $("#deptAcctInfoTable").bootstrapTable("getSelections");
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的机构账户信息！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能修改一个机构账户信息！');
        return;
    }
    var deptAcctInfo = selected[0];
    $.post(ctx + "deptAcctInfo/getDeptAcctInfo", {"deptnbr": deptAcctInfo.deptnbr,"inneracctcfmmode": deptAcctInfo.inneracctcfmmode }, function (r) {
        if (r.code === 0) {debugger;
            var $form = $('#deptAcctInfo-add');
            $form.modal();
            var deptAcctInfo = r.msg;
            $("#deptAcctInfo-add-modal-title").html('修改机构账户信息');
            $form.find("input[name='channelId']").attr("readOnly",true);
            $form.find("input[name='channelType']").attr("readOnly",true);
            $form.find("input[name='bankId']").attr("readOnly",true);
            $MB.setFormValues( $form, deptAcctInfo);
            $("#deptAcctInfo-add-button").attr("name", "update");
        } else {
            $MB.n_danger(r.msg);
        }
    });
}
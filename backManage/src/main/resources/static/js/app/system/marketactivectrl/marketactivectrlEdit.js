function updateInnerDeptManage() {
    var selected = $("#innerDeptManageTable").bootstrapTable("getSelections");
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的机构信息！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能修改一个机构信息！');
        return;
    }
    var deptnbr = selected[0].deptnbr;
    var deptname = selected[0].deptname;
    $.post(ctx + "innerDeptManage/getInnerDeptManage", {"deptnbr": deptnbr,"deptname": deptname}, function (r) {
        if (r.code === 0) {debugger;
            var $form = $('#innerDeptManage-add');
            $form.modal();
            var innerDeptManage = r.msg;
            $("#innerDeptManage-add-modal-title").html('修改机构信息');
            $form.find("input[name='deptnbr']").val(innerDeptManage.deptnbr).attr("readonly",true);
            $form.find("input[name='deptname']").val(innerDeptManage.deptname).attr("readonly",true);
            $form.find("input[name='deptlevel']").val(innerDeptManage.deptlevel);
            $form.find("input[name='superdeptnbr']").val(innerDeptManage.superdeptnbr);
            $form.find("input[name='opendate']").val(innerDeptManage.opendate);
            $form.find("input[name='openusernbr']").val(innerDeptManage.openusernbr);
            $form.find("input[name='closedate']").val(innerDeptManage.closedate);
            $form.find("input[name='closeusernbr']").val(innerDeptManage.closeusernbr);
            $form.find("input[name='modifydate']").val(innerDeptManage.modifydate);
            $form.find("input[name='modifyusernbr']").val(innerDeptManage.modifyusernbr);
            $form.find("input[name='deptstatus']").val(innerDeptManage.deptstatus);
            $("#innerDeptManage-add-button").attr("name", "update");
        } else {
            $MB.n_danger(r.msg);
        }
    });
}
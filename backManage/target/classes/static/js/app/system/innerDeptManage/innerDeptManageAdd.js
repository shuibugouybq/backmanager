var validator;
var $innerDeptManageAddForm = $("#innerDeptManage-add-form");

$(function () {
	validateRule();
	
    $("#innerDeptManage-add .btn-save").click(function () {
        var name = $(this).attr("name");
        validator = $innerDeptManageAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "innerDeptManage/add", $innerDeptManageAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
                $.post(ctx + "innerDeptManage/update", $innerDeptManageAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#innerDeptManage-add .btn-close").click(function () {
        closeModal();
    });
});

function closeModal() {
    $("#innerDeptManage-add-button").attr("name", "save");
    $("#innerDeptManage-add-modal-title").html('新增通道限额信息');
    $('#innerDeptManage-add').find("input[name='deptnbr']").attr("readonly",false);
    $('#innerDeptManage-add').find("input[name='deptname']").attr("readonly",false);
    validator.resetForm();
    $MB.closeAndRestModal("innerDeptManage-add");
    $MB.refreshTable('innerDeptManageTable');
}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $innerDeptManageAddForm.validate({
        rules: {
        	deptnbr: {
                required: true,
                maxlength: 128,
            }
        },
        messages: {
        	deptnbr: {
                required: icon + "请输入部门编号",
                minlength: icon + "部门编号长度最大128个字符",
            }
        }
    });
}
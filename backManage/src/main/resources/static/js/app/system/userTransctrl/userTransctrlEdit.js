var validator;
var $userTransctrlEditForm = $("#userTransctrl-edit-form");

$(function () {
	validateRule();
	
    $("#userTransctrl-edit .btn-save").click(function () {
        validator = $userTransctrlEditForm.validate();
        var flag = validator.form();
        if (flag) {
            $.post(ctx + "userTransctrl/update", $userTransctrlEditForm.serialize(), function (r) {
                if (r.code === 0) {
                    closeModal();
                    refresh();
                    $MB.n_success(r.msg);
                } else $MB.n_danger(r.msg);
            });
        }
    });

    $("#userTransctrl-edit .btn-close").click(function () {
        closeModal();
    });
});

function closeModal() {
    $("#userTransctrl-edit-button").attr("name", "save");
   /* $('#cardbin-add').find("input[name='cardBin']").attr("disabled",false);
    $('#cardbin-add').find("input[name='bankId']").attr("disabled",false);*/
    validator.resetForm();
    $MB.closeAndRestModal("userTransctrl-edit");
    $MB.refreshTable('userTransctrlTable');
}

function updateUserTransctrl() {
    var selected = $("#userTransctrlTable").bootstrapTable("getSelections");
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的用户交易限额信息！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能修改一个用户交易限额信息！');
        return;
    }
    
    var userTransctrl = selected[0];
    var $form = $('#userTransctrl-edit-form');
    var userTransctrl = selected[0];
    $MB.setFormValues( $form, userTransctrl);
    /*$form.find("input[name='merId']").attr("readonly",true);
    $form.find("input[name='signId']").attr("readonly",true);
    $form.find("input[name='signAcctNo']").attr("readonly",true);*/
    $("#userTransctrl-edit").modal();
}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $userTransctrlEditForm.validate({
        rules: {
            deptName: {
                required: true,
                minlength: 3,
                maxlength: 10,
                remote: {
                    url: "dept/checkDeptName",
                    type: "get",
                    dataType: "json",
                    data: {
                        deptName: function () {
                            return $("input[name='deptName']").val().trim();
                        },
                        oldDeptName: function () {
                            return $("input[name='oldDeptName']").val().trim();
                        }
                    }
                }
            }
        },
        messages: {
            deptName: {
                required: icon + "请输入部门名称",
                minlength: icon + "部门名称长度3到10个字符",
                remote: icon + "该部门名称已经存在"
            }
        }
    });
}
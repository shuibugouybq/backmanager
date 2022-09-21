var validator;
var $customerSignEditForm = $("#customerSign-edit-form");

$(function () {
	validateRule();
	
    $("#customerSign-edit .btn-save").click(function () {debugger;
        var name = $(this).attr("name");
        validator = $customerSignEditForm.validate();
        var flag = validator.form();
        if (flag) {
            $.post(ctx + "customerSign/update", $customerSignEditForm.serialize(), function (r) {
                if (r.code === 0) {
                    closeModal();
                    refresh();
                    $MB.n_success(r.msg);
                } else $MB.n_danger(r.msg);
            });
        }
    });

    $(".btn-close").click(function () {
        closeModal();
    });

    function closeModal() {
        $MB.closeAndRestModal("customerSign-edit");
        $('#customerSign-edit').find("input[name='merId']").attr("readonly",false);
        $('#customerSign-edit').find("input[name='signId']").attr("readonly",false);
        $('#customerSign-edit').find("input[name='signAcctNo']").attr("readonly",false);
    }
});

function updateCustomerSign() {
    var selected = $("#customerSignTable").bootstrapTable("getSelections");
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的签约信息！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能修改一个签约信息！');
        return;
    }
    var customerSign = selected[0];
    var $form = $('#customerSign-edit-form');
    var transQuery = selected[0];
    $MB.setFormValues( $form, customerSign);
    $form.find("input[name='merId']").attr("readonly",true);
    $form.find("input[name='signId']").attr("readonly",true);
    $form.find("input[name='signAcctNo']").attr("readonly",true);
    $("#customerSign-edit").modal();
}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $customerSignEditForm.validate({
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
var validator;
var $merchantAddForm = $("#merchant-add-form");

$(function () {
    validateRule();

    $("#merchant-add .btn-save").click(function () {
        var name = $(this).attr("name");
        validator = $merchantAddForm.validate();
        var flag = validator.form();
        if (flag) {debugger;
            if (name === "save") {
                $.post(ctx + "merchant/add", $merchantAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
                $.post(ctx + "merchant/update", $merchantAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $MB.calenders('input[name="merBusinessopendate"]', false, false);
    $("#merchant-add .btn-close").click(function () {
        closeModal();
    });
});

function closeModal() {debugger;
    $("#merchant-add-button").attr("name", "save");
    $("#merchant-add-modal-title").html('新增商户');
    validator.resetForm();
    $MB.closeAndRestModal("merchant-add");
    $MB.refreshTable('merchantTable');
}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $merchantAddForm.validate({
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
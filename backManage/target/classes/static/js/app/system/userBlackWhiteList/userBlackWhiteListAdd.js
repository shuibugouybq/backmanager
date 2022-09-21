var validator;
var $userBlackWhiteListAddForm = $("#userBlackWhiteList-add-form");

$(function () {
	validateRule();
	
    $("#userBlackWhiteList-add .btn-save").click(function () {
        var name = $(this).attr("name");
        validator = $userBlackWhiteListAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "userBlackWhiteList/add", $userBlackWhiteListAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
                $.post(ctx + "userBlackWhiteList/update", $userBlackWhiteListAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#userBlackWhiteList-add .btn-close").click(function () {
        closeModal();
    });
});

function closeModal() {
    $("#userBlackWhiteList-add-button").attr("name", "save");
    $("#userBlackWhiteList-add-modal-title").html('新增用户黑白名单信息');
    validator.resetForm();
    $MB.closeAndRestModal("userBlackWhiteList-add");
    $MB.refreshTable('userBlackWhiteListTable');
}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $userBlackWhiteListAddForm.validate({
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
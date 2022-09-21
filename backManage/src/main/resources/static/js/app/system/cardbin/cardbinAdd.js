var validator;
var $cardbinAddForm = $("#cardbin-add-form");

$(function () {
	validateRule();
	
    $("#cardbin-add .btn-save").click(function () {
        var name = $(this).attr("name");
        validator = $cardbinAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "cardbin/add", $cardbinAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
                $.post(ctx + "cardbin/update", $cardbinAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#cardbin-add .btn-close").click(function () {
        closeModal();
    });
});

function closeModal() {
    $("#cardbin-add-button").attr("name", "save");
    $("#cardbin-add-modal-title").html('新增卡BIN信息');
    $('#cardbin-add').find("input[name='cardBin']").attr("readOnly",false);
    $('#cardbin-add').find("input[name='bankId']").attr("readOnly",false);
    validator.resetForm();
    $MB.closeAndRestModal("cardbin-add");
    $MB.refreshTable('cardbinTable');
}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $cardbinAddForm.validate({
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
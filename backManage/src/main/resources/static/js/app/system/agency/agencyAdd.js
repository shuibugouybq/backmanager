var validator;
var $agencyAddForm = $("#agency-add-form");

$(function () {
	validateRule();
	
    $("#agency-add .btn-save").click(function () {
        var name = $(this).attr("name");
        validator = $agencyAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "agency/add", $agencyAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
                $.post(ctx + "agency/update", $agencyAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#agency-add .btn-close").click(function () {
        closeModal();
    });
});

function closeModal() {
    $("#agency-add-button").attr("name", "save");
    $("#agency-add-modal-title").html('新增代理商信息');
    $('#agency-add').find("input[name='agencynbr']").attr("readOnly",false);
    validator.resetForm();
    $MB.closeAndRestModal("agency-add");
    $MB.refreshTable('agencyTable');
}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $agencyAddForm.validate({
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
var validator;
var $deptAcctInfoAddForm = $("#deptAcctInfo-add-form");

$(function () {
	validateRule();
	
    $("#deptAcctInfo-add .btn-save").click(function () {
        var name = $(this).attr("name");
        validator = $deptAcctInfoAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "deptAcctInfo/add", $deptAcctInfoAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
                $.post(ctx + "deptAcctInfo/update", $deptAcctInfoAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#deptAcctInfo-add .btn-close").click(function () {
        closeModal();
    });
});

function closeModal() {
    $("#deptAcctInfo-add-button").attr("name", "save");
    $("#deptAcctInfo-add-modal-title").html('新增机构账户信息');
    $('#deptAcctInfo-add').find("input[name='channelId']").attr("readOnly",false);
    $('#deptAcctInfo-add').find("input[name='channelType']").attr("readOnly",false);
    $('#deptAcctInfo-add').find("input[name='bankId']").attr("readOnly",false);
    validator.resetForm();
    $MB.closeAndRestModal("deptAcctInfo-add");
    $MB.refreshTable('deptAcctInfoTable');
}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $deptAcctInfoAddForm.validate({
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
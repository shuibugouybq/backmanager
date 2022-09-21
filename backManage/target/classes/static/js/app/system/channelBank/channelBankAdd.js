var validator;
var $channelBankAddForm = $("#channelBank-add-form");

$(function () {
	validateRule();
	
    $("#channelBank-add .btn-save").click(function () {
        var name = $(this).attr("name");
        validator = $channelBankAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "channelBank/add", $channelBankAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
                $.post(ctx + "channelBank/update", $channelBankAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#channelBank-add .btn-close").click(function () {
        closeModal();
    });
});

function closeModal() {
    $("#channelBank-add-button").attr("name", "save");
    $("#channelBank-add-modal-title").html('新增机构信息');
    $('#channelBank-add').find("input[name='bankId']").attr("readOnly",false);
    validator.resetForm();
    $MB.closeAndRestModal("channelBank-add");
    $MB.refreshTable('channelBankTable');
}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $channelBankAddForm.validate({
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
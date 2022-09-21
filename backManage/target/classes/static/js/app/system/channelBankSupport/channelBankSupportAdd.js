var validator;
var $channelBankSupportAddForm = $("#channelBankSupport-add-form");

$(function () {
	validateRule();
	
    $("#channelBankSupport-add .btn-save").click(function () {
        var name = $(this).attr("name");
        validator = $channelBankSupportAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "channelBankSupport/add", $channelBankSupportAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
            	$('#channelBankSupport-add').find("select[name='channelId']").attr("disabled",false);
            	$('#channelBankSupport-add').find("select[name='channelType']").attr("disabled",false);
                $.post(ctx + "channelBankSupport/update", $channelBankSupportAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#channelBankSupport-add .btn-close").click(function () {
        closeModal();
    });
});

function closeModal() {
    $("#channelBankSupport-add-button").attr("name", "save");
    $("#channelBankSupport-add-modal-title").html('新增通道支持银行信息');
    $('#channelBankSupport-add').find("select[name='channelId']").attr("disabled",false);
    $('#channelBankSupport-add').find("select[name='channelType']").attr("disabled",false);
    $('#channelBankSupport-add').find("input[name='bankId']").attr("readOnly",false);
    validator.resetForm();
    $MB.closeAndRestModal("channelBankSupport-add");
    $MB.refreshTable('channelBankSupportTable');
}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $channelBankSupportAddForm.validate({
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
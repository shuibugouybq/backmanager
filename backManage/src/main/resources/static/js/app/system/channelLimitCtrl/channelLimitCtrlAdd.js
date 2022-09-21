var validator;
var $channelLimitCtrlAddForm = $("#channelLimitCtrl-add-form");

$(function () {
	validateRule();
	
    $("#channelLimitCtrl-add .btn-save").click(function () {
        var name = $(this).attr("name");
        validator = $channelLimitCtrlAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "channelLimitCtrl/add", $channelLimitCtrlAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
            	$('#channelLimitCtrl-add').find("select[name='channelId']").attr("disabled",false);
            	$('#channelLimitCtrl-add').find("select[name='channelType']").attr("disabled",false);
                $.post(ctx + "channelLimitCtrl/update", $channelLimitCtrlAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#channelLimitCtrl-add .btn-close").click(function () {
        closeModal();
    });
});

function closeModal() {
    $("#channelLimitCtrl-add-button").attr("name", "save");
    $("#channelLimitCtrl-add-modal-title").html('新增通道限额信息');
    $('#channelLimitCtrl-add').find("select[name='channelId']").attr("disabled",false);
    $('#channelLimitCtrl-add').find("select[name='channelType']").attr("disabled",false);
    validator.resetForm();
    $MB.closeAndRestModal("channelLimitCtrl-add");
    $MB.refreshTable('channelLimitCtrlTable');
}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $channelLimitCtrlAddForm.validate({
        rules: {
        	channelId: {
                required: true,
                maxlength: 30,
            },
            channelType: {
                required: true,
                maxlength: 2,
            }
        },
        messages: {
        	channelId: {
                required: icon + "请输入通道限额ID",
                minlength: icon + "通道限额ID长度最大30个字符",
            },
            channelType: {
                required: icon + "请输入通道限额类型",
                minlength: icon + "通道限额类型长度最大2个字符",
            }
        }
    });
}
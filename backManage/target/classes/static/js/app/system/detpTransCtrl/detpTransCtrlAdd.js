var validator;
var $detpTransCtrlAddForm = $("#detpTransCtrl-add-form");

$(function () {
	validateRule();
	
    $("#detpTransCtrl-add .btn-save").click(function () {
        var name = $(this).attr("name");
        validator = $detpTransCtrlAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "detpTransCtrl/add", $detpTransCtrlAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
                $.post(ctx + "detpTransCtrl/update", $detpTransCtrlAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#detpTransCtrl-add .btn-close").click(function () {
        closeModal();
    });
});

function closeModal() {
    $("#detpTransCtrl-add-button").attr("name", "save");
    $("#detpTransCtrl-add-modal-title").html('新增机构交易控制信息');
    $('#detpTransCtrl-add').find("input[name='deptnbr']").attr("readonly",false);
    $('#detpTransCtrl-add').find("input[name='payTypeCd']").attr("readonly",false);
    $('#detpTransCtrl-add').find("input[name='channelNBR']").attr("readonly",false);
    validator.resetForm();
    $MB.closeAndRestModal("detpTransCtrl-add");
    $MB.refreshTable('detpTransCtrlTable');
}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $detpTransCtrlAddForm.validate({
        rules: {
        	deptnbr: {
                required: true,
                maxlength: 128,
            },
            payTypeCd: {
                required: true,
                maxlength: 4,
            },
            channelNBR: {
                required: true,
                maxlength: 128,
            }
        },
        messages: {
        	deptnbr: {
                required: icon + "请输入机构编号",
                minlength: icon + "机构编号长度最大128个字符",
            },
            payTypeCd: {
                required: icon + "请输入支付产品编号",
                minlength: icon + "支付产品编号长度最大4个字符",
            },
            channelNBR: {
                required: icon + "请输入渠道编号",
                minlength: icon + "渠道编号长度最大128个字符",
            }
        }
    });
}
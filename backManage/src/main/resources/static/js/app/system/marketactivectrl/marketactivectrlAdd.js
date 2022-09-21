var validator;
var $marketactivectrlAddForm = $("#marketactivectrl-add-form");

$(function () {
	validateRule();
	
    $("#marketactivectrl-add .btn-save").click(function () {
        var name = $(this).attr("name");
        validator = $marketactivectrlAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "marketactivectrl/add", $marketactivectrlAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
                $.post(ctx + "marketactivectrl/update", $marketactivectrlAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#marketactivectrl-add .btn-close").click(function () {
        closeModal();
    });
});

function closeModal() {
    $("#marketactivectrl-add-button").attr("name", "save");
    $("#marketactivectrl-add-modal-title").html('新增营销控制信息');
   /* $('#marketactivectrl-add').find("input[name='channelId']").attr("readonly",false);
    $('#marketactivectrl-add').find("input[name='channelType']").attr("readonly",false);*/
    validator.resetForm();
    $MB.closeAndRestModal("marketactivectrl-add");
    $MB.refreshTable('marketactivectrlTable');
}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $marketactivectrlAddForm.validate({
        rules: {
        	marketActiveID: {
                required: true,
                maxlength: 128,
            },
            userCardTypCd: {
                required: true,
                maxlength: 128,
            },
            cardRank: {
                required: true,
                maxlength: 128,
            },
            payProduct: {
                required: true,
                maxlength: 128,
            },
            channelNBR: {
                required: true,
                maxlength: 128,
            }
        },
        messages: {
        	marketActiveID: {
                required: icon + "请输入营销活动ID",
                maxlength: icon + "营销活动ID长度最大128个字符",
            },
            userCardTypCd: {
                required: icon + "请输入用户卡类型",
                maxlength: icon + "用户卡类型长度最大128个字符",
            },
            cardRank: {
                required: icon + "请输入卡等级",
                maxlength: icon + "卡等级长度最大128个字符",
            },
            payProduct: {
                required: icon + "请输入支付产品",
                maxlength: icon + "支付产品长度最大128个字符",
            },
            channelNBR: {
                required: icon + "请输入渠道",
                maxlength: icon + "渠道长度最大128个字符",
            }
        }
    });
}
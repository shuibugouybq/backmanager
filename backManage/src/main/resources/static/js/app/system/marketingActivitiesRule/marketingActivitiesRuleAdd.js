var validator;
var $marketingActivitiesRuleAddForm = $("#marketingActivitiesRule-add-form");

$(function () {
	validateRule();
	
    $("#marketingActivitiesRule-add .btn-save").click(function () {
        var name = $(this).attr("name");
        validator = $marketingActivitiesRuleAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "marketingActivitiesRule/add", $marketingActivitiesRuleAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
                $.post(ctx + "marketingActivitiesRule/update", $marketingActivitiesRuleAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#marketingActivitiesRule-add .btn-close").click(function () {
        closeModal();
    });
});

function closeModal() {
    $("#marketingActivitiesRule-add-button").attr("name", "save");
    $("#marketingActivitiesRule-add-modal-title").html('新增营销管理信息');
    $('#marketingActivitiesRule-add').find("input[name='marketActiveID']").attr("readonly",false);
    validator.resetForm();
    $MB.closeAndRestModal("marketingActivitiesRule-add");
    $MB.refreshTable('marketingActivitiesRuleTable');
}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $marketingActivitiesRuleAddForm.validate({
        rules: {
        	marketActiveID: {
                required: true,
                maxlength: 128,
            }
        },
        messages: {
        	channelId: {
        		marketActiveID: icon + "请输入营销活动ID",
                maxlength: icon + "营销活动ID长度最大128个字符",
            }
        }
    });
}
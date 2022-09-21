var validator;
var $channelRateAddForm = $("#channelRate-add-form");

$(function () {
	validateRule();
	
    $("#payType-add .btn-save").click(function () {
        var name = $(this).attr("name");
        debugger;
        validator = $channelRateAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "payType/add", $channelRateAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal1();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
                $.post(ctx + "payType/update", $channelRateAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal1();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#payType-add .btn-close").click(function () {
        closeModal1();
    });
   
});

function closeModal1() {
    $("#channelRate-add-button").attr("name", "save");
    $("#channelItemScore-add-modal-title").html('添加产品基本信息');
    $('#payType-add').find("input[name='paytypcd']").attr("readonly",false);
    validator.resetForm();
    $MB.closeAndRestModal("payType-add");
    $MB.refreshTable('dayChannelRateTable');

}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $channelRateAddForm.validate({
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
                            return $("input[name='channelId']").val().trim();
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
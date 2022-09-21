var validator;
var $channelItemScoreAddForm = $("#userPayTypeSignInfo-add-form");

$(function () {
	validateRule();
    $("#userPayTypeSignInfo-add .btn-save").click(function () {
        var name = $(this).attr("name");
        debugger;
        validator = $channelItemScoreAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "userPayTypeSignInfo/add", $channelItemScoreAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal1();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
                $.post(ctx + "userPayTypeSignInfo/update", $channelItemScoreAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal1();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#userPayTypeSignInfo-add .btn-close").click(function () {
        closeModal1();
    });
   
});

function closeModal1() {
    $("#userPayTypeSignInfo-add-button").attr("name", "save");
    $("#userPayTypeSignInfo-add-modal-title").html('新增用户支付产品签约');
    $('#userPayTypeSignInfo-add').find("input[name='signnbr']").attr("readonly",false);
//    $('#userPayTypeSignInfo-add').find("input[name='signtypcd']").attr("readonly",false);
    validator.resetForm();
    $MB.closeAndRestModal("userPayTypeSignInfo-add");
    $MB.refreshTable('dayuserPayTypeSignInfoTable');

}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $channelItemScoreAddForm.validate({
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
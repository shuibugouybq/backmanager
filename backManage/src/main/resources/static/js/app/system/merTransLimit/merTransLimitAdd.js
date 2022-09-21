var validator;
var $merTransLimitAddForm = $("#merTransLimit-add-form");

$(function () {
	validateRule();
	
    $("#merTransLimit-add .btn-save").click(function () {
        var name = $(this).attr("name");
        debugger;
        validator = $merTransLimitAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "merTransLimit/add", $merTransLimitAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal1();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
                $.post(ctx + "merTransLimit/update", $merTransLimitAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal1();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#merTransLimit-add .btn-close").click(function () {
        closeModal1();
    });
   
});

function closeModal1() {
    $("#merTransLimit-add-button").attr("name", "save");
    $("#merTransLimit-add-modal-title").html('添加商户交易控制');
    $('#merTransLimit-add').find("input[name='paytypcd']").attr("readonly",false);
    $(".row").show();
//    $('#merTransLimit-add').find("input[name='scoreType']").attr("readonly",false);
//    $('#merTransLimit-add').find("input[name='channelType']").attr("readonly",false);
    validator.resetForm();
    $MB.closeAndRestModal("merTransLimit-add");
    $MB.refreshTable('daymerTransLimitTable');

}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $merTransLimitAddForm.validate({
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
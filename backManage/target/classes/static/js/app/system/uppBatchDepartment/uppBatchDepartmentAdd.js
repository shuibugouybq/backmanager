var validator;
var $uppBatchDepartmentAddForm = $("#uppBatchDepartment-add-form");

$(function () {
	validateRule();
	
    $("#uppBatchDepartment-add .btn-save").click(function () {
        var name = $(this).attr("name");
        debugger;
        validator = $uppBatchDepartmentAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "uppBatchDepartment/add", $uppBatchDepartmentAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal1();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
                $.post(ctx + "uppBatchDepartment/update", $uppBatchDepartmentAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal1();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#uppBatchDepartment-add .btn-close").click(function () {
        closeModal1();
    });
   
});

function closeModal1() {
    $("#uppBatchDepartment-add-button").attr("name", "save");
    $("#uppBatchDepartment-add-modal-title").html('添加通道');
    $('#uppBatchDepartment-add').find("input[name='departmentId']").attr("readonly",false);
    validator.resetForm();
    $MB.closeAndRestModal("uppBatchDepartment-add");
    $MB.refreshTable('dayUppBatchDepartmentTable');

}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $uppBatchDepartmentAddForm.validate({
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
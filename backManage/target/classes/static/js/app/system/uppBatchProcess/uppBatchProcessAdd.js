var validator;
var $uppBatchProcessAddForm = $("#uppBatchProcess-add-form");

$(function () {
	validateRule();
	
    $("#uppBatchProcess-add .btn-save").click(function () {
        var name = $(this).attr("name");
        validator = $uppBatchProcessAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "uppBatchProcess/add", $uppBatchProcessAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
                $.post(ctx + "uppBatchProcess/update", $uppBatchProcessAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#uppBatchProcess-add .btn-close").click(function () {
        closeModal();
    });
});

function closeModal() {
    $("#uppBatchProcess-add-button").attr("name", "save");
    $("#uppBatchProcess-add-modal-title").html('新增进程控制信息');
    $('#uppBatchProcess-add').find("input[name='departmentId']").attr("readOnly",false);
    $('#uppBatchProcess-add').find("input[name='shardingKey']").attr("readOnly",false);
    validator.resetForm();
    $MB.closeAndRestModal("uppBatchProcess-add");
    $MB.refreshTable('uppBatchProcessTable');
}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $uppBatchProcessAddForm.validate({
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
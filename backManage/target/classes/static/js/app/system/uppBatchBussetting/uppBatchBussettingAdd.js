var validator;
var $uppBatchBussettingAddForm = $("#uppBatchBussetting-add-form");

$(function () {
	validateRule();
	
    $("#uppBatchBussetting-add .btn-save").click(function () {
        var name = $(this).attr("name");
        validator = $uppBatchBussettingAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "uppBatchBussetting/add", $uppBatchBussettingAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
                $.post(ctx + "uppBatchBussetting/update", $uppBatchBussettingAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#uppBatchBussetting-add .btn-close").click(function () {
        closeModal();
    });
});

function closeModal() {
    $("#uppBatchBussetting-add-button").attr("name", "save");
    $("#uppBatchBussetting-add-modal-title").html('新增业务参数信息');
    $('#uppBatchBussetting-add').find("input[name='busDepartmentid']").attr("readOnly",false);
    $('#uppBatchBussetting-add').find("input[name='shardingKey']").attr("readOnly",false);
    validator.resetForm();
    $MB.closeAndRestModal("uppBatchBussetting-add");
    $MB.refreshTable('uppBatchBussettingTable');
}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $uppBatchBussettingAddForm.validate({
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
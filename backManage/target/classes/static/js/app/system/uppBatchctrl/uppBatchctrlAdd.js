var validator;
var $uppBatchctrlAddForm = $("#uppBatchctrl-add-form");

$(function () {
	validateRule();
	
    $("#uppBatchctrl-add .btn-save").click(function () {
        var name = $(this).attr("name");
        debugger;
        validator = $uppBatchctrlAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "uppBatchctrl/add", $uppBatchctrlAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal1();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
                $.post(ctx + "uppBatchctrl/update", $uppBatchctrlAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal1();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#uppBatchctrl-add .btn-close").click(function () {
        closeModal1();
    });
   
});

function closeModal1() {
    $("#uppBatchctrl-add-button").attr("name", "save");
    $("#uppBatchctrl-add-modal-title").html('添加清算控制');
    $('#uppBatchctrl-add').find("input[name='bpDepartmentid']").attr("readonly",false);
    $('#uppBatchctrl-add').find("input[name='shardingKey']").attr("readonly",false);
    validator.resetForm();
    $MB.closeAndRestModal("uppBatchctrl-add");
    $MB.refreshTable('dayUppBatchctrlTable');

}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $uppBatchctrlAddForm.validate({
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
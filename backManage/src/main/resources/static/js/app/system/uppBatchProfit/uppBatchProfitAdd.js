var validator;
var $uppBatchProfitAddForm = $("#uppBatchProfit-add-form");

$(function () {
	validateRule();
	
    $("#uppBatchProfit-add .btn-save").click(function () {
        var name = $(this).attr("name");
        validator = $uppBatchProfitAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "uppBatchProfit/add", $uppBatchProfitAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
                $.post(ctx + "uppBatchProfit/update", $uppBatchProfitAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#uppBatchProfit-add .btn-close").click(function () {
        closeModal();
    });
});

function closeModal() {
    $("#uppBatchProfit-add-button").attr("name", "save");
    $("#uppBatchProfit-add-modal-title").html('新增分润比例信息');
    $('#uppBatchProfit-add').find("input[name='profitOrder']").attr("readOnly",false);
    $('#uppBatchProfit-add').find("input[name='profitSeqno']").attr("readOnly",false);
    validator.resetForm();
    $MB.closeAndRestModal("uppBatchProfit-add");
    $MB.refreshTable('uppBatchProfitTable');
}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $uppBatchProfitAddForm.validate({
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
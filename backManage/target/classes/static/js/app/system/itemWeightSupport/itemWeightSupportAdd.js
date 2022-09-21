var validator;
var $itemWeightSupportAddForm = $("#itemWeightSupport-add-form");

$(function () {
	validateRule();
	
    $("#itemWeightSupport-add .btn-save").click(function () {
        var name = $(this).attr("name");
        validator = $itemWeightSupportAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "itemWeightSupport/add", $itemWeightSupportAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
                $('#itemWeightSupport-add').find("select[name='channelId']").attr("disabled",false); 
                $.post(ctx + "itemWeightSupport/update", $itemWeightSupportAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#itemWeightSupport-add .btn-close").click(function () {
        closeModal();
    });
});

function closeModal() {
    $("#itemWeightSupport-add-button").attr("name", "save");
    $("#itemWeightSupport-add-modal-title").html('新增服务项目权重');
    $('#itemWeightSupport-add').find("input[name='id']").attr("readonly",false);
    $('#itemWeightSupport-add').find("select[name='channelId']").attr("disabled",false); 
    validator.resetForm();
    $MB.closeAndRestModal("itemWeightSupport-add");
    $MB.refreshTable('itemWeightSupportTable');
}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $itemWeightSupportAddForm.validate({
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
var validator;
var $channelResultAddForm = $("#channelResult-add-form");

$(function () {
	validateRule();
	
    $("#channelResult-add .btn-save").click(function () {
        var name = $(this).attr("name");
        validator = $channelResultAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "channelResult/add", $channelResultAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
            	$('#channelResult-add').find("select[name='channelId']").attr("disabled",false);
                $('#channelResult-add').find("select[name='channelType']").attr("disabled",false);
                $.post(ctx + "channelResult/update", $channelResultAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#channelResult-add .btn-close").click(function () {
        closeModal();
    });
});

function closeModal() {
    $("#channelResult-add-button").attr("name", "save");
    $("#channelResult-add-modal-title").html('新增择优排序信息');
    $('#channelResult-add').find("select[name='channelId']").attr("disabled",false);
    $('#channelResult-add').find("select[name='channelType']").attr("disabled",false);
    validator.resetForm();
    $MB.closeAndRestModal("channelResult-add");
    $MB.refreshTable('channelResultTable');
}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $channelResultAddForm.validate({
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
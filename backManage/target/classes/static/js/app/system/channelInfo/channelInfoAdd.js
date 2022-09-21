var validator;
var $channelInfoAddForm = $("#channelInfo-add-form");

$(function () {
	validateRule();
	
    $("#channelInfo-add .btn-save").click(function () {
        var name = $(this).attr("name");
        validator = $channelInfoAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "channelInfo/add", $channelInfoAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
            	$('#channelInfo-add').find("select[name='channelType']").attr("disabled",false);
                $.post(ctx + "channelInfo/update", $channelInfoAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#channelInfo-add .btn-close").click(function () {
        closeModal();
    });
});

function closeModal() {
    $("#channelInfo-add-button").attr("name", "save");
    $("#channelInfo-add-modal-title").html('新增通道信息');
    $('#channelInfo-add').find("input[name='channelId']").attr("readOnly",false);
    $('#channelInfo-add').find("select[name='channelType']").attr("disabled",false);
    validator.resetForm();
    $MB.closeAndRestModal("channelInfo-add");
    $MB.refreshTable('channelInfoTable');
}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $channelInfoAddForm.validate({
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
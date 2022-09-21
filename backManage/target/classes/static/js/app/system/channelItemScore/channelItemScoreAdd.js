var validator;
var $channelItemScoreAddForm = $("#channelItemScore-add-form");

$(function () {
	validateRule();
	
    $("#channelItemScore-add .btn-save").click(function () {
        var name = $(this).attr("name");
        validator = $channelItemScoreAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "channelItemScore/add", $channelItemScoreAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal1();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
            	$('#channelItemScore-add').find("select[name='channelId']").attr("disabled",false);
                $('#channelItemScore-add').find("select[name='channelType']").attr("disabled",false);
                $.post(ctx + "ChannelItemScore/update", $channelItemScoreAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal1();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });

    $("#channelItemScore-add .btn-close").click(function () {
        closeModal();
    });
   
});

function closeModal() {
    $("#channelItemScore-add-button").attr("name", "save");
    $("#channelItemScore-add-modal-title").html('通道项目打分信息');
    $('#channelItemScore-add').find("select[name='channelId']").attr("disabled",false);
    $('#channelItemScore-add').find("input[name='scoreType']").attr("readonly",false);
    $('#channelItemScore-add').find("select[name='channelType']").attr("disabled",false);
    validator.resetForm();
    $MB.closeAndRestModal("channelItemScore-add");
    $MB.refreshTable('dayChannelTable');

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
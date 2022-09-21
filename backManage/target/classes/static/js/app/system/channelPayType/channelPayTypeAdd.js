var validator;
var $channelPayTypeAddForm = $("#channelPayType-add-form");

$(function () {
	validateRule();
	
    $("#channelPayType-add .btn-save").click(function () {
        var name = $(this).attr("name");
        validator = $channelPayTypeAddForm.validate();
        var flag = validator.form();
        if (flag) {
            if (name === "save") {
                $.post(ctx + "channelPayType/add", $channelPayTypeAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
            if (name === "update") {
            	$('#channelPayType-add').find("select[name='channelId']").attr("disabled",false);
                $.post(ctx + "channelPayType/update", $channelPayTypeAddForm.serialize(), function (r) {
                    if (r.code === 0) {
                        closeModal();
                        refresh();
                        $MB.n_success(r.msg);
                    } else $MB.n_danger(r.msg);
                });
            }
        }
    });
    $("#channelPayType-add .btn-close").click(function () {
    	debugger;
        closeModal();
    });
   
});

function closeModal() {
    $("#channelPayType-add-button").attr("name", "save");
    $("#channelPayType-add-modal-title").html('添加通道业务信息');
    $('#channelPayType-add').find("select[name='channelId']").attr("disabled",false);
    validator.resetForm();
    $MB.closeAndRestModal("channelPayType-add");
    $MB.refreshTable('dayChannelPayTypeTable');

}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $channelPayTypeAddForm.validate({
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
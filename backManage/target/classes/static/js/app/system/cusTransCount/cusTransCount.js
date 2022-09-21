var validator;debugger;
var $cusTransCountForm = $(".cusTransCount-table-form");
$(function() {
	validateRule();
	var setting = {
        id: 'transSeqNo',
        code: 'transSeqNo',
        url: '',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                accNoTemp: $(".cusTransCount-table-form").find("input[name='accNoTemp']").val().trim(),
                beginDate: $(".cusTransCount-table-form").find("input[name='beginDate']").val().trim(),
                endDate: $(".cusTransCount-table-form").find("input[name='endDate']").val().trim()
            };
        },
        columns: [
            {
                title: '总金额',
                field: 'totalAmt'
            },
            {
                title: '支付金额',
                field: 'payAmt'
            },
            {
                title: '退款金额',
                field: 'refundAmt'
            }
        ]
    };

    $MB.initTable('cusTransCountTable', setting);
    var startDate = moment().subtract('months', 1).format('YYYY/MM/DD');
    $MB.calenders('input[name="beginDate"]', false, false, true, startDate);
    $MB.calenders('input[name="endDate"]', false, false, true);
});

function search() {
	var beginDate = $(".cusTransCount-table-form").find("input[name='beginDate']").val().trim();
    var endDate = $(".cusTransCount-table-form").find("input[name='endDate']").val().trim();
    var tempDate = moment(beginDate).add(3, 'months');
    if(tempDate.isBefore(endDate)){
		$MB.n_warning('请查询三个月间交易记录！');
		return;
    }
    validator = $cusTransCountForm.validate();
    var flag = validator.form();
    if(flag){
    	$('#cusTransCountTable').bootstrapTable("refresh",{
    		url: ctx + 'cusTransCount/list',
    		query: {
                pageNum: 1,
                accNoTemp: $(".cusTransCount-table-form").find("input[name='accNoTemp']").val().trim(),
                beginDate: $(".cusTransCount-table-form").find("input[name='beginDate']").val().trim(),
                endDate: $(".cusTransCount-table-form").find("input[name='endDate']").val().trim()
    		}
    	});
    }
}

function refresh() {
    $(".cusTransCount-table-form")[0].reset();
    search();
}

function validateRule() {
    var icon = "<i class='zmdi zmdi-close-circle zmdi-hc-fw'></i> ";
    validator = $cusTransCountForm.validate({
        rules: {
        	accNoTemp: {
                required: true
            },
            beginDate: {
            	required: true
            },
            endDate: {
            	required: true
            }
        },
        messages: {
        	accNoTemp: {
                required: icon + "请输入账号"
            },
            beginDate: {
                required: icon + "请输入起始日期"
            },
            endDate: {
                required: icon + "请输入结束日期"
            }
        }
    });
}
$(function() {
	var setting = {
        id: 'errorSeqno',
        code: 'errorSeqno',
        url: ctx + 'uppBatchCheckTransErrorCount/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                transDepartmentid: $(".uppBatchCheckTransErrorCount-table-form").find("input[name='transDepartmentid']").val().trim(),
                beginDate: $(".uppBatchCheckTransErrorCount-table-form").find("input[name='beginDate']").val().trim(),
                endDate: $(".uppBatchCheckTransErrorCount-table-form").find("input[name='endDate']").val().trim()
            };
        },
        columns: [
            {
                title: '总笔数',
                field: 'totalCount'
            },
            {
                title: '未处理笔数',
                field: 'untreatedCount'
            },
            {
                title: '已处理笔数',
                field: 'processedCount'
            },
            {
                title: '总金额',
                field: 'totalAmt'
            }
        ]
    };

    $MB.initTable('uppBatchCheckTransErrorCountTable', setting);
    var startDate = moment().subtract('months', 1).format('YYYY/MM/DD');
    $MB.calenders('input[name="beginDate"]', false, false, true, startDate);
    $MB.calenders('input[name="endDate"]', false, false, true);
});

function search() {
	var beginDate = $("input[name='beginDate']").val().trim();
    var endDate = $("input[name='endDate']").val().trim();
    var tempDate = moment(beginDate).add(3, 'months');
    if(tempDate.isBefore(endDate)){
		$MB.n_warning('请查询三个月间交易记录！');
		return;
    }
	$MB.refreshTable('uppBatchCheckTransErrorCountTable');
}

function refresh() {
    $(".uppBatchCheckTransErrorCount-table-form")[0].reset();
    search();
}
$(function() {
	var setting = {
        id: 'channelId',
        code: 'channelId',
        url: ctx + 'channelCtrlFractions/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                channelId: $(".channelCtrlFractions-table-form").find("select[name='channelId']").val().trim()
            };
        },
        columns: [
            {
                title: '通道号',
                field: 'channelId'
            },
            {
                title: '通道时间',
                field: 'channelTransDate'
            },
            {
                title: '通道业务',
                field: 'channelType',
            	formatter: function (value, row, index) {
            		return constMap["channelType"][value] || value;
            	}
            },
            {
                title: '通道得分',
                field: 'fractions'
            },
            {
                title: '预留1',
                field: 'remark1'
            },
            {
                title: '预留2',
                field: 'remark2'
            },
            {
                title: '预留3',
                field: 'remark3'
            },
            {
                title: '预留4',
                field: 'remark4'
            },
            {
                title: '预留5',
                field: 'remark5'
            }
        ]
    };

    $MB.initTable('channelCtrlFractionsTable', setting);
});

function search() {
	$MB.refreshTable('channelCtrlFractionsTable');
}

function refresh() {
    $(".channelCtrlFractions-table-form")[0].reset();
    search();
}
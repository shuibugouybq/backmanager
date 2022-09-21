$(function() {
var setting = {
        id: 'id',
        code: 'id',
        url: ctx + 'itemWeightSupport/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                id: $(".itemWeightSupport-table-form").find("input[name='id']").val().trim(),
                channelId: $(".itemWeightSupport-table-form").find("select[name='channelId']").val().trim()            
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: 'id',
                field: 'id'
            },
            {
                title: '通道',
                field: 'channelId',
                formatter: function (value, row, index) {
                     if (value === '00') return '核心';
                     else if (value === '01') return '贷记卡核心';
                     else if (value === '02') return '中金支付';
                     else return '其他';
                 }
            },
            {
                title: '服务项id',
                field: 'itemId'
            },

            {
                title: '百分比',
                field: 'itemWeight'
            },
            {
                title: '默认分数',
                field: 'score'
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

    $MB.initTable('itemWeightSupportTable', setting);
});

function search() {
	$MB.refreshTable('itemWeightSupportTable');
}

function refresh() {
    $(".itemWeightSupport-table-form")[0].reset();
    search();
}

function deleteItemWeightSupport() {
    var ids = $("#itemWeightSupportTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的服务项目权重！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中服务项目权重？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'itemWeightSupport/delete', { "id": ids[0].id,"channelId": ids[0].channelId}, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
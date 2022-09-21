$(function() {
	var setting = {
        id: 'channelId',
        code: 'channelId',
        url: ctx + 'ChannelItemScore/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
       queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                channelId: $(".dayChannel-table-form").find("select[name='channelId']").val().trim()
                
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '打分类型',
                field: 'scoreType'
            },
            {
                title: '通道号',
                field: 'channelId'
            },
            {
                title: '通道业务',
                field: 'channelType',
            	formatter: function (value, row, index) {
            		return constMap["channelType"][value] || value;
            	}
            },
            {
                title: '通道时间',
                field: 'channelDateTime'
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

    $MB.initTable('dayChannelTable', setting);
	$MB.calenders('input[name="channelDateTime"]', false, false, true);
});

function search() {
	$MB.refreshTable('dayChannelTable');
}

function refresh() {
    $(".dayChannel-table-form")[0].reset();
    search();
}

function deleteScore() {
    var ids = $("#dayChannelTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的项目信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中项目信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'ChannelItemScore/delete', { "channelId": ids[0].channelId,"scoreType": ids[0].scoreType,"channelType": ids[0].channelType }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
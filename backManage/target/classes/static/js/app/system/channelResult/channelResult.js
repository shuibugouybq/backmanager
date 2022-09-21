$(function() {
	var setting = {
        id: 'channelId',
        code: 'channelId',
        url: ctx + 'channelResult/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                channelId: $(".channelResult-table-form").find("select[name='channelId']").val().trim(),
                channelType: $(".channelResult-table-form").find("select[name='channelType']").val().trim(),
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '通道编号',
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
                title: '分数',
                field: 'itemScore'
            },
            {
                title: '更新时间',
                field: 'updateDateTime'
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

    $MB.initTable('channelResultTable', setting);
});

function search() {
	$MB.refreshTable('channelResultTable');
}

function refresh() {
    $(".channelResult-table-form")[0].reset();
    search();
}

function deleteChannelResults() {
    var ids = $("#channelResultTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的择优排序信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中择优排序信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'channelResult/delete', { "channelId": ids[0].channelId,"channelType": ids[0].channelType }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
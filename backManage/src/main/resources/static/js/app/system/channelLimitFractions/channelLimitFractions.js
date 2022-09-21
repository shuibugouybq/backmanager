$(function() {
	var setting = {
        id: 'channelId',
        code: 'channelId',
        url: ctx + 'channelLimitFractions/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
       queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                channelId: $(".dayFractions-table-form").find("select[name='channelId']").val().trim()
                
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
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

    $MB.initTable('dayfractionsable', setting);
	$MB.calenders('input[name="channelDateTime"]', false, false, true);
});

function search() {
	$MB.refreshTable('dayfractionsable');
}

function refresh() {
    $(".dayFractions-table-form")[0].reset();
    search();
}

function deleteFractions() {
    var ids = $("#dayfractionsable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的通道限额信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中通道限额信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'channelLimitFractions/delete', { "channelId": ids[0].channelId,"channelType": ids[0].channelType }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
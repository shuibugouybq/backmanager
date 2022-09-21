$(function() {
	var setting = {
        id: 'channelId',
        code: 'channelId',
        url: ctx + 'channelCtrlDayFract/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
       queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                channelId: $(".dayfrac-table-form").find("select[name='channelId']").val().trim()
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
            /*{
                title: '借贷记卡标志',
                field: 'cardType',
                formatter: function (value, row, index) {
                    if (value === '1') return '借记卡';
                    else if (value === '2') return '贷记卡';
                    else if (value === '3') return '准贷记卡';
                    else return '预付费卡';
                }
            }*/
        ]
    };

    $MB.initTable('dayfracTable', setting);
});

function search() {
	$MB.refreshTable('dayfracTable');
}

function refresh() {
    $(".dayfrac-table-form")[0].reset();
    search();
}

/*function deleteCardbins() {
    var ids = $("#dayfracTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的卡BIN信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中卡BIN信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'cardbin/delete', { "cardBin": ids[0].cardBin,"bankId": ids[0].bankId }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}*/
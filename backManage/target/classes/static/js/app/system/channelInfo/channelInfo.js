$(function() {
	var setting = {
        id: 'channelId',
        code: 'channelId',
        url: ctx + 'channelInfo/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                channelId: $(".channelInfo-table-form").find("input[name='channelId']").val().trim()
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
                title: '机构编号',
                field: 'parentChannelId'
            },
            {
                title: '通道状态',
                field: 'channelStatus',
                formatter: function (value, row, index) {
                    if (value === '0') return '开通';
                    else if (value === '1') return '关闭';
                    else return '';
                }
            },
            {
                title: '通道名称',
                field: 'channelName'
            },
            {
                title: '通道描述',
                field: 'channelDesc'
            },
            {
            	title: '通道IP地址列表',
            	field: 'channelIpList'
            },
            {
            	title: '开通日期',
            	field: 'channelOpenDate'
            },
            {
            	title: '开通人',
            	field: 'channelOpenUser'
            },
            {
            	title: '关闭日期',
            	field: 'channelCloseDate'
            },
            {
            	title: '关闭人',
            	field: 'channelCloseUser'
            },
            {
            	title: '修改日期',
            	field: 'channelModifyDate'
            },
            {
            	title: '修改人',
            	field: 'channelModifyUser'
            },
            {
            	title: '到帐时效',
            	field: 'channelArrDate',
            	formatter: function (value, row, index) {
            		return constMap["settleTime"][value] || value;
            	}
            },
            {
            	title: '业务类型',
            	field: 'channelType',
            	formatter: function (value, row, index) {
            		return constMap["channelType"][value] || value;
            	}
            },
            {
            	title: '结算周期',
            	field: 'settleTime',
            	formatter: function (value, row, index) {
            		return constMap["settleTime"][value] || value;
            	}
            }
            
        ]
    };

    $MB.initTable('channelInfoTable', setting);
});

function search() {
	$MB.refreshTable('channelInfoTable');
}

function refresh() {
    $(".channelInfo-table-form")[0].reset();
    search();
}

function deleteChannelInfos() {
    var ids = $("#channelInfoTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的通道信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中通道信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'channelInfo/delete', { "channelId": ids[0].channelId,"channelType": ids[0].channelType }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
$(function() {
	var setting = {
        id: 'errorSeqno',
        code: 'errorSeqno',
        url: ctx + 'uppBatchCheckTransError/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                errorSeqno: $(".uppBatchCheckTransError-table-form").find("input[name='errorSeqno']").val().trim(),
                shardingKey: $(".uppBatchCheckTransError-table-form").find("input[name='shardingKey']").val().trim()
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '差错号',
                field: 'errorSeqno'
            },
            {
                title: '差错类型',
                field: 'errorCode'
            },
            {
                title: '资金通道',
                field: 'transDepartmentid'
            },
            {
                title: '平台流水',
                field: 'transSeqno'
            },
            {
                title: '记账日期',
                field: 'transCleardate'
            },
            {
                title: '付款账户',
                field: 'transPayacctno'
            },
            {
                title: '收款账户',
                field: 'transRcvacctno'
            },
            {
                title: '交易金额',
                field: 'transAmt'
            },
            {
                title: '对账状态',
                field: 'transCheckStatus'
            },
            {
                title: '处理状态',
                field: 'transHandstatus',
                formatter: function (value, row, index) {
                    if (value === '0'){
                    	return "<a href='#' onclick='updateStatus(\"" + row.errorSeqno + "\",\"" + row.shardingKey + "\")'>未处理</a>";
                    }else if (value === '1') return '已处理';
                    else return '';
                }
            }
        ]
    };

    $MB.initTable('uppBatchCheckTransErrorTable', setting);
});

function search() {
	$MB.refreshTable('uppBatchCheckTransErrorTable');
}

function refresh() {
    $(".uppBatchCheckTransError-table-form")[0].reset();
    search();
}

function updateStatus(errorSeqno,shardingKey){
	$MB.confirm({
        text: "确定对该差错记录进行处理？",
        confirmButtonText: "确定"
    }, function() {
    	$.post(ctx + "uppBatchCheckTransError/update", { "errorSeqno": errorSeqno,"shardingKey": shardingKey,"transHandstatus": "1" }, function (r) {
            if (r.code === 0) {
                closeModal();
                refresh();
                $MB.n_success(r.msg);
            } else $MB.n_danger(r.msg);
        });
    });
}

function deleteUppBatchCheckTransErrors() {
    var ids = $("#uppBatchCheckTransErrorTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的对账差错明细信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中对账差错明细信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'uppBatchCheckTransError/delete', { "errorSeqno": ids[0].errorSeqno,"shardingKey": ids[0].shardingKey }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
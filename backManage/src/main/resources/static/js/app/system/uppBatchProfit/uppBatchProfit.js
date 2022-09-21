$(function() {
	var setting = {
        id: 'channelId',
        code: 'channelId',
        url: ctx + 'uppBatchProfit/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                profitSeqno: $(".uppBatchProfit-table-form").find("input[name='profitSeqno']").val().trim(),
                profitOrder: $(".uppBatchProfit-table-form").find("input[name='profitOrder']").val().trim()
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '分润流水号',
                field: 'profitSeqno'
            },
            {
                title: '顺序号',
                field: 'profitOrder'
            },
            {
                title: '分润机构',
                field: 'profitDeptid'
            },
            {
                title: '分润模式',
                field: 'profitMode'
            },
            {
            	title: '比例',
            	field: 'profitScale'
            },
            {
            	title: '修改时间',
            	field: 'gmtModified'
            },
            {
            	title: '创建时间',
            	field: 'gmtCreate'
            },
            {
            	title: '分润帐号',
            	field: 'profitAcctno'
            },
            {
            	title: '帐号类型',
            	field: 'profitAcctnoType'
            },
            {
            	title: '帐号名称',
            	field: 'profitAcctnoName'
            },
            {
            	title: '分润是否兜底',
            	field: 'isLast'
            },
            {
            	title: '法人代码',
            	field: 'corporationCode'
            },
            {
            	title: '法人机构号',
            	field: 'deptId'
            }
        ]
    };

    $MB.initTable('uppBatchProfitTable', setting);
});

function search() {
	$MB.refreshTable('uppBatchProfitTable');
}

function refresh() {
    $(".uppBatchProfit-table-form")[0].reset();
    search();
}

function deleteUppBatchProfits() {
    var ids = $("#uppBatchProfitTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的分润比例信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中分润比例信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'uppBatchProfit/delete', { "profitSeqno": ids[0].profitSeqno,"profitOrder": ids[0].profitOrder }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
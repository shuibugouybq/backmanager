$(function() {
	var setting = {
        id: 'merId',
        code: 'merId',
        url: ctx + 'cardbin/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                cardBin: $(".cardbin-table-form").find("input[name='cardBin']").val().trim()
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '卡BIN',
                field: 'cardBin'
            },
            {
                title: '卡BIN名称',
                field: 'bankName'
            },
            {
                title: '银行编号',
                field: 'bankId'
            },
            {
                title: '卡号长度',
                field: 'cardLength'
            },
            {
                title: '借贷记卡标志',
                field: 'cardType',
                formatter: function (value, row, index) {
                    if (value === '1') return '借记卡';
                    else if (value === '2') return '贷记卡';
                    else if (value === '3') return '准贷记卡';
                    else return '预付费卡';
                }
            }
        ]
    };

    $MB.initTable('cardbinTable', setting);
});

function search() {
	$MB.refreshTable('cardbinTable');
}

function refresh() {
    $(".cardbin-table-form")[0].reset();
    search();
}

function deleteCardbins() {
    var ids = $("#cardbinTable").bootstrapTable("getSelections");
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
}
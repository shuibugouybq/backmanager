$(function() {
	var setting = {
        id: 'cardno',
        code: 'cardno',
        url: ctx + 'userBlackWhiteList/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                cardno: $(".userBlackWhiteList-table-form").find("input[name='cardno']").val().trim()
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '卡号',
                field: 'cardno'
            },
            {
                title: '卡状态',
                field: 'status',
                formatter: function (value, row, index) {
                    if (value === '0') return '黑名单';
                    else if (value === '1') return '白名单';
                    else if (value === '2') return '灰名单';
                    else return '';
                }
            }
        ]
    };

    $MB.initTable('userBlackWhiteListTable', setting);
});

function search() {
	$MB.refreshTable('userBlackWhiteListTable');
}

function refresh() {
    $(".userBlackWhiteList-table-form")[0].reset();
    search();
}

function deleteUserBlackWhiteLists() {
    var ids = $("#userBlackWhiteListTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的用户黑白名单信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中用户黑白名单信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'userBlackWhiteList/delete', { "cardno": ids[0].cardno }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
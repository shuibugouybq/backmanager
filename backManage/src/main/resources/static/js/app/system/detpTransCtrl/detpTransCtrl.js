$(function() {
	var setting = {
        id: 'deptnbr',
        code: 'deptnbr',
        url: ctx + 'detpTransCtrl/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                deptnbr: $(".detpTransCtrl-table-form").find("input[name='deptnbr']").val().trim(),
                payTypeDesc: $(".detpTransCtrl-table-form").find("input[name='payTypeDesc']").val().trim()

            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '机构编号',
                field: 'deptnbr'
            },
            {
                title: '支付产品',
                field: 'payTypeDesc'
            },
            {
                title: '渠道',
                field: 'channelDesc'
            },
            {
                title: '单笔限额',
                field: 'pertranslimit'
            },
            {
                title: '单日限额',
                field: 'perdaylimit',
            },
            {
                title: '单日额度日期',
                field: 'dayamtdate',
            },
            {
                title: '单日额度',
                field: 'dayamt'
            },
            {
                title: '状态',
                field: 'status',
            },
            {
                field: 'payTypeCd',
                visible:false,
            },
            {
                field: 'channelNBR',
                visible:false,
            }
        ]
    };

    $MB.initTable('detpTransCtrlTable', setting);
});

function search() {
	$MB.refreshTable('detpTransCtrlTable');
}

function refresh() {
    $(".detpTransCtrl-table-form")[0].reset();
    search();
}

function deleteDetpTransCtrls() {
    var ids = $("#detpTransCtrlTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的机构交易控制信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中机构交易控制信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'detpTransCtrl/delete', { "deptnbr": ids[0].deptnbr,"payTypeCd": ids[0].payTypeCd,"channelNBR": ids[0].channelNBR }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
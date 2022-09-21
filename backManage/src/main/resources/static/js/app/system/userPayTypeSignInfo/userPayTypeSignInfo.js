$(function() {
	var setting = {
        id: 'signnbr',
        code: 'signnbr',
        url: ctx + 'userPayTypeSignInfo/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                signnbr: $(".userPayTypeSignInfo-table-form").find("input[name='signnbr']").val().trim(),
                signtypcd: $(".userPayTypeSignInfo-table-form").find("input[name='signtypcd']").val().trim()
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '签约编号',
                field: 'signnbr'
            },
//            {
//                title: '签约状态',
//                field: 'signStatus',
//                formatter: function (value, row, index) {
//                    if (value === '0') return '已签约';
//                    else if (value === '1') return '已解约';
//                    else if (value === '2') return '预签约';
//                    else if (value === '3') return '初始状态';
//                    else return '';
//                }
//            },
            {
                title: '支付产品类型',
                field: 'signtypcd'
            },
            {
                title: '签约状态',
                field: 'signstatus',
                formatter: function (value, row, index) {
                  if (value === '0') return '开启';
                  else if (value === '2') return '关闭';
              }
            },
            {
                title: '签约名称',
                field: 'signname'
            },
            {
                title: '用户编号',
                field: 'usernbr'
            },
            {
                title: '柜员号',
                field: 'teller'
            },
            {
                title: '签约手机号',
                field: 'signmobile'
            },
            {
                title: '签约卡号',
                field: 'signcardnbr'
            },
            {
                title: '账户性质',
                field: 'acctkindcd'
            },
            {
                title: '签约日期',
                field: 'signdate'
            }
        ]
    };

    $MB.initTable('dayuserPayTypeSignInfoTable', setting);
});

function search() {
	$MB.refreshTable('dayuserPayTypeSignInfoTable');
}

function refresh() {
    $(".userPayTypeSignInfo-table-form")[0].reset();
    search();
}

function deleteSignInfo() {debugger;
    var ids = $("#dayuserPayTypeSignInfoTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的签约信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中签约信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'userPayTypeSignInfo/delete', { "signnbr": ids[0].signnbr,"signtypcd": ids[0].signtypcd}, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
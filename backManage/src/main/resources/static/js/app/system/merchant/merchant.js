$(function() {
	var setting = {
        id: 'merId',
        code: 'merId',
        url: ctx + 'merchant/list',
        pageSize: 10,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                merId: $(".merchant-table-form").find("input[name='merId']").val().trim()
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '商户号',
                field: 'merId'
            },
            {
                title: '商户名称',
                field: 'merName'
            },
            {
                title: '商户客户号',
                field: 'merCifno'
            },
            {
                title: '商户状态',
                field: 'merStatus',
                formatter: function (value, row, index) {
                    if (value === '0') return '<span class="badge badge-success">正常</span>';
                    else if (value === '1') return '<span class="badge badge-warning">停用</span>';
                    else return '<span class="badge badge-danger">注销</span>';
                }
            }
        ]
    };

    $MB.initTable('merchantTable', setting);
});

function search() {
	$MB.refreshTable('merchantTable');
}

function refresh() {
    $(".merchant-table-form")[0].reset();
    search();
}

function deleteMerchants() {
    var ids = $("#merchantTable").bootstrapTable("getSelections");
    var ids_arr = "";
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的商户！");
        return;
    }
    for (var i = 0; i < ids.length; i++) {
        ids_arr += ids[i].merId;
        if (i !== (ids.length - 1)) ids_arr += ",";
    }
    $MB.confirm({
        text: "确定删除选中商户？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'merchant/delete', { "merIds": ids_arr }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}

function exportDeptExcel(){
	$.post(ctx+"dept/excel",$(".dept-table-form").serialize(),function(r){
		if (r.code === 0) {
			window.location.href = "common/download?fileName=" + r.msg + "&delete=" + true;
		} else {
			$MB.n_warning(r.msg);
		}
	});
}

function exportDeptCsv(){
	$.post(ctx+"dept/csv",$(".dept-table-form").serialize(),function(r){
		if (r.code === 0) {
			window.location.href = "common/download?fileName=" + r.msg + "&delete=" + true;
		} else {
			$MB.n_warning(r.msg);
		}
	});
}
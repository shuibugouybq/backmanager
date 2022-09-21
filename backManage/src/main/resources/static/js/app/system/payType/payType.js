$(function() {
	var setting = {
        id: 'paytypcd',
        code: 'paytypcd',
        url: ctx + 'payType/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
       queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                paytypcd: $(".daypayType-table-form").find("input[name='paytypcd']").val().trim()
                
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '支付产品编号',
                field: 'paytypcd'
            },
            {
                title: '支付产品名称',
                field: 'paytypdesc'
            },
            {
                title: '支持产品状态',
                field: 'status',
                formatter: function (value, row, index) {
                    if (value === '001') return '有效';
                    else if (value === '000') return '无效';
                    else return '';
                }
            },
            {
                title: '创建时间',
                field: 'createtime'
            },
            {
                title: '生效时间',
                field: 'starttime'
            },
            {
                title: '结束时间',
                field: 'endtime'
            }]        
    };

    $MB.initTable('daypayTypeTable', setting);
	$MB.calenders('input[name="starttime"]', false, false, true);
	$MB.calenders('input[name="endtime"]', false, false, true);
});

function search() {
	$MB.refreshTable('daypayTypeTable');
}

function refresh() {
    $(".daypayType-table-form")[0].reset();
    search();
}

function deleteScore() {
    var ids = $("#daypayTypeTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的产品基本信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中产品基本信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'payType/delete', { "paytypcd": ids[0].paytypcd }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
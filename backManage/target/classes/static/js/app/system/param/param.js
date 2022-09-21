$(function() {
	var setting = {
        id: 'id',
        code: 'id',
        url: ctx + 'param/list',
        pageSize: 10,
        singleSelect: false,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                parentParmaId: $(".param-table-form").find("input[name='parentParmaId']").val().trim(),
                paramValue: $(".param-table-form").find("input[name='paramValue']").val().trim(),
                paramName: $(".param-table-form").find("input[name='paramName']").val().trim()
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: 'ID',
                field: 'id'
            },
            {
                title: '版本号',
                field: 'version'
            },
            {
                title: '字典名称',
                field: 'parentParmaId'
            },
            {
                title: '类型',
                field: 'paramType'
            },
            {
                title: '参数id',
                field: 'paramId'
            },
            {
            	title: '参数值',
            	field: 'paramValue'
            },
            {
            	title: '参数名',
            	field: 'paramName'
            },
            {
            	title: '创建时间',
            	field: 'createTime'
            },
            {
            	title: '更新时间',
            	field: 'updateTime'
            }
        ]
    };

    $MB.initTable('paramTable', setting);
});

function search() {
	$MB.refreshTable('paramTable');
}

function refresh() {
    $(".param-table-form")[0].reset();
    search();
}

function deleteParams() {
    var ids = $("#paramTable").bootstrapTable("getSelections");
    var ids_arr = "";
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的字典数据！");
        return;
    }
    for (var i = 0; i < ids.length; i++) {
        ids_arr += ids[i].id;
        if (i !== (ids.length - 1)) ids_arr += ",";
    }
    $MB.confirm({
        text: "确定删除选中字典数据？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'param/delete', { "ids": ids_arr }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
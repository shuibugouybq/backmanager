$(function() {
	var setting = {
        id: 'channelId',
        code: 'channelId',
        url: ctx + 'agency/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                agencynbr: $(".agency-table-form").find("input[name='agencynbr']").val().trim()
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '代理商编号',
                field: 'agencynbr'
            },
            {
                title: '代理商名称',
                field: 'agencyname'
            },
            {
                title: '代理商联系方式',
                field: 'agencytelphone'
            },
            {
                title: '代理商地址',
                field: 'agencyaddress'
            },
            {
                title: '代理商邮箱地址',
                field: 'agencymail'
            },
            {
            	title: '代理商服务电话',
            	field: 'agencyservicephone'
            },
            {
            	title: '代理商营业执照号',
            	field: 'agencylicenseid'
            },
            {
            	title: '代理商法人代表姓名',
            	field: 'agencyporationname'
            },
            {
            	title: '代理商法人代表身份证件类型',
            	field: 'agencyporationpapertyp'
            },
            {
            	title: '代理商法人代表身份证件号',
            	field: 'agencyporationpapernbr'
            },
            {
            	title: '代理商信息备注',
            	field: 'agencyremark'
            },
            {
            	title: '代理商结算账户',
            	field: 'agencysettleacct'
            },
            {
            	title: '代理商分润标识',
            	field: 'agencyprofitnbr'
            }
        ]
    };

    $MB.initTable('agencyTable', setting);
});

function search() {
	$MB.refreshTable('agencyTable');
}

function refresh() {
    $(".agency-table-form")[0].reset();
    search();
}

function deleteAgencys() {
    var ids = $("#agencyTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的代理商信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中代理商信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'agency/delete', { "agencynbr": ids[0].agencynbr }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
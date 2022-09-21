$(function() {
	var setting = {
        id: 'merId',
        code: 'merId',
        url: ctx + 'merRiskLevel/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                rislevel: $(".merRiskLevel-table-form").find("input[name='rislevel']").val().trim()
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '商户编号',
                field: 'merId'
            },
            {
                title: '商户名称',
                field: 'merName'
            },
            {
                title: '商户营业执照号',
                field: 'merBusinessLicenseId'
            },
            {
                title: '商户法人代表名称',
                field: 'merCorporationName'
            },
            {
                title: '商户法人代表身份证件号',
                field: 'merCorporationPaperId',
            },
            {
                title: '预警处理时间',
                field: 'warndatetime',
            },
            {
                title: '预警处理人员',
                field: 'warndealman',
            },
            {
                title: '商户处理结果',
                field: 'merdealresult',
            },
            {
                title: '风险等级',
                field: 'rislevel',
            }
        ]
    };

    $MB.initTable('merRiskLevelTable', setting);
});

function search() {
	$MB.refreshTable('merRiskLevelTable');
}

function refresh() {
    $(".merRiskLevel-table-form")[0].reset();
    search();
}

/*function deleteChannelLimitCtrls() {
    var ids = $("#channelLimitCtrlTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的通道限额信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中通道限额信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'channelLimitCtrl/delete', { "channelId": ids[0].channelId,"channelType": ids[0].channelType }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}*/
$(function() {
	var setting = {
        id: 'rateId',
        code: 'rateId',
        url: ctx + 'channelRate/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
       queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                rateId: $(".dayChannelRate-table-form").find("input[name='rateId']").val().trim()
                
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '编号',
                field: 'rateId'
            },
            {
                title: '第三方公司编号',
                field: 'companyId'
            },
            {
                title: '第三方公司名称',
                field: 'companyName'
            },
            {
                title: '网上支付',
                field: 'ratePayment'
            },
            {
                title: '单笔和总额的金额体现',
                field: 'rateAmount'
            },
            {
                title: '1.每笔/2.总笔',
                field: 'rateUnit'
            },
            {
                title: '收费标准',
                field: 'price'
            },
            {
                title: '单笔费率',
                field: 'singleRate'
            },
            {
                title: '总额费率',
                field: 'allRate'
            },
            {
                title: '阶梯费率1',
                field: 'ladderPrice1'
            },
            {
                title: '阶梯费率区间1',
                field: 'ladderInterval1'
            },
            {
                title: '阶梯费率区间2',
                field: 'ladderInterval2'
            },
            {
                title: '阶梯费率3',
                field: 'ladderPrice3'
            },
            {
                title: '阶梯费率区间3',
                field: 'ladderInterval3'
            },
            {
                title: '阶梯费率4',
                field: 'ladderPrice4'
            },
            {
                title: '阶梯费率区间4',
                field: 'ladderInterval4'
            },
            {
                title: '阶梯费率5',
                field: 'ladderPrice5'
            },
            {
                title: '阶梯费率区间5',
                field: 'ladderInterval5'
            },
            {
                title: '预留1',
                field: 'remark1'
            },
            {
                title: '预留2',
                field: 'remark2'
            },
            {
                title: '预留3',
                field: 'remark3'
            },
            {
                title: '预留4',
                field: 'remark4'
            },
            {
                title: '预留5',
                field: 'remark5'
            }]        
    };

    $MB.initTable('dayChannelRateTable', setting);
//	$MB.calenders('input[name="channelDateTime"]', false, false, true);
});

function search() {
	$MB.refreshTable('dayChannelRateTable');
}

function refresh() {
    $(".dayChannelRate-table-form")[0].reset();
    search();
}

function deleteScore() {
    var ids = $("#dayChannelRateTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的通道费率！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中通道费率？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'channelRate/delete', { "rateId": ids[0].rateId }, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
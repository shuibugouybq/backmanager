$(function() {
	var setting = {
        id: 'channelId',
        code: 'channelId',
        url: ctx + 'deptAcctInfo/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                deptnbr: $(".deptAcctInfo-table-form").find("input[name='deptnbr']").val().trim(),
                acctnbr: $(".deptAcctInfo-table-form").find("input[name='acctnbr']").val().trim(),
                acctdeptnbr: $(".deptAcctInfo-table-form").find("input[name='acctdeptnbr']").val().trim()
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
                title: '商户类型',
                field: 'inneracctcfmmode'
            },
            {
                title: '账号',
                field: 'acctnbr'
            },
            {
                title: '账户名称',
                field: 'acctname'
            },
            {
                title: '账户性质',
                field: 'acctkindcd'/*,
                formatter: function (value, row, index) {
                    if (value === '1') return '借记卡';
                    else if (value === '2') return '贷记卡';
                    else if (value === '3') return '准贷记卡';
                    else return '预付费卡';
                }*/
            },
            {
            	title: '账户机构号',
            	field: 'acctdeptnbr'
            },
            {
            	title: '账户所属行号',
            	field: 'acctbanknbr'
            },
            {
            	title: '手续费账号',
            	field: 'feeacctnbr'
            },
            {
            	title: '手续费账户性质',
            	field: 'feeacctkind'
            },
            {
            	title: '手续费账号名称',
            	field: 'feeacctname'
            },
            {
            	title: '虚拟柜员号',
            	field: 'virtualtellernbr'
            },
            {
            	title: '柜员所属机构号',
            	field: 'tellerdeptnbr'
            }
        ]
    };

    $MB.initTable('deptAcctInfoTable', setting);
});

function search() {
	$MB.refreshTable('deptAcctInfoTable');
}

function refresh() {
    $(".deptAcctInfo-table-form")[0].reset();
    search();
}

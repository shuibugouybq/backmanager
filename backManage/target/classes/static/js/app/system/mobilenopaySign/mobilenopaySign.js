$(function() {
	var setting = {
        id: 'signId',
        code: 'signId',
        url: ctx + 'mobilenopaySign/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
        queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                userMobile: $(".mobilenopaySign-table-form").find("input[name='userMobile']").val().trim(),
                signAcctNo: $(".mobilenopaySign-table-form").find("input[name='signAcctNo']").val().trim()
            };
        },
        columns: [
            {
                title: '签约流水',
                field: 'signId'
            },
            {
                title: '手机号',
                field: 'userMobile'
            },
            {
                title: '卡类型',
                field: 'signAcctType'
            },
            {
                title: '卡号',
                field: 'signAcctNo'
            },
            {
                title: '证件类型',
                field: 'userCertType'
            },
            {
                title: '证件号码',
                field: 'userCertNo'
            },
            {
                title: '签约日期',
                field: 'userOpenDate'
            },
            {
                title: '解约日期',
                field: 'userModifyDate'
            },
            {
                title: '证件有效期',
                field: 'userCertEffectDate'
            },
            {
                title: '签约状态',
                field: 'signStatus'
            },
            {
                title: 'cvv2',
                field: 'cvv2'
            },
            {
                title: '有效期',
                field: 'validateDate'
            },
            {
                title: '所属银行',
                field: 'bankflag'
            },
            {
                title: '银行号',
                field: 'bankId'
            }
        ]
    };

    $MB.initTable('mobilenopaySignTable', setting);
});

function search() {
	$MB.refreshTable('mobilenopaySignTable');
}

function refresh() {
    $(".mobilenopaySign-table-form")[0].reset();
    search();
}
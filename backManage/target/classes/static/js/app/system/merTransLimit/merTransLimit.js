$(function() {
	var setting = {
        id: 'paytypcd',
        code: 'paytypcd',
        url: ctx + 'merTransLimit/list',
        pageSize: 10,
        singleSelect: true,
        pageList: [5, 10, 25, 50, 100],
       queryParams: function (params) {
            return {
                pageSize: params.limit,
                pageNum: params.offset / params.limit + 1,
                paytypcd: $(".merTransLimit-table-form").find("input[name='paytypcd']").val().trim()
                
            };
        },
        columns: [{
                field: 'selectItem',
                checkbox: true
            },
            {
                title: '商户号',
                field: 'mernbr'
            },
            {
                title: '交易类型',
                field: 'transtypcd'
            },
            {
                title: '支付产品',
                field: 'paytypcd'
            },
            {
                title: '卡类型',
                field: 'cardtypcd'
            },
            {
                title: '渠道号',
                field: 'channelnbr'
            },
            {
                title: '单笔限额',
                field: 'pertranslimit'
            },
            {
                title: '状态',
                field: 'status',
                formatter: function (value, row, index) {
                  if (value === '1') return '开通';
                  else if (value === '0') return '关闭';
                  else return '';
              }
            },
            {
                title: '操作',
                field: 'status',
                formatter: function (value, row, index) {
	                  if (value === '1'){
	                	  return  "<a href='#' onclick='offline(\"" + row.mernbr  + "\",\"" + row.transtypcd  + "\",\"" + row.paytypcd  + "\",\"" + row.cardtypcd  + "\",\"" + row.channelnbr  + "\",\"" + row.status + "\")'>关闭</a>";
	                  }
                else if (value === '0') {
	                	  return  "<a href='#' onclick='offline(\"" + row.mernbr  + "\",\"" + row.transtypcd  + "\",\"" + row.paytypcd  + "\",\"" + row.cardtypcd  + "\",\"" + row.channelnbr  + "\",\"" + row.status + "\")'>开通</a>";
	                  } else return '';
                 }
            }
        ]
    };

    $MB.initTable('daymerTransLimitTable', setting);
//	$MB.calenders('input[name="paytypcd"]', false, false, true);
});

function offline(mernbr,transtypcd,paytypcd,cardtypcd,channelnbr,status){
	
	
	if(status==='1'){
		var status='0';
	}else{
		var status='1';
	}
	
    $.post(ctx + "merTransLimit/update", {"mernbr":mernbr,"transtypcd":transtypcd,"paytypcd":paytypcd,"cardtypcd":cardtypcd,"channelnbr":channelnbr,"status":status}, function (r) {
    	if (r.code === 0) search();
    }, "json");
}
function search() {
	$MB.refreshTable('daymerTransLimitTable');
}

function refresh() {
    $(".merTransLimit-table-form")[0].reset();
    search();
}

function deleteScore() {
    var ids = $("#daymerTransLimitTable").bootstrapTable("getSelections");
    if (!ids.length) {
        $MB.n_warning("请勾选需要删除的项目信息！");
        return;
    }
    $MB.confirm({
        text: "确定删除选中项目信息？",
        confirmButtonText: "确定删除"
    }, function() {
        $.post(ctx + 'merTransLimit/delete', { "paytypcd": ids[0].paytypcd,"transtypcd":ids[0].transtypcd,"channelnbr":ids[0].channelnbr,"cardtypcd":ids[0].cardtypcd,"mernbr":ids[0].mernbr}, function(r) {
            if (r.code === 0) {
                $MB.n_success(r.msg);
                refresh();
            } else {
                $MB.n_danger(r.msg);
            }
        });
    });
}
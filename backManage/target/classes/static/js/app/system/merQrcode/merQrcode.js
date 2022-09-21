function search() {
	loadQRCode();
}

function refresh() {
    $(".merQrcode-table-form")[0].reset();
    $("#merQRImg").attr("src", "");
}

function loadQRCode() {
	var merId = $(".merQrcode-table-form").find("input[name='merId']").val().trim();
    $.post(ctx+"merQrcode/checkMerchant",{"merId": merId},function(r){
		if (r.code === 0) {
			$("#merQRImg").attr("src", ctx + "merQrcode/getMerQrcode?merId=" + merId + "&tmp=" + new Date() + "");
		} else {
			$MB.n_warning(r.msg);
		}
	});
}
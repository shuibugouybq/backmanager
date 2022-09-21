function updateMerchant() {
	closeModal();
    var selected = $("#merchantTable").bootstrapTable("getSelections");
    var selected_length = selected.length;
    if (!selected_length) {
        $MB.n_warning('请勾选需要修改的商户！');
        return;
    }
    if (selected_length > 1) {
        $MB.n_warning('一次只能修改一个商户！');
        return;
    }
    var merId = selected[0].merId;
    $.post(ctx + "merchant/getMerchant", {"merId": merId}, function (r) {
        if (r.code === 0) {debugger;
            var $form = $('#merchant-add');
            $form.modal();
            var merchant = r.msg;
            $("#merchant-add-modal-title").html('修改商户信息');
            $form.find("input[name='merId']").val(merchant.merId);
            $form.find("input[name='merCifno']").val(merchant.merCifno);
            $form.find("input[name='merBusinessopendate']").val(merchant.merBusinessopendate);
            $form.find("input[name='merName']").val(merchant.merName);
            $form.find("input[name='merBriefname']").val(merchant.merBriefname);
            $form.find("input[name='merRegcapital']").val(merchant.merRegcapital);
            $form.find("select[name='merProperty']").val(merchant.merProperty);
            $form.find("input[name='merBusinesslicenseid']").val(merchant.merBusinesslicenseid);
            $form.find("input[name='merTaxregid']").val(merchant.merTaxregid);
            $form.find("input[name='merAddr']").val(merchant.merAddr);
            $form.find("input[name='merRepurl']").val(merchant.merRepurl);
            $form.find("input[name='merCorporationname']").val(merchant.merCorporationname);
            $form.find("select[name='merCorporationpapertype']").val(merchant.merCorporationpapertype);
            $form.find("input[name='merCorporationpaperid']").val(merchant.merCorporationpaperid);
            $form.find("input[name='merSitename']").val(merchant.merSitename);
            $form.find("input[name='merDomain']").val(merchant.merDomain);
            $form.find("input[name='merSiteiport']").val(merchant.merSiteiport);
            $form.find("input[name='merSitecode']").val(merchant.merSitecode);
            $form.find("select[name='merIfvirtrualgoods']").val(merchant.merIfvirtrualgoods);
            $form.find("input[name='merSpeciallicense']").val(merchant.merSpeciallicense);
            $form.find("input[name='merLicenese']").val(merchant.merLicenese);
            
            $form.find("input[name='merLinkmanname']").val(merchant.merLinkmanname);
            $form.find("input[name='merLinkmanphone']").val(merchant.merLinkmanphone);
            $form.find("input[name='merLinkmantel']").val(merchant.merLinkmantel);
            $form.find("input[name='merLinkmanemail']").val(merchant.merLinkmanemail);
            $form.find("input[name='merTechlinkname']").val(merchant.merTechlinkname);
            $form.find("input[name='merTechlinkmanphone']").val(merchant.merTechlinkmanphone);
            $form.find("input[name='merTechlinkmantel']").val(merchant.merTechlinkmantel);
            $form.find("input[name='merTechlinkmanemail']").val(merchant.merTechlinkmanemail);
            $form.find("input[name='merFax']").val(merchant.merFax);
            $form.find("input[name='merSettacctno']").val(merchant.merSettacctno);
            $form.find("input[name='merSettacctname']").val(merchant.merSettacctname);
            $form.find("input[name='merOpendeptid']").val(merchant.merOpendeptid);
            $form.find("input[name='merDevelopdeptid']").val(merchant.merDevelopdeptid);
            
            $form.find("select[name='merStatus']").val(merchant.merStatus);
            $form.find("select[name='merLevel']").val(merchant.merLevel);
            $form.find("select[name='merServicetype']").val(merchant.merServicetype);
            $form.find("input[name='merTranstype']").val(merchant.merTranstype);
            $form.find("select[name='merSettperiod']").val(merchant.merSettperiod);
            $form.find("select[name='merSettmode']").val(merchant.merSettmode);
            $form.find("select[name='merSettaccttype']").val(merchant.merSettaccttype);
            $form.find("select[name='merFeemode']").val(merchant.merFeemode);
            $form.find("input[name='merFeeamt']").val(merchant.merFeeamt);
            $form.find("select[name='merFeesettperiod']").val(merchant.merFeesettperiod);
            var servicesArray = merchant.merWorkscop.split(",");
            $("input[type=checkbox][name=merWorkscop]").each(function (i, e) {
                for (var i = 0; i < servicesArray.length; i++) {
                    if ($(this).val() == servicesArray[i]) {
                    	this.checked=true;
                    }
                }
            });
            $("#merchant-add-button").attr("name", "update");
        } else {
            $MB.n_danger(r.msg);
        }
    });
}
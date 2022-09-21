package cc.mrbird.system.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cc.mrbird.common.annotation.Log;
import cc.mrbird.common.controller.BaseController;
import cc.mrbird.common.domain.QueryRequest;
import cc.mrbird.common.domain.ResponseBo;
import cc.mrbird.system.domain.CustomerSign;
import cc.mrbird.system.service.CustomerSignService;

@Controller
public class CustomerSignController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CustomerSignService customerSignService;

    @Log("用户支付产品签约查询")
    @RequestMapping("customerSign")
    @RequiresPermissions("customerSign:list")
    public String index() {
        return "system/customerSign/customerSign";
    }

    /*@RequestMapping("cardbin/getCardbin")
    @ResponseBody
    public ResponseBo getCardbin(CardBin cardbin) {
        try {
        	CardBin cardbin1 = this.cardBinService.findById(cardbin);
            return ResponseBo.ok(cardbin1);
        } catch (Exception e) {
            log.error("获取卡BIN信息失败", e);
            return ResponseBo.error("获取卡BIN信息失败，请联系网站管理员！");
        }
    }*/

    @RequestMapping("customerSign/list")
    @RequiresPermissions("customerSign:list")
    @ResponseBody
    public Map<String, Object> customerSignList(QueryRequest request,CustomerSign customerSign) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<CustomerSign> list = this.customerSignService.findAllCustomerSigns(customerSign);
        PageInfo<CustomerSign> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("删除用户支付产品签约")
    @RequiresPermissions("customerSign:delete")
    @RequestMapping("customerSign/delete")
    @ResponseBody
    public ResponseBo deleteCustomerSign(CustomerSign customerSign) {
        try {
            this.customerSignService.deleteCustomerSign(customerSign);
            return ResponseBo.ok("删除用户支付产品签约成功！");
        } catch (Exception e) {
            log.error("删除用户支付产品签约失败", e);
            return ResponseBo.error("删除用户支付产品签约失败，请联系网站管理员！");
        }
    }

    @Log("修改用户支付产品签约 ")
    @RequiresPermissions("customerSign:update")
    @RequestMapping("customerSign/update")
    @ResponseBody
    public ResponseBo updateCustomerSign(CustomerSign customerSign) {
        try {
            this.customerSignService.updateCustomerSign(customerSign);
            return ResponseBo.ok("修改用户支付产品签约成功！");
        } catch (Exception e) {
            log.error("修改用户支付产品签约失败", e);
            return ResponseBo.error("修改用户支付产品签约失败，请联系网站管理员！");
        }
    }
}

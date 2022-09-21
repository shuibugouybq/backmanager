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
import cc.mrbird.system.domain.UppMarketingOrder;
import cc.mrbird.system.service.UppMarketingOrderService;

@Controller
public class UppMarketingOrderController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UppMarketingOrderService uppMarketingOrderService;

    @Log("营销订单查询")
    @RequestMapping("uppMarketingOrder")
    @RequiresPermissions("uppMarketingOrder:list")
    public String index() {
        return "system/uppMarketingOrder/uppMarketingOrder";
    }

    @RequestMapping("uppMarketingOrder/list")
    @RequiresPermissions("uppMarketingOrder:list")
    @ResponseBody
    public Map<String, Object> transQueryList(QueryRequest request,UppMarketingOrder uppMarketingOrder) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<UppMarketingOrder> list = this.uppMarketingOrderService.transQuery(uppMarketingOrder);
        PageInfo<UppMarketingOrder> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

}

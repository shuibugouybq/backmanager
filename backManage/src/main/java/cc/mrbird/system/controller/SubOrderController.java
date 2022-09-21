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
import cc.mrbird.system.domain.SubOrder;
import cc.mrbird.system.service.SubOrderService;

@Controller
public class SubOrderController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private SubOrderService subOrderService;

    @Log("子订单表")
    @RequestMapping("subOrder")
    @RequiresPermissions("subOrder:list")
    public String index() {
        return "system/subOrder/SubOrder";
    }


    @RequestMapping("subOrder/list")
    @RequiresPermissions("subOrder:list")
    @ResponseBody
    public Map<String, Object> subOrderList(QueryRequest request,SubOrder subOrder) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<SubOrder> list = this.subOrderService.listQuery(subOrder);
        PageInfo<SubOrder> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

}

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
import cc.mrbird.system.domain.MerAccumulatedAmount;
import cc.mrbird.system.service.MerAccumulatedAmountService;

@Controller
public class MerAccumulatedAmountController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MerAccumulatedAmountService merAccumulatedAmountService;

    @Log("商户累计金额查询")
    @RequestMapping("merAccumulatedAmount")
    @RequiresPermissions("merAccumulatedAmount:list")
    public String index() {
        return "system/merAccumulatedAmount/merAccumulatedAmount";
    }

    @RequestMapping("merAccumulatedAmount/list")
    @RequiresPermissions("merAccumulatedAmount:list")
    @ResponseBody
    public Map<String, Object> transQueryList(QueryRequest request,MerAccumulatedAmount merAccumulatedAmount) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<MerAccumulatedAmount> list = this.merAccumulatedAmountService.transQuery(merAccumulatedAmount);
        PageInfo<MerAccumulatedAmount> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

}

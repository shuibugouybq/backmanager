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
import cc.mrbird.system.domain.UppMarketingDayset;
import cc.mrbird.system.service.UppMarketingDaysetService;

@Controller
public class UppMarketingDaysetController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UppMarketingDaysetService uppMarketingDaysetService;

    @Log("营销日结查询")
    @RequestMapping("uppMarketingDayset")
    @RequiresPermissions("uppMarketingDayset:list")
    public String index() {
        return "system/uppMarketingDayset/uppMarketingDayset";
    }

    @RequestMapping("uppMarketingDayset/list")
    @RequiresPermissions("uppMarketingDayset:list")
    @ResponseBody
    public Map<String, Object> transQueryList(QueryRequest request,UppMarketingDayset uppMarketingDayset) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<UppMarketingDayset> list = this.uppMarketingDaysetService.transQuery(uppMarketingDayset);
        PageInfo<UppMarketingDayset> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

}

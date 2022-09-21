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
import cc.mrbird.system.domain.UppBatchMerDaysett;
import cc.mrbird.system.service.UppBatchMerDaysettService;

@Controller
public class UppBatchMerDaysettController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UppBatchMerDaysettService uppBatchMerDaysettService;

    @Log("商户每日应结款项查询")
    @RequestMapping("uppBatchMerDaysett")
    @RequiresPermissions("uppBatchMerDaysett:list")
    public String index() {
        return "system/uppBatchMerDaysett/uppBatchMerDaysett";
    }

    @RequestMapping("uppBatchMerDaysett/list")
    @RequiresPermissions("uppBatchMerDaysett:list")
    @ResponseBody
    public Map<String, Object> transQueryList(QueryRequest request,UppBatchMerDaysett uppBatchMerDaysett) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<UppBatchMerDaysett> list = this.uppBatchMerDaysettService.transQuery(uppBatchMerDaysett);
        PageInfo<UppBatchMerDaysett> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

}

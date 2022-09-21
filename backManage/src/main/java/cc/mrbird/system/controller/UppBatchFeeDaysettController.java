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
import cc.mrbird.system.domain.UppBatchFeeDaysett;
import cc.mrbird.system.service.UppBatchFeeDaysettService;

@Controller
public class UppBatchFeeDaysettController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UppBatchFeeDaysettService uppBatchFeeDaysettService;

    @Log("手续费每日结算查询")
    @RequestMapping("uppBatchFeeDaysett")
    @RequiresPermissions("uppBatchFeeDaysett:list")
    public String index() {
        return "system/uppBatchFeeDaysett/uppBatchFeeDaysett";
    }

    @RequestMapping("uppBatchFeeDaysett/list")
    @RequiresPermissions("uppBatchFeeDaysett:list")
    @ResponseBody
    public Map<String, Object> transQueryList(QueryRequest request,UppBatchFeeDaysett uppBatchFeeDaysett) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<UppBatchFeeDaysett> list = this.uppBatchFeeDaysettService.transQuery(uppBatchFeeDaysett);
        PageInfo<UppBatchFeeDaysett> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

}

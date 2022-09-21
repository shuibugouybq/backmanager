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
import cc.mrbird.system.domain.OtTrans;
import cc.mrbird.system.domain.UppBatchMersett;
import cc.mrbird.system.service.UppBatchMersettService;

@Controller
public class UppBatchMersettController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UppBatchMersettService uppBatchMersettService;

    @Log("商户结算查询")
    @RequestMapping("uppBatchMersett")
    @RequiresPermissions("uppBatchMersett:list")
    public String index() {
        return "system/uppBatchMersett/uppBatchMersett";
    }

    @RequestMapping("uppBatchMersett/list")
    @RequiresPermissions("uppBatchMersett:list")
    @ResponseBody
    public Map<String, Object> transQueryList(QueryRequest request,UppBatchMersett uppBatchMersett) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<UppBatchMersett> list = this.uppBatchMersettService.transQuery(uppBatchMersett);
        PageInfo<UppBatchMersett> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

}

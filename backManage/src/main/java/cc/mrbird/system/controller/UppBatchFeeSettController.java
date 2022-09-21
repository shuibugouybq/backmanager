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
import cc.mrbird.system.domain.UppBatchFeeSett;
import cc.mrbird.system.service.UppBatchFeeSettService;

@Controller
public class UppBatchFeeSettController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UppBatchFeeSettService uppBatchFeeSettService;

    @Log("手续费结算查询")
    @RequestMapping("uppBatchFeeSett")
    @RequiresPermissions("uppBatchFeeSett:list")
    public String index() {
        return "system/uppBatchFeeSett/uppBatchFeeSett";
    }

    @RequestMapping("uppBatchFeeSett/list")
    @RequiresPermissions("uppBatchFeeSett:list")
    @ResponseBody
    public Map<String, Object> transQueryList(QueryRequest request,UppBatchFeeSett uppBatchFeeSett) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<UppBatchFeeSett> list = this.uppBatchFeeSettService.transQuery(uppBatchFeeSett);
        PageInfo<UppBatchFeeSett> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

}

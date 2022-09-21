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
import cc.mrbird.system.domain.UppBatchFeeTrans;
import cc.mrbird.system.service.UppBatchFeeTransService;

@Controller
public class UppBatchFeeTransController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UppBatchFeeTransService uppBatchFeeTransService;

    @Log("手续费台账查询")
    @RequestMapping("uppBatchFeeTrans")
    @RequiresPermissions("uppBatchFeeTrans:list")
    public String index() {
        return "system/uppBatchFeeTrans/uppBatchFeeTrans";
    }

    @RequestMapping("uppBatchFeeTrans/list")
    @RequiresPermissions("uppBatchFeeTrans:list")
    @ResponseBody
    public Map<String, Object> transQueryList(QueryRequest request,UppBatchFeeTrans uppBatchFeeTrans) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<UppBatchFeeTrans> list = this.uppBatchFeeTransService.transQuery(uppBatchFeeTrans);
        PageInfo<UppBatchFeeTrans> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

}

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
import cc.mrbird.system.domain.UppBatchHostTrans;
import cc.mrbird.system.service.UppBatchHostTransService;

@Controller
public class UppBatchHostTransController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UppBatchHostTransService uppBatchHostTransService;

    @Log("对账核心提取")
    @RequestMapping("uppBatchHostTrans")
    @RequiresPermissions("uppBatchHostTrans:list")
    public String index() {
        return "system/uppBatchHostTrans/UppBatchHostTrans";
    }


    @RequestMapping("uppBatchHostTrans/list")
    @RequiresPermissions("uppBatchHostTrans:list")
    @ResponseBody
    public Map<String, Object> uppBatchHostTransList(QueryRequest request,UppBatchHostTrans uppBatchHostTrans) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<UppBatchHostTrans> list = this.uppBatchHostTransService.listQuery(uppBatchHostTrans);
        PageInfo<UppBatchHostTrans> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

}

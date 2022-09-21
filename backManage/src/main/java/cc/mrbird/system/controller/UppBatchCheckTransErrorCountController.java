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
import cc.mrbird.system.domain.UppBatchCheckTransError;
import cc.mrbird.system.service.UppBatchCheckTransErrorService;

@Controller
public class UppBatchCheckTransErrorCountController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UppBatchCheckTransErrorService uppBatchCheckTransErrorService;

    @Log("获取对账差错统计")
    @RequestMapping("uppBatchCheckTransErrorCount")
    @RequiresPermissions("uppBatchCheckTransErrorCount:list")
    public String index() {
        return "system/uppBatchCheckTransError/uppBatchCheckTransErrorCount";
    }
    
    @RequestMapping("uppBatchCheckTransErrorCount/list")
    @RequiresPermissions("uppBatchCheckTransErrorCount:list")
    @ResponseBody
    public Map<String, Object> uppBatchCheckTransErrorCountList(QueryRequest request,UppBatchCheckTransError upp) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<UppBatchCheckTransError> list = this.uppBatchCheckTransErrorService.getCheckErrorCount(upp);
        PageInfo<UppBatchCheckTransError> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }


}

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
import cc.mrbird.common.domain.ResponseBo;
import cc.mrbird.system.domain.UppBatchCheckTransError;
import cc.mrbird.system.service.UppBatchCheckTransErrorService;

@Controller
public class UppBatchCheckTransErrorController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UppBatchCheckTransErrorService uppBatchCheckTransErrorService;

    @Log("获取对账差错明细信息")
    @RequestMapping("uppBatchCheckTransError")
    @RequiresPermissions("uppBatchCheckTransError:list")
    public String index() {
        return "system/uppBatchCheckTransError/uppBatchCheckTransError";
    }

    @RequestMapping("uppBatchCheckTransError/getUppBatchCheckTransError")
    @ResponseBody
    public ResponseBo getUppBatchCheckTransError(UppBatchCheckTransError uppBatchCheckTransError) {
        try {
        	UppBatchCheckTransError uppBatchCheckTransError1 = this.uppBatchCheckTransErrorService.findById(uppBatchCheckTransError);
            return ResponseBo.ok(uppBatchCheckTransError1);
        } catch (Exception e) {
            log.error("获取对账差错明细列表信息失败", e);
            return ResponseBo.error("获取对账差错明细列表信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("uppBatchCheckTransError/list")
    @RequiresPermissions("uppBatchCheckTransError:list")
    @ResponseBody
    public Map<String, Object> uppBatchCheckTransErrorList(QueryRequest request,UppBatchCheckTransError uppBatchCheckTransError) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<UppBatchCheckTransError> list = this.uppBatchCheckTransErrorService.findAllUppBatchCheckTransErrors(uppBatchCheckTransError);
        PageInfo<UppBatchCheckTransError> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增对账差错明细 ")
    @RequiresPermissions("uppBatchCheckTransError:add")
    @RequestMapping("uppBatchCheckTransError/add")
    @ResponseBody
    public ResponseBo addUppBatchCheckTransError(UppBatchCheckTransError uppBatchCheckTransError) {
        try {
        	this.uppBatchCheckTransErrorService.addUppBatchCheckTransError(uppBatchCheckTransError);
            return ResponseBo.ok("新增对账差错明细成功！");
        } catch (Exception e) {
            log.error("新增对账差错明细失败", e);
            return ResponseBo.error("新增对账差错明细失败，请联系网站管理员！");
        }
    }

    @Log("删除对账差错明细")
    @RequiresPermissions("uppBatchCheckTransError:delete")
    @RequestMapping("uppBatchCheckTransError/delete")
    @ResponseBody
    public ResponseBo deleteUppBatchCheckTransErrors(UppBatchCheckTransError uppBatchCheckTransError) {
        try {
            this.uppBatchCheckTransErrorService.deleteUppBatchCheckTransError(uppBatchCheckTransError);
            return ResponseBo.ok("删除对账差错明细成功！");
        } catch (Exception e) {
            log.error("删除对账差错明细失败", e);
            return ResponseBo.error("删除对账差错明细失败，请联系网站管理员！");
        }
    }

    @Log("修改对账差错明细 ")
    @RequestMapping("uppBatchCheckTransError/update")
    @ResponseBody
    public ResponseBo updateUppBatchCheckTransError(UppBatchCheckTransError uppBatchCheckTransError) {
        try {
            this.uppBatchCheckTransErrorService.updateUppBatchCheckTransError(uppBatchCheckTransError);
            return ResponseBo.ok("修改对账差错明细成功！");
        } catch (Exception e) {
            log.error("修改对账差错明细失败", e);
            return ResponseBo.error("修改对账差错明细失败，请联系网站管理员！");
        }
    }
}

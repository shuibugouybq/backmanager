package cc.mrbird.system.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.session.Session;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cc.mrbird.common.annotation.Log;
import cc.mrbird.common.controller.BaseController;
import cc.mrbird.common.domain.QueryRequest;
import cc.mrbird.common.domain.ResponseBo;
import cc.mrbird.common.util.DateUtil;
import cc.mrbird.system.domain.UppBatchProcess;
import cc.mrbird.system.service.UppBatchProcessService;

@Controller
public class UppBatchProcessController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UppBatchProcessService uppBatchProcessService;

    @Log("获取进程控制信息")
    @RequestMapping("uppBatchProcess")
    @RequiresPermissions("uppBatchProcess:list")
    public String index(Model model) {
    	Session session = super.getSession();
    	Map<String, Map<String, String>> dictMap = (Map<String, Map<String, String>>) session.getAttribute("constMap");
    	model.addAttribute("AcctTpCdMap", dictMap.get("AcctTpCd"));
        return "system/uppBatchProcess/uppBatchProcess";
    }

    @RequestMapping("uppBatchProcess/getUppBatchProcess")
    @ResponseBody
    public ResponseBo getUppBatchProcess(UppBatchProcess uppBatchProcess) {
        try {
        	UppBatchProcess uppBatchProcess1 = this.uppBatchProcessService.findById(uppBatchProcess);
            return ResponseBo.ok(uppBatchProcess1);
        } catch (Exception e) {
            log.error("获取进程控制列表信息失败", e);
            return ResponseBo.error("获取进程控制列表信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("uppBatchProcess/list")
    @RequiresPermissions("uppBatchProcess:list")
    @ResponseBody
    public Map<String, Object> uppBatchProcessList(QueryRequest request,UppBatchProcess uppBatchProcess) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<UppBatchProcess> list = this.uppBatchProcessService.findAllUppBatchProcesss(uppBatchProcess);
        PageInfo<UppBatchProcess> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增进程控制 ")
    @RequiresPermissions("uppBatchProcess:add")
    @RequestMapping("uppBatchProcess/add")
    @ResponseBody
    public ResponseBo addUppBatchProcess(UppBatchProcess uppBatchProcess) {
        try {
        	uppBatchProcess.setGmtCreate(DateUtil.getCurrentDateTimeStr());
        	uppBatchProcess.setGmtModified(DateUtil.getCurrentDateTimeStr());
        	this.uppBatchProcessService.addUppBatchProcess(uppBatchProcess);
            return ResponseBo.ok("新增进程控制成功！");
        } catch (Exception e) {
            log.error("新增进程控制失败", e);
            return ResponseBo.error("新增进程控制失败，请联系网站管理员！");
        }
    }

    @Log("删除进程控制")
    @RequiresPermissions("uppBatchProcess:delete")
    @RequestMapping("uppBatchProcess/delete")
    @ResponseBody
    public ResponseBo deleteUppBatchProcesss(UppBatchProcess uppBatchProcess) {
        try {
            this.uppBatchProcessService.deleteUppBatchProcess(uppBatchProcess);
            return ResponseBo.ok("删除进程控制成功！");
        } catch (Exception e) {
            log.error("删除进程控制失败", e);
            return ResponseBo.error("删除进程控制失败，请联系网站管理员！");
        }
    }

    @Log("修改进程控制 ")
    @RequiresPermissions("uppBatchProcess:update")
    @RequestMapping("uppBatchProcess/update")
    @ResponseBody
    public ResponseBo updateUppBatchProcess(UppBatchProcess uppBatchProcess) {
        try {
        	uppBatchProcess.setGmtModified(DateUtil.getCurrentDateTimeStr());
            this.uppBatchProcessService.updateUppBatchProcess(uppBatchProcess);
            return ResponseBo.ok("修改进程控制成功！");
        } catch (Exception e) {
            log.error("修改进程控制失败", e);
            return ResponseBo.error("修改进程控制失败，请联系网站管理员！");
        }
    }
}

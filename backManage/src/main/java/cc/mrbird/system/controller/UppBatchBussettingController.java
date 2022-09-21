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
import cc.mrbird.system.domain.UppBatchBussetting;
import cc.mrbird.system.service.UppBatchBussettingService;

@Controller
public class UppBatchBussettingController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UppBatchBussettingService uppBatchBussettingService;

    @Log("获取业务参数信息")
    @RequestMapping("uppBatchBussetting")
    @RequiresPermissions("uppBatchBussetting:list")
    public String index(Model model) {
    	Session session = super.getSession();
    	Map<String, Map<String, String>> dictMap = (Map<String, Map<String, String>>) session.getAttribute("constMap");
    	model.addAttribute("AcctTpCdMap", dictMap.get("AcctTpCd"));
        return "system/uppBatchBussetting/uppBatchBussetting";
    }

    @RequestMapping("uppBatchBussetting/getUppBatchBussetting")
    @ResponseBody
    public ResponseBo getUppBatchBussetting(UppBatchBussetting uppBatchBussetting) {
        try {
        	UppBatchBussetting uppBatchBussetting1 = this.uppBatchBussettingService.findById(uppBatchBussetting);
            return ResponseBo.ok(uppBatchBussetting1);
        } catch (Exception e) {
            log.error("获取业务参数列表信息失败", e);
            return ResponseBo.error("获取业务参数列表信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("uppBatchBussetting/list")
    @RequiresPermissions("uppBatchBussetting:list")
    @ResponseBody
    public Map<String, Object> uppBatchBussettingList(QueryRequest request,UppBatchBussetting uppBatchBussetting) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<UppBatchBussetting> list = this.uppBatchBussettingService.findAllUppBatchBussettings(uppBatchBussetting);
        PageInfo<UppBatchBussetting> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增业务参数 ")
    @RequiresPermissions("uppBatchBussetting:add")
    @RequestMapping("uppBatchBussetting/add")
    @ResponseBody
    public ResponseBo addUppBatchBussetting(UppBatchBussetting uppBatchBussetting) {
        try {
        	uppBatchBussetting.setGmtCreate(DateUtil.getCurrentDateTimeStr());
        	uppBatchBussetting.setGmtModified(DateUtil.getCurrentDateTimeStr());
        	this.uppBatchBussettingService.addUppBatchBussetting(uppBatchBussetting);
            return ResponseBo.ok("新增业务参数成功！");
        } catch (Exception e) {
            log.error("新增业务参数失败", e);
            return ResponseBo.error("新增业务参数失败，请联系网站管理员！");
        }
    }

    @Log("删除业务参数")
    @RequiresPermissions("uppBatchBussetting:delete")
    @RequestMapping("uppBatchBussetting/delete")
    @ResponseBody
    public ResponseBo deleteUppBatchBussettings(UppBatchBussetting uppBatchBussetting) {
        try {
            this.uppBatchBussettingService.deleteUppBatchBussetting(uppBatchBussetting);
            return ResponseBo.ok("删除业务参数成功！");
        } catch (Exception e) {
            log.error("删除业务参数失败", e);
            return ResponseBo.error("删除业务参数失败，请联系网站管理员！");
        }
    }

    @Log("修改业务参数 ")
    @RequiresPermissions("uppBatchBussetting:update")
    @RequestMapping("uppBatchBussetting/update")
    @ResponseBody
    public ResponseBo updateUppBatchBussetting(UppBatchBussetting uppBatchBussetting) {
        try {
        	uppBatchBussetting.setGmtModified(DateUtil.getCurrentDateTimeStr());
            this.uppBatchBussettingService.updateUppBatchBussetting(uppBatchBussetting);
            return ResponseBo.ok("修改业务参数成功！");
        } catch (Exception e) {
            log.error("修改业务参数失败", e);
            return ResponseBo.error("修改业务参数失败，请联系网站管理员！");
        }
    }
}

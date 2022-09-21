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
import cc.mrbird.system.domain.Agency;
import cc.mrbird.system.service.AgencyService;

@Controller
public class AgencyController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AgencyService agencyService;

    @Log("获取代理商信息")
    @RequestMapping("agency")
    @RequiresPermissions("agency:list")
    public String index(Model model) {
    	Session session = super.getSession();
    	Map<String, Map<String, String>> dictMap = (Map<String, Map<String, String>>) session.getAttribute("constMap");
    	model.addAttribute("AcctTpCdMap", dictMap.get("AcctTpCd"));
        return "system/agency/agency";
    }

    @RequestMapping("agency/getAgency")
    @ResponseBody
    public ResponseBo getAgency(Agency agency) {
        try {
        	Agency agency1 = this.agencyService.findById(agency);
            return ResponseBo.ok(agency1);
        } catch (Exception e) {
            log.error("获取代理商列表信息失败", e);
            return ResponseBo.error("获取代理商列表信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("agency/list")
    @RequiresPermissions("agency:list")
    @ResponseBody
    public Map<String, Object> agencyList(QueryRequest request,Agency agency) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<Agency> list = this.agencyService.findAllAgencys(agency);
        PageInfo<Agency> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增代理商 ")
    @RequiresPermissions("agency:add")
    @RequestMapping("agency/add")
    @ResponseBody
    public ResponseBo addAgency(Agency agency) {
        try {
        	this.agencyService.addAgency(agency);
            return ResponseBo.ok("新增代理商成功！");
        } catch (Exception e) {
            log.error("新增代理商失败", e);
            return ResponseBo.error("新增代理商失败，请联系网站管理员！");
        }
    }

    @Log("删除代理商")
    @RequiresPermissions("agency:delete")
    @RequestMapping("agency/delete")
    @ResponseBody
    public ResponseBo deleteAgencys(Agency agency) {
        try {
            this.agencyService.deleteAgency(agency);
            return ResponseBo.ok("删除代理商成功！");
        } catch (Exception e) {
            log.error("删除代理商失败", e);
            return ResponseBo.error("删除代理商失败，请联系网站管理员！");
        }
    }

    @Log("修改代理商 ")
    @RequiresPermissions("agency:update")
    @RequestMapping("agency/update")
    @ResponseBody
    public ResponseBo updateAgency(Agency agency) {
        try {
            this.agencyService.updateAgency(agency);
            return ResponseBo.ok("修改代理商成功！");
        } catch (Exception e) {
            log.error("修改代理商失败", e);
            return ResponseBo.error("修改代理商失败，请联系网站管理员！");
        }
    }
}

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
import cc.mrbird.system.domain.DeptAcctInfo;
import cc.mrbird.system.service.DeptAcctInfoService;

@Controller
public class DeptAcctInfoController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DeptAcctInfoService deptAcctInfoService;

    @Log("获取机构账户信息")
    @RequestMapping("deptAcctInfo")
    @RequiresPermissions("deptAcctInfo:list")
    public String index(Model model) {
    	Session session = super.getSession();
    	Map<String, Map<String, String>> dictMap = (Map<String, Map<String, String>>) session.getAttribute("constMap");
    	model.addAttribute("AcctTpCdMap", dictMap.get("AcctTpCd"));
        return "system/deptAcctInfo/deptAcctInfo";
    }

    @RequestMapping("deptAcctInfo/getDeptAcctInfo")
    @ResponseBody
    public ResponseBo getDeptAcctInfo(DeptAcctInfo deptAcctInfo) {
        try {
        	DeptAcctInfo deptAcctInfo1 = this.deptAcctInfoService.findById(deptAcctInfo);
            return ResponseBo.ok(deptAcctInfo1);
        } catch (Exception e) {
            log.error("获取机构账户列表信息失败", e);
            return ResponseBo.error("获取机构账户列表信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("deptAcctInfo/list")
    @RequiresPermissions("deptAcctInfo:list")
    @ResponseBody
    public Map<String, Object> deptAcctInfoList(QueryRequest request,DeptAcctInfo deptAcctInfo) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<DeptAcctInfo> list = this.deptAcctInfoService.findAllDeptAcctInfos(deptAcctInfo);
        PageInfo<DeptAcctInfo> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增机构账户 ")
    @RequiresPermissions("deptAcctInfo:add")
    @RequestMapping("deptAcctInfo/add")
    @ResponseBody
    public ResponseBo addDeptAcctInfo(DeptAcctInfo deptAcctInfo) {
        try {
        	this.deptAcctInfoService.addDeptAcctInfo(deptAcctInfo);
            return ResponseBo.ok("新增机构账户成功！");
        } catch (Exception e) {
            log.error("新增机构账户失败", e);
            return ResponseBo.error("新增机构账户失败，请联系网站管理员！");
        }
    }

    @Log("删除机构账户")
    @RequiresPermissions("deptAcctInfo:delete")
    @RequestMapping("deptAcctInfo/delete")
    @ResponseBody
    public ResponseBo deleteDeptAcctInfos(DeptAcctInfo deptAcctInfo) {
        try {
            this.deptAcctInfoService.deleteDeptAcctInfo(deptAcctInfo);
            return ResponseBo.ok("删除机构账户成功！");
        } catch (Exception e) {
            log.error("删除机构账户失败", e);
            return ResponseBo.error("删除机构账户失败，请联系网站管理员！");
        }
    }

    @Log("修改机构账户 ")
    @RequiresPermissions("deptAcctInfo:update")
    @RequestMapping("deptAcctInfo/update")
    @ResponseBody
    public ResponseBo updateDeptAcctInfo(DeptAcctInfo deptAcctInfo) {
        try {
            this.deptAcctInfoService.updateDeptAcctInfo(deptAcctInfo);
            return ResponseBo.ok("修改机构账户成功！");
        } catch (Exception e) {
            log.error("修改机构账户失败", e);
            return ResponseBo.error("修改机构账户失败，请联系网站管理员！");
        }
    }
}

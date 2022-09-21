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
import cc.mrbird.system.domain.InnerDeptManage;
import cc.mrbird.system.domain.InnerDeptManage;
import cc.mrbird.system.service.InnerDeptManageService;
import cc.mrbird.system.service.InnerDeptManageService;

@Controller
public class InnerDeptManageController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private InnerDeptManageService innerDeptManageService;

    @Log("获取机构信息")
    @RequestMapping("innerDeptManage")
    @RequiresPermissions("innerDeptManage:list")
    public String index() {
        return "system/innerDeptManage/innerDeptManage";
    }

    @RequestMapping("innerDeptManage/getInnerDeptManage")
    @ResponseBody
    public ResponseBo getInnerDeptManage(InnerDeptManage innerDeptManage) {
        try {
        	InnerDeptManage innerDeptManage1 = this.innerDeptManageService.findById(innerDeptManage);
            return ResponseBo.ok(innerDeptManage1);
        } catch (Exception e) {
            log.error("获取机构信息失败", e);
            return ResponseBo.error("获取机构信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("innerDeptManage/list")
    @RequiresPermissions("innerDeptManage:list")
    @ResponseBody
    public Map<String, Object> InnerDeptManageList(QueryRequest request,InnerDeptManage innerDeptManage) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<InnerDeptManage> list = this.innerDeptManageService.findAllInnerDeptManages(innerDeptManage);
        PageInfo<InnerDeptManage> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增机构 ")
    @RequiresPermissions("innerDeptManage:add")
    @RequestMapping("innerDeptManage/add")
    @ResponseBody
    public ResponseBo addInnerDeptManage(InnerDeptManage innerDeptManage) {
        try {
        	this.innerDeptManageService.insertInnerDept(innerDeptManage);
            return ResponseBo.ok("新增机构成功！");
        } catch (Exception e) {
            log.error("新增机构失败", e);
            return ResponseBo.error("新增机构失败，请联系网站管理员！");
        }
    }

    @Log("删除机构")
    @RequiresPermissions("innerDeptManage:delete")
    @RequestMapping("innerDeptManage/delete")
    @ResponseBody
    public ResponseBo deleteInnerDeptManages(InnerDeptManage innerDeptManage) {
        try {
            this.innerDeptManageService.deleteInnerDeptManage(innerDeptManage);
            return ResponseBo.ok("删除机构成功！");
        } catch (Exception e) {
            log.error("删除机构失败", e);
            return ResponseBo.error("删除机构失败，请联系网站管理员！");
        }
    }

    @Log("修改机构 ")
    @RequiresPermissions("innerDeptManage:update")
    @RequestMapping("innerDeptManage/update")
    @ResponseBody
    public ResponseBo updateInnerDeptManage(InnerDeptManage innerDeptManage) {
        try {
            this.innerDeptManageService.updateInnerDept(innerDeptManage);
            return ResponseBo.ok("修改机构成功！");
        } catch (Exception e) {
            log.error("修改机构失败", e);
            return ResponseBo.error("修改机构失败，请联系网站管理员！");
        }
    }
}

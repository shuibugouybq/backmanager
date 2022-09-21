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
import cc.mrbird.system.domain.Merchant;
import cc.mrbird.system.service.MerchantService;

@Controller
public class MerchantController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MerchantService merchantService;

    @Log("获取商户信息")
    @RequestMapping("merchant")
    @RequiresPermissions("merchant:list")
    public String index() {
        return "system/merchant/merchant";
    }

    @RequestMapping("merchant/getMerchant")
    @ResponseBody
    public ResponseBo getMerchant(String merId) {
        try {
        	Merchant merchant = this.merchantService.findById(merId);
            return ResponseBo.ok(merchant);
        } catch (Exception e) {
            log.error("获取商户信息失败", e);
            return ResponseBo.error("获取商户信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("merchant/list")
    @RequiresPermissions("merchant:list")
    @ResponseBody
    public Map<String, Object> merchantList(QueryRequest request,Merchant merchant) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<Merchant> list = this.merchantService.findAllMerchants(merchant);
        PageInfo<Merchant> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

   /* @RequestMapping("dept/excel")
    @ResponseBody
    public ResponseBo deptExcel(Dept dept) {
        try {
            List<Dept> list = this.deptService.findAllDepts(dept);
            return FileUtils.createExcelByPOIKit("部门表", list, Dept.class);
        } catch (Exception e) {
            log.error("导出部门信息Excel失败", e);
            return ResponseBo.error("导出Excel失败，请联系网站管理员！");
        }
    }

    @RequestMapping("dept/csv")
    @ResponseBody
    public ResponseBo deptCsv(Dept dept) {
        try {
            List<Dept> list = this.deptService.findAllDepts(dept);
            return FileUtils.createCsv("部门表", list, Dept.class);
        } catch (Exception e) {
            log.error("获取部门信息Csv失败", e);
            return ResponseBo.error("导出Csv失败，请联系网站管理员！");
        }
    }

    @RequestMapping("dept/checkDeptName")
    @ResponseBody
    public boolean checkDeptName(String deptName, String oldDeptName) {
        if (StringUtils.isNotBlank(oldDeptName) && deptName.equalsIgnoreCase(oldDeptName)) {
            return true;
        }
        Dept result = this.deptService.findByName(deptName);
        return result == null;
    }*/

    @Log("新增商户 ")
    @RequiresPermissions("merchant:add")
    @RequestMapping("merchant/add")
    @ResponseBody
    public ResponseBo addMerchant(Merchant merchant) {
        try {
        	this.merchantService.addMerchant(merchant);
            return ResponseBo.ok("新增部门成功！");
        } catch (Exception e) {
            log.error("新增商户失败", e);
            return ResponseBo.error("新增商户失败，请联系网站管理员！");
        }
    }

    @Log("删除商户")
    @RequiresPermissions("merchant:delete")
    @RequestMapping("merchant/delete")
    @ResponseBody
    public ResponseBo deleteMerchants(String merIds) {
        try {
            this.merchantService.deleteMerchants(merIds);
            return ResponseBo.ok("删除商户成功！");
        } catch (Exception e) {
            log.error("删除商户失败", e);
            return ResponseBo.error("删除商户失败，请联系网站管理员！");
        }
    }

    @Log("修改商户 ")
    @RequiresPermissions("merchant:update")
    @RequestMapping("merchant/update")
    @ResponseBody
    public ResponseBo updateMerchant(Merchant merchant) {
        try {
            this.merchantService.updateMerchant(merchant);
            return ResponseBo.ok("修改商户成功！");
        } catch (Exception e) {
            log.error("修改商户失败", e);
            return ResponseBo.error("修改商户失败，请联系网站管理员！");
        }
    }
}

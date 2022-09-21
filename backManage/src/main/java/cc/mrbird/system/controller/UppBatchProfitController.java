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
import cc.mrbird.system.domain.UppBatchProfit;
import cc.mrbird.system.service.UppBatchProfitService;

@Controller
public class UppBatchProfitController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UppBatchProfitService uppBatchProfitService;

    @Log("获取分润比例信息")
    @RequestMapping("uppBatchProfit")
    @RequiresPermissions("uppBatchProfit:list")
    public String index(Model model) {
    	Session session = super.getSession();
    	Map<String, Map<String, String>> dictMap = (Map<String, Map<String, String>>) session.getAttribute("constMap");
    	model.addAttribute("AcctTpCdMap", dictMap.get("AcctTpCd"));
        return "system/uppBatchProfit/uppBatchProfit";
    }

    @RequestMapping("uppBatchProfit/getUppBatchProfit")
    @ResponseBody
    public ResponseBo getUppBatchProfit(UppBatchProfit uppBatchProfit) {
        try {
        	UppBatchProfit uppBatchProfit1 = this.uppBatchProfitService.findById(uppBatchProfit);
            return ResponseBo.ok(uppBatchProfit1);
        } catch (Exception e) {
            log.error("获取分润比例列表信息失败", e);
            return ResponseBo.error("获取分润比例列表信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("uppBatchProfit/list")
    @RequiresPermissions("uppBatchProfit:list")
    @ResponseBody
    public Map<String, Object> uppBatchProfitList(QueryRequest request,UppBatchProfit uppBatchProfit) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<UppBatchProfit> list = this.uppBatchProfitService.findAllUppBatchProfits(uppBatchProfit);
        PageInfo<UppBatchProfit> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增分润比例 ")
    @RequiresPermissions("uppBatchProfit:add")
    @RequestMapping("uppBatchProfit/add")
    @ResponseBody
    public ResponseBo addUppBatchProfit(UppBatchProfit uppBatchProfit) {
        try {
        	uppBatchProfit.setGmtCreate(DateUtil.getCurrentDateTimeStr());
        	this.uppBatchProfitService.addUppBatchProfit(uppBatchProfit);
            return ResponseBo.ok("新增分润比例成功！");
        } catch (Exception e) {
            log.error("新增分润比例失败", e);
            return ResponseBo.error("新增分润比例失败，请联系网站管理员！");
        }
    }

    @Log("删除分润比例")
    @RequiresPermissions("uppBatchProfit:delete")
    @RequestMapping("uppBatchProfit/delete")
    @ResponseBody
    public ResponseBo deleteUppBatchProfits(UppBatchProfit uppBatchProfit) {
        try {
            this.uppBatchProfitService.deleteUppBatchProfit(uppBatchProfit);
            return ResponseBo.ok("删除分润比例成功！");
        } catch (Exception e) {
            log.error("删除分润比例失败", e);
            return ResponseBo.error("删除分润比例失败，请联系网站管理员！");
        }
    }

    @Log("修改分润比例 ")
    @RequiresPermissions("uppBatchProfit:update")
    @RequestMapping("uppBatchProfit/update")
    @ResponseBody
    public ResponseBo updateUppBatchProfit(UppBatchProfit uppBatchProfit) {
        try {
        	uppBatchProfit.setGmtModified(DateUtil.getCurrentDateTimeStr());
            this.uppBatchProfitService.updateUppBatchProfit(uppBatchProfit);
            return ResponseBo.ok("修改分润比例成功！");
        } catch (Exception e) {
            log.error("修改分润比例失败", e);
            return ResponseBo.error("修改分润比例失败，请联系网站管理员！");
        }
    }
}

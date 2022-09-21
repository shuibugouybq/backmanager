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
import cc.mrbird.system.domain.Marketactivectrl;
import cc.mrbird.system.service.MarketactivectrlService;

@Controller
public class MarketactivectrlController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MarketactivectrlService marketactivectrlService;

    @Log("获取营销控制信息")
    @RequestMapping("marketactivectrl")
    @RequiresPermissions("marketactivectrl:list")
    public String index() {
        return "system/marketactivectrl/marketactivectrl";
    }

    @RequestMapping("marketactivectrl/getMarketactivectrl")
    @ResponseBody
    public ResponseBo getMarketactivectrl(Marketactivectrl marketactivectrl) {
        try {
        	Marketactivectrl marketactivectrl1 = this.marketactivectrlService.findById(marketactivectrl);
            return ResponseBo.ok(marketactivectrl1);
        } catch (Exception e) {
            log.error("获取营销控制信息失败", e);
            return ResponseBo.error("获取营销控制信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("marketactivectrl/list")
    @RequiresPermissions("marketactivectrl:list")
    @ResponseBody
    public Map<String, Object> MarketactivectrlList(QueryRequest request,Marketactivectrl marketactivectrl) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<Marketactivectrl> list = this.marketactivectrlService.findAllMarketactivectrls(marketactivectrl);
        PageInfo<Marketactivectrl> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增营销控制 ")
    @RequiresPermissions("marketactivectrl:add")
    @RequestMapping("marketactivectrl/add")
    @ResponseBody
    public ResponseBo addMarketactivectrl(Marketactivectrl marketactivectrl) {
        try {
        	this.marketactivectrlService.insertMarketactivectrl(marketactivectrl);
            return ResponseBo.ok("新增营销控制成功！");
        } catch (Exception e) {
            log.error("新增营销控制失败", e);
            return ResponseBo.error("新增营销控制失败，请联系网站管理员！");
        }
    }

    @Log("删除营销控制")
    @RequiresPermissions("marketactivectrl:delete")
    @RequestMapping("marketactivectrl/delete")
    @ResponseBody
    public ResponseBo deleteMarketactivectrls(Marketactivectrl marketactivectrl) {
        try {
            this.marketactivectrlService.deleteMarketactivectrl(marketactivectrl);
            return ResponseBo.ok("删除营销控制成功！");
        } catch (Exception e) {
            log.error("删除营销控制失败", e);
            return ResponseBo.error("删除营销控制失败，请联系网站管理员！");
        }
    }

    /*@Log("修改营销控制 ")
    @RequiresPermissions("marketactivectrl:update")
    @RequestMapping("marketactivectrl/update")
    @ResponseBody
    public ResponseBo updateMarketactivectrl(Marketactivectrl marketactivectrl) {
        try {
            this.marketactivectrlService.updateInnerDept(marketactivectrl);
            return ResponseBo.ok("修改营销控制成功！");
        } catch (Exception e) {
            log.error("修改营销控制失败", e);
            return ResponseBo.error("修改营销控制失败，请联系网站管理员！");
        }
    }*/
}

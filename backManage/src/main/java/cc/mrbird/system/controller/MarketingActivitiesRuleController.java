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
import cc.mrbird.system.domain.MarketingActivitiesRule;
import cc.mrbird.system.service.MarketingActivitiesRuleService;

@Controller
public class MarketingActivitiesRuleController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MarketingActivitiesRuleService marketingActivitiesRuleService;

    @Log("获取营销管理信息")
    @RequestMapping("marketingActivitiesRule")
    @RequiresPermissions("marketingActivitiesRule:list")
    public String index() {
        return "system/marketingActivitiesRule/marketingActivitiesRule";
    }

    @RequestMapping("marketingActivitiesRule/getMarketingActivitiesRule")
    @ResponseBody
    public ResponseBo getMarketingActivitiesRule(MarketingActivitiesRule marketingActivitiesRule) {
        try {
        	MarketingActivitiesRule marketingActivitiesRule1 = this.marketingActivitiesRuleService.findById(marketingActivitiesRule);
            return ResponseBo.ok(marketingActivitiesRule1);
        } catch (Exception e) {
            log.error("获取营销管理信息失败", e);
            return ResponseBo.error("获取营销管理信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("marketingActivitiesRule/list")
    @RequiresPermissions("marketingActivitiesRule:list")
    @ResponseBody
    public Map<String, Object> MarketingActivitiesRuleList(QueryRequest request,MarketingActivitiesRule marketingActivitiesRule) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<MarketingActivitiesRule> list = this.marketingActivitiesRuleService.findAllMarketingActivitiesRules(marketingActivitiesRule);
        PageInfo<MarketingActivitiesRule> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增营销管理 ")
    @RequiresPermissions("marketingActivitiesRule:add")
    @RequestMapping("marketingActivitiesRule/add")
    @ResponseBody
    public ResponseBo addMarketingActivitiesRule(MarketingActivitiesRule marketingActivitiesRule) {
        try {
        	this.marketingActivitiesRuleService.insertMarketingActivitiesRule(marketingActivitiesRule);
            return ResponseBo.ok("新增营销管理成功！");
        } catch (Exception e) {
            log.error("新增营销管理失败", e);
            return ResponseBo.error("新增营销管理失败，请联系网站管理员！");
        }
    }

    @Log("删除营销管理")
    @RequiresPermissions("marketingActivitiesRule:delete")
    @RequestMapping("marketingActivitiesRule/delete")
    @ResponseBody
    public ResponseBo deleteMarketingActivitiesRules(MarketingActivitiesRule marketingActivitiesRule) {
        try {
            this.marketingActivitiesRuleService.deleteMarketingActivitiesRule(marketingActivitiesRule);
            return ResponseBo.ok("删除营销管理成功！");
        } catch (Exception e) {
            log.error("删除营销管理失败", e);
            return ResponseBo.error("删除营销管理失败，请联系网站管理员！");
        }
    }

    @Log("修改营销管理 ")
    @RequiresPermissions("marketingActivitiesRule:update")
    @RequestMapping("marketingActivitiesRule/update")
    @ResponseBody
    public ResponseBo updateMarketingActivitiesRule(MarketingActivitiesRule marketingActivitiesRule) {
        try {
            this.marketingActivitiesRuleService.updateMarketingActivitiesRule(marketingActivitiesRule);
            return ResponseBo.ok("修改营销管理成功！");
        } catch (Exception e) {
            log.error("修改营销管理失败", e);
            return ResponseBo.error("修改营销管理失败，请联系网站管理员！");
        }
    }
}

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
import cc.mrbird.system.domain.OtTrans;
import cc.mrbird.system.service.TransQueryService;

@Controller
public class TransQueryController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private TransQueryService transQueryService;

    @Log("商户交易查询")
    @RequestMapping("transQuery")
    @RequiresPermissions("transQuery:list")
    public String index() {
        return "system/transQuery/transQuery";
    }

    /*@RequestMapping("cardbin/getCardbin")
    @ResponseBody
    public ResponseBo getCardbin(CardBin cardbin) {
        try {
        	CardBin cardbin1 = this.cardBinService.findById(cardbin);
            return ResponseBo.ok(cardbin1);
        } catch (Exception e) {
            log.error("获取卡BIN信息失败", e);
            return ResponseBo.error("获取卡BIN信息失败，请联系网站管理员！");
        }
    }*/

    @RequestMapping("transQuery/list")
    @RequiresPermissions("transQuery:list")
    @ResponseBody
    public Map<String, Object> transQueryList(QueryRequest request,OtTrans otTrans) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<OtTrans> list = this.transQueryService.transQuery(otTrans);
        PageInfo<OtTrans> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    /*@Log("新增卡BIN ")
    @RequiresPermissions("cardbin:add")
    @RequestMapping("cardbin/add")
    @ResponseBody
    public ResponseBo addCardbin(CardBin cardbin) {
        try {
        	this.cardBinService.addCardBin(cardbin);
            return ResponseBo.ok("新增卡BIN成功！");
        } catch (Exception e) {
            log.error("新增卡BIN失败", e);
            return ResponseBo.error("新增卡BIN失败，请联系网站管理员！");
        }
    }

    @Log("删除卡BIN")
    @RequiresPermissions("cardbin:delete")
    @RequestMapping("cardbin/delete")
    @ResponseBody
    public ResponseBo deleteCardbins(CardBin cardbin) {
        try {
            this.cardBinService.deleteCardBin(cardbin);
            return ResponseBo.ok("删除卡BIN成功！");
        } catch (Exception e) {
            log.error("删除卡BIN失败", e);
            return ResponseBo.error("删除卡BIN失败，请联系网站管理员！");
        }
    }

    @Log("修改商户 ")
    @RequiresPermissions("cardbin:update")
    @RequestMapping("cardbin/update")
    @ResponseBody
    public ResponseBo updateCardbin(CardBin cardbin) {
        try {
            this.cardBinService.updateCardBin(cardbin);
            return ResponseBo.ok("修改商户成功！");
        } catch (Exception e) {
            log.error("修改商户失败", e);
            return ResponseBo.error("修改商户失败，请联系网站管理员！");
        }
    }*/
}

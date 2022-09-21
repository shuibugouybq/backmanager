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
import cc.mrbird.system.domain.CardBin;
import cc.mrbird.system.service.CardBinService;

@Controller
public class CardbinController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CardBinService cardBinService;

    @Log("获取卡BIN信息")
    @RequestMapping("cardbin")
    @RequiresPermissions("cardbin:list")
    public String index() {
        return "system/cardbin/cardbin";
    }

    @RequestMapping("cardbin/getCardbin")
    @ResponseBody
    public ResponseBo getCardbin(CardBin cardbin) {
        try {
        	CardBin cardbin1 = this.cardBinService.findById(cardbin);
            return ResponseBo.ok(cardbin1);
        } catch (Exception e) {
            log.error("获取卡BIN信息失败", e);
            return ResponseBo.error("获取卡BIN信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("cardbin/list")
    @RequiresPermissions("cardbin:list")
    @ResponseBody
    public Map<String, Object> cardbinList(QueryRequest request,CardBin cardbin) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<CardBin> list = this.cardBinService.findAllCardBins(cardbin);
        PageInfo<CardBin> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增卡BIN ")
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

    @Log("修改卡BIN ")
    @RequiresPermissions("cardbin:update")
    @RequestMapping("cardbin/update")
    @ResponseBody
    public ResponseBo updateCardbin(CardBin cardbin) {
        try {
            this.cardBinService.updateCardBin(cardbin);
            return ResponseBo.ok("修改卡BIN成功！");
        } catch (Exception e) {
            log.error("修改卡BIN失败", e);
            return ResponseBo.error("修改卡BIN失败，请联系网站管理员！");
        }
    }
}

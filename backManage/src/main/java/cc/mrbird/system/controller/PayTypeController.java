package cc.mrbird.system.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
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
import cc.mrbird.system.domain.ChannelItemScore;
import cc.mrbird.system.domain.PayType;
import cc.mrbird.system.service.CardBinService;
import cc.mrbird.system.service.ChannelItemScoreService;
import cc.mrbird.system.service.PayTypeService;

@Controller
public class PayTypeController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PayTypeService payTypeService;

    @Log("产品基本信息")
    @RequestMapping("payType")
    @RequiresPermissions("payType:list")
    public String index() {
        return "system/payType/payType";
    }

//    @RequestMapping("ChannelItemScore/list")
//    @ResponseBody
//    public ResponseBo getCardbin(CardBin cardbin) {
//        try {
//        	CardBin cardbin1 = this.channelItemScoreService.findById(cardbin);
//            return ResponseBo.ok(cardbin1);
//        } catch (Exception e) {
//            log.error("获取卡BIN信息失败", e);
//            return ResponseBo.error("获取卡BIN信息失败，请联系网站管理员！");
//        }
//    }

    @RequestMapping("payType/list")
    @RequiresPermissions("payType:list")
    @ResponseBody
    public Map<String, Object> cardbinList(QueryRequest request,PayType payType) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<PayType> list = this.payTypeService.findAllPayType(payType);
        PageInfo<PayType> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增通道项目打分")
    @RequiresPermissions("payType:add")
    @RequestMapping("payType/add")
    @ResponseBody
    public ResponseBo addCardbin(PayType payType) {
    	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	Date date=new Date();
    	payType.setCreatetime(dateFormat.format(date));
        try {
        	this.payTypeService.addPayType(payType);
            return ResponseBo.ok("新增通道项目打分成功！");
        } catch (Exception e) {
            log.error("新增通道项目打分失败", e);
            return ResponseBo.error("新增通道项目打分失败，请联系网站管理员！");
        }
    }
//
    @Log("删除通道项目")
    @RequiresPermissions("payType:delete")
    @RequestMapping("payType/delete")
    @ResponseBody
    public ResponseBo deleteCardbins(PayType payType) {
        try {
            this.payTypeService.deletePayType(payType);
            return ResponseBo.ok("删除通道项目成功！");
        } catch (Exception e) {
            log.error("删除通道项目失败", e);
            return ResponseBo.error("删除通道项目失败，请联系网站管理员！");
        }
    }
//
    @Log("修改通道项目 ")
    @RequiresPermissions("payType:update")
    @RequestMapping("payType/update")
    @ResponseBody
    public ResponseBo updateCardbin(PayType payType) {
        try {
            this.payTypeService.updatePayType(payType);
            return ResponseBo.ok("修改通道项目成功！");
        } catch (Exception e) {
            log.error("修改通道项目失败", e);
            return ResponseBo.error("修改通道项目失败，请联系网站管理员！");
        }
    }
}

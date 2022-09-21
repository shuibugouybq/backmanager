package cc.mrbird.system.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
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
import cc.mrbird.system.domain.ChannelLimitFractions;
import cc.mrbird.system.service.ChannelInfoService;
import cc.mrbird.system.service.ChannelLimitFractionsService;

@Controller
public class ChannelLimitFractionsController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ChannelLimitFractionsService channelLimitFractionsService;
    
    @Autowired
    private ChannelInfoService channelInfoService;

    @Log("通道项目限额表信息")
    @RequestMapping("channelLimitFractions")
    @RequiresPermissions("channelLimitFractions:list")
    public String index(Model model) {
    	model.addAttribute("channelIdMap", channelInfoService.queryDicMap());
    	model.addAttribute("channelTypeMap", getDic("channelType"));
        return "system/channelLimitFractions/channelLimitFractions";
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

    @RequestMapping("channelLimitFractions/list")
    @RequiresPermissions("channelLimitFractions:list")
    @ResponseBody
    public Map<String, Object> channelItemScoreList(QueryRequest request,ChannelLimitFractions channelLimitFractions) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<ChannelLimitFractions> list = this.channelLimitFractionsService.findAllChannelLimitFractions(channelLimitFractions);
        PageInfo<ChannelLimitFractions> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增通道项目打分")
    @RequiresPermissions("channelLimitFractions:add")
    @RequestMapping("channelLimitFractions/add")
    @ResponseBody
    public ResponseBo addchannelItemScore(ChannelLimitFractions channelLimitFractions) {
        try {
        	this.channelLimitFractionsService.addChannelLimitFractions(channelLimitFractions);
            return ResponseBo.ok("新增通道限额表打分成功！");
        } catch (Exception e) {
            log.error("新增通道限额表打分失败", e);
            return ResponseBo.error("新增通道限额表打分失败，请联系网站管理员！");
        }
    }
//
    @Log("删除通道项目")
    @RequiresPermissions("channelLimitFractions:delete")
    @RequestMapping("channelLimitFractions/delete")
    @ResponseBody
    public ResponseBo deletechannelItemScore(ChannelLimitFractions channelLimitFractions) {
        try {
            this.channelLimitFractionsService.deleteChannelLimitFractions(channelLimitFractions);
            return ResponseBo.ok("删除通限额表目成功！");
        } catch (Exception e) {
            log.error("删除通道限额表失败", e);
            return ResponseBo.error("删除通道限额表失败，请联系网站管理员！");
        }
    }
//
    @Log("修改通道项目 ")
    @RequiresPermissions("channelLimitFractions:update")
    @RequestMapping("channelLimitFractions/update")
    @ResponseBody
    public ResponseBo updatechannelItemScore(ChannelLimitFractions channelLimitFractions) {
        try {
            this.channelLimitFractionsService.updateChannelLimitFractions(channelLimitFractions);
            return ResponseBo.ok("修改通道限额表成功！");
        } catch (Exception e) {
            log.error("修改通道项目失败", e);
            return ResponseBo.error("修改通道限额表失败，请联系网站管理员！");
        }
    }
}

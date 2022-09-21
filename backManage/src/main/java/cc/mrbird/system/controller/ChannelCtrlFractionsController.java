package cc.mrbird.system.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
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
import cc.mrbird.system.domain.ChannelCtrlFractions;
import cc.mrbird.system.service.ChannelCtrlFractionsService;
import cc.mrbird.system.service.ChannelInfoService;

@Controller
public class ChannelCtrlFractionsController extends BaseController {

    @Autowired
    private ChannelCtrlFractionsService channelCtrlFractionsService;
    
    @Autowired
    private ChannelInfoService channelInfoService;

    @Log("交易成功率列表查询")
    @RequestMapping("channelCtrlFractions")
    @RequiresPermissions("channelCtrlFractions:list")
    public String index(Model model) {
    	model.addAttribute("channelIdMap", channelInfoService.queryDicMap());
        return "system/channelCtrlFractions/channelCtrlFractions";
    }

    @RequestMapping("channelCtrlFractions/list")
    @RequiresPermissions("channelCtrlFractions:list")
    @ResponseBody
    public Map<String, Object> channelCtrlFractionsList(QueryRequest request,ChannelCtrlFractions channelCtrlFractions) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<ChannelCtrlFractions> list = this.channelCtrlFractionsService.transQuery(channelCtrlFractions);
        PageInfo<ChannelCtrlFractions> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }
}

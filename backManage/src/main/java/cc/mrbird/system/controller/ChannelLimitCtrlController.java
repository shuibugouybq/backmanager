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
import cc.mrbird.system.domain.ChannelLimitCtrl;
import cc.mrbird.system.service.ChannelInfoService;
import cc.mrbird.system.service.ChannelLimitCtrlService;

@Controller
public class ChannelLimitCtrlController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ChannelLimitCtrlService channelLimitCtrlService;
    
    @Autowired
    private ChannelInfoService channelInfoService;

    @Log("获取通道限额信息")
    @RequestMapping("channelLimitCtrl")
    @RequiresPermissions("channelLimitCtrl:list")
    public String index(Model model) {
    	model.addAttribute("channelIdMap", channelInfoService.queryDicMap());
    	model.addAttribute("channelTypeMap", getDic("channelType"));
        return "system/channelLimitCtrl/channelLimitCtrl";
    }

    @RequestMapping("channelLimitCtrl/getChannelLimitCtrl")
    @ResponseBody
    public ResponseBo getChannelLimitCtrl(ChannelLimitCtrl channelLimitCtrl) {
        try {
        	ChannelLimitCtrl channelLimitCtrl1 = this.channelLimitCtrlService.findById(channelLimitCtrl);
            return ResponseBo.ok(channelLimitCtrl1);
        } catch (Exception e) {
            log.error("获取通道限额信息失败", e);
            return ResponseBo.error("获取通道限额信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("channelLimitCtrl/list")
    @RequiresPermissions("channelLimitCtrl:list")
    @ResponseBody
    public Map<String, Object> channelLimitCtrlList(QueryRequest request,ChannelLimitCtrl channelLimitCtrl) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<ChannelLimitCtrl> list = this.channelLimitCtrlService.findAllChannelLimitCtrls(channelLimitCtrl);
        PageInfo<ChannelLimitCtrl> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增通道限额 ")
    @RequiresPermissions("channelLimitCtrl:add")
    @RequestMapping("channelLimitCtrl/add")
    @ResponseBody
    public ResponseBo addChannelLimitCtrl(ChannelLimitCtrl channelLimitCtrl) {
        try {
        	this.channelLimitCtrlService.addChannelLimitCtrl(channelLimitCtrl);
            return ResponseBo.ok("新增通道限额成功！");
        } catch (Exception e) {
            log.error("新增通道限额失败", e);
            return ResponseBo.error("新增通道限额失败，请联系网站管理员！");
        }
    }

    @Log("删除通道限额")
    @RequiresPermissions("channelLimitCtrl:delete")
    @RequestMapping("channelLimitCtrl/delete")
    @ResponseBody
    public ResponseBo deleteChannelLimitCtrls(ChannelLimitCtrl channelLimitCtrl) {
        try {
            this.channelLimitCtrlService.deleteChannelLimitCtrl(channelLimitCtrl);
            return ResponseBo.ok("删除通道限额成功！");
        } catch (Exception e) {
            log.error("删除通道限额失败", e);
            return ResponseBo.error("删除通道限额失败，请联系网站管理员！");
        }
    }

    @Log("修改通道限额 ")
    @RequiresPermissions("channelLimitCtrl:update")
    @RequestMapping("channelLimitCtrl/update")
    @ResponseBody
    public ResponseBo updateChannelLimitCtrl(ChannelLimitCtrl channelLimitCtrl) {
        try {
        	log.info("channelLimitCtrl:"+channelLimitCtrl.getChannelId()+","+channelLimitCtrl.getChannelType());
            this.channelLimitCtrlService.updateChannelLimitCtrl(channelLimitCtrl);
            return ResponseBo.ok("修改通道限额成功！");
        } catch (Exception e) {
            log.error("修改通道限额失败", e);
            return ResponseBo.error("修改通道限额失败，请联系网站管理员！");
        }
    }
}

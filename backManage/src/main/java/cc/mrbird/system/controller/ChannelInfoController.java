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
import cc.mrbird.system.domain.ChannelInfo;
import cc.mrbird.system.domain.User;
import cc.mrbird.system.service.ChannelInfoService;

@Controller
public class ChannelInfoController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ChannelInfoService channelInfoService;

    @Log("获取通道信息")
    @RequestMapping("channelInfo")
    @RequiresPermissions("channelInfo:list")
    public String index(Model model) {
    	model.addAttribute("settleTimeMap", getDic("settleTime"));
    	model.addAttribute("channelTypeMap", getDic("channelType"));
        return "system/channelInfo/channelInfo";
    }

    @RequestMapping("channelInfo/getChannelInfo")
    @ResponseBody
    public ResponseBo getChannelInfo(ChannelInfo channelInfo) {
        try {
        	ChannelInfo channelInfo1 = this.channelInfoService.findById(channelInfo);
            return ResponseBo.ok(channelInfo1);
        } catch (Exception e) {
            log.error("获取通道信息列表信息失败", e);
            return ResponseBo.error("获取通道信息列表信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("channelInfo/list")
    @RequiresPermissions("channelInfo:list")
    @ResponseBody
    public Map<String, Object> channelInfoList(QueryRequest request,ChannelInfo channelInfo) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<ChannelInfo> list = this.channelInfoService.findAllChannelInfos(channelInfo);
        PageInfo<ChannelInfo> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增通道信息 ")
    @RequiresPermissions("channelInfo:add")
    @RequestMapping("channelInfo/add")
    @ResponseBody
    public ResponseBo addChannelInfo(ChannelInfo channelInfo) {
        try {
        	User user = super.getCurrentUser();
        	String userId = user.getUserId().toString();
        	String now = DateUtil.getCurrentDateTimeStr("yyyyMMdd");
        	if(channelInfo.getChannelStatus().equals("0")) {
        		channelInfo.setChannelOpenDate(now);
        		channelInfo.setChannelOpenUser(userId);
        	}else {
        		channelInfo.setChannelCloseDate(now);
        		channelInfo.setChannelCloseUser(userId);
        	}
        	channelInfo.setChannelModifyDate(now);
        	channelInfo.setChannelModifyUser(userId);
        	this.channelInfoService.addChannelInfo(channelInfo);
            return ResponseBo.ok("新增通道信息成功！");
        } catch (Exception e) {
            log.error("新增通道信息失败", e);
            return ResponseBo.error("新增通道信息失败，请联系网站管理员！");
        }
    }

    @Log("删除通道信息")
    @RequiresPermissions("channelInfo:delete")
    @RequestMapping("channelInfo/delete")
    @ResponseBody
    public ResponseBo deleteChannelInfos(ChannelInfo channelInfo) {
        try {
            this.channelInfoService.deleteChannelInfo(channelInfo);
            return ResponseBo.ok("删除通道信息成功！");
        } catch (Exception e) {
            log.error("删除通道信息失败", e);
            return ResponseBo.error("删除通道信息失败，请联系网站管理员！");
        }
    }

    @Log("修改通道信息 ")
    @RequiresPermissions("channelInfo:update")
    @RequestMapping("channelInfo/update")
    @ResponseBody
    public ResponseBo updateChannelInfo(ChannelInfo channelInfo) {
        try {
        	User user = super.getCurrentUser();
        	String userId = user.getUserId().toString();
        	String now = DateUtil.getCurrentDateTimeStr("yyyyMMdd");
        	if(channelInfo.getChannelStatus().equals("0")) {
        		channelInfo.setChannelOpenDate(now);
        		channelInfo.setChannelOpenUser(userId);
        	}else {
        		channelInfo.setChannelCloseDate(now);
        		channelInfo.setChannelCloseUser(userId);
        	}
        	channelInfo.setChannelModifyDate(now);
        	channelInfo.setChannelModifyUser(userId);
            this.channelInfoService.updateChannelInfo(channelInfo);
            return ResponseBo.ok("修改通道信息成功！");
        } catch (Exception e) {
            log.error("修改通道信息失败", e);
            return ResponseBo.error("修改通道信息失败，请联系网站管理员！");
        }
    }
}

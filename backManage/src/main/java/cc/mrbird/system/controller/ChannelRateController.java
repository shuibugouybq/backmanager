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
import cc.mrbird.system.domain.ChannelLimitCtrl;
import cc.mrbird.system.domain.ChannelRate;
import cc.mrbird.system.service.ChannelLimitCtrlService;
import cc.mrbird.system.service.ChannelRateService;

@Controller
public class ChannelRateController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ChannelRateService channelRateService;

    @Log("获取通道费率表信息")
    @RequestMapping("channelRate")
    @RequiresPermissions("channelRate:list")
    public String index() {
        return "system/channelRate/channelRate";
    }


    @RequestMapping("channelRate/list")
    @RequiresPermissions("channelRate:list")
    @ResponseBody
    public Map<String, Object> channelRateList(QueryRequest request,ChannelRate channelRate) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<ChannelRate> list = this.channelRateService.findAllChannelRate(channelRate);
        PageInfo<ChannelRate> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增通道费率 ")
    @RequiresPermissions("channelRate:add")
    @RequestMapping("channelRate/add")
    @ResponseBody
    public ResponseBo addChannelRate(ChannelRate channelRate) {
        try {
        	this.channelRateService.addChannelRate(channelRate);
            return ResponseBo.ok("新增通道限额成功！");
        } catch (Exception e) {
            log.error("新增通道费率失败", e);
            return ResponseBo.error("新增通道费率失败，请联系网站管理员！");
        }
    }

    @Log("删除通道费率")
    @RequiresPermissions("channelRate:delete")
    @RequestMapping("channelRate/delete")
    @ResponseBody
    public ResponseBo deleteChannelRate(ChannelRate channelRate) {
        try {
            this.channelRateService.deleteChannelRate(channelRate);
            return ResponseBo.ok("删除通道费率成功！");
        } catch (Exception e) {
            log.error("删除通道费率失败", e);
            return ResponseBo.error("删除通道费率失败，请联系网站管理员！");
        }
    }

    @Log("修改通道费率 ")
    @RequiresPermissions("channelRate:update")
    @RequestMapping("channelRate/update")
    @ResponseBody
    public ResponseBo updateChannelRate(ChannelRate channelRate) {
        try {
//        	log.info("channelLimitCtrl:"+channelLimitCtrl.getChannelId()+","+channelLimitCtrl.getChannelType());
            this.channelRateService.updateChannelRate(channelRate);
            return ResponseBo.ok("修改通道费率成功！");
        } catch (Exception e) {
            log.error("修改通道费率失败", e);
            return ResponseBo.error("修改通道费率失败，请联系网站管理员！");
        }
    }
}

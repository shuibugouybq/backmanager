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
import cc.mrbird.system.domain.ChannelBankSupport;
import cc.mrbird.system.service.ChannelBankSupportService;
import cc.mrbird.system.service.ChannelInfoService;

@Controller
public class ChannelBankSupportController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ChannelBankSupportService channelBankSupportService;
    
    @Autowired
    private ChannelInfoService channelInfoService;

    @Log("获取通道支持银行信息")
    @RequestMapping("channelBankSupport")
    @RequiresPermissions("channelBankSupport:list")
    public String index(Model model) {
    	model.addAttribute("channelIdMap", channelInfoService.queryDicMap());
    	model.addAttribute("channelTypeMap", getDic("channelType"));
        return "system/channelBankSupport/channelBankSupport";
    }

    @RequestMapping("channelBankSupport/getChannelBankSupport")
    @ResponseBody
    public ResponseBo getChannelBankSupport(ChannelBankSupport channelBankSupport) {
        try {
        	ChannelBankSupport channelBankSupport1 = this.channelBankSupportService.findById(channelBankSupport);
            return ResponseBo.ok(channelBankSupport1);
        } catch (Exception e) {
            log.error("获取通道支持银行列表信息失败", e);
            return ResponseBo.error("获取通道支持银行列表信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("channelBankSupport/list")
    @RequiresPermissions("channelBankSupport:list")
    @ResponseBody
    public Map<String, Object> channelBankSupportList(QueryRequest request,ChannelBankSupport channelBankSupport) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<ChannelBankSupport> list = this.channelBankSupportService.findAllChannelBankSupports(channelBankSupport);
        PageInfo<ChannelBankSupport> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增通道支持银行 ")
    @RequiresPermissions("channelBankSupport:add")
    @RequestMapping("channelBankSupport/add")
    @ResponseBody
    public ResponseBo addChannelBankSupport(ChannelBankSupport channelBankSupport) {
        try {
        	this.channelBankSupportService.addChannelBankSupport(channelBankSupport);
            return ResponseBo.ok("新增通道支持银行成功！");
        } catch (Exception e) {
            log.error("新增通道支持银行失败", e);
            return ResponseBo.error("新增通道支持银行失败，请联系网站管理员！");
        }
    }

    @Log("删除通道支持银行")
    @RequiresPermissions("channelBankSupport:delete")
    @RequestMapping("channelBankSupport/delete")
    @ResponseBody
    public ResponseBo deleteChannelBankSupports(ChannelBankSupport channelBankSupport) {
        try {
            this.channelBankSupportService.deleteChannelBankSupport(channelBankSupport);
            return ResponseBo.ok("删除通道支持银行成功！");
        } catch (Exception e) {
            log.error("删除通道支持银行失败", e);
            return ResponseBo.error("删除通道支持银行失败，请联系网站管理员！");
        }
    }

    @Log("修改通道支持银行 ")
    @RequiresPermissions("channelBankSupport:update")
    @RequestMapping("channelBankSupport/update")
    @ResponseBody
    public ResponseBo updateChannelBankSupport(ChannelBankSupport channelBankSupport) {
        try {
            this.channelBankSupportService.updateChannelBankSupport(channelBankSupport);
            return ResponseBo.ok("修改通道支持银行成功！");
        } catch (Exception e) {
            log.error("修改通道支持银行失败", e);
            return ResponseBo.error("修改通道支持银行失败，请联系网站管理员！");
        }
    }
}

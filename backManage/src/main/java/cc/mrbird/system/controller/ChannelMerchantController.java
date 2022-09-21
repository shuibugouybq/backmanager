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
import cc.mrbird.system.domain.ChannelMerchant;
import cc.mrbird.system.service.ChannelInfoService;
import cc.mrbird.system.service.ChannelMerchantService;

@Controller
public class ChannelMerchantController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ChannelMerchantService channelMerchantService;
    
    @Autowired
    private ChannelInfoService channelInfoService;

    @Log("获取指定通道信息")
    @RequestMapping("channelMerchant")
    @RequiresPermissions("channelMerchant:list")
    public String index(Model model) {
    	model.addAttribute("channelIdMap", channelInfoService.queryDicMap());
    	model.addAttribute("channelTypeMap", getDic("channelType"));
        return "system/channelMerchant/channelMerchant";
    }

    @RequestMapping("channelMerchant/getChannelMerchant")
    @ResponseBody
    public ResponseBo getChannelMerchant(ChannelMerchant channelMerchant) {
        try {
        	ChannelMerchant channelMerchant1 = this.channelMerchantService.findById(channelMerchant);
            return ResponseBo.ok(channelMerchant1);
        } catch (Exception e) {
            log.error("获取指定通道信息列表信息失败", e);
            return ResponseBo.error("获取指定通道信息列表信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("channelMerchant/list")
    @RequiresPermissions("channelMerchant:list")
    @ResponseBody
    public Map<String, Object> channelMerchantList(QueryRequest request,ChannelMerchant channelMerchant) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<ChannelMerchant> list = this.channelMerchantService.findAllChannelMerchants(channelMerchant);
        PageInfo<ChannelMerchant> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增指定通道信息 ")
    @RequiresPermissions("channelMerchant:add")
    @RequestMapping("channelMerchant/add")
    @ResponseBody
    public ResponseBo addChannelMerchant(ChannelMerchant channelMerchant) {
        try {
        	this.channelMerchantService.addChannelMerchant(channelMerchant);
            return ResponseBo.ok("新增指定通道信息成功！");
        } catch (Exception e) {
            log.error("新增指定通道信息失败", e);
            return ResponseBo.error("新增指定通道信息失败，请联系网站管理员！");
        }
    }

    @Log("删除指定通道信息")
    @RequiresPermissions("channelMerchant:delete")
    @RequestMapping("channelMerchant/delete")
    @ResponseBody
    public ResponseBo deleteChannelMerchants(ChannelMerchant channelMerchant) {
        try {
            this.channelMerchantService.deleteChannelMerchant(channelMerchant);
            return ResponseBo.ok("删除指定通道信息成功！");
        } catch (Exception e) {
            log.error("删除指定通道信息失败", e);
            return ResponseBo.error("删除指定通道信息失败，请联系网站管理员！");
        }
    }

    @Log("修改指定通道信息 ")
    @RequiresPermissions("channelMerchant:update")
    @RequestMapping("channelMerchant/update")
    @ResponseBody
    public ResponseBo updateChannelMerchant(ChannelMerchant channelMerchant) {
        try {
            this.channelMerchantService.updateChannelMerchant(channelMerchant);
            return ResponseBo.ok("修改指定通道信息成功！");
        } catch (Exception e) {
            log.error("修改指定通道信息失败", e);
            return ResponseBo.error("修改指定通道信息失败，请联系网站管理员！");
        }
    }
}

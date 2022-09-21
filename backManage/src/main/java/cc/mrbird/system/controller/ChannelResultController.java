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
import cc.mrbird.system.domain.ChannelResult;
import cc.mrbird.system.service.ChannelInfoService;
import cc.mrbird.system.service.ChannelResultService;

@Controller
public class ChannelResultController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ChannelResultService channelResultService;
    
    @Autowired
    private ChannelInfoService channelInfoService;

    @Log("获取择优排序信息")
    @RequestMapping("channelResult")
    @RequiresPermissions("channelResult:list")
    public String index(Model model) {
    	model.addAttribute("channelIdMap", channelInfoService.queryDicMap());
    	model.addAttribute("channelTypeMap", getDic("channelType"));
        return "system/channelResult/channelResult";
    }

    @RequestMapping("channelResult/getChannelResult")
    @ResponseBody
    public ResponseBo getChannelResult(ChannelResult channelResult) {
        try {
        	ChannelResult channelResult1 = this.channelResultService.findById(channelResult);
            return ResponseBo.ok(channelResult1);
        } catch (Exception e) {
            log.error("获取择优排序信息列表信息失败", e);
            return ResponseBo.error("获取择优排序信息列表信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("channelResult/list")
    @RequiresPermissions("channelResult:list")
    @ResponseBody
    public Map<String, Object> channelResultList(QueryRequest request,ChannelResult channelResult) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<ChannelResult> list = this.channelResultService.findAllChannelResults(channelResult);
        PageInfo<ChannelResult> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增择优排序信息 ")
    @RequiresPermissions("channelResult:add")
    @RequestMapping("channelResult/add")
    @ResponseBody
    public ResponseBo addChannelResult(ChannelResult channelResult) {
        try {
        	this.channelResultService.addChannelResult(channelResult);
            return ResponseBo.ok("新增择优排序信息成功！");
        } catch (Exception e) {
            log.error("新增择优排序信息失败", e);
            return ResponseBo.error("新增择优排序信息失败，请联系网站管理员！");
        }
    }

    @Log("删除择优排序信息")
    @RequiresPermissions("channelResult:delete")
    @RequestMapping("channelResult/delete")
    @ResponseBody
    public ResponseBo deleteChannelResults(ChannelResult channelResult) {
        try {
            this.channelResultService.deleteChannelResult(channelResult);
            return ResponseBo.ok("删除择优排序信息成功！");
        } catch (Exception e) {
            log.error("删除择优排序信息失败", e);
            return ResponseBo.error("删除择优排序信息失败，请联系网站管理员！");
        }
    }

    @Log("修改择优排序信息 ")
    @RequiresPermissions("channelResult:update")
    @RequestMapping("channelResult/update")
    @ResponseBody
    public ResponseBo updateChannelResult(ChannelResult channelResult) {
        try {
            this.channelResultService.updateChannelResult(channelResult);
            return ResponseBo.ok("修改择优排序信息成功！");
        } catch (Exception e) {
            log.error("修改择优排序信息失败", e);
            return ResponseBo.error("修改择优排序信息失败，请联系网站管理员！");
        }
    }
}

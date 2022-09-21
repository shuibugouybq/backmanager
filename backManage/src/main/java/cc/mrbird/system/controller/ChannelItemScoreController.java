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
import cc.mrbird.system.domain.ChannelItemScore;
import cc.mrbird.system.service.ChannelInfoService;
import cc.mrbird.system.service.ChannelItemScoreService;

@Controller
public class ChannelItemScoreController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ChannelItemScoreService channelItemScoreService;
    
    @Autowired
    private ChannelInfoService channelInfoService;

    @Log("通道项目打分表信息")
    @RequestMapping("ChannelItemScore")
    @RequiresPermissions("ChannelItemScore:list")
    public String index(Model model) {
    	model.addAttribute("channelIdMap", channelInfoService.queryDicMap());
    	model.addAttribute("channelTypeMap", getDic("channelType"));
        return "system/channelItemScore/channelItemScore";
    }

    @RequestMapping("ChannelItemScore/list")
    @RequiresPermissions("ChannelItemScore:list")
    @ResponseBody
    public Map<String, Object> cardbinList(QueryRequest request,ChannelItemScore channelItemScore) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<ChannelItemScore> list = this.channelItemScoreService.findAllChannelItemScores(channelItemScore);
        PageInfo<ChannelItemScore> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增通道项目打分")
    @RequiresPermissions("ChannelItemScore:add")
    @RequestMapping("channelItemScore/add")
    @ResponseBody
    public ResponseBo addCardbin(ChannelItemScore channelItemScore) {
        try {
        	this.channelItemScoreService.addChannelItemScore(channelItemScore);
            return ResponseBo.ok("新增通道项目打分成功！");
        } catch (Exception e) {
            log.error("新增通道项目打分失败", e);
            return ResponseBo.error("新增通道项目打分失败，请联系网站管理员！");
        }
    }

    @Log("删除通道项目")
    @RequiresPermissions("ChannelItemScore:delete")
    @RequestMapping("ChannelItemScore/delete")
    @ResponseBody
    public ResponseBo deleteCardbins(ChannelItemScore channelItemScore) {
        try {
            this.channelItemScoreService.deleteChannelItemScore(channelItemScore);
            return ResponseBo.ok("删除通道项目成功！");
        } catch (Exception e) {
            log.error("删除通道项目失败", e);
            return ResponseBo.error("删除通道项目失败，请联系网站管理员！");
        }
    }

    @Log("修改通道项目 ")
    @RequiresPermissions("ChannelItemScore:update")
    @RequestMapping("ChannelItemScore/update")
    @ResponseBody
    public ResponseBo updateCardbin(ChannelItemScore channelItemScore) {
        try {
            this.channelItemScoreService.updateChannelItemScore(channelItemScore);
            return ResponseBo.ok("修改通道项目成功！");
        } catch (Exception e) {
            log.error("修改通道项目失败", e);
            return ResponseBo.error("修改通道项目失败，请联系网站管理员！");
        }
    }
}

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
import cc.mrbird.system.domain.ChannelBank;
import cc.mrbird.system.service.ChannelBankService;

@Controller
public class ChannelBankController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ChannelBankService channelBankService;

    @Log("获取机构信息")
    @RequestMapping("channelBank")
    @RequiresPermissions("channelBank:list")
    public String index() {
        return "system/channelBank/channelBank";
    }

    @RequestMapping("channelBank/getChannelBank")
    @ResponseBody
    public ResponseBo getChannelBank(ChannelBank channelBank) {
        try {
        	ChannelBank channelBank1 = this.channelBankService.findById(channelBank);
            return ResponseBo.ok(channelBank1);
        } catch (Exception e) {
            log.error("获取机构信息失败", e);
            return ResponseBo.error("获取机构信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("channelBank/list")
    @RequiresPermissions("channelBank:list")
    @ResponseBody
    public Map<String, Object> channelBankList(QueryRequest request,ChannelBank channelBank) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<ChannelBank> list = this.channelBankService.findAllChannelBanks(channelBank);
        PageInfo<ChannelBank> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增机构 ")
    @RequiresPermissions("channelBank:add")
    @RequestMapping("channelBank/add")
    @ResponseBody
    public ResponseBo addChannelBank(ChannelBank channelBank) {
        try {
        	this.channelBankService.addChannelBank(channelBank);
            return ResponseBo.ok("新增机构成功！");
        } catch (Exception e) {
            log.error("新增机构失败", e);
            return ResponseBo.error("新增机构失败，请联系网站管理员！");
        }
    }

    @Log("删除机构")
    @RequiresPermissions("channelBank:delete")
    @RequestMapping("channelBank/delete")
    @ResponseBody
    public ResponseBo deleteChannelBanks(ChannelBank channelBank) {
        try {
            this.channelBankService.deleteChannelBank(channelBank);
            return ResponseBo.ok("删除机构成功！");
        } catch (Exception e) {
            log.error("删除机构失败", e);
            return ResponseBo.error("删除机构失败，请联系网站管理员！");
        }
    }

    @Log("修改机构 ")
    @RequiresPermissions("channelBank:update")
    @RequestMapping("channelBank/update")
    @ResponseBody
    public ResponseBo updateChannelBank(ChannelBank channelBank) {
        try {
            this.channelBankService.updateChannelBank(channelBank);
            return ResponseBo.ok("修改机构成功！");
        } catch (Exception e) {
            log.error("修改机构失败", e);
            return ResponseBo.error("修改机构失败，请联系网站管理员！");
        }
    }
}

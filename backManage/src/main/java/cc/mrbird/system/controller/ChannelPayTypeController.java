package cc.mrbird.system.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
import cc.mrbird.system.domain.ChannelBank;
import cc.mrbird.system.domain.ChannelInfo;
import cc.mrbird.system.domain.ChannelPayType;
import cc.mrbird.system.service.ChannelBankService;
import cc.mrbird.system.service.ChannelInfoService;
import cc.mrbird.system.service.ChannelPayTypeService;

@Controller
public class ChannelPayTypeController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ChannelPayTypeService channelPayTypeService;
    
    @Autowired
    private ChannelInfoService channelInfoService;
    
    @Autowired
    private ChannelBankService channelBankService;

    @Log("通道业务信息")
    @RequestMapping("channelPayType")
    @RequiresPermissions("channelPayType:list")
    public String index(Model model) {
		/*List list = channelBankService.findAllChannelBanks(new ChannelBank());
		model.addAttribute("channelBankMap", list.stream()
				.collect(Collectors.toMap(ChannelBank::getBankId, ChannelBank::getBankName)));*/
    	model.addAttribute("channelIdMap", channelInfoService.queryDicMap());
		model.addAttribute("channelBankMap", channelBankService.getChannelBank());
    	model.addAttribute("channelTypeMap", getDic("channelType"));
        return "system/channelPayType/channelPayType";
    }
    
	@RequestMapping("channelPayType/getDic")
	@RequiresPermissions("channelPayType:list")
	@ResponseBody
	@SuppressWarnings(value = { "unchecked", "rawtypes" })
	public Map<String, Object> getDic() {
		Map<String, Object> dicMap = new HashMap<String, Object>();
		try {
			List list = channelBankService.findAllChannelBanks(new ChannelBank());
			List list1 = channelInfoService.findAllChannelInfos(new ChannelInfo());
			dicMap.put("channelBank_b", list.stream()
					.collect(Collectors.toMap(ChannelBank::getBankId, ChannelBank::getBankName)));
			dicMap.put("channelInfo_b", super.toMap(list1, "channelId", "channelName"));
			return dicMap;
		} catch (Exception e) {
			log.error("获取字典信息失败", e);
			return dicMap;
		}
	}

    @RequestMapping("channelPayType/list")
    @RequiresPermissions("channelPayType:list")
    @ResponseBody
    public Map<String, Object> channelPayTypeList(QueryRequest request,ChannelPayType channelPayType) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<ChannelPayType> list = this.channelPayTypeService.findAllChannelPayType(channelPayType);
        PageInfo<ChannelPayType> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增通道业务信息")
    @RequiresPermissions("channelPayType:add")
    @RequestMapping("channelPayType/add")
    @ResponseBody
    public ResponseBo addChannelPayType(ChannelPayType channelPayType) {
        try {
        	this.channelPayTypeService.addChannelPayType(channelPayType);
            return ResponseBo.ok("新增通道业务信息成功！");
        } catch (Exception e) {
            log.error("新增通道业务信息失败", e);
            return ResponseBo.error("新增通道业务信息失败，请联系网站管理员！");
        }
    }
//
    @Log("删除通道业务信息")
    @RequiresPermissions("channelPayType:delete")
    @RequestMapping("channelPayType/delete")
    @ResponseBody
    public ResponseBo deleteChannelPayType(ChannelPayType channelPayType) {
        try {
            this.channelPayTypeService.deleteChannelPayType(channelPayType);
            return ResponseBo.ok("删除通道业务信息成功！");
        } catch (Exception e) {
            log.error("删除通道业务信息失败", e);
            return ResponseBo.error("删除通道业务信息失败，请联系网站管理员！");
        }
    }
//
    @Log("修改通道业务信息 ")
    @RequiresPermissions("channelPayType:update")
    @RequestMapping("channelPayType/update")
    @ResponseBody
    public ResponseBo 通道业务(ChannelPayType channelPayType) {
        try {
            this.channelPayTypeService.updateChannelPayType(channelPayType);
            return ResponseBo.ok("修改通道业务信息成功！");
        } catch (Exception e) {
            log.error("修改通道业务信息失败", e);
            return ResponseBo.error("修改通道业务信息失败，请联系网站管理员！");
        }
    }
}

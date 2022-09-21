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
import cc.mrbird.system.domain.ChannelCtrlDayFractions;
import cc.mrbird.system.service.ChannelCtrlDayfractService;
import cc.mrbird.system.service.ChannelInfoService;
@Controller
public class ChannelCtrlDayfractController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ChannelCtrlDayfractService fractService;
    
    @Autowired
    private ChannelInfoService channelInfoService;
    
    @Log("通道历史得分表查询")
    @RequestMapping("channelCtrlDayFract")
    @RequiresPermissions("channelCtrlDayFract:list")
    public String index(Model model) {
    	model.addAttribute("channelIdMap", channelInfoService.queryDicMap());
        return "system/channelctrldayfract/channelctrldayfract";
    }

  

    @RequestMapping("channelCtrlDayFract/list")
    @RequiresPermissions("channelCtrlDayFract:list")
    @ResponseBody
    public Map<String, Object> merchantList(QueryRequest request,ChannelCtrlDayFractions channelCtrlDayFractions) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<ChannelCtrlDayFractions> list = this.fractService.findAllChannelCtrlDayfract(channelCtrlDayFractions);
        PageInfo<ChannelCtrlDayFractions> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

//    @Log("新增商户 ")
//    @RequiresPermissions("merchant:add")
//    @RequestMapping("merchant/add")
//    @ResponseBody
//    public ResponseBo addMerchant(Merchant merchant) {
//        try {
//        	this.merchantService.addMerchant(merchant);
//            return ResponseBo.ok("新增部门成功！");
//        } catch (Exception e) {
//            log.error("新增商户失败", e);
//            return ResponseBo.error("新增商户失败，请联系网站管理员！");
//        }
//    }

//    @Log("删除商户")
//    @RequiresPermissions("merchant:delete")
//    @RequestMapping("merchant/delete")
//    @ResponseBody
//    public ResponseBo deleteMerchants(String merIds) {
//        try {
//            this.merchantService.deleteMerchants(merIds);
//            return ResponseBo.ok("删除商户成功！");
//        } catch (Exception e) {
//            log.error("删除商户失败", e);
//            return ResponseBo.error("删除商户失败，请联系网站管理员！");
//        }
//    }
//
//    @Log("修改商户 ")
//    @RequiresPermissions("merchant:update")
//    @RequestMapping("merchant/update")
//    @ResponseBody
//    public ResponseBo updateMerchant(Merchant merchant) {
//        try {
//            this.merchantService.updateMerchant(merchant);
//            return ResponseBo.ok("修改商户成功！");
//        } catch (Exception e) {
//            log.error("修改商户失败", e);
//            return ResponseBo.error("修改商户失败，请联系网站管理员！");
//        }
//    }
}

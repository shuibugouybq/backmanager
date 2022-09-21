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
import cc.mrbird.system.domain.UserPayTypeSignInfo;
import cc.mrbird.system.service.UserPayTypeSignInfoService;

@Controller
public class UserPayTypeSignInfoController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserPayTypeSignInfoService userPayTypeSignInfoService;

    @Log("通道项目打分表信息")
    @RequestMapping("userPayTypeSignInfo")
    @RequiresPermissions("userPayTypeSignInfo:list")
    public String index() {
        return "system/userPayTypeSignInfo/userPayTypeSignInfo";
    }

//    @RequestMapping("ChannelItemScore/list")
//    @ResponseBody
//    public ResponseBo getCardbin(CardBin cardbin) {
//        try {
//        	CardBin cardbin1 = this.channelItemScoreService.findById(cardbin);
//            return ResponseBo.ok(cardbin1);
//        } catch (Exception e) {
//            log.error("获取卡BIN信息失败", e);
//            return ResponseBo.error("获取卡BIN信息失败，请联系网站管理员！");
//        }
//    }

    @RequestMapping("userPayTypeSignInfo/list")
    @RequiresPermissions("userPayTypeSignInfo:list")
    @ResponseBody
    public Map<String, Object> userPayTypeSignInfoList(QueryRequest request,UserPayTypeSignInfo userPayTypeSignInfo) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<UserPayTypeSignInfo> list = this.userPayTypeSignInfoService.findAllUserPayTypeSignInfo(userPayTypeSignInfo);
        PageInfo<UserPayTypeSignInfo> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增通道项目打分")
    @RequiresPermissions("userPayTypeSignInfo:add")
    @RequestMapping("userPayTypeSignInfo/add")
    @ResponseBody
    public ResponseBo addCardbin(UserPayTypeSignInfo userPayTypeSignInfo) {
        try {
        	this.userPayTypeSignInfoService.addUserPayTypeSignInfo(userPayTypeSignInfo);
            return ResponseBo.ok("新增通道项目打分成功！");
        } catch (Exception e) {
            log.error("新增通道项目打分失败", e);
            return ResponseBo.error("新增通道项目打分失败，请联系网站管理员！");
        }
    }
//
    @Log("删除通道项目")
    @RequiresPermissions("userPayTypeSignInfo:delete")
    @RequestMapping("userPayTypeSignInfo/delete")
    @ResponseBody
    public ResponseBo deleteCardbins(UserPayTypeSignInfo userPayTypeSignInfo) {
        try {
            this.userPayTypeSignInfoService.deleteUserPayTypeSignInfo(userPayTypeSignInfo);
            return ResponseBo.ok("删除通道项目成功！");
        } catch (Exception e) {
            log.error("删除通道项目失败", e);
            return ResponseBo.error("删除通道项目失败，请联系网站管理员！");
        }
    }
//
    @Log("修改通道项目 ")
    @RequiresPermissions("userPayTypeSignInfo:update")
    @RequestMapping("userPayTypeSignInfo/update")
    @ResponseBody
    public ResponseBo updateCardbin(UserPayTypeSignInfo userPayTypeSignInfo) {
        try {
            this.userPayTypeSignInfoService.updateUserPayTypeSignInfo(userPayTypeSignInfo);
            return ResponseBo.ok("修改通道项目成功！");
        } catch (Exception e) {
            log.error("修改通道项目失败", e);
            return ResponseBo.error("修改通道项目失败，请联系网站管理员！");
        }
    }
}

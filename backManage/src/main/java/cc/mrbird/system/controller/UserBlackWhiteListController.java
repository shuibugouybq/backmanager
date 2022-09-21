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
import cc.mrbird.system.domain.UserBlackWhiteList;
import cc.mrbird.system.service.UserBlackWhiteListService;

@Controller
public class UserBlackWhiteListController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserBlackWhiteListService userBlackWhiteListService;

    @Log("获取用户黑白名单信息")
    @RequestMapping("userBlackWhiteList")
    @RequiresPermissions("userBlackWhiteList:list")
    public String index(Model model) {
    	Session session = super.getSession();
    	Map<String, Map<String, String>> dictMap = (Map<String, Map<String, String>>) session.getAttribute("constMap");
    	model.addAttribute("AcctTpCdMap", dictMap.get("AcctTpCd"));
        return "system/userBlackWhiteList/userBlackWhiteList";
    }

    @RequestMapping("userBlackWhiteList/getUserBlackWhiteList")
    @ResponseBody
    public ResponseBo getUserBlackWhiteList(UserBlackWhiteList userBlackWhiteList) {
        try {
        	UserBlackWhiteList userBlackWhiteList1 = this.userBlackWhiteListService.findById(userBlackWhiteList);
            return ResponseBo.ok(userBlackWhiteList1);
        } catch (Exception e) {
            log.error("获取用户黑白名单列表信息失败", e);
            return ResponseBo.error("获取用户黑白名单列表信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("userBlackWhiteList/list")
    @RequiresPermissions("userBlackWhiteList:list")
    @ResponseBody
    public Map<String, Object> userBlackWhiteListList(QueryRequest request,UserBlackWhiteList userBlackWhiteList) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<UserBlackWhiteList> list = this.userBlackWhiteListService.findAllUserBlackWhiteLists(userBlackWhiteList);
        PageInfo<UserBlackWhiteList> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增用户黑白名单 ")
    @RequiresPermissions("userBlackWhiteList:add")
    @RequestMapping("userBlackWhiteList/add")
    @ResponseBody
    public ResponseBo addUserBlackWhiteList(UserBlackWhiteList userBlackWhiteList) {
        try {
        	this.userBlackWhiteListService.addUserBlackWhiteList(userBlackWhiteList);
            return ResponseBo.ok("新增用户黑白名单成功！");
        } catch (Exception e) {
            log.error("新增用户黑白名单失败", e);
            return ResponseBo.error("新增用户黑白名单失败，请联系网站管理员！");
        }
    }

    @Log("删除用户黑白名单")
    @RequiresPermissions("userBlackWhiteList:delete")
    @RequestMapping("userBlackWhiteList/delete")
    @ResponseBody
    public ResponseBo deleteUserBlackWhiteLists(UserBlackWhiteList userBlackWhiteList) {
        try {
            this.userBlackWhiteListService.deleteUserBlackWhiteList(userBlackWhiteList);
            return ResponseBo.ok("删除用户黑白名单成功！");
        } catch (Exception e) {
            log.error("删除用户黑白名单失败", e);
            return ResponseBo.error("删除用户黑白名单失败，请联系网站管理员！");
        }
    }

    @Log("修改用户黑白名单 ")
    @RequiresPermissions("userBlackWhiteList:update")
    @RequestMapping("userBlackWhiteList/update")
    @ResponseBody
    public ResponseBo updateUserBlackWhiteList(UserBlackWhiteList userBlackWhiteList) {
        try {
            this.userBlackWhiteListService.updateUserBlackWhiteList(userBlackWhiteList);
            return ResponseBo.ok("修改用户黑白名单成功！");
        } catch (Exception e) {
            log.error("修改用户黑白名单失败", e);
            return ResponseBo.error("修改用户黑白名单失败，请联系网站管理员！");
        }
    }
}

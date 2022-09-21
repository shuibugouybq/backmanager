package cc.mrbird.system.controller;


import java.util.Date;
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
import cc.mrbird.common.util.DateUtil;
import cc.mrbird.system.domain.UserTransctrl;
import cc.mrbird.system.service.UserTransctrlService;

@Controller
public class UserTransctrlController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UserTransctrlService userTransctrlService;

    @Log("获取用户交易限额信息")
    @RequestMapping("userTransctrl")
    @RequiresPermissions("userTransctrl:list")
    public String index() {
        return "system/userTransctrl/userTransctrl";
    }

    @RequestMapping("userTransctrl/getUserTransctrl")
    @ResponseBody
    public ResponseBo getUserTransctrl(UserTransctrl userTransctrl) {
        try {
        	UserTransctrl userTransctrl1 = this.userTransctrlService.findById(userTransctrl);
            return ResponseBo.ok(userTransctrl1);
        } catch (Exception e) {
            log.error("获取用户交易限额信息失败", e);
            return ResponseBo.error("获取用户交易限额信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("userTransctrl/list")
    @RequiresPermissions("userTransctrl:list")
    @ResponseBody
    public Map<String, Object> userTransctrlList(QueryRequest request,UserTransctrl userTransctrl) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<UserTransctrl> list = this.userTransctrlService.findAllUserTransctrls(userTransctrl);
        PageInfo<UserTransctrl> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("删除用户交易限额")
    @RequiresPermissions("userTransctrl:delete")
    @RequestMapping("userTransctrl/delete")
    @ResponseBody
    public ResponseBo deleteUserTransctrls(UserTransctrl userTransctrl) {
        try {
            this.userTransctrlService.deleteUserTransctrl(userTransctrl);
            return ResponseBo.ok("删除用户交易限额成功！");
        } catch (Exception e) {
            log.error("删除用户交易限额失败", e);
            return ResponseBo.error("删除用户交易限额失败，请联系网站管理员！");
        }
    }

    @Log("修改用户交易限额 ")
    @RequiresPermissions("userTransctrl:update")
    @RequestMapping("userTransctrl/update")
    @ResponseBody
    public ResponseBo updateUserTransctrl(UserTransctrl userTransctrl) {
        try {
        	Long userId = super.getCurrentUser().getUserId();
        	userTransctrl.setUsertcModifyUser(Long.toString(userId));
        	userTransctrl.setUsertcModifyDate(new Date());
            this.userTransctrlService.updateUserTransctrl(userTransctrl);
            return ResponseBo.ok("修改用户交易限额成功！");
        } catch (Exception e) {
            log.error("修改用户交易限额失败", e);
            return ResponseBo.error("修改用户交易限额失败，请联系网站管理员！");
        }
    }
}

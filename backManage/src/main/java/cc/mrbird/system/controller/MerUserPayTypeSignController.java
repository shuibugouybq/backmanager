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
import cc.mrbird.system.domain.MerUserPayTypeSign;
import cc.mrbird.system.service.MerUserPayTypeSignService;

@Controller
public class MerUserPayTypeSignController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MerUserPayTypeSignService merUserPayTypeSignService;

    @Log("获取用户商户平台支付产品签约信息")
    @RequestMapping("merUserPayTypeSign")
    @RequiresPermissions("merUserPayTypeSign:list")
    public String index(Model model) {
    	Session session = super.getSession();
    	Map<String, Map<String, String>> dictMap = (Map<String, Map<String, String>>) session.getAttribute("constMap");
    	model.addAttribute("AcctTpCdMap", dictMap.get("AcctTpCd"));
        return "system/merUserPayTypeSign/merUserPayTypeSign";
    }

    @RequestMapping("merUserPayTypeSign/getMerUserPayTypeSign")
    @ResponseBody
    public ResponseBo getMerUserPayTypeSign(MerUserPayTypeSign merUserPayTypeSign) {
        try {
        	MerUserPayTypeSign merUserPayTypeSign1 = this.merUserPayTypeSignService.findById(merUserPayTypeSign);
            return ResponseBo.ok(merUserPayTypeSign1);
        } catch (Exception e) {
            log.error("获取用户商户平台支付产品签约列表信息失败", e);
            return ResponseBo.error("获取用户商户平台支付产品签约列表信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("merUserPayTypeSign/list")
    @RequiresPermissions("merUserPayTypeSign:list")
    @ResponseBody
    public Map<String, Object> merUserPayTypeSignList(QueryRequest request,MerUserPayTypeSign merUserPayTypeSign) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<MerUserPayTypeSign> list = this.merUserPayTypeSignService.findAllMerUserPayTypeSign(merUserPayTypeSign);
        PageInfo<MerUserPayTypeSign> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增用户商户平台支付产品签约 ")
    @RequiresPermissions("merUserPayTypeSign:add")
    @RequestMapping("merUserPayTypeSign/add")
    @ResponseBody
    public ResponseBo addMerUserPayTypeSign(MerUserPayTypeSign merUserPayTypeSign) {
        try {
        	this.merUserPayTypeSignService.addMerUserPayTypeSign(merUserPayTypeSign);
            return ResponseBo.ok("新增用户商户平台支付产品签约成功！");
        } catch (Exception e) {
            log.error("新增用户商户平台支付产品签约失败", e);
            return ResponseBo.error("新增用户商户平台支付产品签约失败，请联系网站管理员！");
        }
    }

    @Log("删除用户商户平台支付产品签约")
    @RequiresPermissions("merUserPayTypeSign:delete")
    @RequestMapping("merUserPayTypeSign/delete")
    @ResponseBody
    public ResponseBo deleteMerUserPayTypeSigns(MerUserPayTypeSign merUserPayTypeSign) {
        try {
            this.merUserPayTypeSignService.deleteMerUserPayTypeSign(merUserPayTypeSign);
            return ResponseBo.ok("删除用户商户平台支付产品签约成功！");
        } catch (Exception e) {
            log.error("删除用户商户平台支付产品签约失败", e);
            return ResponseBo.error("删除用户商户平台支付产品签约失败，请联系网站管理员！");
        }
    }

    @Log("修改用户商户平台支付产品签约 ")
    @RequiresPermissions("merUserPayTypeSign:update")
    @RequestMapping("merUserPayTypeSign/update")
    @ResponseBody
    public ResponseBo updateMerUserPayTypeSign(MerUserPayTypeSign merUserPayTypeSign) {
        try {
            this.merUserPayTypeSignService.updateMerUserPayTypeSign(merUserPayTypeSign);
            return ResponseBo.ok("修改用户商户平台支付产品签约成功！");
        } catch (Exception e) {
            log.error("修改用户商户平台支付产品签约失败", e);
            return ResponseBo.error("修改用户商户平台支付产品签约失败，请联系网站管理员！");
        }
    }
}

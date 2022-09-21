package cc.mrbird.system.controller;

import java.util.List;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

import cc.mrbird.common.annotation.Log;
import cc.mrbird.common.controller.BaseController;
import cc.mrbird.common.domain.QueryRequest;
import cc.mrbird.system.domain.UTransJnl;
import cc.mrbird.system.service.UTransJnlService;

@Controller
public class UTransJnlController extends BaseController {

    @Autowired
    private UTransJnlService uTransJnlService;

    @Log("无卡支付日志列表查询")
    @RequestMapping("uTransJnl")
    @RequiresPermissions("uTransJnl:list")
    public String index() {
        return "system/uTransJnl/uTransJnl";
    }

    @RequestMapping("uTransJnl/list")
    @RequiresPermissions("uTransJnl:list")
    @ResponseBody
    public Map<String, Object> uTransJnlList(QueryRequest request,UTransJnl uTransJnl) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<UTransJnl> list = this.uTransJnlService.transQuery(uTransJnl);
        PageInfo<UTransJnl> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }
}

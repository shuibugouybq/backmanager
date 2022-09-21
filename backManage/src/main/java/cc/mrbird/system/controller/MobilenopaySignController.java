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
import cc.mrbird.system.domain.MobilenopaySign;
import cc.mrbird.system.service.MobilenopaySignService;

@Controller
public class MobilenopaySignController extends BaseController {

    @Autowired
    private MobilenopaySignService mobilenopaySignService;

    @Log("获取用户签约信息列表查询")
    @RequestMapping("mobilenopaySign")
    @RequiresPermissions("mobilenopaySign:list")
    public String index() {
        return "system/mobilenopaySign/mobilenopaySign";
    }

    @RequestMapping("mobilenopaySign/list")
    @RequiresPermissions("mobilenopaySign:list")
    @ResponseBody
    public Map<String, Object> mobilenopaySignList(QueryRequest request,MobilenopaySign mobilenopaySign) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<MobilenopaySign> list = this.mobilenopaySignService.findAllMobilenopaySign(mobilenopaySign);
        PageInfo<MobilenopaySign> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }
}

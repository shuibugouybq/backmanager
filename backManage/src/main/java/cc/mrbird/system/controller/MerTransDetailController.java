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
import cc.mrbird.system.domain.OtTrans;
import cc.mrbird.system.service.TransQueryService;

@Controller
public class MerTransDetailController extends BaseController {

    @Autowired
    private TransQueryService transQueryService;

    @Log("商户交易明细查询")
    @RequestMapping("merTransDetail")
    @RequiresPermissions("merTransDetail:list")
    public String index() {
        return "system/merTransDetail/merTransDetail";
    }

    @RequestMapping("merTransDetail/list")
    @RequiresPermissions("merTransDetail:list")
    @ResponseBody
    public Map<String, Object> merTransDetailList(QueryRequest request,OtTrans otTrans) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<OtTrans> list = this.transQueryService.transQuery(otTrans);
        PageInfo<OtTrans> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

}

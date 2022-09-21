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
import cc.mrbird.system.domain.MerTransLimit;
import cc.mrbird.system.service.MerTransLimitService;

@Controller
public class MerTransLimitController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MerTransLimitService merTransLimitService;

    @Log("商户交易控制信息")
    @RequestMapping("merTransLimit")
    @RequiresPermissions("merTransLimit:list")
    public String index() {
        return "system/merTransLimit/merTransLimit";
    }


    @RequestMapping("merTransLimit/list")
    @RequiresPermissions("merTransLimit:list")
    @ResponseBody
    public Map<String, Object> merTransLimitList(QueryRequest request,MerTransLimit merTransLimit) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<MerTransLimit> list = this.merTransLimitService.findAllMerTransLimit(merTransLimit);
        PageInfo<MerTransLimit> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增商户交易控制")
    @RequiresPermissions("merTransLimit:add")
    @RequestMapping("merTransLimit/add")
    @ResponseBody
    public ResponseBo addCardbin(MerTransLimit merTransLimit) {
        try {
        	this.merTransLimitService.addMerTransLimit(merTransLimit);
            return ResponseBo.ok("新增通道项目打分成功！");
        } catch (Exception e) {
            log.error("新增通道项目打分失败", e);
            return ResponseBo.error("新增通道项目打分失败，请联系网站管理员！");
        }
    }
//
    @Log("删除商户交易控制")
    @RequiresPermissions("merTransLimit:delete")
    @RequestMapping("merTransLimit/delete")
    @ResponseBody
    public ResponseBo deleteMerTransLimit(MerTransLimit merTransLimit) {
        try {
            this.merTransLimitService.deleteMerTransLimit(merTransLimit);
            return ResponseBo.ok("删除商户交易控制成功！");
        } catch (Exception e) {
            log.error("删除商户交易控制失败", e);
            return ResponseBo.error("删除商户交易控制失败，请联系网站管理员！");
        }
    }
//
    @Log("修改商户交易控制")
    @RequiresPermissions("merTransLimit:update")
    @RequestMapping("merTransLimit/update")
    @ResponseBody
    public ResponseBo updateMerTransLimit(MerTransLimit merTransLimit) {
        try {
            this.merTransLimitService.updateMerTransLimit(merTransLimit);
            return ResponseBo.ok("修改商户交易控制成功！");
        } catch (Exception e) {
            log.error("修改商户交易控制失败", e);
            return ResponseBo.error("修改商户交易控制失败，请联系网站管理员！");
        }
    }
}

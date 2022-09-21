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
import cc.mrbird.system.domain.DetpTransCtrl;
import cc.mrbird.system.service.DetpTransCtrlService;

@Controller
public class DetpTransCtrlController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DetpTransCtrlService detpTransCtrlService;

    @Log("获取机构交易控制信息")
    @RequestMapping("detpTransCtrl")
    @RequiresPermissions("detpTransCtrl:list")
    public String index() {
        return "system/detpTransCtrl/detpTransCtrl";
    }

    @RequestMapping("detpTransCtrl/getDetpTransCtrl")
    @ResponseBody
    public ResponseBo getDetpTransCtrl(DetpTransCtrl detpTransCtrl) {
        try {
        	DetpTransCtrl detpTransCtrl1 = this.detpTransCtrlService.findById(detpTransCtrl);
        	log.info(detpTransCtrl1.toString());
            return ResponseBo.ok(detpTransCtrl1);
        } catch (Exception e) {
            log.error("获取机构交易控制信息失败", e);
            return ResponseBo.error("获取机构交易控制信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("detpTransCtrl/list")
    @RequiresPermissions("detpTransCtrl:list")
    @ResponseBody
    public Map<String, Object> DetpTransCtrlList(QueryRequest request,DetpTransCtrl detpTransCtrl) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<DetpTransCtrl> list = this.detpTransCtrlService.findAllDetpTransCtrls(detpTransCtrl);
        PageInfo<DetpTransCtrl> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增机构交易控制 ")
    @RequiresPermissions("detpTransCtrl:add")
    @RequestMapping("detpTransCtrl/add")
    @ResponseBody
    public ResponseBo addDetpTransCtrl(DetpTransCtrl detpTransCtrl) {
        try {
        	this.detpTransCtrlService.insertDetpTransCtrl(detpTransCtrl);
            return ResponseBo.ok("新增机构交易控制成功！");
        } catch (Exception e) {
            log.error("新增机构交易控制失败", e);
            return ResponseBo.error("新增机构交易控制失败，请联系网站管理员！");
        }
    }

    @Log("删除机构交易控制")
    @RequiresPermissions("detpTransCtrl:delete")
    @RequestMapping("detpTransCtrl/delete")
    @ResponseBody
    public ResponseBo deleteDetpTransCtrls(DetpTransCtrl detpTransCtrl) {
        try {
            this.detpTransCtrlService.deleteDetpTransCtrl(detpTransCtrl);
            return ResponseBo.ok("删除机构交易控制成功！");
        } catch (Exception e) {
            log.error("删除机构交易控制失败", e);
            return ResponseBo.error("删除机构交易控制失败，请联系网站管理员！");
        }
    }

    @Log("修改机构交易控制 ")
    @RequiresPermissions("detpTransCtrl:update")
    @RequestMapping("detpTransCtrl/update")
    @ResponseBody
    public ResponseBo updateDetpTransCtrl(DetpTransCtrl detpTransCtrl) {
        try {
            this.detpTransCtrlService.updateDetpTransCtrl(detpTransCtrl);
            return ResponseBo.ok("修改机构交易控制成功！");
        } catch (Exception e) {
            log.error("修改机构交易控制失败", e);
            return ResponseBo.error("修改机构交易控制失败，请联系网站管理员！");
        }
    }
}

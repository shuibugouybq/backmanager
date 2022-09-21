package cc.mrbird.system.controller;

import java.text.SimpleDateFormat;
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
import cc.mrbird.system.domain.UppBatchDepartment;
import cc.mrbird.system.service.UppBatchDepartmentService;

@Controller
public class UppBatchDepartmentController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UppBatchDepartmentService uppBatchDepartmentService;

    @Log("通道信息")
    @RequestMapping("uppBatchDepartment")
    @RequiresPermissions("uppBatchDepartment:list")
    public String index() {
        return "system/uppBatchDepartment/uppBatchDepartment";
    }


    @RequestMapping("uppBatchDepartment/list")
    @RequiresPermissions("uppBatchDepartment:list")
    @ResponseBody
    public Map<String, Object> uppBatchctrlList(QueryRequest request,UppBatchDepartment uppBatchDepartment) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<UppBatchDepartment> list = this.uppBatchDepartmentService.findAllUppBatchDepartment(uppBatchDepartment);
        PageInfo<UppBatchDepartment> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增通道")
    @RequiresPermissions("uppBatchDepartment:add")
    @RequestMapping("uppBatchDepartment/add")
    @ResponseBody
    public ResponseBo addUppBatchctrl(UppBatchDepartment uppBatchDepartment) {
    	Date date = new Date();
    	SimpleDateFormat  dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	uppBatchDepartment.setGmtCreate(dateFormat.format(date));
    	try {
        	this.uppBatchDepartmentService.addUppBatchDepartment(uppBatchDepartment);
            return ResponseBo.ok("新增通道项目打分成功！");
        } catch (Exception e) {
            log.error("新增通道项目打分失败", e);
            return ResponseBo.error("新增通道项目打分失败，请联系网站管理员！");
        }
    }
//
    @Log("删除通道")
    @RequiresPermissions("uppBatchDepartment:delete")
    @RequestMapping("uppBatchDepartment/delete")
    @ResponseBody
    public ResponseBo deleteUppBatchctrls(UppBatchDepartment uppBatchDepartment) {
        try {
            this.uppBatchDepartmentService.deleteUppBatchDepartment(uppBatchDepartment);
            return ResponseBo.ok("删除通道项目成功！");
        } catch (Exception e) {
            log.error("删除通道项目失败", e);
            return ResponseBo.error("删除通道项目失败，请联系网站管理员！");
        }
    }
//
    @Log("修改清算控制 ")
    @RequiresPermissions("uppBatchDepartment:update")
    @RequestMapping("uppBatchDepartment/update")
    @ResponseBody
    public ResponseBo uppBatchDepartmentBatchctrl(UppBatchDepartment uppBatchDepartment) 
    {
    	Date date = new Date();
    	SimpleDateFormat  dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	uppBatchDepartment.setGmtModified(dateFormat.format(date));
        try {
            this.uppBatchDepartmentService.updateUppBatchDepartment(uppBatchDepartment);
            return ResponseBo.ok("修改通道项目成功！");
        } catch (Exception e) {
            log.error("修改通道项目失败", e);
            return ResponseBo.error("修改通道项目失败，请联系网站管理员！");
        }
    }
}

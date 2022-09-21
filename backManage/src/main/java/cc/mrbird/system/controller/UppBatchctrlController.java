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
import cc.mrbird.system.domain.UppBatchctrl;
import cc.mrbird.system.service.UppBatchctrlService;

@Controller
public class UppBatchctrlController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private UppBatchctrlService uppBatchctrlService;

    @Log("清算控制信息")
    @RequestMapping("uppBatchctrl")
    @RequiresPermissions("uppBatchctrl:list")
    public String index() {
        return "system/uppBatchctrl/uppBatchctrl";
    }


    @RequestMapping("uppBatchctrl/list")
    @RequiresPermissions("uppBatchctrl:list")
    @ResponseBody
    public Map<String, Object> uppBatchctrlList(QueryRequest request,UppBatchctrl uppBatchctrl) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<UppBatchctrl> list = this.uppBatchctrlService.findAlluppBatchctrl(uppBatchctrl);
        PageInfo<UppBatchctrl> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增清算控制")
    @RequiresPermissions("uppBatchctrl:add")
    @RequestMapping("uppBatchctrl/add")
    @ResponseBody
    public ResponseBo addUppBatchctrl(UppBatchctrl uppBatchctrl) {
    	Date date = new Date();
    	SimpleDateFormat  dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	uppBatchctrl.setGmtCreate(dateFormat.format(date));
    	try {
        	this.uppBatchctrlService.addUppBatchctrl(uppBatchctrl);
            return ResponseBo.ok("新增通道项目打分成功！");
        } catch (Exception e) {
            log.error("新增通道项目打分失败", e);
            return ResponseBo.error("新增通道项目打分失败，请联系网站管理员！");
        }
    }
//
    @Log("删除清算控制")
    @RequiresPermissions("uppBatchctrl:delete")
    @RequestMapping("uppBatchctrl/delete")
    @ResponseBody
    public ResponseBo deleteUppBatchctrls(UppBatchctrl uppBatchctrl) {
        try {
            this.uppBatchctrlService.deleteUppBatchctrl(uppBatchctrl);
            return ResponseBo.ok("删除通道项目成功！");
        } catch (Exception e) {
            log.error("删除通道项目失败", e);
            return ResponseBo.error("删除通道项目失败，请联系网站管理员！");
        }
    }
//
    @Log("修改清算控制 ")
    @RequiresPermissions("uppBatchctrl:update")
    @RequestMapping("uppBatchctrl/update")
    @ResponseBody
    public ResponseBo updateUppBatchctrl(UppBatchctrl uppBatchctrl) {
        try {
            this.uppBatchctrlService.updateUppBatchctrl(uppBatchctrl);
            return ResponseBo.ok("修改通道项目成功！");
        } catch (Exception e) {
            log.error("修改通道项目失败", e);
            return ResponseBo.error("修改通道项目失败，请联系网站管理员！");
        }
    }
}

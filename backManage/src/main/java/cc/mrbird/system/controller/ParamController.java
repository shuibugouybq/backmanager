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
import cc.mrbird.common.util.DateUtil;
import cc.mrbird.system.domain.Param;
import cc.mrbird.system.service.ParamService;

@Controller
public class ParamController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ParamService paramService;

    @Log("获取字典数据信息")
    @RequestMapping("param")
    @RequiresPermissions("param:list")
    public String index() {
        return "system/param/param";
    }

    @RequestMapping("param/getParam")
    @ResponseBody
    public ResponseBo getParam(Param param) {
        try {
        	Param param1 = this.paramService.findById(param);
            return ResponseBo.ok(param1);
        } catch (Exception e) {
            log.error("获取字典数据列表信息失败", e);
            return ResponseBo.error("获取字典数据列表信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("param/list")
    @RequiresPermissions("param:list")
    @ResponseBody
    public Map<String, Object> paramList(QueryRequest request,Param param) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<Param> list = this.paramService.findAllParams(param);
        PageInfo<Param> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增字典数据 ")
    @RequiresPermissions("param:add")
    @RequestMapping("param/add")
    @ResponseBody
    public ResponseBo addParam(Param param) {
        try {
        	param.setId(null);
        	param.setCreateTime(DateUtil.getCurrentDateTimeStr());
        	this.paramService.addParam(param);
            return ResponseBo.ok("新增字典数据成功！");
        } catch (Exception e) {
            log.error("新增字典数据失败", e);
            return ResponseBo.error("新增字典数据失败，请联系网站管理员！");
        }
    }

    @Log("删除字典数据")
    @RequiresPermissions("param:delete")
    @RequestMapping("param/delete")
    @ResponseBody
    public ResponseBo deleteParams(String ids) {
        try {
            this.paramService.deleteParam(ids);
            return ResponseBo.ok("删除字典数据成功！");
        } catch (Exception e) {
            log.error("删除字典数据失败", e);
            return ResponseBo.error("删除字典数据失败，请联系网站管理员！");
        }
    }

    @Log("修改字典数据 ")
    @RequiresPermissions("param:update")
    @RequestMapping("param/update")
    @ResponseBody
    public ResponseBo updateParam(Param param) {
        try {
        	param.setUpdateTime(DateUtil.getCurrentDateTimeStr());
            this.paramService.updateParam(param);
            return ResponseBo.ok("修改字典数据成功！");
        } catch (Exception e) {
            log.error("修改字典数据失败", e);
            return ResponseBo.error("修改字典数据失败，请联系网站管理员！");
        }
    }
}

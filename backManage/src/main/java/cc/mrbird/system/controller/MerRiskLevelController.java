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
import cc.mrbird.system.domain.ChannelLimitCtrl;
import cc.mrbird.system.domain.MerRiskLevel;
import cc.mrbird.system.service.ChannelLimitCtrlService;
import cc.mrbird.system.service.MerRiskLevelService;

@Controller
public class MerRiskLevelController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MerRiskLevelService merRiskLevelService;

    @Log("商户风险等级")
    @RequestMapping("merRiskLevel")
    @RequiresPermissions("merRiskLevel:list")
    public String index() {
        return "system/merRiskLevel/MerRiskLevel";
    }

    /*@RequestMapping("merRiskLevel/getMerRiskLevel")
    @ResponseBody
    public ResponseBo getmerRiskLevel(MerRiskLevel merRiskLevel) {
        try {
        	log.info("findByRiskLevel");
        	MerRiskLevel merRiskLevel1 = this.merRiskLevelService.findByRiskLevel(merRiskLevel);
            return ResponseBo.ok(merRiskLevel1);
        } catch (Exception e) {
            log.error("获取商户风险等级信息失败", e);
            return ResponseBo.error("获取商户风险等级信息失败，请联系网站管理员！");
        }
    }*/

    @RequestMapping("merRiskLevel/list")
    @RequiresPermissions("merRiskLevel:list")
    @ResponseBody
    public Map<String, Object> merRiskLevelList(QueryRequest request,MerRiskLevel merRiskLevel) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<MerRiskLevel> list = this.merRiskLevelService.listQuery(merRiskLevel);
        PageInfo<MerRiskLevel> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    /*@Log("新增商户风险等级 ")
    @RequiresPermissions("merRiskLevel:add")
    @RequestMapping("merRiskLevel/add")
    @ResponseBody
    public ResponseBo addChannelLimitCtrl(ChannelLimitCtrl merRiskLevel) {
        try {
        	this.merRiskLevelService.addChannelLimitCtrl(merRiskLevel);
            return ResponseBo.ok("新增商户风险等级成功！");
        } catch (Exception e) {
            log.error("新增商户风险等级失败", e);
            return ResponseBo.error("新增商户风险等级失败，请联系网站管理员！");
        }
    }*/

    /*@Log("删除商户风险等级")
    @RequiresPermissions("merRiskLevel:delete")
    @RequestMapping("merRiskLevel/delete")
    @ResponseBody
    public ResponseBo deleteChannelLimitCtrls(ChannelLimitCtrl merRiskLevel) {
        try {
            this.merRiskLevelService.deleteChannelLimitCtrl(merRiskLevel);
            return ResponseBo.ok("删除商户风险等级成功！");
        } catch (Exception e) {
            log.error("删除商户风险等级失败", e);
            return ResponseBo.error("删除商户风险等级失败，请联系网站管理员！");
        }
    }*/

    /*@Log("修改商户风险等级 ")
    @RequiresPermissions("merRiskLevel:update")
    @RequestMapping("merRiskLevel/update")
    @ResponseBody
    public ResponseBo updateChannelLimitCtrl(ChannelLimitCtrl merRiskLevel) {
        try {
        	log.info("merRiskLevel:"+merRiskLevel.getChannelId()+","+merRiskLevel.getChannelType());
            this.merRiskLevelService.updateChannelLimitCtrl(merRiskLevel);
            return ResponseBo.ok("修改商户风险等级成功！");
        } catch (Exception e) {
            log.error("修改商户风险等级失败", e);
            return ResponseBo.error("修改商户风险等级失败，请联系网站管理员！");
        }
    }*/
}

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
import cc.mrbird.system.domain.CardBin;
import cc.mrbird.system.domain.ItemWeightSupport;
import cc.mrbird.system.service.ItemWeightSupportService;

@Controller
public class ItemWeightSupportController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private ItemWeightSupportService itemWeightSupportService;

    @Log("服务项目权重查询")
    @RequestMapping("itemWeightSupport")
    @RequiresPermissions("itemWeightSupport:list")
    public String index() {
        return "system/itemWeightSupport/itemWeightSupport";
    }

    @RequestMapping("itemWeightSupport/getItemWeightSupport")
    @ResponseBody
    public ResponseBo getItemWeightSupport(ItemWeightSupport itemWeightSupport) {
        try {
        	ItemWeightSupport itemWeightSupport1 = this.itemWeightSupportService.findById(itemWeightSupport);
            return ResponseBo.ok(itemWeightSupport1);
        } catch (Exception e) {
            log.error("获取卡BIN信息失败", e);
            return ResponseBo.error("获取卡BIN信息失败，请联系网站管理员！");
        }
    }

    @RequestMapping("itemWeightSupport/list")
    @RequiresPermissions("itemWeightSupport:list")
    @ResponseBody
    public Map<String, Object> ItemWeightSupportList(QueryRequest request,ItemWeightSupport itemWeightSupport) {
    	PageHelper.startPage(request.getPageNum(), request.getPageSize());
        List<ItemWeightSupport> list = this.itemWeightSupportService.findAllItemWeightSupport(itemWeightSupport);
        PageInfo<ItemWeightSupport> pageInfo = new PageInfo<>(list);
        return getDataTable(pageInfo);
    }

    @Log("新增服务项目权重")
    @RequiresPermissions("itemWeightSupport:add")
    @RequestMapping("itemWeightSupport/add")
    @ResponseBody
    public ResponseBo addItemWeightSupport(ItemWeightSupport itemWeightSupport) {
        try {
        	System.out.println("11111");
        	this.itemWeightSupportService.addItemWeightSupport(itemWeightSupport);
            return ResponseBo.ok("新增服务项目权重成功！");
        } catch (Exception e) {
            log.error("新增服务项目权重失败", e);
            return ResponseBo.error("新增服务项目权重失败，请联系网站管理员！");
        }
    }    
  
    @Log("删除服务项目权重")
    @RequiresPermissions("itemWeightSupport:delete")
    @RequestMapping("itemWeightSupport/delete")
    @ResponseBody
    public ResponseBo deleteItemWeightSupport(ItemWeightSupport itemWeightSupport) {
        try {
            this.itemWeightSupportService.deleteItemWeightSupport(itemWeightSupport);
            return ResponseBo.ok("删除服务项目权重成功！");
        } catch (Exception e) {
            log.error("删除服务项目权重失败", e);
            return ResponseBo.error("删除服务项目权重失败，请联系网站管理员！");
        }
    }

    @Log("修改服务项目权重 ")
    @RequiresPermissions("itemWeightSupport:update")
    @RequestMapping("itemWeightSupport/update")
    @ResponseBody
    public ResponseBo updateItemWeightSupport(ItemWeightSupport itemWeightSupport) {
        try {
            this.itemWeightSupportService.updateItemWeightSupport(itemWeightSupport);
            return ResponseBo.ok("修改服务项目权重成功！");
        } catch (Exception e) {
            log.error("修改服务项目权重失败", e);
            return ResponseBo.error("修改服务项目权重失败，请联系网站管理员！");
        }
    }
}

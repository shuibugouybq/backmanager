package cc.mrbird.system.controller;

import java.io.PrintStream;

import org.apache.commons.net.telnet.TelnetClient;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cc.mrbird.common.annotation.Log;
import cc.mrbird.common.controller.BaseController;
import cc.mrbird.common.domain.ResponseBo;

@Controller
public class UppBatchTaskController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());


    @Log("获取商户固码")
    @RequestMapping("uppBatchTask")
    @RequiresPermissions("uppBatchTask:list")
    public String index() {
        return "system/uppBatchTask/uppBatchTask";
    }

    @RequestMapping("uppBatchTask/uppBatchTaskStep")
    @ResponseBody
    public ResponseBo uppBatchTaskStep(String step) {
    	try {
    		updateStep(step);
            return ResponseBo.ok("");
        } catch (Exception e) {
            log.error("批量操作失败", e);
            return ResponseBo.error("批量操作失败，请联系网站管理员！");
        }
    }

    public void updateStep(String step) throws Exception{
        TelnetClient telnetClient = new TelnetClient("vt200");  //指明Telnet终端类型，否则会返回来的数据中文会乱码
        telnetClient.setDefaultTimeout(5000); //socket延迟时间：5000ms
        telnetClient.connect("192.168.43.207",21001);  //建立一个连接,默认端口是23
        PrintStream pStream = new PrintStream(telnetClient.getOutputStream());  //写命令的流
        pStream.println(step); //写命令
        pStream.flush(); //将命令发送到telnet Server
        if(null != pStream) {
            pStream.close();
        }
        telnetClient.disconnect();
    }

}

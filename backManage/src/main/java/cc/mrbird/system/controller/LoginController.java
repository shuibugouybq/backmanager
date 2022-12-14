package cc.mrbird.system.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.lang3.StringUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cc.mrbird.common.annotation.Log;
import cc.mrbird.common.config.FebsProperties;
import cc.mrbird.common.controller.BaseController;
import cc.mrbird.common.domain.ResponseBo;
import cc.mrbird.common.service.RedisService;
import cc.mrbird.common.util.MD5Utils;
import cc.mrbird.common.util.vcode.Captcha;
import cc.mrbird.common.util.vcode.GifCaptcha;
import cc.mrbird.system.domain.Param;
import cc.mrbird.system.domain.User;
import cc.mrbird.system.service.ParamService;
import cc.mrbird.system.service.UserService;

@Controller
public class LoginController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    private static final String CODE_KEY = "_code";

    @Autowired
    private FebsProperties febsProperties;

    @Autowired
    private UserService userService;
    
    @Autowired
	private RedisService redisService;
    
    @Autowired
	private ParamService paramService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    public ResponseBo login(String username, String password, String code, Boolean rememberMe, Model model) {
        /*if (!StringUtils.isNotBlank(code)) {
            return ResponseBo.warn("????????????????????????");
        }
        Session session = super.getSession();
        String sessionCode = (String) session.getAttribute(CODE_KEY);
        if (!code.equalsIgnoreCase(sessionCode)) {
            return ResponseBo.warn("??????????????????");
        }*/
        // ????????????Redis
        /*Map<String, Map<String, String>> dictMap = changeToMap(paramService.findAllParams(new Param()));
        model.addAttribute("constMap", dictMap);*/
        /*redisService.set("dict".getBytes(), redisService.serialize(dictMap));
        byte[] value = redisService.get("dict".getBytes());
        Map<String, Map<String, String>> dictMap3 = (Map<String, Map<String, String>>) redisService.unserizlize(value);*/
        // ?????? MD5 ??????
        password = MD5Utils.encrypt(username.toLowerCase(), password);
        UsernamePasswordToken token = new UsernamePasswordToken(username, password, rememberMe);
        try {
            Subject subject = getSubject();
            if (subject != null)
                subject.logout();
            super.login(token);
            this.userService.updateLoginTime(username);
            return ResponseBo.ok();
        } catch (UnknownAccountException | IncorrectCredentialsException | LockedAccountException e) {
            return ResponseBo.error(e.getMessage());
        } catch (AuthenticationException e) {
            return ResponseBo.error("???????????????");
        }
    }

    @GetMapping(value = "gifCode")
    public void getGifCode(HttpServletResponse response, HttpServletRequest request) {
        try {
            response.setHeader("Pragma", "No-cache");
            response.setHeader("Cache-Control", "no-cache");
            response.setDateHeader("Expires", 0);
            response.setContentType("image/gif");

            Captcha captcha = new GifCaptcha(
                    febsProperties.getValidateCode().getWidth(),
                    febsProperties.getValidateCode().getHeight(),
                    febsProperties.getValidateCode().getLength());
            captcha.out(response.getOutputStream());
            HttpSession session = request.getSession(true);
            session.removeAttribute(CODE_KEY);
            session.setAttribute(CODE_KEY, captcha.text().toLowerCase());
        } catch (Exception e) {
            log.error("???????????????????????????", e);
        }
    }

    @RequestMapping("/")
    public String redirectIndex() {
        return "redirect:/index";
    }

    @GetMapping("/403")
    public String forbid() {
        return "403";
    }

    @Log("????????????")
    @RequestMapping("/index")
    public String index(Model model) {
        // ??????????????????????????? Subject ???????????????????????????
        User user = super.getCurrentUser();
        model.addAttribute("user", user);
        // ?????????????????????????????????????????????.??????session???????????????select;??????????????????bootstrap table??????
        Param param = new Param();
        param.setParamType("001");
        Map<String, Map<String, String>> dictMap = changeToMap(paramService.findAllParams(param));
        JSONObject itemJSONObj = JSONObject.parseObject(JSON.toJSONString(dictMap));
        Session session = super.getSession();
        session.setAttribute("constMap", itemJSONObj);
        return "index";
    }
    /**
     * ?????????list?????????Map
     *
     * @param dictList
     * @return
     */
    private Map<String, Map<String, String>> changeToMap(List<Param> dictList) {
        Map<String, Map<String, String>> resultMap = new HashMap<String, Map<String, String>>();
        for (Param dict : dictList) {
            String groupId = dict.getParentParmaId();
            Map dictMap = resultMap.get(groupId);
            if (dictMap != null) {
                dictMap.put(dict.getParamValue(), dict.getParamName());
            } else {
                dictMap = new HashMap<>();
                dictMap.put(dict.getParamValue(), dict.getParamName());
                resultMap.put(groupId, dictMap);
            }
        }
        return resultMap;
    }
}

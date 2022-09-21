package cc.mrbird.system.controller;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cc.mrbird.common.annotation.Log;
import cc.mrbird.common.controller.BaseController;
import cc.mrbird.common.domain.ResponseBo;
import cc.mrbird.common.util.QRCodeUtil;
import cc.mrbird.system.domain.Merchant;
import cc.mrbird.system.service.MerchantService;

@Controller
public class MerQrcodeController extends BaseController {

    private Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private MerchantService merchantService;

    @Log("获取商户固码")
    @RequestMapping("merQrcode")
    @RequiresPermissions("merQrcode:list")
    public String index() {
        return "system/merQrcode/merQrcode";
    }

    @RequestMapping("merQrcode/getMerQrcode")
    @ResponseBody
    public void getMerQrcode(String merId, HttpServletResponse response) {
        try {
        	Merchant merchant = this.merchantService.findById(merId);
        	String content = "此处为transId"+ merchant.getMerId();
        	encode(content, response);
        } catch (Exception e) {
            log.error("生成商户固码失败", e);
        }
    }
    
    @RequestMapping("merQrcode/checkMerchant")
    @ResponseBody
    public ResponseBo checkMerchant(String merId) {
        try {
        	Merchant merchant = this.merchantService.findById(merId);
        	if(merchant==null) {
        		return ResponseBo.error("商户不存在，请确认！");
        	}
            return ResponseBo.ok(merchant);
        } catch (Exception e) {
            log.error("获取商户信息失败", e);
            return ResponseBo.error("获取商户信息失败，请联系网站管理员！");
        }
    }

	/**
	 *  *
	 * 生成二维码输出页面
	 *  * @Description:  * @param content  * @param response  * @throws Exception
	 */
	public static void encode(String content, HttpServletResponse response) throws Exception {
		BufferedImage image = QRCodeUtil.createImage(content);
		ImageIO.write(image, QRCodeUtil.FORMAT_NAME, response.getOutputStream());
	}

}

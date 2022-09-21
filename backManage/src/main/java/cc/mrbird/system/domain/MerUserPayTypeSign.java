package cc.mrbird.system.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "mer_platform_user_pay_type_sign")
public class MerUserPayTypeSign {
	/**
     * 签约编号
     */
    @Id
    @Column(name = "SIGNNBR")
    private String signnbr;

    /**
     * 协议类型
     */
    @Id
    @Column(name = "SIGNTYPCD")
    private String signtypcd;

    /**
     * 协议编码
     */
    @Column(name = "SIGNCODE")
    private String signcode;

    /**
     * 商户平台号
     */
    @Column(name = "MERPLATFORMCD")
    private String merplatformcd;

    /**
     * 用户编号
     */
    @Column(name = "USERNBR")
    private String usernbr;

    /**
     * 商户客户号
     */
    @Column(name = "MERCUSTNBR")
    private String mercustnbr;

    /**
     * 用户账号
     */
    @Column(name = "USERACCTNBR")
    private String useracctnbr;

    /**
     * 账户性质
     */
    @Column(name = "ACCTKINDCD")
    private String acctkindcd;

    @Column(name = "PAYTYPCD")
    private String paytypcd;

    /**
     * 签约日期
     */
    @Column(name = "SIGNDATE")
    private Date signdate;

    @Column(name = "SIGNEFFDATE")
    private Date signeffdate;

    @Column(name = "SIGNINACTIVEDATE")
    private Date signinactivedate;

    @Column(name = "SIGNTHIRDACCTNBR")
    private String signthirdacctnbr;

    @Column(name = "CHECKDATE")
    private Date checkdate;

    @Column(name = "DATELASTMAINT")
    private Date datelastmaint;

    /**
     * 签约手机号
     */
    @Column(name = "SIGNMOBILE")
    private String signmobile;

    /**
     * 签约状态
     */
    @Column(name = "SIGNSTATUS")
    private String signstatus;

    /**
     * 柜员号
     */
    @Column(name = "TELLERNBR")
    private String tellernbr;

    @Column(name = "MEMO")
    private String memo;

    /**
     * @return SIGNNBR
     */
    public String getSignnbr() {
        return signnbr;
    }

    /**
     * @param signnbr
     */
    public void setSignnbr(String signnbr) {
        this.signnbr = signnbr == null ? null : signnbr.trim();
    }

    /**
     * @return SIGNTYPCD
     */
    public String getSigntypcd() {
        return signtypcd;
    }

    /**
     * @param signtypcd
     */
    public void setSigntypcd(String signtypcd) {
        this.signtypcd = signtypcd == null ? null : signtypcd.trim();
    }

    /**
     * @return SIGNCODE
     */
    public String getSigncode() {
        return signcode;
    }

    /**
     * @param signcode
     */
    public void setSigncode(String signcode) {
        this.signcode = signcode == null ? null : signcode.trim();
    }

    /**
     * @return MERPLATFORMCD
     */
    public String getMerplatformcd() {
        return merplatformcd;
    }

    /**
     * @param merplatformcd
     */
    public void setMerplatformcd(String merplatformcd) {
        this.merplatformcd = merplatformcd == null ? null : merplatformcd.trim();
    }

    /**
     * @return USERNBR
     */
    public String getUsernbr() {
        return usernbr;
    }

    /**
     * @param usernbr
     */
    public void setUsernbr(String usernbr) {
        this.usernbr = usernbr == null ? null : usernbr.trim();
    }

    /**
     * @return MERCUSTNBR
     */
    public String getMercustnbr() {
        return mercustnbr;
    }

    /**
     * @param mercustnbr
     */
    public void setMercustnbr(String mercustnbr) {
        this.mercustnbr = mercustnbr == null ? null : mercustnbr.trim();
    }

    /**
     * @return USERACCTNBR
     */
    public String getUseracctnbr() {
        return useracctnbr;
    }

    /**
     * @param useracctnbr
     */
    public void setUseracctnbr(String useracctnbr) {
        this.useracctnbr = useracctnbr == null ? null : useracctnbr.trim();
    }

    /**
     * @return ACCTKINDCD
     */
    public String getAcctkindcd() {
        return acctkindcd;
    }

    /**
     * @param acctkindcd
     */
    public void setAcctkindcd(String acctkindcd) {
        this.acctkindcd = acctkindcd == null ? null : acctkindcd.trim();
    }

    /**
     * @return PAYTYPCD
     */
    public String getPaytypcd() {
        return paytypcd;
    }

    /**
     * @param paytypcd
     */
    public void setPaytypcd(String paytypcd) {
        this.paytypcd = paytypcd == null ? null : paytypcd.trim();
    }

    /**
     * @return SIGNDATE
     */
    public Date getSigndate() {
        return signdate;
    }

    /**
     * @param signdate
     */
    public void setSigndate(Date signdate) {
        this.signdate = signdate;
    }

    /**
     * @return SIGNEFFDATE
     */
    public Date getSigneffdate() {
        return signeffdate;
    }

    /**
     * @param signeffdate
     */
    public void setSigneffdate(Date signeffdate) {
        this.signeffdate = signeffdate;
    }

    /**
     * @return SIGNINACTIVEDATE
     */
    public Date getSigninactivedate() {
        return signinactivedate;
    }

    /**
     * @param signinactivedate
     */
    public void setSigninactivedate(Date signinactivedate) {
        this.signinactivedate = signinactivedate;
    }

    /**
     * @return SIGNTHIRDACCTNBR
     */
    public String getSignthirdacctnbr() {
        return signthirdacctnbr;
    }

    /**
     * @param signthirdacctnbr
     */
    public void setSignthirdacctnbr(String signthirdacctnbr) {
        this.signthirdacctnbr = signthirdacctnbr == null ? null : signthirdacctnbr.trim();
    }

    /**
     * @return CHECKDATE
     */
    public Date getCheckdate() {
        return checkdate;
    }

    /**
     * @param checkdate
     */
    public void setCheckdate(Date checkdate) {
        this.checkdate = checkdate;
    }

    /**
     * @return DATELASTMAINT
     */
    public Date getDatelastmaint() {
        return datelastmaint;
    }

    /**
     * @param datelastmaint
     */
    public void setDatelastmaint(Date datelastmaint) {
        this.datelastmaint = datelastmaint;
    }

    /**
     * @return SIGNMOBILE
     */
    public String getSignmobile() {
        return signmobile;
    }

    /**
     * @param signmobile
     */
    public void setSignmobile(String signmobile) {
        this.signmobile = signmobile == null ? null : signmobile.trim();
    }

    /**
     * @return SIGNSTATUS
     */
    public String getSignstatus() {
        return signstatus;
    }

    /**
     * @param signstatus
     */
    public void setSignstatus(String signstatus) {
        this.signstatus = signstatus == null ? null : signstatus.trim();
    }

    /**
     * @return TELLERNBR
     */
    public String getTellernbr() {
        return tellernbr;
    }

    /**
     * @param tellernbr
     */
    public void setTellernbr(String tellernbr) {
        this.tellernbr = tellernbr == null ? null : tellernbr.trim();
    }

    /**
     * @return MEMO
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param memo
     */
    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }
}
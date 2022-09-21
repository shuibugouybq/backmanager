package cc.mrbird.system.domain;

import javax.persistence.*;

@Table(name = "user_pay_type_sign_info")
public class UserPayTypeSignInfo {
	/**
	 * 签约编号
	 */
    @Id
    @Column(name = "SIGNNBR")
    private String signnbr;
    /**
     * 支付产品类型
     */
    @Id
    @Column(name = "SIGNTYPCD")
    private String signtypcd;
    /**
     * 签约状态
     */
    @Column(name = "SIGNSTATUS")
    private String signstatus;
    /**
     * 签约名称
     */
    @Column(name = "SIGNNAME")
    private String signname;
    /**
     * 用户编号
     */
    @Column(name = "USERNBR")
    private String usernbr;
    /**
     * 柜员号
     */
    @Column(name = "TELLER")
    private String teller;
    /**
     * 签约手机号
     */
    @Column(name = "SIGNMOBILE")
    private String signmobile;
    /**
     * 签约卡号
     */
    @Column(name = "SIGNCARDNBR")
    private String signcardnbr;

    @Column(name = "SIGNDEPTNBR")
    private String signdeptnbr;
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
    private String signdate;

    @Column(name = "SIGNEFFDATE")
    private String signeffdate;

    @Column(name = "SIGNINACTIVEDATE")
    private String signinactivedate;

    @Column(name = "CHECKDATE")
    private String checkdate;

    @Column(name = "DATELASTMAINT")
    private String datelastmaint;

    @Column(name = "MEMO")
    private String memo;

    @Column(name = "SYNSTATUS")
    private String synstatus;

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
     * @return SIGNNAME
     */
    public String getSignname() {
        return signname;
    }

    /**
     * @param signname
     */
    public void setSignname(String signname) {
        this.signname = signname == null ? null : signname.trim();
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
     * @return TELLER
     */
    public String getTeller() {
        return teller;
    }

    /**
     * @param teller
     */
    public void setTeller(String teller) {
        this.teller = teller == null ? null : teller.trim();
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
     * @return SIGNCARDNBR
     */
    public String getSigncardnbr() {
        return signcardnbr;
    }

    /**
     * @param signcardnbr
     */
    public void setSigncardnbr(String signcardnbr) {
        this.signcardnbr = signcardnbr == null ? null : signcardnbr.trim();
    }

    /**
     * @return SIGNDEPTNBR
     */
    public String getSigndeptnbr() {
        return signdeptnbr;
    }

    /**
     * @param signdeptnbr
     */
    public void setSigndeptnbr(String signdeptnbr) {
        this.signdeptnbr = signdeptnbr == null ? null : signdeptnbr.trim();
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
    public String getSigndate() {
        return signdate;
    }

    /**
     * @param signdate
     */
    public void setSigndate(String signdate) {
        this.signdate = signdate;
    }

    /**
     * @return SIGNEFFDATE
     */
    public String getSigneffdate() {
        return signeffdate;
    }

    /**
     * @param signeffdate
     */
    public void setSigneffdate(String signeffdate) {
        this.signeffdate = signeffdate;
    }

    /**
     * @return SIGNINACTIVEDATE
     */
    public String getSigninactivedate() {
        return signinactivedate;
    }

    /**
     * @param signinactivedate
     */
    public void setSigninactivedate(String signinactivedate) {
        this.signinactivedate = signinactivedate;
    }

    /**
     * @return CHECKDATE
     */
    public String getCheckdate() {
        return checkdate;
    }

    /**
     * @param checkdate
     */
    public void setCheckdate(String checkdate) {
        this.checkdate = checkdate;
    }

    /**
     * @return DATELASTMAINT
     */
    public String getDatelastmaint() {
        return datelastmaint;
    }

    /**
     * @param datelastmaint
     */
    public void setDatelastmaint(String datelastmaint) {
        this.datelastmaint = datelastmaint;
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

    /**
     * @return SYNSTATUS
     */
    public String getSynstatus() {
        return synstatus;
    }

    /**
     * @param synstatus
     */
    public void setSynstatus(String synstatus) {
        this.synstatus = synstatus == null ? null : synstatus.trim();
    }
}
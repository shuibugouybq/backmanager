package cc.mrbird.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "mer_trans_limit")
public class MerTransLimit {
	/**
	 * 商户号
	 */
    @Id
    @Column(name = "MERNBR")
    private String mernbr;
    /**
     * 交易类型
     */
    @Id
    @Column(name = "TRANSTYPCD")
    private String transtypcd;
    /**
     * 支付产品
     */
    @Id
    @Column(name = "PAYTYPCD")
    private String paytypcd;
    /**
     * 卡类型
     */
    @Id
    @Column(name = "CARDTYPCD")
    private String cardtypcd;
    /**
     * 渠道号
     */
    @Id
    @Column(name = "CHANNELNBR")
    private String channelnbr;
    /**
     * 单笔限额
     */
    @Column(name = "PERTRANSLIMIT")
    private BigDecimal pertranslimit;
    /**
     * 状态
     */
    @Column(name = "STATUS")
    private String status;

    @Column(name = "OPENDATE")
    private Date opendate;

    @Column(name = "OPENUSERNBR")
    private String openusernbr;

    @Column(name = "CLOSEDATE")
    private Date closedate;

    @Column(name = "CLOSEUSERNBR")
    private String closeusernbr;

    @Column(name = "MODIFYUSER")
    private Date modifyuser;

    @Column(name = "DATELASTMAINT")
    private Date datelastmaint;

    /**
     * @return MERNBR
     */
    public String getMernbr() {
        return mernbr;
    }

    /**
     * @param mernbr
     */
    public void setMernbr(String mernbr) {
        this.mernbr = mernbr == null ? null : mernbr.trim();
    }

    /**
     * @return TRANSTYPCD
     */
    public String getTranstypcd() {
        return transtypcd;
    }

    /**
     * @param transtypcd
     */
    public void setTranstypcd(String transtypcd) {
        this.transtypcd = transtypcd == null ? null : transtypcd.trim();
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
     * @return CARDTYPCD
     */
    public String getCardtypcd() {
        return cardtypcd;
    }

    /**
     * @param cardtypcd
     */
    public void setCardtypcd(String cardtypcd) {
        this.cardtypcd = cardtypcd == null ? null : cardtypcd.trim();
    }

    /**
     * @return CHANNELNBR
     */
    public String getChannelnbr() {
        return channelnbr;
    }

    /**
     * @param channelnbr
     */
    public void setChannelnbr(String channelnbr) {
        this.channelnbr = channelnbr == null ? null : channelnbr.trim();
    }

    /**
     * @return PERTRANSLIMIT
     */
    public BigDecimal getPertranslimit() {
        return pertranslimit;
    }

    /**
     * @param pertranslimit
     */
    public void setPertranslimit(BigDecimal pertranslimit) {
        this.pertranslimit = pertranslimit;
    }

    /**
     * @return STATUS
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return OPENDATE
     */
    public Date getOpendate() {
        return opendate;
    }

    /**
     * @param opendate
     */
    public void setOpendate(Date opendate) {
        this.opendate = opendate;
    }

    /**
     * @return OPENUSERNBR
     */
    public String getOpenusernbr() {
        return openusernbr;
    }

    /**
     * @param openusernbr
     */
    public void setOpenusernbr(String openusernbr) {
        this.openusernbr = openusernbr == null ? null : openusernbr.trim();
    }

    /**
     * @return CLOSEDATE
     */
    public Date getClosedate() {
        return closedate;
    }

    /**
     * @param closedate
     */
    public void setClosedate(Date closedate) {
        this.closedate = closedate;
    }

    /**
     * @return CLOSEUSERNBR
     */
    public String getCloseusernbr() {
        return closeusernbr;
    }

    /**
     * @param closeusernbr
     */
    public void setCloseusernbr(String closeusernbr) {
        this.closeusernbr = closeusernbr == null ? null : closeusernbr.trim();
    }

    /**
     * @return MODIFYUSER
     */
    public Date getModifyuser() {
        return modifyuser;
    }

    /**
     * @param modifyuser
     */
    public void setModifyuser(Date modifyuser) {
        this.modifyuser = modifyuser;
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
}
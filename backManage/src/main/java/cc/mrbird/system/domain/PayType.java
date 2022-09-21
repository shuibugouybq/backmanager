package cc.mrbird.system.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "pay_type")
public class PayType {
	/**
	 * 支付产品编号
	 */
    @Id
    @Column(name = "PAYTYPCD")
    private String paytypcd;
    
    @Column(name = "DEPARTMENTNBR")
    private String departmentnbr;
    /**
     * 支付产品名称
     */
    
    @Column(name = "PAYTYPDESC")
    private String paytypdesc;

    @Column(name = "DATELASTMAINT")
    private String datelastmaint;

    @Column(name = "ACCTYPCD")
    private String acctypcd;

    @Column(name = "ACCTKIND")
    private String acctkind;
    /**
     * 创建时间
     */
    @Column(name = "CREATETIME")
    private String createtime;
    /**
     * 生效时间
     */
    @Column(name = "STARTTIME")
    private String starttime;
    /**
     * 结束时间
     */
    @Column(name = "ENDTIME")
    private String endtime;
    /**
     * 支持产品状态
     */
    @Column(name = "STATUS")
    private String status;

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
     * @return DEPARTMENTNBR
     */
    public String getDepartmentnbr() {
        return departmentnbr;
    }

    /**
     * @param departmentnbr
     */
    public void setDepartmentnbr(String departmentnbr) {
        this.departmentnbr = departmentnbr == null ? null : departmentnbr.trim();
    }

    /**
     * @return PAYTYPDESC
     */
    public String getPaytypdesc() {
        return paytypdesc;
    }

    /**
     * @param paytypdesc
     */
    public void setPaytypdesc(String paytypdesc) {
        this.paytypdesc = paytypdesc == null ? null : paytypdesc.trim();
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
     * @return ACCTYPCD
     */
    public String getAcctypcd() {
        return acctypcd;
    }

    /**
     * @param acctypcd
     */
    public void setAcctypcd(String acctypcd) {
        this.acctypcd = acctypcd == null ? null : acctypcd.trim();
    }

    /**
     * @return ACCTKIND
     */
    public String getAcctkind() {
        return acctkind;
    }

    /**
     * @param acctkind
     */
    public void setAcctkind(String acctkind) {
        this.acctkind = acctkind == null ? null : acctkind.trim();
    }

    /**
     * @return CREATETIME
     */
    public String getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    /**
     * @return STARTTIME
     */
    public String getStarttime() {
        return starttime;
    }

    /**
     * @param starttime
     */
    public void setStarttime(String starttime) {
        this.starttime = starttime;
    }

    /**
     * @return ENDTIME
     */
    public String getEndtime() {
        return endtime;
    }

    /**
     * @param endtime
     */
    public void setEndtime(String endtime) {
        this.endtime = endtime;
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
}
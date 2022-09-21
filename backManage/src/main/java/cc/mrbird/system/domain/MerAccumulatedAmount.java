package cc.mrbird.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "mer_accumulated_amount")
public class MerAccumulatedAmount {
    /**
     * 商户号
     */
    @Column(name = "Mer_id")
    private String merId;

    /**
     * 结算日期
     */
    @Column(name = "mer_setDate")
    private String merSetdate;

    /**
     * 结算方式
     */
    @Column(name = "mer_setmode")
    private String merSetmode;

    /**
     * 累计金额
     */
    @Column(name = "Accumulated_amount")
    private BigDecimal accumulatedAmount;

    @Column(name = "modify_date")
    private Date modifyDate;
    
    @Transient
    private String beginDate;
    
    @Transient
    private String endDate;

    /**
     * 获取商户号
     *
     * @return Mer_id - 商户号
     */
    public String getMerId() {
        return merId;
    }

    /**
     * 设置商户号
     *
     * @param merId 商户号
     */
    public void setMerId(String merId) {
        this.merId = merId == null ? null : merId.trim();
    }

    /**
     * 获取结算日期
     *
     * @return mer_setDate - 结算日期
     */
    public String getMerSetdate() {
        return merSetdate;
    }

    /**
     * 设置结算日期
     *
     * @param merSetdate 结算日期
     */
    public void setMerSetdate(String merSetdate) {
        this.merSetdate = merSetdate;
    }

    /**
     * 获取结算方式
     *
     * @return mer_setmode - 结算方式
     */
    public String getMerSetmode() {
        return merSetmode;
    }

    /**
     * 设置结算方式
     *
     * @param merSetmode 结算方式
     */
    public void setMerSetmode(String merSetmode) {
        this.merSetmode = merSetmode == null ? null : merSetmode.trim();
    }

    /**
     * 获取累计金额
     *
     * @return Accumulated_amount - 累计金额
     */
    public BigDecimal getAccumulatedAmount() {
        return accumulatedAmount;
    }

    /**
     * 设置累计金额
     *
     * @param accumulatedAmount 累计金额
     */
    public void setAccumulatedAmount(BigDecimal accumulatedAmount) {
        this.accumulatedAmount = accumulatedAmount;
    }

    /**
     * @return modify_date
     */
    public Date getModifyDate() {
        return modifyDate;
    }

    /**
     * @param modifyDate
     */
    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
}
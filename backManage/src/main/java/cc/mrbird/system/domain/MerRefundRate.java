package cc.mrbird.system.domain;

import javax.persistence.*;

//@Table(name = "mer_warn_info")
public class MerRefundRate {
	/**
     * 商户编号
     */
    @Id
    @Column(name = "MER_ID")
    private String merId;

    /**
     * 商户名称
     */
    @Id
    @Column(name = "MER_NAME")
    private String merName;

    /**
     * 退单率
     */
    @Column(name = "REFUND_RATE")
    private String refundRate;

    /**
     * 退单笔数
     */
    @Column(name = "REFUND_NUM")
    private String refundNum;
    
    /**
     * 商户类别码
     */
    @Transient
    private String merType;
    
    /**
     * 开始日期
     */
    @Transient
    private String beginDate;
    
    /**
     * 结束日期
     */    
    @Transient
    private String endDate;

	public String getMerId() {
		return merId;
	}

	public void setMerId(String merId) {
		this.merId = merId;
	}

	public String getMerName() {
		return merName;
	}

	public void setMerName(String merName) {
		this.merName = merName;
	}

	public String getRefundRate() {
		return refundRate;
	}

	public void setRefundRate(String refundRate) {
		this.refundRate = refundRate;
	}

	public String getRefundNum() {
		return refundNum;
	}

	public void setRefundNum(String refundNum) {
		this.refundNum = refundNum;
	}


	public String getMerType() {
		return merType;
	}

	public void setMerType(String merType) {
		this.merType = merType;
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
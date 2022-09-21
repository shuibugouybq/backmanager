package cc.mrbird.system.domain;

import javax.persistence.*;

@Table(name = "ft_channel_transctrl")
public class ChannelLimitCtrl {
    /**
     * 通道号
     */
    @Id
    @Column(name = "CHANNEL_ID")
    private String channelId;

    /**
     * 通道类型
     */
    @Id
    @Column(name = "CHANNEL_TYPE")
    private String channelType;

    /**
     * 单笔限额
     */
    @Column(name = "PER_TRANS_LIMIT")
    private String perTransLimit;

    /**
     * 日累计
     */
    @Column(name = "DAY_TRANS_AMT")
    private String dayTransAmt;

    /**
     * 日限额
     */
    @Column(name = "DAY_TRANS_LIMIT_AMT")
    private String dayTransLimitAmt;

    /**
     * 月累计
     */
    @Column(name = "MONTH_TRANS_AMT")
    private String monthTransAmt;

    /**
     * 月限额
     */
    @Column(name = "MONTH_TRANS_LIMIT_AMT")
    private String monthTransLimitAmt;
    
    /**
     * 年限额
     */
    @Column(name = "YEAR_TRANS_LIMIT_AMT")
    private String yearTransLimitAmt;
    
    /**
     * 货币
     */
    @Column(name = "CURRENCY")
    private String currency;
    

//    /**
//     * 预留1
//     */
//    @Column(name = "REMARK1")
//    private String remark1;
//
//    /**
//     * 预留2
//     */
//    @Column(name = "REMARK2")
//    private String remark2;
//
//    /**
//     * 预留3
//     */
//    @Column(name = "REMARK3")
//    private String remark3;

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public String getChannelType() {
		return channelType;
	}

	public void setChannelType(String channelType) {
		this.channelType = channelType;
	}

	public String getPerTransLimit() {
		return perTransLimit;
	}

	public void setPerTransLimit(String perTransLimit) {
		this.perTransLimit = perTransLimit;
	}

	public String getDayTransAmt() {
		return dayTransAmt;
	}

	public void setDayTransAmt(String dayTransAmt) {
		this.dayTransAmt = dayTransAmt;
	}

	public String getDayTransLimitAmt() {
		return dayTransLimitAmt;
	}

	public void setDayTransLimitAmt(String dayTransLimitAmt) {
		this.dayTransLimitAmt = dayTransLimitAmt;
	}

	public String getMonthTransAmt() {
		return monthTransAmt;
	}

	public void setMonthTransAmt(String monthTransAmt) {
		this.monthTransAmt = monthTransAmt;
	}

	public String getMonthTransLimitAmt() {
		return monthTransLimitAmt;
	}

	public void setMonthTransLimitAmt(String monthTransLimitAmt) {
		this.monthTransLimitAmt = monthTransLimitAmt;
	}

	public String getYearTransLimitAmt() {
		return yearTransLimitAmt;
	}

	public void setYearTransLimitAmt(String yearTransLimitAmt) {
		this.yearTransLimitAmt = yearTransLimitAmt;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

//	public String getRemark1() {
//		return remark1;
//	}
//
//	public void setRemark1(String remark1) {
//		this.remark1 = remark1;
//	}
//
//	public String getRemark2() {
//		return remark2;
//	}
//
//	public void setRemark2(String remark2) {
//		this.remark2 = remark2;
//	}
//
//	public String getRemark3() {
//		return remark3;
//	}
//
//	public void setRemark3(String remark3) {
//		this.remark3 = remark3;
//	}

   
}
package cc.mrbird.system.domain;

import javax.persistence.*;

@Table(name = "pay_type/dept_trans_ctrl/channelinfo")
public class DetpTransCtrl {
    /**
     * 机构编号
     */
    @Column(name = "DEPTNBR")
    private String deptnbr;
    
    /**
     * 支付产品  
     * pay_type
     */
    @Column(name = "PAYTYPDESC")
    private String payTypeDesc;
    
    /**
     * 渠道编号
     * channelinfo
     */
    @Column(name = "CHANNELDESC")
    private String channelDesc;
    
    /**
     * 单笔限额
     */
    @Column(name = "PERTRANSLIMIT")
    private String pertranslimit;
    
    /**
     * 单日限额
     */
    @Column(name = "PERDAYLIMIT")
    private String perdaylimit;
    
    /**
     * 单日额度日期
     */
    @Column(name = "DAYAMTDATE")
    private String dayamtdate;
    
    /**
     * 单日额度
     */
    @Column(name = "DAYAMT")
    private String dayamt;
    
    /**
     * 状态
     */
    @Column(name = "STATUS")
    private String status;
    
    
    @Column(name = "PAYTYPCD")
    private String payTypeCd;
    
    @Column(name = "CHANNELNBR")
    private String channelNBR;
    
    
    
    

	public String getDeptnbr() {
		return deptnbr;
	}

	public void setDeptnbr(String deptnbr) {
		this.deptnbr = deptnbr;
	}

	public String getPayTypeDesc() {
		return payTypeDesc;
	}

	public void setPayTypeDesc(String payTypeDesc) {
		this.payTypeDesc = payTypeDesc;
	}

	public String getChannelDesc() {
		return channelDesc;
	}

	public void setChannelDesc(String channelDesc) {
		this.channelDesc = channelDesc;
	}

	public String getPertranslimit() {
		return pertranslimit;
	}

	public void setPertranslimit(String pertranslimit) {
		this.pertranslimit = pertranslimit;
	}

	public String getPerdaylimit() {
		return perdaylimit;
	}

	public void setPerdaylimit(String perdaylimit) {
		this.perdaylimit = perdaylimit;
	}

	public String getDayamtdate() {
		return dayamtdate;
	}

	public void setDayamtdate(String dayamtdate) {
		this.dayamtdate = dayamtdate;
	}

	public String getDayamt() {
		return dayamt;
	}

	public void setDayamt(String dayamt) {
		this.dayamt = dayamt;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getPayTypeCd() {
		return payTypeCd;
	}

	public void setPayTypeCd(String payTypeCd) {
		this.payTypeCd = payTypeCd;
	}

	public String getChannelNBR() {
		return channelNBR;
	}

	public void setChannelNBR(String channelNBR) {
		this.channelNBR = channelNBR;
	}

	@Override
	public String toString() {
		return "ChannelInfo [deptnbr=" + deptnbr + ", payTypeDesc=" + payTypeDesc + ", channelDesc=" + channelDesc
				+ ", pertranslimit=" + pertranslimit + ", perdaylimit=" + perdaylimit + ", dayamtdate=" + dayamtdate
				+ ", dayamt=" + dayamt + ", status=" + status + ", payTypeCd=" + payTypeCd + ", channelNBR="
				+ channelNBR + "]";
	}

    
    
    
	

	
	

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
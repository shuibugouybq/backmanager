package cc.mrbird.system.domain;

import javax.persistence.*;

//@Table(name = "mer_warn_info")
public class UppBatchHostTrans {
	/**
     * 平台流水
     */
    @Id
    @Column(name = "TRANS_SEQNO")
    private String transSeqno;

    /**
     * 付款账号
     */
    @Column(name = "TRANS_PAYACCTNO")
    private String transPayAcctNo;

    /**
     * 收款账号
     */
    @Column(name = "TRANS_RCVACCTNO")
    private String transRcvAcctNo;

    /**
     * 交易金额
     */
    @Column(name = "TRANS_AMT")
    private String transAmt;

    /**
     * 对账状态
     */
    @Column(name = "TRANS_CHECKSTATUS")
    private String transCheckStatus;

    /**
     * 通道号
     */
    @Id
    @Column(name = "DEPARTMENT_ID")
    private String departmentId;

    /**
     * 通道流水
     */
    @Column(name = "TRANS_HOSTSEQNO")
    private String transHostSeqno;
    
    /**
     * 通道日期
     */
    @Id
    @Column(name = "TRANS_HOSTDATE")
    private String transHostDate;
    
    /**
     * 状态
     */
    @Column(name = "TRANS_STATUS")
    private String transStatus;
    
    /**
     * 手续费金额
     */
    @Column(name = "TRANS_FEEAMT")
    private String transFeeAmt;

	public String getTransSeqno() {
		return transSeqno;
	}

	public void setTransSeqno(String transSeqno) {
		this.transSeqno = transSeqno;
	}

	public String getTransPayAcctNo() {
		return transPayAcctNo;
	}

	public void setTransPayAcctNo(String transPayAcctNo) {
		this.transPayAcctNo = transPayAcctNo;
	}

	public String getTransRcvAcctNo() {
		return transRcvAcctNo;
	}

	public void setTransRcvAcctNo(String transRcvAcctNo) {
		this.transRcvAcctNo = transRcvAcctNo;
	}

	public String getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(String transAmt) {
		this.transAmt = transAmt;
	}

	public String getTransCheckStatus() {
		return transCheckStatus;
	}

	public void setTransCheckStatus(String transCheckStatus) {
		this.transCheckStatus = transCheckStatus;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getTransHostSeqno() {
		return transHostSeqno;
	}

	public void setTransHostSeqno(String transHostSeqno) {
		this.transHostSeqno = transHostSeqno;
	}

	public String getTransHostDate() {
		return transHostDate;
	}

	public void setTransHostDate(String transHostDate) {
		this.transHostDate = transHostDate;
	}

	public String getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}

	public String getTransFeeAmt() {
		return transFeeAmt;
	}

	public void setTransFeeAmt(String transFeeAmt) {
		this.transFeeAmt = transFeeAmt;
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
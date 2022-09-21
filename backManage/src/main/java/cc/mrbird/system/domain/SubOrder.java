package cc.mrbird.system.domain;

import javax.persistence.*;

//@Table(name = "mer_warn_info")
public class SubOrder {
	/**
     * 主商户号
     */
    @Column(name = "PARENT_MERCHANT_ID")
    private String parentMerchantId;

    /**
     * 订单编号--商户流水号
     */
    @Id
    @Column(name = "ORDER_NO")
    private String orderNo;

    /**
     * 订单流水
     */
    @Column(name = "TRANS_SEQ_NO")
    private String transSeqNo;

    /**
     * 付款机构号
     */
    @Column(name = "PAYER_DEPARTMENT_ID")
    private String payerDepartmentId;

    /**
     * 收款机构号
     */
    @Column(name = "PAYEE_DEPARTMENT_ID")
    private String payeeDepartmentId;

    /**
     * 订单状态
     */
    @Column(name = "TRANS_STATUS")
    private String transStatus;

    /**
     * 交易日期
     */
    @Id
    @Column(name = "ORDER_DATE")
    private String orderDate;
    
    private String startOrderDate;
    
    private String endOrderDate;
    
    /**
     * 金额
     */
    @Column(name = "TRANS_AMT")
    private String transAmt;

	public String getParentMerchantId() {
		return parentMerchantId;
	}

	public void setParentMerchantId(String parentMerchantId) {
		this.parentMerchantId = parentMerchantId;
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getTransSeqNo() {
		return transSeqNo;
	}

	public void setTransSeqNo(String transSeqNo) {
		this.transSeqNo = transSeqNo;
	}

	public String getPayerDepartmentId() {
		return payerDepartmentId;
	}

	public void setPayerDepartmentId(String payerDepartmentId) {
		this.payerDepartmentId = payerDepartmentId;
	}

	public String getPayeeDepartmentId() {
		return payeeDepartmentId;
	}

	public void setPayeeDepartmentId(String payeeDepartmentId) {
		this.payeeDepartmentId = payeeDepartmentId;
	}

	public String getTransStatus() {
		return transStatus;
	}

	public void setTransStatus(String transStatus) {
		this.transStatus = transStatus;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public String getTransAmt() {
		return transAmt;
	}

	public void setTransAmt(String transAmt) {
		this.transAmt = transAmt;
	}

	public String getStartOrderDate() {
		return startOrderDate;
	}

	public void setStartOrderDate(String startOrderDate) {
		this.startOrderDate = startOrderDate;
	}

	public String getEndOrderDate() {
		return endOrderDate;
	}

	public void setEndOrderDate(String endOrderDate) {
		this.endOrderDate = endOrderDate;
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
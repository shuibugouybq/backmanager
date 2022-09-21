package cc.mrbird.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "upp_batch_fee_trans")
public class UppBatchFeeTrans {
    /**
     * 分润流水
     */
    @Id
    @Column(name = "FEE_SEQNO")
    private String feeSeqno;

    /**
     * 模值
     */
    @Id
    @Column(name = "SHARDING_KEY")
    private Integer shardingKey;

    /**
     * 平台流水
     */
    @Column(name = "TRANS_SEQNO")
    private String transSeqno;

    /**
     * 清算日期
     */
    @Column(name = "TRANS_CLEARDATE")
    private Date transCleardate;

    /**
     * 结算日期
     */
    @Column(name = "TRANS_SETTDATE")
    private Date transSettdate;

    /**
     * 订单号
     */
    @Column(name = "TRANS_MERSEQNO")
    private String transMerseqno;

    /**
     * 商户号
     */
    @Column(name = "MER_ID")
    private String merId;

    /**
     * 付款账号
     */
    @Column(name = "TRANS_PAYACCTNO")
    private String transPayacctno;

    /**
     * 付款账号类型
     */
    @Column(name = "TRANS_PAYACCTNO_TYPE")
    private String transPayacctnoType;

    /**
     * 付款账号名称
     */
    @Column(name = "TRANS_PAYACCTNAME")
    private String transPayacctname;

    /**
     * 付款机构
     */
    @Column(name = "PAY_DEPTID")
    private String payDeptid;

    /**
     * 收款账号
     */
    @Column(name = "TRANS_RCVACCTNO")
    private String transRcvacctno;

    /**
     * 收款账号类型
     */
    @Column(name = "TRANS_RCVACCTNO_TYPE")
    private String transRcvacctnoType;

    /**
     * 收款账号名称
     */
    @Column(name = "TRANS_RCVACCTNAME")
    private String transRcvacctname;

    /**
     * 收款账户机构
     */
    @Column(name = "RCV_DEPTID")
    private String rcvDeptid;

    /**
     * 金额
     */
    @Column(name = "TRANS_AMT")
    private BigDecimal transAmt;

    /**
     * 摘要码
     */
    @Column(name = "TRANS_BRIEFCODE")
    private String transBriefcode;

    /**
     * 法人机构
     */
    @Column(name = "CORPORATION_DEPTID")
    private String corporationDeptid;

    /**
     * 法人代码
     */
    @Column(name = "CORPORATION_CODE")
    private String corporationCode;

    /**
     * 修改时间
     */
    @Column(name = "GMT_MODIFIED")
    private Date gmtModified;

    /**
     * 创建时间
     */
    @Column(name = "GMT_CREATE")
    private Date gmtCreate;

    /**
     * 结算状态
     */
    @Column(name = "TRANS_SETTSTATUS")
    private String transSettstatus;

    /**
     * 实收还是计提 1:实收 0:计提
     */
    @Column(name = "SEND_FLAG")
    private String sendFlag;
    
    @Transient
    private String beginDate;
    
    @Transient
    private String endDate;

    /**
     * 获取分润流水
     *
     * @return FEE_SEQNO - 分润流水
     */
    public String getFeeSeqno() {
        return feeSeqno;
    }

    /**
     * 设置分润流水
     *
     * @param feeSeqno 分润流水
     */
    public void setFeeSeqno(String feeSeqno) {
        this.feeSeqno = feeSeqno == null ? null : feeSeqno.trim();
    }

    /**
     * 获取模值
     *
     * @return SHARDING_KEY - 模值
     */
    public Integer getShardingKey() {
        return shardingKey;
    }

    /**
     * 设置模值
     *
     * @param shardingKey 模值
     */
    public void setShardingKey(Integer shardingKey) {
        this.shardingKey = shardingKey;
    }

    /**
     * 获取平台流水
     *
     * @return TRANS_SEQNO - 平台流水
     */
    public String getTransSeqno() {
        return transSeqno;
    }

    /**
     * 设置平台流水
     *
     * @param transSeqno 平台流水
     */
    public void setTransSeqno(String transSeqno) {
        this.transSeqno = transSeqno == null ? null : transSeqno.trim();
    }

    /**
     * 获取清算日期
     *
     * @return TRANS_CLEARDATE - 清算日期
     */
    public Date getTransCleardate() {
        return transCleardate;
    }

    /**
     * 设置清算日期
     *
     * @param transCleardate 清算日期
     */
    public void setTransCleardate(Date transCleardate) {
        this.transCleardate = transCleardate;
    }

    /**
     * 获取结算日期
     *
     * @return TRANS_SETTDATE - 结算日期
     */
    public Date getTransSettdate() {
        return transSettdate;
    }

    /**
     * 设置结算日期
     *
     * @param transSettdate 结算日期
     */
    public void setTransSettdate(Date transSettdate) {
        this.transSettdate = transSettdate;
    }

    /**
     * 获取订单号
     *
     * @return TRANS_MERSEQNO - 订单号
     */
    public String getTransMerseqno() {
        return transMerseqno;
    }

    /**
     * 设置订单号
     *
     * @param transMerseqno 订单号
     */
    public void setTransMerseqno(String transMerseqno) {
        this.transMerseqno = transMerseqno == null ? null : transMerseqno.trim();
    }

    /**
     * 获取商户号
     *
     * @return MER_ID - 商户号
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
     * 获取付款账号
     *
     * @return TRANS_PAYACCTNO - 付款账号
     */
    public String getTransPayacctno() {
        return transPayacctno;
    }

    /**
     * 设置付款账号
     *
     * @param transPayacctno 付款账号
     */
    public void setTransPayacctno(String transPayacctno) {
        this.transPayacctno = transPayacctno == null ? null : transPayacctno.trim();
    }

    /**
     * 获取付款账号类型
     *
     * @return TRANS_PAYACCTNO_TYPE - 付款账号类型
     */
    public String getTransPayacctnoType() {
        return transPayacctnoType;
    }

    /**
     * 设置付款账号类型
     *
     * @param transPayacctnoType 付款账号类型
     */
    public void setTransPayacctnoType(String transPayacctnoType) {
        this.transPayacctnoType = transPayacctnoType == null ? null : transPayacctnoType.trim();
    }

    /**
     * 获取付款账号名称
     *
     * @return TRANS_PAYACCTNAME - 付款账号名称
     */
    public String getTransPayacctname() {
        return transPayacctname;
    }

    /**
     * 设置付款账号名称
     *
     * @param transPayacctname 付款账号名称
     */
    public void setTransPayacctname(String transPayacctname) {
        this.transPayacctname = transPayacctname == null ? null : transPayacctname.trim();
    }

    /**
     * 获取付款机构
     *
     * @return PAY_DEPTID - 付款机构
     */
    public String getPayDeptid() {
        return payDeptid;
    }

    /**
     * 设置付款机构
     *
     * @param payDeptid 付款机构
     */
    public void setPayDeptid(String payDeptid) {
        this.payDeptid = payDeptid == null ? null : payDeptid.trim();
    }

    /**
     * 获取收款账号
     *
     * @return TRANS_RCVACCTNO - 收款账号
     */
    public String getTransRcvacctno() {
        return transRcvacctno;
    }

    /**
     * 设置收款账号
     *
     * @param transRcvacctno 收款账号
     */
    public void setTransRcvacctno(String transRcvacctno) {
        this.transRcvacctno = transRcvacctno == null ? null : transRcvacctno.trim();
    }

    /**
     * 获取收款账号类型
     *
     * @return TRANS_RCVACCTNO_TYPE - 收款账号类型
     */
    public String getTransRcvacctnoType() {
        return transRcvacctnoType;
    }

    /**
     * 设置收款账号类型
     *
     * @param transRcvacctnoType 收款账号类型
     */
    public void setTransRcvacctnoType(String transRcvacctnoType) {
        this.transRcvacctnoType = transRcvacctnoType == null ? null : transRcvacctnoType.trim();
    }

    /**
     * 获取收款账号名称
     *
     * @return TRANS_RCVACCTNAME - 收款账号名称
     */
    public String getTransRcvacctname() {
        return transRcvacctname;
    }

    /**
     * 设置收款账号名称
     *
     * @param transRcvacctname 收款账号名称
     */
    public void setTransRcvacctname(String transRcvacctname) {
        this.transRcvacctname = transRcvacctname == null ? null : transRcvacctname.trim();
    }

    /**
     * 获取收款账户机构
     *
     * @return RCV_DEPTID - 收款账户机构
     */
    public String getRcvDeptid() {
        return rcvDeptid;
    }

    /**
     * 设置收款账户机构
     *
     * @param rcvDeptid 收款账户机构
     */
    public void setRcvDeptid(String rcvDeptid) {
        this.rcvDeptid = rcvDeptid == null ? null : rcvDeptid.trim();
    }

    /**
     * 获取金额
     *
     * @return TRANS_AMT - 金额
     */
    public BigDecimal getTransAmt() {
        return transAmt;
    }

    /**
     * 设置金额
     *
     * @param transAmt 金额
     */
    public void setTransAmt(BigDecimal transAmt) {
        this.transAmt = transAmt;
    }

    /**
     * 获取摘要码
     *
     * @return TRANS_BRIEFCODE - 摘要码
     */
    public String getTransBriefcode() {
        return transBriefcode;
    }

    /**
     * 设置摘要码
     *
     * @param transBriefcode 摘要码
     */
    public void setTransBriefcode(String transBriefcode) {
        this.transBriefcode = transBriefcode == null ? null : transBriefcode.trim();
    }

    /**
     * 获取法人机构
     *
     * @return CORPORATION_DEPTID - 法人机构
     */
    public String getCorporationDeptid() {
        return corporationDeptid;
    }

    /**
     * 设置法人机构
     *
     * @param corporationDeptid 法人机构
     */
    public void setCorporationDeptid(String corporationDeptid) {
        this.corporationDeptid = corporationDeptid == null ? null : corporationDeptid.trim();
    }

    /**
     * 获取法人代码
     *
     * @return CORPORATION_CODE - 法人代码
     */
    public String getCorporationCode() {
        return corporationCode;
    }

    /**
     * 设置法人代码
     *
     * @param corporationCode 法人代码
     */
    public void setCorporationCode(String corporationCode) {
        this.corporationCode = corporationCode == null ? null : corporationCode.trim();
    }

    /**
     * 获取修改时间
     *
     * @return GMT_MODIFIED - 修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置修改时间
     *
     * @param gmtModified 修改时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 获取创建时间
     *
     * @return GMT_CREATE - 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取结算状态
     *
     * @return TRANS_SETTSTATUS - 结算状态
     */
    public String getTransSettstatus() {
        return transSettstatus;
    }

    /**
     * 设置结算状态
     *
     * @param transSettstatus 结算状态
     */
    public void setTransSettstatus(String transSettstatus) {
        this.transSettstatus = transSettstatus == null ? null : transSettstatus.trim();
    }

    /**
     * 获取实收还是计提 1:实收 0:计提
     *
     * @return SEND_FLAG - 实收还是计提 1:实收 0:计提
     */
    public String getSendFlag() {
        return sendFlag;
    }

    /**
     * 设置实收还是计提 1:实收 0:计提
     *
     * @param sendFlag 实收还是计提 1:实收 0:计提
     */
    public void setSendFlag(String sendFlag) {
        this.sendFlag = sendFlag == null ? null : sendFlag.trim();
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
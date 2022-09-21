package cc.mrbird.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "upp_batch_mer_daysett")
public class UppBatchMerDaysett {
    /**
     * 平台流水
     */
    @Id
    @Column(name = "TRANS_SETTSEQNO")
    private String transSettseqno;

    /**
     * 台账类型
     */
    @Id
    @Column(name = "TRANS_MERACCTTYPE")
    private String transMeraccttype;

    /**
     * 模值
     */
    @Id
    @Column(name = "SHARDING_KEY")
    private Integer shardingKey;

    /**
     * 结算日期
     */
    @Column(name = "TRANS_CLEARDATE")
    private Date transCleardate;

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
     * 顺序号
     */
    @Column(name = "TRANS_SEQUENCE")
    private Integer transSequence;

    /**
     * 发送通道
     */
    @Column(name = "TRANS_SEND_DEPARTMENTID")
    private String transSendDepartmentid;

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
     * 是否查询余额 1:需要查询余额 0:不需要
     */
    @Column(name = "IS_BALANCE")
    private Integer isBalance;

    /**
     * 付款账号类型
     */
    @Column(name = "TRANS_PAYACCTNO_TYPE")
    private String transPayacctnoType;

    /**
     * 收款账号类型
     */
    @Column(name = "TRANS_RCVACCTNO_TYPE")
    private String transRcvacctnoType;

    /**
     * 付款账户名称
     */
    @Column(name = "TRANS_PAYACCTNAME")
    private String transPayacctname;

    /**
     * 收款账户名称
     */
    @Column(name = "TRANS_RCVACCTNAME")
    private String transRcvacctname;
    
    @Transient
    private String beginDate;
    
    @Transient
    private String endDate;

    /**
     * 获取平台流水
     *
     * @return TRANS_SETTSEQNO - 平台流水
     */
    public String getTransSettseqno() {
        return transSettseqno;
    }

    /**
     * 设置平台流水
     *
     * @param transSettseqno 平台流水
     */
    public void setTransSettseqno(String transSettseqno) {
        this.transSettseqno = transSettseqno == null ? null : transSettseqno.trim();
    }

    /**
     * 获取台账类型
     *
     * @return TRANS_MERACCTTYPE - 台账类型
     */
    public String getTransMeraccttype() {
        return transMeraccttype;
    }

    /**
     * 设置台账类型
     *
     * @param transMeraccttype 台账类型
     */
    public void setTransMeraccttype(String transMeraccttype) {
        this.transMeraccttype = transMeraccttype == null ? null : transMeraccttype.trim();
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
     * 获取结算日期
     *
     * @return TRANS_CLEARDATE - 结算日期
     */
    public Date getTransCleardate() {
        return transCleardate;
    }

    /**
     * 设置结算日期
     *
     * @param transCleardate 结算日期
     */
    public void setTransCleardate(Date transCleardate) {
        this.transCleardate = transCleardate;
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
     * 获取顺序号
     *
     * @return TRANS_SEQUENCE - 顺序号
     */
    public Integer getTransSequence() {
        return transSequence;
    }

    /**
     * 设置顺序号
     *
     * @param transSequence 顺序号
     */
    public void setTransSequence(Integer transSequence) {
        this.transSequence = transSequence;
    }

    /**
     * 获取发送通道
     *
     * @return TRANS_SEND_DEPARTMENTID - 发送通道
     */
    public String getTransSendDepartmentid() {
        return transSendDepartmentid;
    }

    /**
     * 设置发送通道
     *
     * @param transSendDepartmentid 发送通道
     */
    public void setTransSendDepartmentid(String transSendDepartmentid) {
        this.transSendDepartmentid = transSendDepartmentid == null ? null : transSendDepartmentid.trim();
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
     * 获取是否查询余额 1:需要查询余额 0:不需要
     *
     * @return IS_BALANCE - 是否查询余额 1:需要查询余额 0:不需要
     */
    public Integer getIsBalance() {
        return isBalance;
    }

    /**
     * 设置是否查询余额 1:需要查询余额 0:不需要
     *
     * @param isBalance 是否查询余额 1:需要查询余额 0:不需要
     */
    public void setIsBalance(Integer isBalance) {
        this.isBalance = isBalance;
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
     * 获取付款账户名称
     *
     * @return TRANS_PAYACCTNAME - 付款账户名称
     */
    public String getTransPayacctname() {
        return transPayacctname;
    }

    /**
     * 设置付款账户名称
     *
     * @param transPayacctname 付款账户名称
     */
    public void setTransPayacctname(String transPayacctname) {
        this.transPayacctname = transPayacctname == null ? null : transPayacctname.trim();
    }

    /**
     * 获取收款账户名称
     *
     * @return TRANS_RCVACCTNAME - 收款账户名称
     */
    public String getTransRcvacctname() {
        return transRcvacctname;
    }

    /**
     * 设置收款账户名称
     *
     * @param transRcvacctname 收款账户名称
     */
    public void setTransRcvacctname(String transRcvacctname) {
        this.transRcvacctname = transRcvacctname == null ? null : transRcvacctname.trim();
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
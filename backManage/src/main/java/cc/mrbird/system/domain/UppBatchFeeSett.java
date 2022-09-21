package cc.mrbird.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "upp_batch_fee_sett")
public class UppBatchFeeSett {
    /**
     * 分润流水
     */
    @Id
    @Column(name = "TRANS_SETTSEQNO")
    private String transSettseqno;

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
     * 结算状态
     */
    @Column(name = "TRANS_SETTSTATUS")
    private String transSettstatus;

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
     * 付款账户名称
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
     * 收款账户名称
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
     * 核心流水
     */
    @Column(name = "TRANS_HOSTSEQNO")
    private String transHostseqno;

    /**
     * 核心日期
     */
    @Column(name = "TRANS_HOSTDATE")
    private Date transHostdate;

    /**
     * 对账状态
     */
    @Column(name = "TRANS_CHECKSTATUS")
    private String transCheckstatus;

    /**
     * 响应码
     */
    @Column(name = "TRANS_RESPCODE")
    private String transRespcode;

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
     * @return TRANS_SETTSEQNO - 分润流水
     */
    public String getTransSettseqno() {
        return transSettseqno;
    }

    /**
     * 设置分润流水
     *
     * @param transSettseqno 分润流水
     */
    public void setTransSettseqno(String transSettseqno) {
        this.transSettseqno = transSettseqno == null ? null : transSettseqno.trim();
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
     * 获取核心流水
     *
     * @return TRANS_HOSTSEQNO - 核心流水
     */
    public String getTransHostseqno() {
        return transHostseqno;
    }

    /**
     * 设置核心流水
     *
     * @param transHostseqno 核心流水
     */
    public void setTransHostseqno(String transHostseqno) {
        this.transHostseqno = transHostseqno == null ? null : transHostseqno.trim();
    }

    /**
     * 获取核心日期
     *
     * @return TRANS_HOSTDATE - 核心日期
     */
    public Date getTransHostdate() {
        return transHostdate;
    }

    /**
     * 设置核心日期
     *
     * @param transHostdate 核心日期
     */
    public void setTransHostdate(Date transHostdate) {
        this.transHostdate = transHostdate;
    }

    /**
     * 获取对账状态
     *
     * @return TRANS_CHECKSTATUS - 对账状态
     */
    public String getTransCheckstatus() {
        return transCheckstatus;
    }

    /**
     * 设置对账状态
     *
     * @param transCheckstatus 对账状态
     */
    public void setTransCheckstatus(String transCheckstatus) {
        this.transCheckstatus = transCheckstatus == null ? null : transCheckstatus.trim();
    }

    /**
     * 获取响应码
     *
     * @return TRANS_RESPCODE - 响应码
     */
    public String getTransRespcode() {
        return transRespcode;
    }

    /**
     * 设置响应码
     *
     * @param transRespcode 响应码
     */
    public void setTransRespcode(String transRespcode) {
        this.transRespcode = transRespcode == null ? null : transRespcode.trim();
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
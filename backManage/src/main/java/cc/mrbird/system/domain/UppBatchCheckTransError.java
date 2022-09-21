package cc.mrbird.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "upp_batch_checktrans_error")
public class UppBatchCheckTransError {
    /**
     * 流水
     */
    @Id
    @Column(name = "ERROR_SEQNO")
    private String errorSeqno;

    /**
     * 模值
     */
    @Id
    @Column(name = "SHARDING_KEY")
    private String shardingKey;

    /**
     * 平台流水
     */
    @Column(name = "TRANS_SEQNO")
    private String transSeqno;

    /**
     * 通道编号
     */
    @Column(name = "TRANS_DEPARTMENTID")
    private String transDepartmentid;

    /**
     * 顺序号
     */
    @Column(name = "TRANS_SEQUENCE")
    private String transSequence;

    /**
     * 记账日期
     */
    @Column(name = "TRANS_CLEARDATE")
    private Date transCleardate;

    /**
     * 平台的交易码
     */
    @Column(name = "TRANS_ID")
    private String transId;

    /**
     * 交易码
     */
    @Column(name = "TRANS_CODE")
    private String transCode;

    /**
     * 付款账户
     */
    @Column(name = "TRANS_PAYACCTNO")
    private String transPayacctno;

    /**
     * 收款账户
     */
    @Column(name = "TRANS_RCVACCTNO")
    private String transRcvacctno;

    /**
     * 金额
     */
    @Column(name = "TRANS_AMT")
    private BigDecimal transAmt;

    /**
     * 对账状态
     */
    @Column(name = "TRANS_CHECK_STATUS")
    private String transCheckStatus;

    /**
     * 处理状态0:未处理1:已处理
     */
    @Column(name = "TRANS_HANDSTATUS")
    private String transHandstatus;

    /**
     * 差错类型 0-9 A-Z
     */
    @Column(name = "ERROR_CODE")
    private String errorCode;

    /**
     * 差错描述
     */
    @Column(name = "ERROR_MSG")
    private String errorMsg;

    /**
     * 创建时间
     */
    @Column(name = "GMT_CREATE")
    private Date gmtCreate;

    /**
     * 修改时间
     */
    @Column(name = "GMT_MODIFIED")
    private Date gmtModified;
    
    @Transient
    private String beginDate;
    
    @Transient
    private String endDate;
    @Transient
    private String totalCount;
    @Transient
    private String totalAmt;
    @Transient
    private String untreatedCount;
    @Transient
    private String processedCount;
    

    /**
     * 获取流水
     *
     * @return ERROR_SEQNO - 流水
     */
    public String getErrorSeqno() {
        return errorSeqno;
    }

    /**
     * 设置流水
     *
     * @param errorSeqno 流水
     */
    public void setErrorSeqno(String errorSeqno) {
        this.errorSeqno = errorSeqno == null ? null : errorSeqno.trim();
    }

    /**
     * 获取模值
     *
     * @return SHARDING_KEY - 模值
     */
    public String getShardingKey() {
        return shardingKey;
    }

    /**
     * 设置模值
     *
     * @param shardingKey 模值
     */
    public void setShardingKey(String shardingKey) {
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
     * 获取通道编号
     *
     * @return TRANS_DEPARTMENTID - 通道编号
     */
    public String getTransDepartmentid() {
        return transDepartmentid;
    }

    /**
     * 设置通道编号
     *
     * @param transDepartmentid 通道编号
     */
    public void setTransDepartmentid(String transDepartmentid) {
        this.transDepartmentid = transDepartmentid == null ? null : transDepartmentid.trim();
    }

    /**
     * 获取顺序号
     *
     * @return TRANS_SEQUENCE - 顺序号
     */
    public String getTransSequence() {
        return transSequence;
    }

    /**
     * 设置顺序号
     *
     * @param transSequence 顺序号
     */
    public void setTransSequence(String transSequence) {
        this.transSequence = transSequence;
    }

    /**
     * 获取记账日期
     *
     * @return TRANS_CLEARDATE - 记账日期
     */
    public Date getTransCleardate() {
        return transCleardate;
    }

    /**
     * 设置记账日期
     *
     * @param transCleardate 记账日期
     */
    public void setTransCleardate(Date transCleardate) {
        this.transCleardate = transCleardate;
    }

    /**
     * 获取平台的交易码
     *
     * @return TRANS_ID - 平台的交易码
     */
    public String getTransId() {
        return transId;
    }

    /**
     * 设置平台的交易码
     *
     * @param transId 平台的交易码
     */
    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
    }

    /**
     * 获取交易码
     *
     * @return TRANS_CODE - 交易码
     */
    public String getTransCode() {
        return transCode;
    }

    /**
     * 设置交易码
     *
     * @param transCode 交易码
     */
    public void setTransCode(String transCode) {
        this.transCode = transCode == null ? null : transCode.trim();
    }

    /**
     * 获取付款账户
     *
     * @return TRANS_PAYACCTNO - 付款账户
     */
    public String getTransPayacctno() {
        return transPayacctno;
    }

    /**
     * 设置付款账户
     *
     * @param transPayacctno 付款账户
     */
    public void setTransPayacctno(String transPayacctno) {
        this.transPayacctno = transPayacctno == null ? null : transPayacctno.trim();
    }

    /**
     * 获取收款账户
     *
     * @return TRANS_RCVACCTNO - 收款账户
     */
    public String getTransRcvacctno() {
        return transRcvacctno;
    }

    /**
     * 设置收款账户
     *
     * @param transRcvacctno 收款账户
     */
    public void setTransRcvacctno(String transRcvacctno) {
        this.transRcvacctno = transRcvacctno == null ? null : transRcvacctno.trim();
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
     * 获取对账状态
     *
     * @return TRANS_CHECK_STATUS - 对账状态
     */
    public String getTransCheckStatus() {
        return transCheckStatus;
    }

    /**
     * 设置对账状态
     *
     * @param transCheckStatus 对账状态
     */
    public void setTransCheckStatus(String transCheckStatus) {
        this.transCheckStatus = transCheckStatus == null ? null : transCheckStatus.trim();
    }

    /**
     * 获取处理状态0:未处理1:已处理
     *
     * @return TRANS_HANDSTATUS - 处理状态0:未处理1:已处理
     */
    public String getTransHandstatus() {
        return transHandstatus;
    }

    /**
     * 设置处理状态0:未处理1:已处理
     *
     * @param transHandstatus 处理状态0:未处理1:已处理
     */
    public void setTransHandstatus(String transHandstatus) {
        this.transHandstatus = transHandstatus == null ? null : transHandstatus.trim();
    }

    /**
     * 获取差错类型 0-9 A-Z
     *
     * @return ERROR_CODE - 差错类型 0-9 A-Z
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * 设置差错类型 0-9 A-Z
     *
     * @param errorCode 差错类型 0-9 A-Z
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode == null ? null : errorCode.trim();
    }

    /**
     * 获取差错描述
     *
     * @return ERROR_MSG - 差错描述
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    /**
     * 设置差错描述
     *
     * @param errorMsg 差错描述
     */
    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg == null ? null : errorMsg.trim();
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

	public String getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}

	public String getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}

	public String getUntreatedCount() {
		return untreatedCount;
	}

	public void setUntreatedCount(String untreatedCount) {
		this.untreatedCount = untreatedCount;
	}

	public String getProcessedCount() {
		return processedCount;
	}

	public void setProcessedCount(String processedCount) {
		this.processedCount = processedCount;
	}
	
}
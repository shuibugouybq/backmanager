package cc.mrbird.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "upp_marketing_order")
public class UppMarketingOrder {
    /**
     * 原支付流水
     */
    @Column(name = "TRANS_SEQNO")
    private String transSeqno;

    /**
     * 支付类型 00 支付， 01退货
     */
    @Column(name = "TRANS_MERACCTTYPE")
    private String transMeraccttype;

    /**
     * 清算日期
     */
    @Column(name = "TRANS_CLEARDATE")
    private Date transCleardate;

    /**
     * 交易日期
     */
    @Column(name = "TRANS_DATE")
    private Date transDate;

    /**
     * 商户流水
     */
    @Column(name = "TRANS_MERSEQNO")
    private String transMerseqno;

    /**
     * 商户id
     */
    @Column(name = "MER_ID")
    private String merId;

    /**
     * 付款账户
     */
    @Column(name = "TRANS_PAYACCTNO")
    private String transPayacctno;

    /**
     * 付款账户类型
     */
    @Column(name = "TRANS_PAYACCTNO_TYPE")
    private String transPayacctnoType;

    /**
     * 付款账户名
     */
    @Column(name = "TRANS_PAYACCTNAME")
    private String transPayacctname;

    /**
     * 收款账户名
     */
    @Column(name = "TRANS_RCVACCTNAME")
    private String transRcvacctname;

    /**
     * 收款账号
     */
    @Column(name = "TRANS_RCVACCTNO")
    private String transRcvacctno;

    /**
     * 抵扣金额
     */
    @Column(name = "POINT_AMT")
    private BigDecimal pointAmt;

    /**
     * 抵扣数  使用积分时是积分数，使用红包时存抵扣金额，满减时存满减金额
     */
    @Column(name = "POINT_NO")
    private Long pointNo;

    /**
     * 营销通道  ，例如红包，积分，满减
     */
    @Column(name = "POINT_CHANNEL")
    private String pointChannel;

    /**
     * 营销通道响应码
     */
    @Column(name = "CHANNEL_RES_CODE")
    private String channelResCode;

    /**
     * 营销通道信息
     */
    @Column(name = "CHANNEL_RES_MSG")
    private String channelResMsg;

    /**
     * 交易状态  00 成功   01 失败   09 处理中   
     */
    @Column(name = "TRANS_STATUS")
    private String transStatus;

    /**
     * 结算步骤，日间默认是0，清结算后状态为3，对账后成为1
     */
    @Column(name = "TRANS_STEP")
    private String transStep;

    /**
     * 清结算状态
     */
    @Column(name = "TRANS_PROCSTATUS")
    private String transProcstatus;

    @Column(name = "SHARDING_KEY")
    private String shardingKey;

    @Column(name = "REMARK1")
    private String remark1;

    @Column(name = "REMARK2")
    private String remark2;

    @Column(name = "REMARK3")
    private String remark3;

    @Column(name = "REMARK4")
    private String remark4;

    @Column(name = "REMARK5")
    private String remark5;
    
    @Transient
    private String beginDate;
    
    @Transient
    private String endDate;

    /**
     * 获取原支付流水
     *
     * @return TRANS_SEQNO - 原支付流水
     */
    public String getTransSeqno() {
        return transSeqno;
    }

    /**
     * 设置原支付流水
     *
     * @param transSeqno 原支付流水
     */
    public void setTransSeqno(String transSeqno) {
        this.transSeqno = transSeqno == null ? null : transSeqno.trim();
    }

    /**
     * 获取支付类型 00 支付， 01退货
     *
     * @return TRANS_MERACCTTYPE - 支付类型 00 支付， 01退货
     */
    public String getTransMeraccttype() {
        return transMeraccttype;
    }

    /**
     * 设置支付类型 00 支付， 01退货
     *
     * @param transMeraccttype 支付类型 00 支付， 01退货
     */
    public void setTransMeraccttype(String transMeraccttype) {
        this.transMeraccttype = transMeraccttype == null ? null : transMeraccttype.trim();
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
     * 获取交易日期
     *
     * @return TRANS_DATE - 交易日期
     */
    public Date getTransDate() {
        return transDate;
    }

    /**
     * 设置交易日期
     *
     * @param transDate 交易日期
     */
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    /**
     * 获取商户流水
     *
     * @return TRANS_MERSEQNO - 商户流水
     */
    public String getTransMerseqno() {
        return transMerseqno;
    }

    /**
     * 设置商户流水
     *
     * @param transMerseqno 商户流水
     */
    public void setTransMerseqno(String transMerseqno) {
        this.transMerseqno = transMerseqno == null ? null : transMerseqno.trim();
    }

    /**
     * 获取商户id
     *
     * @return MER_ID - 商户id
     */
    public String getMerId() {
        return merId;
    }

    /**
     * 设置商户id
     *
     * @param merId 商户id
     */
    public void setMerId(String merId) {
        this.merId = merId == null ? null : merId.trim();
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
     * 获取付款账户类型
     *
     * @return TRANS_PAYACCTNO_TYPE - 付款账户类型
     */
    public String getTransPayacctnoType() {
        return transPayacctnoType;
    }

    /**
     * 设置付款账户类型
     *
     * @param transPayacctnoType 付款账户类型
     */
    public void setTransPayacctnoType(String transPayacctnoType) {
        this.transPayacctnoType = transPayacctnoType == null ? null : transPayacctnoType.trim();
    }

    /**
     * 获取付款账户名
     *
     * @return TRANS_PAYACCTNAME - 付款账户名
     */
    public String getTransPayacctname() {
        return transPayacctname;
    }

    /**
     * 设置付款账户名
     *
     * @param transPayacctname 付款账户名
     */
    public void setTransPayacctname(String transPayacctname) {
        this.transPayacctname = transPayacctname == null ? null : transPayacctname.trim();
    }

    /**
     * 获取收款账户名
     *
     * @return TRANS_RCVACCTNAME - 收款账户名
     */
    public String getTransRcvacctname() {
        return transRcvacctname;
    }

    /**
     * 设置收款账户名
     *
     * @param transRcvacctname 收款账户名
     */
    public void setTransRcvacctname(String transRcvacctname) {
        this.transRcvacctname = transRcvacctname == null ? null : transRcvacctname.trim();
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
     * 获取抵扣金额
     *
     * @return POINT_AMT - 抵扣金额
     */
    public BigDecimal getPointAmt() {
        return pointAmt;
    }

    /**
     * 设置抵扣金额
     *
     * @param pointAmt 抵扣金额
     */
    public void setPointAmt(BigDecimal pointAmt) {
        this.pointAmt = pointAmt;
    }

    /**
     * 获取抵扣数  使用积分时是积分数，使用红包时存抵扣金额，满减时存满减金额
     *
     * @return POINT_NO - 抵扣数  使用积分时是积分数，使用红包时存抵扣金额，满减时存满减金额
     */
    public Long getPointNo() {
        return pointNo;
    }

    /**
     * 设置抵扣数  使用积分时是积分数，使用红包时存抵扣金额，满减时存满减金额
     *
     * @param pointNo 抵扣数  使用积分时是积分数，使用红包时存抵扣金额，满减时存满减金额
     */
    public void setPointNo(Long pointNo) {
        this.pointNo = pointNo;
    }

    /**
     * 获取营销通道  ，例如红包，积分，满减
     *
     * @return POINT_CHANNEL - 营销通道  ，例如红包，积分，满减
     */
    public String getPointChannel() {
        return pointChannel;
    }

    /**
     * 设置营销通道  ，例如红包，积分，满减
     *
     * @param pointChannel 营销通道  ，例如红包，积分，满减
     */
    public void setPointChannel(String pointChannel) {
        this.pointChannel = pointChannel == null ? null : pointChannel.trim();
    }

    /**
     * 获取营销通道响应码
     *
     * @return CHANNEL_RES_CODE - 营销通道响应码
     */
    public String getChannelResCode() {
        return channelResCode;
    }

    /**
     * 设置营销通道响应码
     *
     * @param channelResCode 营销通道响应码
     */
    public void setChannelResCode(String channelResCode) {
        this.channelResCode = channelResCode == null ? null : channelResCode.trim();
    }

    /**
     * 获取营销通道信息
     *
     * @return CHANNEL_RES_MSG - 营销通道信息
     */
    public String getChannelResMsg() {
        return channelResMsg;
    }

    /**
     * 设置营销通道信息
     *
     * @param channelResMsg 营销通道信息
     */
    public void setChannelResMsg(String channelResMsg) {
        this.channelResMsg = channelResMsg == null ? null : channelResMsg.trim();
    }

    /**
     * 获取交易状态  00 成功   01 失败   09 处理中   
     *
     * @return TRANS_STATUS - 交易状态  00 成功   01 失败   09 处理中   
     */
    public String getTransStatus() {
        return transStatus;
    }

    /**
     * 设置交易状态  00 成功   01 失败   09 处理中   
     *
     * @param transStatus 交易状态  00 成功   01 失败   09 处理中   
     */
    public void setTransStatus(String transStatus) {
        this.transStatus = transStatus == null ? null : transStatus.trim();
    }

    /**
     * 获取结算步骤，日间默认是0，清结算后状态为3，对账后成为1
     *
     * @return TRANS_STEP - 结算步骤，日间默认是0，清结算后状态为3，对账后成为1
     */
    public String getTransStep() {
        return transStep;
    }

    /**
     * 设置结算步骤，日间默认是0，清结算后状态为3，对账后成为1
     *
     * @param transStep 结算步骤，日间默认是0，清结算后状态为3，对账后成为1
     */
    public void setTransStep(String transStep) {
        this.transStep = transStep == null ? null : transStep.trim();
    }

    /**
     * 获取清结算状态
     *
     * @return TRANS_PROCSTATUS - 清结算状态
     */
    public String getTransProcstatus() {
        return transProcstatus;
    }

    /**
     * 设置清结算状态
     *
     * @param transProcstatus 清结算状态
     */
    public void setTransProcstatus(String transProcstatus) {
        this.transProcstatus = transProcstatus == null ? null : transProcstatus.trim();
    }

    /**
     * @return SHARDING_KEY
     */
    public String getShardingKey() {
        return shardingKey;
    }

    /**
     * @param shardingKey
     */
    public void setShardingKey(String shardingKey) {
        this.shardingKey = shardingKey == null ? null : shardingKey.trim();
    }

    /**
     * @return REMARK1
     */
    public String getRemark1() {
        return remark1;
    }

    /**
     * @param remark1
     */
    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    /**
     * @return REMARK2
     */
    public String getRemark2() {
        return remark2;
    }

    /**
     * @param remark2
     */
    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    /**
     * @return REMARK3
     */
    public String getRemark3() {
        return remark3;
    }

    /**
     * @param remark3
     */
    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }

    /**
     * @return REMARK4
     */
    public String getRemark4() {
        return remark4;
    }

    /**
     * @param remark4
     */
    public void setRemark4(String remark4) {
        this.remark4 = remark4 == null ? null : remark4.trim();
    }

    /**
     * @return REMARK5
     */
    public String getRemark5() {
        return remark5;
    }

    /**
     * @param remark5
     */
    public void setRemark5(String remark5) {
        this.remark5 = remark5 == null ? null : remark5.trim();
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
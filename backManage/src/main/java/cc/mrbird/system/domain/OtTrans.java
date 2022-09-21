package cc.mrbird.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "ot_trans")
public class OtTrans {
    /**
     * 平台流水
     */
    @Id
    @Column(name = "TRANS_SEQ_NO")
    private String transSeqNo;

    /**
     * 平台交易日期
     */
    @Id
    @Column(name = "TRANS_DATE")
    private Date transDate;

    /**
     * 交易时间
     */
    @Column(name = "TRANS_DATE_TIME")
    private Date transDateTime;

    /**
     * 交易完成时间
     */
    @Column(name = "TRANS_FINISH_TIME")
    private Date transFinishTime;

    /**
     * 前端平台流水
     */
    @Column(name = "TRANS_MER_SEQ_NO")
    private String transMerSeqNo;

    /**
     * 前端平台日期
     */
    @Column(name = "TRANS_MER_DATE")
    private Date transMerDate;

    /**
     * 前端平台交易时间
     */
    @Column(name = "TRANS_MER_DATE_TIME")
    private Date transMerDateTime;

    /**
     * 付款账号
     */
    @Column(name = "USER_ACCT_NO")
    private String userAcctNo;

    /**
     * 付款账户类型
     */
    @Column(name = "USER_ACCT_TYPE")
    private String userAcctType;

    /**
     * 付款人姓名
     */
    @Column(name = "USER_NAME")
    private String userName;

    /**
     * 付款人证件号
     */
    @Column(name = "USER_CERT_ID")
    private String userCertId;

    /**
     * 付款人证件类型
     */
    @Column(name = "USER_CERT_TYPE")
    private String userCertType;

    /**
     * 付款人手机号
     */
    @Column(name = "USER_MOBILE")
    private String userMobile;

    /**
     * 收款账号
     */
    @Column(name = "TRANS_RCV_ACCT_NO")
    private String transRcvAcctNo;

    /**
     * 收款人账户类型
     */
    @Column(name = "TRANS_RCV_ACCT_TYPE")
    private String transRcvAcctType;

    /**
     * 收款人姓名
     */
    @Column(name = "TRANS_RCV_ACCT_NAME")
    private String transRcvAcctName;

    /**
     * 收款人行号
     */
    @Column(name = "TRANS_RCV_BANK_ID")
    private String transRcvBankId;

    /**
     * 收款人行名
     */
    @Column(name = "TRANS_RCV_BANK_NAME")
    private String transRcvBankName;

    /**
     * 币种
     */
    @Column(name = "TRANS_CURRENCY")
    private String transCurrency;

    /**
     * 确认支付时间
     */
    @Column(name = "CONFIRM_PAY_DATE")
    private Date confirmPayDate;

    /**
     * 清算日期
     */
    @Column(name = "TRANS_CLEAR_DATE")
    private Date transClearDate;

    /**
     * 银行编码
     */
    @Column(name = "BANK_ID")
    private String bankId;

    /**
     * 00-支付   01-退货
     */
    @Column(name = "TRANS_TYPE")
    private String transType;

    /**
     * 三方标志
     */
    @Column(name = "OTHER_DEPARTMENT_ID")
    private String otherDepartmentId;

    /**
     * 通道号
     */
    @Column(name = "DEPARTMENT_ID")
    private String departmentId;

    /**
     * 快捷 代扣 代付
     */
    @Column(name = "CHANNEL_TYPE")
    private String channelType;

    /**
     * 交易响应码
     */
    @Column(name = "TRANS_RESP_CODE")
    private String transRespCode;

    /**
     * 交易码
     */
    @Column(name = "TRANS_ID")
    private String transId;

    /**
     * 商户号
     */
    @Column(name = "MER_ID")
    private String merId;

    /**
     * 交易金额
     */
    @Column(name = "TRANS_AMT")
    private BigDecimal transAmt;

    /**
     * 可退款金额
     */
    @Column(name = "TRANS_REMAIN_AMT")
    private BigDecimal transRemainAmt;

    /**
     * 已退款金额
     */
    @Column(name = "TRANS_REFUND_AMT")
    private BigDecimal transRefundAmt;

    /**
     * 手续费金额
     */
    @Column(name = "TRANS_FEE_AMT")
    private BigDecimal transFeeAmt;

    /**
     * 实收金额
     */
    @Column(name = "TRANS_ACT_RCV_AMT")
    private BigDecimal transActRcvAmt;

    /**
     * 积分抵扣金额
     */
    @Column(name = "POINT_AMT")
    private BigDecimal pointAmt;

    /**
     * 交易状态
     */
    @Column(name = "TRANS_STATUS")
    private String transStatus;

    /**
     * 对账步骤
     */
    @Column(name = "TRANS_STEP")
    private String transStep;

    /**
     * 对账状态
     */
    @Column(name = "TRANS_PROC_STATUS")
    private String transProcStatus;

    /**
     * 三方对账步骤
     */
    @Column(name = "OTHER_TRANS_STEP")
    private String otherTransStep;

    /**
     * 三方队长状态
     */
    @Column(name = "OTHER_TRANS_STATUS")
    private String otherTransStatus;

    /**
     * 批次号
     */
    @Column(name = "BATCH_NO")
    private String batchNo;

    /**
     * 核心响应流水
     */
    @Column(name = "TRANS_CORE_SEQ_NO")
    private String transCoreSeqNo;

    /**
     * 核心日期
     */
    @Column(name = "TRANS_CORE_DATE")
    private Date transCoreDate;

    /**
     * 核心响应时间
     */
    @Column(name = "TRANS_CORE_DATE_TIME")
    private Date transCoreDateTime;

    /**
     * 核心响应码
     */
    @Column(name = "TRANS_CORE_RESP_CODE")
    private String transCoreRespCode;

    /**
     * 核心响应码
     */
    @Column(name = "TRANS_CORE_RESP_MSG")
    private String transCoreRespMsg;

    /**
     * 通道响应流水
     */
    @Column(name = "TRANS_HOST_SEQ_NO")
    private String transHostSeqNo;

    /**
     * 通道响应日期
     */
    @Column(name = "TRANS_HOST_DATE")
    private Date transHostDate;

    /**
     * 通道响应时间
     */
    @Column(name = "TRANS_HOST_DATE_TIME")
    private Date transHostDateTime;

    /**
     * 通道响应码
     */
    @Column(name = "TRANS_HOST_RESP_CODE")
    private String transHostRespCode;

    @Column(name = "TRANS_HOST_RESP_MSG")
    private String transHostRespMsg;

    /**
     * 原交易流水
     */
    @Column(name = "ORG_TRANS_SEQ_NO")
    private String orgTransSeqNo;

    /**
     * 原交易日期
     */
    @Column(name = "ORG_TRANS_DATE")
    private Date orgTransDate;

    /**
     * 原交易时间
     */
    @Column(name = "ORG_TRANS_DATE_TIME")
    private Date orgTransDateTime;

    /**
     * 原商户流水
     */
    @Column(name = "ORG_TRANS_MER_SEQ_NO")
    private String orgTransMerSeqNo;

    /**
     * 原商户日期
     */
    @Column(name = "ORG_TRANS_MER_DATE")
    private Date orgTransMerDate;

    /**
     * 原渠道流水
     */
    @Column(name = "ORG_TRANS_HOST_SEQ_NO")
    private String orgTransHostSeqNo;

    /**
     * 原渠道日期
     */
    @Column(name = "ORG_TRANS_HOST_DATE")
    private Date orgTransHostDate;

    /**
     * 原渠道时间
     */
    @Column(name = "ORG_TRANS_HOST_DATE_TIME")
    private Date orgTransHostDateTime;

    /**
     * 二级商户号
     */
    @Column(name = "SUB_MER_ID")
    private String subMerId;

    /**
     * 资金渠道
     */
    @Column(name = "FUND_CHANNEL")
    private String fundChannel;

    /**
     * 买家类型
     */
    @Column(name = "BUYER_USER_TYPE")
    private String buyerUserType;

    /**
     * buyer_logon_id
     */
    @Column(name = "BUYER_LOGON_ID")
    private String buyerLogonId;

    /**
     * mer_wxid
     */
    @Column(name = "MER_WXID")
    private String merWxid;

    /**
     * appid
     */
    @Column(name = "APPID")
    private String appid;

    /**
     * openid
     */
    @Column(name = "OPENID")
    private String openid;

    /**
     * agent_id
     */
    @Column(name = "AGENT_ID")
    private String agentId;

    /**
     * cashier_id
     */
    @Column(name = "CASHIER_ID")
    private String cashierId;

    /**
     * cashier_name
     */
    @Column(name = "CASHIER_NAME")
    private String cashierName;

    /**
     * isvoicenotified
     */
    @Column(name = "ISVOICENOTIFIED")
    private String isvoicenotified;

    /**
     * app_auth_token
     */
    @Column(name = "APP_AUTH_TOKEN")
    private String appAuthToken;

    /**
     * terminal_id
     */
    @Column(name = "TERMINAL_ID")
    private String terminalId;

    /**
     * store_name
     */
    @Column(name = "STORE_NAME")
    private String storeName;

    /**
     * store_id
     */
    @Column(name = "STORE_ID")
    private String storeId;

    /**
     * 账户余额
     */
    @Column(name = "ACCT_BLANCE")
    private BigDecimal acctBlance;

    /**
     * 订单编号
     */
    @Column(name = "ORDER_NO")
    private String orderNo;

    /**
     * 订单关键字
     */
    @Column(name = "SUBJECT")
    private String subject;

    /**
     * 商品描述
     */
    @Column(name = "BODY")
    private String body;

    /**
     * 预留1
     */
    @Column(name = "REMARK1")
    private String remark1;

    /**
     * 预留2
     */
    @Column(name = "REMARK2")
    private String remark2;

    /**
     * 预留3
     */
    @Column(name = "REMARK3")
    private String remark3;

    /**
     * 预留4
     */
    @Column(name = "REMARK4")
    private String remark4;

    /**
     * 预留5
     */
    @Column(name = "REMARK5")
    private String remark5;
    
    @Transient
    private String beginDate;
    
    @Transient
    private String endDate;
    
    @Transient
    private String accNoTemp;
    @Transient
    private String payAmt;
    @Transient
    private String refundAmt;
    @Transient
    private String totalAmt;

    /**
     * 获取平台流水
     *
     * @return TRANS_SEQ_NO - 平台流水
     */
    public String getTransSeqNo() {
        return transSeqNo;
    }

    /**
     * 设置平台流水
     *
     * @param transSeqNo 平台流水
     */
    public void setTransSeqNo(String transSeqNo) {
        this.transSeqNo = transSeqNo == null ? null : transSeqNo.trim();
    }

    /**
     * 获取平台交易日期
     *
     * @return TRANS_DATE - 平台交易日期
     */
    public Date getTransDate() {
        return transDate;
    }

    /**
     * 设置平台交易日期
     *
     * @param transDate 平台交易日期
     */
    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    /**
     * 获取交易时间
     *
     * @return TRANS_DATE_TIME - 交易时间
     */
    public Date getTransDateTime() {
        return transDateTime;
    }

    /**
     * 设置交易时间
     *
     * @param transDateTime 交易时间
     */
    public void setTransDateTime(Date transDateTime) {
        this.transDateTime = transDateTime;
    }

    /**
     * 获取交易完成时间
     *
     * @return TRANS_FINISH_TIME - 交易完成时间
     */
    public Date getTransFinishTime() {
        return transFinishTime;
    }

    /**
     * 设置交易完成时间
     *
     * @param transFinishTime 交易完成时间
     */
    public void setTransFinishTime(Date transFinishTime) {
        this.transFinishTime = transFinishTime;
    }

    /**
     * 获取前端平台流水
     *
     * @return TRANS_MER_SEQ_NO - 前端平台流水
     */
    public String getTransMerSeqNo() {
        return transMerSeqNo;
    }

    /**
     * 设置前端平台流水
     *
     * @param transMerSeqNo 前端平台流水
     */
    public void setTransMerSeqNo(String transMerSeqNo) {
        this.transMerSeqNo = transMerSeqNo == null ? null : transMerSeqNo.trim();
    }

    /**
     * 获取前端平台日期
     *
     * @return TRANS_MER_DATE - 前端平台日期
     */
    public Date getTransMerDate() {
        return transMerDate;
    }

    /**
     * 设置前端平台日期
     *
     * @param transMerDate 前端平台日期
     */
    public void setTransMerDate(Date transMerDate) {
        this.transMerDate = transMerDate;
    }

    /**
     * 获取前端平台交易时间
     *
     * @return TRANS_MER_DATE_TIME - 前端平台交易时间
     */
    public Date getTransMerDateTime() {
        return transMerDateTime;
    }

    /**
     * 设置前端平台交易时间
     *
     * @param transMerDateTime 前端平台交易时间
     */
    public void setTransMerDateTime(Date transMerDateTime) {
        this.transMerDateTime = transMerDateTime;
    }

    /**
     * 获取付款账号
     *
     * @return USER_ACCT_NO - 付款账号
     */
    public String getUserAcctNo() {
        return userAcctNo;
    }

    /**
     * 设置付款账号
     *
     * @param userAcctNo 付款账号
     */
    public void setUserAcctNo(String userAcctNo) {
        this.userAcctNo = userAcctNo == null ? null : userAcctNo.trim();
    }

    /**
     * 获取付款账户类型
     *
     * @return USER_ACCT_TYPE - 付款账户类型
     */
    public String getUserAcctType() {
        return userAcctType;
    }

    /**
     * 设置付款账户类型
     *
     * @param userAcctType 付款账户类型
     */
    public void setUserAcctType(String userAcctType) {
        this.userAcctType = userAcctType == null ? null : userAcctType.trim();
    }

    /**
     * 获取付款人姓名
     *
     * @return USER_NAME - 付款人姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置付款人姓名
     *
     * @param userName 付款人姓名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取付款人证件号
     *
     * @return USER_CERT_ID - 付款人证件号
     */
    public String getUserCertId() {
        return userCertId;
    }

    /**
     * 设置付款人证件号
     *
     * @param userCertId 付款人证件号
     */
    public void setUserCertId(String userCertId) {
        this.userCertId = userCertId == null ? null : userCertId.trim();
    }

    /**
     * 获取付款人证件类型
     *
     * @return USER_CERT_TYPE - 付款人证件类型
     */
    public String getUserCertType() {
        return userCertType;
    }

    /**
     * 设置付款人证件类型
     *
     * @param userCertType 付款人证件类型
     */
    public void setUserCertType(String userCertType) {
        this.userCertType = userCertType == null ? null : userCertType.trim();
    }

    /**
     * 获取付款人手机号
     *
     * @return USER_MOBILE - 付款人手机号
     */
    public String getUserMobile() {
        return userMobile;
    }

    /**
     * 设置付款人手机号
     *
     * @param userMobile 付款人手机号
     */
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    /**
     * 获取收款账号
     *
     * @return TRANS_RCV_ACCT_NO - 收款账号
     */
    public String getTransRcvAcctNo() {
        return transRcvAcctNo;
    }

    /**
     * 设置收款账号
     *
     * @param transRcvAcctNo 收款账号
     */
    public void setTransRcvAcctNo(String transRcvAcctNo) {
        this.transRcvAcctNo = transRcvAcctNo == null ? null : transRcvAcctNo.trim();
    }

    /**
     * 获取收款人账户类型
     *
     * @return TRANS_RCV_ACCT_TYPE - 收款人账户类型
     */
    public String getTransRcvAcctType() {
        return transRcvAcctType;
    }

    /**
     * 设置收款人账户类型
     *
     * @param transRcvAcctType 收款人账户类型
     */
    public void setTransRcvAcctType(String transRcvAcctType) {
        this.transRcvAcctType = transRcvAcctType == null ? null : transRcvAcctType.trim();
    }

    /**
     * 获取收款人姓名
     *
     * @return TRANS_RCV_ACCT_NAME - 收款人姓名
     */
    public String getTransRcvAcctName() {
        return transRcvAcctName;
    }

    /**
     * 设置收款人姓名
     *
     * @param transRcvAcctName 收款人姓名
     */
    public void setTransRcvAcctName(String transRcvAcctName) {
        this.transRcvAcctName = transRcvAcctName == null ? null : transRcvAcctName.trim();
    }

    /**
     * 获取收款人行号
     *
     * @return TRANS_RCV_BANK_ID - 收款人行号
     */
    public String getTransRcvBankId() {
        return transRcvBankId;
    }

    /**
     * 设置收款人行号
     *
     * @param transRcvBankId 收款人行号
     */
    public void setTransRcvBankId(String transRcvBankId) {
        this.transRcvBankId = transRcvBankId == null ? null : transRcvBankId.trim();
    }

    /**
     * 获取收款人行名
     *
     * @return TRANS_RCV_BANK_NAME - 收款人行名
     */
    public String getTransRcvBankName() {
        return transRcvBankName;
    }

    /**
     * 设置收款人行名
     *
     * @param transRcvBankName 收款人行名
     */
    public void setTransRcvBankName(String transRcvBankName) {
        this.transRcvBankName = transRcvBankName == null ? null : transRcvBankName.trim();
    }

    /**
     * 获取币种
     *
     * @return TRANS_CURRENCY - 币种
     */
    public String getTransCurrency() {
        return transCurrency;
    }

    /**
     * 设置币种
     *
     * @param transCurrency 币种
     */
    public void setTransCurrency(String transCurrency) {
        this.transCurrency = transCurrency == null ? null : transCurrency.trim();
    }

    /**
     * 获取确认支付时间
     *
     * @return CONFIRM_PAY_DATE - 确认支付时间
     */
    public Date getConfirmPayDate() {
        return confirmPayDate;
    }

    /**
     * 设置确认支付时间
     *
     * @param confirmPayDate 确认支付时间
     */
    public void setConfirmPayDate(Date confirmPayDate) {
        this.confirmPayDate = confirmPayDate;
    }

    /**
     * 获取清算日期
     *
     * @return TRANS_CLEAR_DATE - 清算日期
     */
    public Date getTransClearDate() {
        return transClearDate;
    }

    /**
     * 设置清算日期
     *
     * @param transClearDate 清算日期
     */
    public void setTransClearDate(Date transClearDate) {
        this.transClearDate = transClearDate;
    }

    /**
     * 获取银行编码
     *
     * @return BANK_ID - 银行编码
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * 设置银行编码
     *
     * @param bankId 银行编码
     */
    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    /**
     * 获取00-支付   01-退货
     *
     * @return TRANS_TYPE - 00-支付   01-退货
     */
    public String getTransType() {
        return transType;
    }

    /**
     * 设置00-支付   01-退货
     *
     * @param transType 00-支付   01-退货
     */
    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }

    /**
     * 获取三方标志
     *
     * @return OTHER_DEPARTMENT_ID - 三方标志
     */
    public String getOtherDepartmentId() {
        return otherDepartmentId;
    }

    /**
     * 设置三方标志
     *
     * @param otherDepartmentId 三方标志
     */
    public void setOtherDepartmentId(String otherDepartmentId) {
        this.otherDepartmentId = otherDepartmentId == null ? null : otherDepartmentId.trim();
    }

    /**
     * 获取通道号
     *
     * @return DEPARTMENT_ID - 通道号
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置通道号
     *
     * @param departmentId 通道号
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    /**
     * 获取快捷 代扣 代付
     *
     * @return CHANNEL_TYPE - 快捷 代扣 代付
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * 设置快捷 代扣 代付
     *
     * @param channelType 快捷 代扣 代付
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }

    /**
     * 获取交易响应码
     *
     * @return TRANS_RESP_CODE - 交易响应码
     */
    public String getTransRespCode() {
        return transRespCode;
    }

    /**
     * 设置交易响应码
     *
     * @param transRespCode 交易响应码
     */
    public void setTransRespCode(String transRespCode) {
        this.transRespCode = transRespCode == null ? null : transRespCode.trim();
    }

    /**
     * 获取交易码
     *
     * @return TRANS_ID - 交易码
     */
    public String getTransId() {
        return transId;
    }

    /**
     * 设置交易码
     *
     * @param transId 交易码
     */
    public void setTransId(String transId) {
        this.transId = transId == null ? null : transId.trim();
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
     * 获取交易金额
     *
     * @return TRANS_AMT - 交易金额
     */
    public BigDecimal getTransAmt() {
        return transAmt;
    }

    /**
     * 设置交易金额
     *
     * @param transAmt 交易金额
     */
    public void setTransAmt(BigDecimal transAmt) {
        this.transAmt = transAmt;
    }

    /**
     * 获取可退款金额
     *
     * @return TRANS_REMAIN_AMT - 可退款金额
     */
    public BigDecimal getTransRemainAmt() {
        return transRemainAmt;
    }

    /**
     * 设置可退款金额
     *
     * @param transRemainAmt 可退款金额
     */
    public void setTransRemainAmt(BigDecimal transRemainAmt) {
        this.transRemainAmt = transRemainAmt;
    }

    /**
     * 获取已退款金额
     *
     * @return TRANS_REFUND_AMT - 已退款金额
     */
    public BigDecimal getTransRefundAmt() {
        return transRefundAmt;
    }

    /**
     * 设置已退款金额
     *
     * @param transRefundAmt 已退款金额
     */
    public void setTransRefundAmt(BigDecimal transRefundAmt) {
        this.transRefundAmt = transRefundAmt;
    }

    /**
     * 获取手续费金额
     *
     * @return TRANS_FEE_AMT - 手续费金额
     */
    public BigDecimal getTransFeeAmt() {
        return transFeeAmt;
    }

    /**
     * 设置手续费金额
     *
     * @param transFeeAmt 手续费金额
     */
    public void setTransFeeAmt(BigDecimal transFeeAmt) {
        this.transFeeAmt = transFeeAmt;
    }

    /**
     * 获取实收金额
     *
     * @return TRANS_ACT_RCV_AMT - 实收金额
     */
    public BigDecimal getTransActRcvAmt() {
        return transActRcvAmt;
    }

    /**
     * 设置实收金额
     *
     * @param transActRcvAmt 实收金额
     */
    public void setTransActRcvAmt(BigDecimal transActRcvAmt) {
        this.transActRcvAmt = transActRcvAmt;
    }

    /**
     * 获取积分抵扣金额
     *
     * @return POINT_AMT - 积分抵扣金额
     */
    public BigDecimal getPointAmt() {
        return pointAmt;
    }

    /**
     * 设置积分抵扣金额
     *
     * @param pointAmt 积分抵扣金额
     */
    public void setPointAmt(BigDecimal pointAmt) {
        this.pointAmt = pointAmt;
    }

    /**
     * 获取交易状态
     *
     * @return TRANS_STATUS - 交易状态
     */
    public String getTransStatus() {
        return transStatus;
    }

    /**
     * 设置交易状态
     *
     * @param transStatus 交易状态
     */
    public void setTransStatus(String transStatus) {
        this.transStatus = transStatus == null ? null : transStatus.trim();
    }

    /**
     * 获取对账步骤
     *
     * @return TRANS_STEP - 对账步骤
     */
    public String getTransStep() {
        return transStep;
    }

    /**
     * 设置对账步骤
     *
     * @param transStep 对账步骤
     */
    public void setTransStep(String transStep) {
        this.transStep = transStep == null ? null : transStep.trim();
    }

    /**
     * 获取对账状态
     *
     * @return TRANS_PROC_STATUS - 对账状态
     */
    public String getTransProcStatus() {
        return transProcStatus;
    }

    /**
     * 设置对账状态
     *
     * @param transProcStatus 对账状态
     */
    public void setTransProcStatus(String transProcStatus) {
        this.transProcStatus = transProcStatus == null ? null : transProcStatus.trim();
    }

    /**
     * 获取三方对账步骤
     *
     * @return OTHER_TRANS_STEP - 三方对账步骤
     */
    public String getOtherTransStep() {
        return otherTransStep;
    }

    /**
     * 设置三方对账步骤
     *
     * @param otherTransStep 三方对账步骤
     */
    public void setOtherTransStep(String otherTransStep) {
        this.otherTransStep = otherTransStep == null ? null : otherTransStep.trim();
    }

    /**
     * 获取三方队长状态
     *
     * @return OTHER_TRANS_STATUS - 三方队长状态
     */
    public String getOtherTransStatus() {
        return otherTransStatus;
    }

    /**
     * 设置三方队长状态
     *
     * @param otherTransStatus 三方队长状态
     */
    public void setOtherTransStatus(String otherTransStatus) {
        this.otherTransStatus = otherTransStatus == null ? null : otherTransStatus.trim();
    }

    /**
     * 获取批次号
     *
     * @return BATCH_NO - 批次号
     */
    public String getBatchNo() {
        return batchNo;
    }

    /**
     * 设置批次号
     *
     * @param batchNo 批次号
     */
    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo == null ? null : batchNo.trim();
    }

    /**
     * 获取核心响应流水
     *
     * @return TRANS_CORE_SEQ_NO - 核心响应流水
     */
    public String getTransCoreSeqNo() {
        return transCoreSeqNo;
    }

    /**
     * 设置核心响应流水
     *
     * @param transCoreSeqNo 核心响应流水
     */
    public void setTransCoreSeqNo(String transCoreSeqNo) {
        this.transCoreSeqNo = transCoreSeqNo == null ? null : transCoreSeqNo.trim();
    }

    /**
     * 获取核心日期
     *
     * @return TRANS_CORE_DATE - 核心日期
     */
    public Date getTransCoreDate() {
        return transCoreDate;
    }

    /**
     * 设置核心日期
     *
     * @param transCoreDate 核心日期
     */
    public void setTransCoreDate(Date transCoreDate) {
        this.transCoreDate = transCoreDate;
    }

    /**
     * 获取核心响应时间
     *
     * @return TRANS_CORE_DATE_TIME - 核心响应时间
     */
    public Date getTransCoreDateTime() {
        return transCoreDateTime;
    }

    /**
     * 设置核心响应时间
     *
     * @param transCoreDateTime 核心响应时间
     */
    public void setTransCoreDateTime(Date transCoreDateTime) {
        this.transCoreDateTime = transCoreDateTime;
    }

    /**
     * 获取核心响应码
     *
     * @return TRANS_CORE_RESP_CODE - 核心响应码
     */
    public String getTransCoreRespCode() {
        return transCoreRespCode;
    }

    /**
     * 设置核心响应码
     *
     * @param transCoreRespCode 核心响应码
     */
    public void setTransCoreRespCode(String transCoreRespCode) {
        this.transCoreRespCode = transCoreRespCode == null ? null : transCoreRespCode.trim();
    }

    /**
     * 获取核心响应码
     *
     * @return TRANS_CORE_RESP_MSG - 核心响应码
     */
    public String getTransCoreRespMsg() {
        return transCoreRespMsg;
    }

    /**
     * 设置核心响应码
     *
     * @param transCoreRespMsg 核心响应码
     */
    public void setTransCoreRespMsg(String transCoreRespMsg) {
        this.transCoreRespMsg = transCoreRespMsg == null ? null : transCoreRespMsg.trim();
    }

    /**
     * 获取通道响应流水
     *
     * @return TRANS_HOST_SEQ_NO - 通道响应流水
     */
    public String getTransHostSeqNo() {
        return transHostSeqNo;
    }

    /**
     * 设置通道响应流水
     *
     * @param transHostSeqNo 通道响应流水
     */
    public void setTransHostSeqNo(String transHostSeqNo) {
        this.transHostSeqNo = transHostSeqNo == null ? null : transHostSeqNo.trim();
    }

    /**
     * 获取通道响应日期
     *
     * @return TRANS_HOST_DATE - 通道响应日期
     */
    public Date getTransHostDate() {
        return transHostDate;
    }

    /**
     * 设置通道响应日期
     *
     * @param transHostDate 通道响应日期
     */
    public void setTransHostDate(Date transHostDate) {
        this.transHostDate = transHostDate;
    }

    /**
     * 获取通道响应时间
     *
     * @return TRANS_HOST_DATE_TIME - 通道响应时间
     */
    public Date getTransHostDateTime() {
        return transHostDateTime;
    }

    /**
     * 设置通道响应时间
     *
     * @param transHostDateTime 通道响应时间
     */
    public void setTransHostDateTime(Date transHostDateTime) {
        this.transHostDateTime = transHostDateTime;
    }

    /**
     * 获取通道响应码
     *
     * @return TRANS_HOST_RESP_CODE - 通道响应码
     */
    public String getTransHostRespCode() {
        return transHostRespCode;
    }

    /**
     * 设置通道响应码
     *
     * @param transHostRespCode 通道响应码
     */
    public void setTransHostRespCode(String transHostRespCode) {
        this.transHostRespCode = transHostRespCode == null ? null : transHostRespCode.trim();
    }

    /**
     * @return TRANS_HOST_RESP_MSG
     */
    public String getTransHostRespMsg() {
        return transHostRespMsg;
    }

    /**
     * @param transHostRespMsg
     */
    public void setTransHostRespMsg(String transHostRespMsg) {
        this.transHostRespMsg = transHostRespMsg == null ? null : transHostRespMsg.trim();
    }

    /**
     * 获取原交易流水
     *
     * @return ORG_TRANS_SEQ_NO - 原交易流水
     */
    public String getOrgTransSeqNo() {
        return orgTransSeqNo;
    }

    /**
     * 设置原交易流水
     *
     * @param orgTransSeqNo 原交易流水
     */
    public void setOrgTransSeqNo(String orgTransSeqNo) {
        this.orgTransSeqNo = orgTransSeqNo == null ? null : orgTransSeqNo.trim();
    }

    /**
     * 获取原交易日期
     *
     * @return ORG_TRANS_DATE - 原交易日期
     */
    public Date getOrgTransDate() {
        return orgTransDate;
    }

    /**
     * 设置原交易日期
     *
     * @param orgTransDate 原交易日期
     */
    public void setOrgTransDate(Date orgTransDate) {
        this.orgTransDate = orgTransDate;
    }

    /**
     * 获取原交易时间
     *
     * @return ORG_TRANS_DATE_TIME - 原交易时间
     */
    public Date getOrgTransDateTime() {
        return orgTransDateTime;
    }

    /**
     * 设置原交易时间
     *
     * @param orgTransDateTime 原交易时间
     */
    public void setOrgTransDateTime(Date orgTransDateTime) {
        this.orgTransDateTime = orgTransDateTime;
    }

    /**
     * 获取原商户流水
     *
     * @return ORG_TRANS_MER_SEQ_NO - 原商户流水
     */
    public String getOrgTransMerSeqNo() {
        return orgTransMerSeqNo;
    }

    /**
     * 设置原商户流水
     *
     * @param orgTransMerSeqNo 原商户流水
     */
    public void setOrgTransMerSeqNo(String orgTransMerSeqNo) {
        this.orgTransMerSeqNo = orgTransMerSeqNo == null ? null : orgTransMerSeqNo.trim();
    }

    /**
     * 获取原商户日期
     *
     * @return ORG_TRANS_MER_DATE - 原商户日期
     */
    public Date getOrgTransMerDate() {
        return orgTransMerDate;
    }

    /**
     * 设置原商户日期
     *
     * @param orgTransMerDate 原商户日期
     */
    public void setOrgTransMerDate(Date orgTransMerDate) {
        this.orgTransMerDate = orgTransMerDate;
    }

    /**
     * 获取原渠道流水
     *
     * @return ORG_TRANS_HOST_SEQ_NO - 原渠道流水
     */
    public String getOrgTransHostSeqNo() {
        return orgTransHostSeqNo;
    }

    /**
     * 设置原渠道流水
     *
     * @param orgTransHostSeqNo 原渠道流水
     */
    public void setOrgTransHostSeqNo(String orgTransHostSeqNo) {
        this.orgTransHostSeqNo = orgTransHostSeqNo == null ? null : orgTransHostSeqNo.trim();
    }

    /**
     * 获取原渠道日期
     *
     * @return ORG_TRANS_HOST_DATE - 原渠道日期
     */
    public Date getOrgTransHostDate() {
        return orgTransHostDate;
    }

    /**
     * 设置原渠道日期
     *
     * @param orgTransHostDate 原渠道日期
     */
    public void setOrgTransHostDate(Date orgTransHostDate) {
        this.orgTransHostDate = orgTransHostDate;
    }

    /**
     * 获取原渠道时间
     *
     * @return ORG_TRANS_HOST_DATE_TIME - 原渠道时间
     */
    public Date getOrgTransHostDateTime() {
        return orgTransHostDateTime;
    }

    /**
     * 设置原渠道时间
     *
     * @param orgTransHostDateTime 原渠道时间
     */
    public void setOrgTransHostDateTime(Date orgTransHostDateTime) {
        this.orgTransHostDateTime = orgTransHostDateTime;
    }

    /**
     * 获取二级商户号
     *
     * @return SUB_MER_ID - 二级商户号
     */
    public String getSubMerId() {
        return subMerId;
    }

    /**
     * 设置二级商户号
     *
     * @param subMerId 二级商户号
     */
    public void setSubMerId(String subMerId) {
        this.subMerId = subMerId == null ? null : subMerId.trim();
    }

    /**
     * 获取资金渠道
     *
     * @return FUND_CHANNEL - 资金渠道
     */
    public String getFundChannel() {
        return fundChannel;
    }

    /**
     * 设置资金渠道
     *
     * @param fundChannel 资金渠道
     */
    public void setFundChannel(String fundChannel) {
        this.fundChannel = fundChannel == null ? null : fundChannel.trim();
    }

    /**
     * 获取买家类型
     *
     * @return BUYER_USER_TYPE - 买家类型
     */
    public String getBuyerUserType() {
        return buyerUserType;
    }

    /**
     * 设置买家类型
     *
     * @param buyerUserType 买家类型
     */
    public void setBuyerUserType(String buyerUserType) {
        this.buyerUserType = buyerUserType == null ? null : buyerUserType.trim();
    }

    /**
     * 获取buyer_logon_id
     *
     * @return BUYER_LOGON_ID - buyer_logon_id
     */
    public String getBuyerLogonId() {
        return buyerLogonId;
    }

    /**
     * 设置buyer_logon_id
     *
     * @param buyerLogonId buyer_logon_id
     */
    public void setBuyerLogonId(String buyerLogonId) {
        this.buyerLogonId = buyerLogonId == null ? null : buyerLogonId.trim();
    }

    /**
     * 获取mer_wxid
     *
     * @return MER_WXID - mer_wxid
     */
    public String getMerWxid() {
        return merWxid;
    }

    /**
     * 设置mer_wxid
     *
     * @param merWxid mer_wxid
     */
    public void setMerWxid(String merWxid) {
        this.merWxid = merWxid == null ? null : merWxid.trim();
    }

    /**
     * 获取appid
     *
     * @return APPID - appid
     */
    public String getAppid() {
        return appid;
    }

    /**
     * 设置appid
     *
     * @param appid appid
     */
    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    /**
     * 获取openid
     *
     * @return OPENID - openid
     */
    public String getOpenid() {
        return openid;
    }

    /**
     * 设置openid
     *
     * @param openid openid
     */
    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    /**
     * 获取agent_id
     *
     * @return AGENT_ID - agent_id
     */
    public String getAgentId() {
        return agentId;
    }

    /**
     * 设置agent_id
     *
     * @param agentId agent_id
     */
    public void setAgentId(String agentId) {
        this.agentId = agentId == null ? null : agentId.trim();
    }

    /**
     * 获取cashier_id
     *
     * @return CASHIER_ID - cashier_id
     */
    public String getCashierId() {
        return cashierId;
    }

    /**
     * 设置cashier_id
     *
     * @param cashierId cashier_id
     */
    public void setCashierId(String cashierId) {
        this.cashierId = cashierId == null ? null : cashierId.trim();
    }

    /**
     * 获取cashier_name
     *
     * @return CASHIER_NAME - cashier_name
     */
    public String getCashierName() {
        return cashierName;
    }

    /**
     * 设置cashier_name
     *
     * @param cashierName cashier_name
     */
    public void setCashierName(String cashierName) {
        this.cashierName = cashierName == null ? null : cashierName.trim();
    }

    /**
     * 获取isvoicenotified
     *
     * @return ISVOICENOTIFIED - isvoicenotified
     */
    public String getIsvoicenotified() {
        return isvoicenotified;
    }

    /**
     * 设置isvoicenotified
     *
     * @param isvoicenotified isvoicenotified
     */
    public void setIsvoicenotified(String isvoicenotified) {
        this.isvoicenotified = isvoicenotified == null ? null : isvoicenotified.trim();
    }

    /**
     * 获取app_auth_token
     *
     * @return APP_AUTH_TOKEN - app_auth_token
     */
    public String getAppAuthToken() {
        return appAuthToken;
    }

    /**
     * 设置app_auth_token
     *
     * @param appAuthToken app_auth_token
     */
    public void setAppAuthToken(String appAuthToken) {
        this.appAuthToken = appAuthToken == null ? null : appAuthToken.trim();
    }

    /**
     * 获取terminal_id
     *
     * @return TERMINAL_ID - terminal_id
     */
    public String getTerminalId() {
        return terminalId;
    }

    /**
     * 设置terminal_id
     *
     * @param terminalId terminal_id
     */
    public void setTerminalId(String terminalId) {
        this.terminalId = terminalId == null ? null : terminalId.trim();
    }

    /**
     * 获取store_name
     *
     * @return STORE_NAME - store_name
     */
    public String getStoreName() {
        return storeName;
    }

    /**
     * 设置store_name
     *
     * @param storeName store_name
     */
    public void setStoreName(String storeName) {
        this.storeName = storeName == null ? null : storeName.trim();
    }

    /**
     * 获取store_id
     *
     * @return STORE_ID - store_id
     */
    public String getStoreId() {
        return storeId;
    }

    /**
     * 设置store_id
     *
     * @param storeId store_id
     */
    public void setStoreId(String storeId) {
        this.storeId = storeId == null ? null : storeId.trim();
    }

    /**
     * 获取账户余额
     *
     * @return ACCT_BLANCE - 账户余额
     */
    public BigDecimal getAcctBlance() {
        return acctBlance;
    }

    /**
     * 设置账户余额
     *
     * @param acctBlance 账户余额
     */
    public void setAcctBlance(BigDecimal acctBlance) {
        this.acctBlance = acctBlance;
    }

    /**
     * 获取订单编号
     *
     * @return ORDER_NO - 订单编号
     */
    public String getOrderNo() {
        return orderNo;
    }

    /**
     * 设置订单编号
     *
     * @param orderNo 订单编号
     */
    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    /**
     * 获取订单关键字
     *
     * @return SUBJECT - 订单关键字
     */
    public String getSubject() {
        return subject;
    }

    /**
     * 设置订单关键字
     *
     * @param subject 订单关键字
     */
    public void setSubject(String subject) {
        this.subject = subject == null ? null : subject.trim();
    }

    /**
     * 获取商品描述
     *
     * @return BODY - 商品描述
     */
    public String getBody() {
        return body;
    }

    /**
     * 设置商品描述
     *
     * @param body 商品描述
     */
    public void setBody(String body) {
        this.body = body == null ? null : body.trim();
    }

    /**
     * 获取预留1
     *
     * @return REMARK1 - 预留1
     */
    public String getRemark1() {
        return remark1;
    }

    /**
     * 设置预留1
     *
     * @param remark1 预留1
     */
    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    /**
     * 获取预留2
     *
     * @return REMARK2 - 预留2
     */
    public String getRemark2() {
        return remark2;
    }

    /**
     * 设置预留2
     *
     * @param remark2 预留2
     */
    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    /**
     * 获取预留3
     *
     * @return REMARK3 - 预留3
     */
    public String getRemark3() {
        return remark3;
    }

    /**
     * 设置预留3
     *
     * @param remark3 预留3
     */
    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }

    /**
     * 获取预留4
     *
     * @return REMARK4 - 预留4
     */
    public String getRemark4() {
        return remark4;
    }

    /**
     * 设置预留4
     *
     * @param remark4 预留4
     */
    public void setRemark4(String remark4) {
        this.remark4 = remark4 == null ? null : remark4.trim();
    }

    /**
     * 获取预留5
     *
     * @return REMARK5 - 预留5
     */
    public String getRemark5() {
        return remark5;
    }

    /**
     * 设置预留5
     *
     * @param remark5 预留5
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

	public String getAccNoTemp() {
		return accNoTemp;
	}

	public void setAccNoTemp(String accNoTemp) {
		this.accNoTemp = accNoTemp;
	}

	public String getPayAmt() {
		return payAmt;
	}

	public void setPayAmt(String payAmt) {
		this.payAmt = payAmt;
	}

	public String getRefundAmt() {
		return refundAmt;
	}

	public void setRefundAmt(String refundAmt) {
		this.refundAmt = refundAmt;
	}

	public String getTotalAmt() {
		return totalAmt;
	}

	public void setTotalAmt(String totalAmt) {
		this.totalAmt = totalAmt;
	}
}
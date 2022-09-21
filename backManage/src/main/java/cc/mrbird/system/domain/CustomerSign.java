package cc.mrbird.system.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ft_customer_sign_unionpay")
public class CustomerSign {
    /**
     * 商户号
     */
    @Id
    @Column(name = "MER_ID")
    private String merId;

    /**
     * 签约流水
     */
    @Id
    @Column(name = "SIGN_ID")
    private String signId;

    /**
     * 签约银行卡号
     */
    @Id
    @Column(name = "SIGN_ACCT_NO")
    private String signAcctNo;

    /**
     * token
     */
    @Column(name = "TOKEN")
    private String token;

    /**
     * 账户账号 借记转账帐号(可他行)
     */
    @Column(name = "CUST_ACCT_NO")
    private String custAcctNo;

    /**
     * 账户等级
     */
    @Column(name = "ACCT_LEVEL")
    private String acctLevel;

    /**
     * 账户类型
     */
    @Column(name = "ACCT_TYPE")
    private String acctType;

    /**
     * 柜面核身状态
     */
    @Column(name = "ACCT_CHECK_STATUS")
    private String acctCheckStatus;

    /**
     * 签约账户名称
     */
    @Column(name = "SIGN_ACCT_NAME")
    private String signAcctName;

    /**
     * 签约账户卡类型
     */
    @Column(name = "SIGN_ACCT_TYPE")
    private String signAcctType;

    /**
     * 签约账户卡等级
     */
    @Column(name = "SIGN_ACCT_LEVEL")
    private String signAcctLevel;

    /**
     * 预留手机号
     */
    @Column(name = "USER_MOBILE")
    private String userMobile;

    /**
     * 证件号码
     */
    @Column(name = "USER_CERT_NO")
    private String userCertNo;

    /**
     * 证件类型
     */
    @Column(name = "USER_CERT_TYPE")
    private String userCertType;

    /**
     * 证件有效期
     */
    @Column(name = "USER_CERT_EFFECT_DATE")
    private String userCertEffectDate;

    /**
     * 有效期
     */
    @Column(name = "VALIDATE_DATE")
    private String validateDate;

    /**
     * cvv2
     */
    @Column(name = "CVV2")
    private String cvv2;

    /**
     * 银行号
     */
    @Column(name = "BANK_ID")
    private String bankId;

    /**
     * 发起方机构标识
     */
    @Column(name = "SIGN_CHANNEL_ID")
    private String signChannelId;

    /**
     * 客户号
     */
    @Column(name = "MER_USER_ID")
    private String merUserId;

    /**
     * 签约日期
     */
    @Column(name = "SIGN_DATE")
    private String signDate;

    /**
     * 签约修改日期
     */
    @Column(name = "MODIFY_DATE")
    private String modifyDate;

    /**
     * 解约日期
     */
    @Column(name = "UNSIGN_DATE")
    private String unsignDate;

    /**
     * 签约状态:0：已签约1：已解约 2:预签约 3：初始状态(账户信息验证）
     */
    @Column(name = "SIGN_STATUS")
    private String signStatus;

    /**
     * 交易币种
     */
    @Column(name = "TRANS_CURRENCY")
    private String transCurrency;

    /**
     * 客户姓名
     */
    @Column(name = "USER_NAME")
    private String userName;

    /**
     * 机构号
     */
    @Column(name = "DEPARTMENT_ID")
    private String departmentId;

    /**
     * 银行名称
     */
    @Column(name = "BANK_NAME")
    private String bankName;

    /**
     * 支行id
     */
    @Column(name = "BRANCH_BANK_ID")
    private String branchBankId;

    /**
     * 支行名称
     */
    @Column(name = "BRANCH_BANK_NAME")
    private String branchBankName;

    /**
     * 支行城市名称
     */
    @Column(name = "BRANCH_CITY_NAME")
    private String branchCityName;

    /**
     * 0:本行 / 1:他行
     */
    @Column(name = "BANKFLAG")
    private String bankflag;

    /**
     * 短信关联码
     */
    @Column(name = "SMSKEY")
    private String smskey;

    /**
     * 验证码
     */
    @Column(name = "AUTH_MSG")
    private String authMsg;

    /**
     * 验证码发送时间
     */
    @Column(name = "MSG_SEND_DATETIME")
    private String msgSendDatetime;

    @Column(name = "MSG_SEND_TIMES")
    private String msgSendTimes;

    /**
     * 签约类型：00协议支付 02借记转账
     */
    @Column(name = "SIGN_TYPE")
    private String signType;

    /**
     * 验证位图
     */
    @Column(name = "VAL_BT_MP")
    private String valBtMp;

    @Column(name = "ORI_TRX_ID")
    private String oriTrxId;

    @Column(name = "IS_CHECKED")
    private String isChecked;

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
     * 获取签约流水
     *
     * @return SIGN_ID - 签约流水
     */
    public String getSignId() {
        return signId;
    }

    /**
     * 设置签约流水
     *
     * @param signId 签约流水
     */
    public void setSignId(String signId) {
        this.signId = signId == null ? null : signId.trim();
    }

    /**
     * 获取签约银行卡号
     *
     * @return SIGN_ACCT_NO - 签约银行卡号
     */
    public String getSignAcctNo() {
        return signAcctNo;
    }

    /**
     * 设置签约银行卡号
     *
     * @param signAcctNo 签约银行卡号
     */
    public void setSignAcctNo(String signAcctNo) {
        this.signAcctNo = signAcctNo == null ? null : signAcctNo.trim();
    }

    /**
     * 获取token
     *
     * @return TOKEN - token
     */
    public String getToken() {
        return token;
    }

    /**
     * 设置token
     *
     * @param token token
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * 获取账户账号 借记转账帐号(可他行)
     *
     * @return CUST_ACCT_NO - 账户账号 借记转账帐号(可他行)
     */
    public String getCustAcctNo() {
        return custAcctNo;
    }

    /**
     * 设置账户账号 借记转账帐号(可他行)
     *
     * @param custAcctNo 账户账号 借记转账帐号(可他行)
     */
    public void setCustAcctNo(String custAcctNo) {
        this.custAcctNo = custAcctNo == null ? null : custAcctNo.trim();
    }

    /**
     * 获取账户等级
     *
     * @return ACCT_LEVEL - 账户等级
     */
    public String getAcctLevel() {
        return acctLevel;
    }

    /**
     * 设置账户等级
     *
     * @param acctLevel 账户等级
     */
    public void setAcctLevel(String acctLevel) {
        this.acctLevel = acctLevel == null ? null : acctLevel.trim();
    }

    /**
     * 获取账户类型
     *
     * @return ACCT_TYPE - 账户类型
     */
    public String getAcctType() {
        return acctType;
    }

    /**
     * 设置账户类型
     *
     * @param acctType 账户类型
     */
    public void setAcctType(String acctType) {
        this.acctType = acctType == null ? null : acctType.trim();
    }

    /**
     * 获取柜面核身状态
     *
     * @return ACCT_CHECK_STATUS - 柜面核身状态
     */
    public String getAcctCheckStatus() {
        return acctCheckStatus;
    }

    /**
     * 设置柜面核身状态
     *
     * @param acctCheckStatus 柜面核身状态
     */
    public void setAcctCheckStatus(String acctCheckStatus) {
        this.acctCheckStatus = acctCheckStatus == null ? null : acctCheckStatus.trim();
    }

    /**
     * 获取签约账户名称
     *
     * @return SIGN_ACCT_NAME - 签约账户名称
     */
    public String getSignAcctName() {
        return signAcctName;
    }

    /**
     * 设置签约账户名称
     *
     * @param signAcctName 签约账户名称
     */
    public void setSignAcctName(String signAcctName) {
        this.signAcctName = signAcctName == null ? null : signAcctName.trim();
    }

    /**
     * 获取签约账户卡类型
     *
     * @return SIGN_ACCT_TYPE - 签约账户卡类型
     */
    public String getSignAcctType() {
        return signAcctType;
    }

    /**
     * 设置签约账户卡类型
     *
     * @param signAcctType 签约账户卡类型
     */
    public void setSignAcctType(String signAcctType) {
        this.signAcctType = signAcctType == null ? null : signAcctType.trim();
    }

    /**
     * 获取签约账户卡等级
     *
     * @return SIGN_ACCT_LEVEL - 签约账户卡等级
     */
    public String getSignAcctLevel() {
        return signAcctLevel;
    }

    /**
     * 设置签约账户卡等级
     *
     * @param signAcctLevel 签约账户卡等级
     */
    public void setSignAcctLevel(String signAcctLevel) {
        this.signAcctLevel = signAcctLevel == null ? null : signAcctLevel.trim();
    }

    /**
     * 获取预留手机号
     *
     * @return USER_MOBILE - 预留手机号
     */
    public String getUserMobile() {
        return userMobile;
    }

    /**
     * 设置预留手机号
     *
     * @param userMobile 预留手机号
     */
    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile == null ? null : userMobile.trim();
    }

    /**
     * 获取证件号码
     *
     * @return USER_CERT_NO - 证件号码
     */
    public String getUserCertNo() {
        return userCertNo;
    }

    /**
     * 设置证件号码
     *
     * @param userCertNo 证件号码
     */
    public void setUserCertNo(String userCertNo) {
        this.userCertNo = userCertNo == null ? null : userCertNo.trim();
    }

    /**
     * 获取证件类型
     *
     * @return USER_CERT_TYPE - 证件类型
     */
    public String getUserCertType() {
        return userCertType;
    }

    /**
     * 设置证件类型
     *
     * @param userCertType 证件类型
     */
    public void setUserCertType(String userCertType) {
        this.userCertType = userCertType == null ? null : userCertType.trim();
    }

    /**
     * 获取证件有效期
     *
     * @return USER_CERT_EFFECT_DATE - 证件有效期
     */
    public String getUserCertEffectDate() {
        return userCertEffectDate;
    }

    /**
     * 设置证件有效期
     *
     * @param userCertEffectDate 证件有效期
     */
    public void setUserCertEffectDate(String userCertEffectDate) {
        this.userCertEffectDate = userCertEffectDate;
    }

    /**
     * 获取有效期
     *
     * @return VALIDATE_DATE - 有效期
     */
    public String getValidateDate() {
        return validateDate;
    }

    /**
     * 设置有效期
     *
     * @param validateDate 有效期
     */
    public void setValidateDate(String validateDate) {
        this.validateDate = validateDate == null ? null : validateDate.trim();
    }

    /**
     * 获取cvv2
     *
     * @return CVV2 - cvv2
     */
    public String getCvv2() {
        return cvv2;
    }

    /**
     * 设置cvv2
     *
     * @param cvv2 cvv2
     */
    public void setCvv2(String cvv2) {
        this.cvv2 = cvv2 == null ? null : cvv2.trim();
    }

    /**
     * 获取银行号
     *
     * @return BANK_ID - 银行号
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * 设置银行号
     *
     * @param bankId 银行号
     */
    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    /**
     * 获取发起方机构标识
     *
     * @return SIGN_CHANNEL_ID - 发起方机构标识
     */
    public String getSignChannelId() {
        return signChannelId;
    }

    /**
     * 设置发起方机构标识
     *
     * @param signChannelId 发起方机构标识
     */
    public void setSignChannelId(String signChannelId) {
        this.signChannelId = signChannelId == null ? null : signChannelId.trim();
    }

    /**
     * 获取客户号
     *
     * @return MER_USER_ID - 客户号
     */
    public String getMerUserId() {
        return merUserId;
    }

    /**
     * 设置客户号
     *
     * @param merUserId 客户号
     */
    public void setMerUserId(String merUserId) {
        this.merUserId = merUserId == null ? null : merUserId.trim();
    }

    /**
     * 获取签约日期
     *
     * @return SIGN_DATE - 签约日期
     */
    public String getSignDate() {
        return signDate;
    }

    /**
     * 设置签约日期
     *
     * @param signDate 签约日期
     */
    public void setSignDate(String signDate) {
        this.signDate = signDate;
    }

    /**
     * 获取签约修改日期
     *
     * @return MODIFY_DATE - 签约修改日期
     */
    public String getModifyDate() {
        return modifyDate;
    }

    /**
     * 设置签约修改日期
     *
     * @param modifyDate 签约修改日期
     */
    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    /**
     * 获取解约日期
     *
     * @return UNSIGN_DATE - 解约日期
     */
    public String getUnsignDate() {
        return unsignDate;
    }

    /**
     * 设置解约日期
     *
     * @param unsignDate 解约日期
     */
    public void setUnsignDate(String unsignDate) {
        this.unsignDate = unsignDate;
    }

    /**
     * 获取签约状态:0：已签约1：已解约 2:预签约 3：初始状态(账户信息验证）
     *
     * @return SIGN_STATUS - 签约状态:0：已签约1：已解约 2:预签约 3：初始状态(账户信息验证）
     */
    public String getSignStatus() {
        return signStatus;
    }

    /**
     * 设置签约状态:0：已签约1：已解约 2:预签约 3：初始状态(账户信息验证）
     *
     * @param signStatus 签约状态:0：已签约1：已解约 2:预签约 3：初始状态(账户信息验证）
     */
    public void setSignStatus(String signStatus) {
        this.signStatus = signStatus == null ? null : signStatus.trim();
    }

    /**
     * 获取交易币种
     *
     * @return TRANS_CURRENCY - 交易币种
     */
    public String getTransCurrency() {
        return transCurrency;
    }

    /**
     * 设置交易币种
     *
     * @param transCurrency 交易币种
     */
    public void setTransCurrency(String transCurrency) {
        this.transCurrency = transCurrency == null ? null : transCurrency.trim();
    }

    /**
     * 获取客户姓名
     *
     * @return USER_NAME - 客户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置客户姓名
     *
     * @param userName 客户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取机构号
     *
     * @return DEPARTMENT_ID - 机构号
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置机构号
     *
     * @param departmentId 机构号
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    /**
     * 获取银行名称
     *
     * @return BANK_NAME - 银行名称
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置银行名称
     *
     * @param bankName 银行名称
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * 获取支行id
     *
     * @return BRANCH_BANK_ID - 支行id
     */
    public String getBranchBankId() {
        return branchBankId;
    }

    /**
     * 设置支行id
     *
     * @param branchBankId 支行id
     */
    public void setBranchBankId(String branchBankId) {
        this.branchBankId = branchBankId == null ? null : branchBankId.trim();
    }

    /**
     * 获取支行名称
     *
     * @return BRANCH_BANK_NAME - 支行名称
     */
    public String getBranchBankName() {
        return branchBankName;
    }

    /**
     * 设置支行名称
     *
     * @param branchBankName 支行名称
     */
    public void setBranchBankName(String branchBankName) {
        this.branchBankName = branchBankName == null ? null : branchBankName.trim();
    }

    /**
     * 获取支行城市名称
     *
     * @return BRANCH_CITY_NAME - 支行城市名称
     */
    public String getBranchCityName() {
        return branchCityName;
    }

    /**
     * 设置支行城市名称
     *
     * @param branchCityName 支行城市名称
     */
    public void setBranchCityName(String branchCityName) {
        this.branchCityName = branchCityName == null ? null : branchCityName.trim();
    }

    /**
     * 获取0:本行 / 1:他行
     *
     * @return BANKFLAG - 0:本行 / 1:他行
     */
    public String getBankflag() {
        return bankflag;
    }

    /**
     * 设置0:本行 / 1:他行
     *
     * @param bankflag 0:本行 / 1:他行
     */
    public void setBankflag(String bankflag) {
        this.bankflag = bankflag == null ? null : bankflag.trim();
    }

    /**
     * 获取短信关联码
     *
     * @return SMSKEY - 短信关联码
     */
    public String getSmskey() {
        return smskey;
    }

    /**
     * 设置短信关联码
     *
     * @param smskey 短信关联码
     */
    public void setSmskey(String smskey) {
        this.smskey = smskey == null ? null : smskey.trim();
    }

    /**
     * 获取验证码
     *
     * @return AUTH_MSG - 验证码
     */
    public String getAuthMsg() {
        return authMsg;
    }

    /**
     * 设置验证码
     *
     * @param authMsg 验证码
     */
    public void setAuthMsg(String authMsg) {
        this.authMsg = authMsg == null ? null : authMsg.trim();
    }

    /**
     * 获取验证码发送时间
     *
     * @return MSG_SEND_DATETIME - 验证码发送时间
     */
    public String getMsgSendDatetime() {
        return msgSendDatetime;
    }

    /**
     * 设置验证码发送时间
     *
     * @param msgSendDatetime 验证码发送时间
     */
    public void setMsgSendDatetime(String msgSendDatetime) {
        this.msgSendDatetime = msgSendDatetime;
    }

    /**
     * @return MSG_SEND_TIMES
     */
    public String getMsgSendTimes() {
        return msgSendTimes;
    }

    /**
     * @param msgSendTimes
     */
    public void setMsgSendTimes(String msgSendTimes) {
        this.msgSendTimes = msgSendTimes == null ? null : msgSendTimes.trim();
    }

    /**
     * 获取签约类型：00协议支付 02借记转账
     *
     * @return SIGN_TYPE - 签约类型：00协议支付 02借记转账
     */
    public String getSignType() {
        return signType;
    }

    /**
     * 设置签约类型：00协议支付 02借记转账
     *
     * @param signType 签约类型：00协议支付 02借记转账
     */
    public void setSignType(String signType) {
        this.signType = signType == null ? null : signType.trim();
    }

    /**
     * 获取验证位图
     *
     * @return VAL_BT_MP - 验证位图
     */
    public String getValBtMp() {
        return valBtMp;
    }

    /**
     * 设置验证位图
     *
     * @param valBtMp 验证位图
     */
    public void setValBtMp(String valBtMp) {
        this.valBtMp = valBtMp == null ? null : valBtMp.trim();
    }

    /**
     * @return ORI_TRX_ID
     */
    public String getOriTrxId() {
        return oriTrxId;
    }

    /**
     * @param oriTrxId
     */
    public void setOriTrxId(String oriTrxId) {
        this.oriTrxId = oriTrxId == null ? null : oriTrxId.trim();
    }

    /**
     * @return IS_CHECKED
     */
    public String getIsChecked() {
        return isChecked;
    }

    /**
     * @param isChecked
     */
    public void setIsChecked(String isChecked) {
        this.isChecked = isChecked == null ? null : isChecked.trim();
    }
}
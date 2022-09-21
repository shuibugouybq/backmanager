package cc.mrbird.system.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ft_mobilenopay_sign")
public class MobilenopaySign {
    /**
     * 签约流水
     */
    @Id
    @Column(name = "SIGN_ID")
    private String signId;

    /**
     * 预留手机号
     */
    @Column(name = "USER_MOBILE")
    private String userMobile;

    /**
     * 签约账户卡类型
     */
    @Column(name = "SIGN_ACCT_TYPE")
    private String signAcctType;

    /**
     * 绑定银行卡号
     */
    @Column(name = "SIGN_ACCT_NO")
    private String signAcctNo;

    /**
     * 证件类型
     */
    @Column(name = "USER_CERT_TYPE")
    private String userCertType;

    /**
     * 证件号码
     */
    @Column(name = "USER_CERT_NO")
    private String userCertNo;

    /**
     * 签约日期
     */
    @Column(name = "USER_OPEN_DATE")
    private Date userOpenDate;

    /**
     * 签约修改日期
     */
    @Column(name = "USER_MODIFY_DATE")
    private Date userModifyDate;

    /**
     * 解约日期
     */
    @Column(name = "USER_CLOSE_DATE")
    private Date userCloseDate;

    /**
     * 证件有效期
     */
    @Column(name = "USER_CERT_EFFECT_DATE")
    private Date userCertEffectDate;

    /**
     * 签约状态:0：已签约1：已解约
     */
    @Column(name = "SIGN_STATUS")
    private String signStatus;

    /**
     * cvv2
     */
    @Column(name = "CVV2")
    private String cvv2;

    /**
     * 有效期
     */
    @Column(name = "VALIDATE_DATE")
    private String validateDate;

    /**
     * 0:本行 / 1:他行
     */
    @Column(name = "BANKFLAG")
    private String bankflag;

    /**
     * 银行号
     */
    @Column(name = "BANK_ID")
    private String bankId;

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
     * 获取绑定银行卡号
     *
     * @return SIGN_ACCT_NO - 绑定银行卡号
     */
    public String getSignAcctNo() {
        return signAcctNo;
    }

    /**
     * 设置绑定银行卡号
     *
     * @param signAcctNo 绑定银行卡号
     */
    public void setSignAcctNo(String signAcctNo) {
        this.signAcctNo = signAcctNo == null ? null : signAcctNo.trim();
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
     * 获取签约日期
     *
     * @return USER_OPEN_DATE - 签约日期
     */
    public Date getUserOpenDate() {
        return userOpenDate;
    }

    /**
     * 设置签约日期
     *
     * @param userOpenDate 签约日期
     */
    public void setUserOpenDate(Date userOpenDate) {
        this.userOpenDate = userOpenDate;
    }

    /**
     * 获取签约修改日期
     *
     * @return USER_MODIFY_DATE - 签约修改日期
     */
    public Date getUserModifyDate() {
        return userModifyDate;
    }

    /**
     * 设置签约修改日期
     *
     * @param userModifyDate 签约修改日期
     */
    public void setUserModifyDate(Date userModifyDate) {
        this.userModifyDate = userModifyDate;
    }

    /**
     * 获取解约日期
     *
     * @return USER_CLOSE_DATE - 解约日期
     */
    public Date getUserCloseDate() {
        return userCloseDate;
    }

    /**
     * 设置解约日期
     *
     * @param userCloseDate 解约日期
     */
    public void setUserCloseDate(Date userCloseDate) {
        this.userCloseDate = userCloseDate;
    }

    /**
     * 获取证件有效期
     *
     * @return USER_CERT_EFFECT_DATE - 证件有效期
     */
    public Date getUserCertEffectDate() {
        return userCertEffectDate;
    }

    /**
     * 设置证件有效期
     *
     * @param userCertEffectDate 证件有效期
     */
    public void setUserCertEffectDate(Date userCertEffectDate) {
        this.userCertEffectDate = userCertEffectDate;
    }

    /**
     * 获取签约状态:0：已签约1：已解约
     *
     * @return SIGN_STATUS - 签约状态:0：已签约1：已解约
     */
    public String getSignStatus() {
        return signStatus;
    }

    /**
     * 设置签约状态:0：已签约1：已解约
     *
     * @param signStatus 签约状态:0：已签约1：已解约
     */
    public void setSignStatus(String signStatus) {
        this.signStatus = signStatus == null ? null : signStatus.trim();
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
}
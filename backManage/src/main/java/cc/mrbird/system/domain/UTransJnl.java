package cc.mrbird.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "union_trans_jnl")
public class UTransJnl {
    /**
     * 平台流水号
     */
    @Id
    @Column(name = "SEQ_NO")
    private String seqNo;

    /**
     * 商户号
     */
    @Id
    @Column(name = "MER_ID")
    private String merId;

    /**
     * 交易日期
     */
    @Id
    @Column(name = "TRANS_DATE")
    private Date transDate;

    /**
     * 交易时间
     */
    @Column(name = "TRANS_TIME")
    private Date transTime;

    /**
     * 交易类型
     */
    @Column(name = "TRX_TP")
    private String trxTp;

    /**
     * 业务类型
     */
    @Column(name = "BIZ_TP")
    private String bizTp;

    /**
     * 银联流水
     */
    @Column(name = "TRX_ID")
    private String trxId;

    /**
     * 银联时间
     */
    @Column(name = "TRX_DT_TM")
    private Date trxDtTm;

    /**
     * 银联日期
     */
    @Column(name = "TRX_DATE")
    private Date trxDate;

    /**
     * 结算日期
     */
    @Column(name = "SETTLMT_DT")
    private Date settlmtDt;

    /**
     * 收付标志
     */
    @Column(name = "RP_FLG")
    private String rpFlg;

    /**
     * 币种
     */
    @Column(name = "CURRENCY")
    private String currency;

    /**
     * 金额
     */
    @Column(name = "TRX_AMT")
    private BigDecimal trxAmt;

    /**
     * 收款机构编号
     */
    @Column(name = "RCVER_ACCT_ISSR_ID")
    private String rcverAcctIssrId;

    /**
     * 收款账户号
     */
    @Column(name = "RCVER_ACCT_ID")
    private String rcverAcctId;

    /**
     * 收款账户名称
     */
    @Column(name = "RCVER_NM")
    private String rcverNm;

    /**
     * 证件类型
     */
    @Column(name = "ID_TP")
    private String idTp;

    /**
     * 证件号码
     */
    @Column(name = "ID_NO")
    private String idNo;

    /**
     * 手机号
     */
    @Column(name = "MOB_NO")
    private String mobNo;

    /**
     * 账户等级
     */
    @Column(name = "ACCT_LVL")
    private String acctLvl;

    /**
     * 账户类型
     */
    @Column(name = "ACCT_TYPE")
    private String acctType;

    /**
     * 核身状态
     */
    @Column(name = "CHK_STAT")
    private String chkStat;

    /**
     * 短信验证码
     */
    @Column(name = "SMS_KEY")
    private String smsKey;

    /**
     * 签约协议号
     */
    @Column(name = "SGN_NO")
    private String sgnNo;

    /**
     * 银联返回码
     */
    @Column(name = "SYS_RTN_CD")
    private String sysRtnCd;

    /**
     * 银联返回时间
     */
    @Column(name = "SYS_RTN_TM")
    private Date sysRtnTm;

    /**
     * 交易状态
     */
    @Column(name = "TRX_STATUS")
    private String trxStatus;

    /**
     * 发起方机构号
     */
    @Column(name = "SDER_ISSR_ID")
    private String sderIssrId;

    /**
     * 发起方账户所属机构号
     */
    @Column(name = "SDERACCT_ISSR_ID")
    private String sderacctIssrId;

    /**
     * 原交易流水
     */
    @Column(name = "ORI_TRX_ID")
    private String oriTrxId;

    /**
     * 原交易日期
     */
    @Column(name = "ORI_TRX_DATE")
    private Date oriTrxDate;

    /**
     * 客户号
     */
    @Column(name = "CIF_NO")
    private String cifNo;

    /**
     * 机构号
     */
    @Column(name = "DEPT_ID")
    private String deptId;

    /**
     * 支付平台签约协议号
     */
    @Column(name = "SIGN_ID")
    private String signId;

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

    /**
     * 银联返回描述
     */
    @Column(name = "SYS_RTN_DESC")
    private String sysRtnDesc;

    @Transient
    private String beginDate;
    
    @Transient
    private String endDate;
    /**
     * 获取平台流水号
     *
     * @return SEQ_NO - 平台流水号
     */
    public String getSeqNo() {
        return seqNo;
    }

    /**
     * 设置平台流水号
     *
     * @param seqNo 平台流水号
     */
    public void setSeqNo(String seqNo) {
        this.seqNo = seqNo == null ? null : seqNo.trim();
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
     * 获取交易时间
     *
     * @return TRANS_TIME - 交易时间
     */
    public Date getTransTime() {
        return transTime;
    }

    /**
     * 设置交易时间
     *
     * @param transTime 交易时间
     */
    public void setTransTime(Date transTime) {
        this.transTime = transTime;
    }

    /**
     * 获取交易类型
     *
     * @return TRX_TP - 交易类型
     */
    public String getTrxTp() {
        return trxTp;
    }

    /**
     * 设置交易类型
     *
     * @param trxTp 交易类型
     */
    public void setTrxTp(String trxTp) {
        this.trxTp = trxTp == null ? null : trxTp.trim();
    }

    /**
     * 获取业务类型
     *
     * @return BIZ_TP - 业务类型
     */
    public String getBizTp() {
        return bizTp;
    }

    /**
     * 设置业务类型
     *
     * @param bizTp 业务类型
     */
    public void setBizTp(String bizTp) {
        this.bizTp = bizTp == null ? null : bizTp.trim();
    }

    /**
     * 获取银联流水
     *
     * @return TRX_ID - 银联流水
     */
    public String getTrxId() {
        return trxId;
    }

    /**
     * 设置银联流水
     *
     * @param trxId 银联流水
     */
    public void setTrxId(String trxId) {
        this.trxId = trxId == null ? null : trxId.trim();
    }

    /**
     * 获取银联时间
     *
     * @return TRX_DT_TM - 银联时间
     */
    public Date getTrxDtTm() {
        return trxDtTm;
    }

    /**
     * 设置银联时间
     *
     * @param trxDtTm 银联时间
     */
    public void setTrxDtTm(Date trxDtTm) {
        this.trxDtTm = trxDtTm;
    }

    /**
     * 获取银联日期
     *
     * @return TRX_DATE - 银联日期
     */
    public Date getTrxDate() {
        return trxDate;
    }

    /**
     * 设置银联日期
     *
     * @param trxDate 银联日期
     */
    public void setTrxDate(Date trxDate) {
        this.trxDate = trxDate;
    }

    /**
     * 获取结算日期
     *
     * @return SETTLMT_DT - 结算日期
     */
    public Date getSettlmtDt() {
        return settlmtDt;
    }

    /**
     * 设置结算日期
     *
     * @param settlmtDt 结算日期
     */
    public void setSettlmtDt(Date settlmtDt) {
        this.settlmtDt = settlmtDt;
    }

    /**
     * 获取收付标志
     *
     * @return RP_FLG - 收付标志
     */
    public String getRpFlg() {
        return rpFlg;
    }

    /**
     * 设置收付标志
     *
     * @param rpFlg 收付标志
     */
    public void setRpFlg(String rpFlg) {
        this.rpFlg = rpFlg == null ? null : rpFlg.trim();
    }

    /**
     * 获取币种
     *
     * @return CURRENCY - 币种
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 设置币种
     *
     * @param currency 币种
     */
    public void setCurrency(String currency) {
        this.currency = currency == null ? null : currency.trim();
    }

    /**
     * 获取金额
     *
     * @return TRX_AMT - 金额
     */
    public BigDecimal getTrxAmt() {
        return trxAmt;
    }

    /**
     * 设置金额
     *
     * @param trxAmt 金额
     */
    public void setTrxAmt(BigDecimal trxAmt) {
        this.trxAmt = trxAmt;
    }

    /**
     * 获取收款机构编号
     *
     * @return RCVER_ACCT_ISSR_ID - 收款机构编号
     */
    public String getRcverAcctIssrId() {
        return rcverAcctIssrId;
    }

    /**
     * 设置收款机构编号
     *
     * @param rcverAcctIssrId 收款机构编号
     */
    public void setRcverAcctIssrId(String rcverAcctIssrId) {
        this.rcverAcctIssrId = rcverAcctIssrId == null ? null : rcverAcctIssrId.trim();
    }

    /**
     * 获取收款账户号
     *
     * @return RCVER_ACCT_ID - 收款账户号
     */
    public String getRcverAcctId() {
        return rcverAcctId;
    }

    /**
     * 设置收款账户号
     *
     * @param rcverAcctId 收款账户号
     */
    public void setRcverAcctId(String rcverAcctId) {
        this.rcverAcctId = rcverAcctId == null ? null : rcverAcctId.trim();
    }

    /**
     * 获取收款账户名称
     *
     * @return RCVER_NM - 收款账户名称
     */
    public String getRcverNm() {
        return rcverNm;
    }

    /**
     * 设置收款账户名称
     *
     * @param rcverNm 收款账户名称
     */
    public void setRcverNm(String rcverNm) {
        this.rcverNm = rcverNm == null ? null : rcverNm.trim();
    }

    /**
     * 获取证件类型
     *
     * @return ID_TP - 证件类型
     */
    public String getIdTp() {
        return idTp;
    }

    /**
     * 设置证件类型
     *
     * @param idTp 证件类型
     */
    public void setIdTp(String idTp) {
        this.idTp = idTp == null ? null : idTp.trim();
    }

    /**
     * 获取证件号码
     *
     * @return ID_NO - 证件号码
     */
    public String getIdNo() {
        return idNo;
    }

    /**
     * 设置证件号码
     *
     * @param idNo 证件号码
     */
    public void setIdNo(String idNo) {
        this.idNo = idNo == null ? null : idNo.trim();
    }

    /**
     * 获取手机号
     *
     * @return MOB_NO - 手机号
     */
    public String getMobNo() {
        return mobNo;
    }

    /**
     * 设置手机号
     *
     * @param mobNo 手机号
     */
    public void setMobNo(String mobNo) {
        this.mobNo = mobNo == null ? null : mobNo.trim();
    }

    /**
     * 获取账户等级
     *
     * @return ACCT_LVL - 账户等级
     */
    public String getAcctLvl() {
        return acctLvl;
    }

    /**
     * 设置账户等级
     *
     * @param acctLvl 账户等级
     */
    public void setAcctLvl(String acctLvl) {
        this.acctLvl = acctLvl == null ? null : acctLvl.trim();
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
     * 获取核身状态
     *
     * @return CHK_STAT - 核身状态
     */
    public String getChkStat() {
        return chkStat;
    }

    /**
     * 设置核身状态
     *
     * @param chkStat 核身状态
     */
    public void setChkStat(String chkStat) {
        this.chkStat = chkStat == null ? null : chkStat.trim();
    }

    /**
     * 获取短信验证码
     *
     * @return SMS_KEY - 短信验证码
     */
    public String getSmsKey() {
        return smsKey;
    }

    /**
     * 设置短信验证码
     *
     * @param smsKey 短信验证码
     */
    public void setSmsKey(String smsKey) {
        this.smsKey = smsKey == null ? null : smsKey.trim();
    }

    /**
     * 获取签约协议号
     *
     * @return SGN_NO - 签约协议号
     */
    public String getSgnNo() {
        return sgnNo;
    }

    /**
     * 设置签约协议号
     *
     * @param sgnNo 签约协议号
     */
    public void setSgnNo(String sgnNo) {
        this.sgnNo = sgnNo == null ? null : sgnNo.trim();
    }

    /**
     * 获取银联返回码
     *
     * @return SYS_RTN_CD - 银联返回码
     */
    public String getSysRtnCd() {
        return sysRtnCd;
    }

    /**
     * 设置银联返回码
     *
     * @param sysRtnCd 银联返回码
     */
    public void setSysRtnCd(String sysRtnCd) {
        this.sysRtnCd = sysRtnCd == null ? null : sysRtnCd.trim();
    }

    /**
     * 获取银联返回时间
     *
     * @return SYS_RTN_TM - 银联返回时间
     */
    public Date getSysRtnTm() {
        return sysRtnTm;
    }

    /**
     * 设置银联返回时间
     *
     * @param sysRtnTm 银联返回时间
     */
    public void setSysRtnTm(Date sysRtnTm) {
        this.sysRtnTm = sysRtnTm;
    }

    /**
     * 获取交易状态
     *
     * @return TRX_STATUS - 交易状态
     */
    public String getTrxStatus() {
        return trxStatus;
    }

    /**
     * 设置交易状态
     *
     * @param trxStatus 交易状态
     */
    public void setTrxStatus(String trxStatus) {
        this.trxStatus = trxStatus == null ? null : trxStatus.trim();
    }

    /**
     * 获取发起方机构号
     *
     * @return SDER_ISSR_ID - 发起方机构号
     */
    public String getSderIssrId() {
        return sderIssrId;
    }

    /**
     * 设置发起方机构号
     *
     * @param sderIssrId 发起方机构号
     */
    public void setSderIssrId(String sderIssrId) {
        this.sderIssrId = sderIssrId == null ? null : sderIssrId.trim();
    }

    /**
     * 获取发起方账户所属机构号
     *
     * @return SDERACCT_ISSR_ID - 发起方账户所属机构号
     */
    public String getSderacctIssrId() {
        return sderacctIssrId;
    }

    /**
     * 设置发起方账户所属机构号
     *
     * @param sderacctIssrId 发起方账户所属机构号
     */
    public void setSderacctIssrId(String sderacctIssrId) {
        this.sderacctIssrId = sderacctIssrId == null ? null : sderacctIssrId.trim();
    }

    /**
     * 获取原交易流水
     *
     * @return ORI_TRX_ID - 原交易流水
     */
    public String getOriTrxId() {
        return oriTrxId;
    }

    /**
     * 设置原交易流水
     *
     * @param oriTrxId 原交易流水
     */
    public void setOriTrxId(String oriTrxId) {
        this.oriTrxId = oriTrxId == null ? null : oriTrxId.trim();
    }

    /**
     * 获取原交易日期
     *
     * @return ORI_TRX_DATE - 原交易日期
     */
    public Date getOriTrxDate() {
        return oriTrxDate;
    }

    /**
     * 设置原交易日期
     *
     * @param oriTrxDate 原交易日期
     */
    public void setOriTrxDate(Date oriTrxDate) {
        this.oriTrxDate = oriTrxDate;
    }

    /**
     * 获取客户号
     *
     * @return CIF_NO - 客户号
     */
    public String getCifNo() {
        return cifNo;
    }

    /**
     * 设置客户号
     *
     * @param cifNo 客户号
     */
    public void setCifNo(String cifNo) {
        this.cifNo = cifNo == null ? null : cifNo.trim();
    }

    /**
     * 获取机构号
     *
     * @return DEPT_ID - 机构号
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * 设置机构号
     *
     * @param deptId 机构号
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }

    /**
     * 获取支付平台签约协议号
     *
     * @return SIGN_ID - 支付平台签约协议号
     */
    public String getSignId() {
        return signId;
    }

    /**
     * 设置支付平台签约协议号
     *
     * @param signId 支付平台签约协议号
     */
    public void setSignId(String signId) {
        this.signId = signId == null ? null : signId.trim();
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

    /**
     * 获取银联返回描述
     *
     * @return SYS_RTN_DESC - 银联返回描述
     */
    public String getSysRtnDesc() {
        return sysRtnDesc;
    }

    /**
     * 设置银联返回描述
     *
     * @param sysRtnDesc 银联返回描述
     */
    public void setSysRtnDesc(String sysRtnDesc) {
        this.sysRtnDesc = sysRtnDesc == null ? null : sysRtnDesc.trim();
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
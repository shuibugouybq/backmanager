package cc.mrbird.system.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ft_user_transctrl")
public class UserTransctrl {
    /**
     * 账号
     */
    @Id
    @Column(name = "USER_ACCT_NO")
    private String userAcctNo;

    /**
     * 交易码
     */
    @Id
    @Column(name = "TRANS_ID")
    private String transId;

    /**
     * 客户号
     */
    @Column(name = "USER_CIF_NO")
    private String userCifNo;

    /**
     * 渠道号
     */
    @Column(name = "CHANNEL_ID")
    private String channelId;

    /**
     * 单笔限额
     */
    @Column(name = "USERTC_PER_TRANS_LIMIT")
    private String usertcPerTransLimit;

    /**
     * 单日限额
     */
    @Column(name = "USERTC_PER_DAY_LITMIT")
    private String usertcPerDayLitmit;

    /**
     * 单日交易额
     */
    @Column(name = "USERTC_DAY_AMT")
    private String usertcDayAmt;

    /**
     * 最后交易日期
     */
    @Column(name = "USERTC_DAY_AMT_DATE")
    private Date usertcDayAmtDate;

    /**
     * 单月限额
     */
    @Column(name = "USERTC_PER_MONTH_LIMIT")
    private String usertcPerMonthLimit;

    /**
     * 当月交易金额
     */
    @Column(name = "USERTC_MONTH_AMT")
    private String usertcMonthAmt;

    /**
     * 上比交易月份
     */
    @Column(name = "USERTC_MONTH_AMT_DATE")
    private String usertcMonthAmtDate;

    /**
     * 年交易限额
     */
    @Column(name = "USERTC_PER_YEAR_LIMIT")
    private String usertcPerYearLimit;

    /**
     * 当年交易额
     */
    @Column(name = "USERTC_YEAR_AMT")
    private String usertcYearAmt;

    /**
     * 上比交易年份
     */
    @Column(name = "USERTC_YEAR_AMT_DATE")
    private String usertcYearAmtDate;

    /**
     * 创建日期
     */
    @Column(name = "USERTC_OPEN_DATE")
    private Date usertcOpenDate;

    /**
     * 最后修改日期
     */
    @Column(name = "USERTC_MODIFY_DATE")
    private Date usertcModifyDate;

    @Column(name = "USERTC_CLOSE_DATE")
    private Date usertcCloseDate;

    /**
     * 创建用户
     */
    @Column(name = "USERTC_OPEN_USER")
    private String usertcOpenUser;

    /**
     * 修改用户
     */
    @Column(name = "USERTC_MODIFY_USER")
    private String usertcModifyUser;

    @Column(name = "USERTC_CLOSE_USER")
    private String usertcCloseUser;

    /**
     * 获取账号
     *
     * @return USER_ACCT_NO - 账号
     */
    public String getUserAcctNo() {
        return userAcctNo;
    }

    /**
     * 设置账号
     *
     * @param userAcctNo 账号
     */
    public void setUserAcctNo(String userAcctNo) {
        this.userAcctNo = userAcctNo == null ? null : userAcctNo.trim();
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
     * 获取客户号
     *
     * @return USER_CIF_NO - 客户号
     */
    public String getUserCifNo() {
        return userCifNo;
    }

    /**
     * 设置客户号
     *
     * @param userCifNo 客户号
     */
    public void setUserCifNo(String userCifNo) {
        this.userCifNo = userCifNo == null ? null : userCifNo.trim();
    }

    /**
     * 获取渠道号
     *
     * @return CHANNEL_ID - 渠道号
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * 设置渠道号
     *
     * @param channelId 渠道号
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    /**
     * 获取单笔限额
     *
     * @return USERTC_PER_TRANS_LIMIT - 单笔限额
     */
    public String getUsertcPerTransLimit() {
        return usertcPerTransLimit;
    }

    /**
     * 设置单笔限额
     *
     * @param usertcPerTransLimit 单笔限额
     */
    public void setUsertcPerTransLimit(String usertcPerTransLimit) {
        this.usertcPerTransLimit = usertcPerTransLimit;
    }

    /**
     * 获取单日限额
     *
     * @return USERTC_PER_DAY_LITMIT - 单日限额
     */
    public String getUsertcPerDayLitmit() {
        return usertcPerDayLitmit;
    }

    /**
     * 设置单日限额
     *
     * @param usertcPerDayLitmit 单日限额
     */
    public void setUsertcPerDayLitmit(String usertcPerDayLitmit) {
        this.usertcPerDayLitmit = usertcPerDayLitmit;
    }

    /**
     * 获取单日交易额
     *
     * @return USERTC_DAY_AMT - 单日交易额
     */
    public String getUsertcDayAmt() {
        return usertcDayAmt;
    }

    /**
     * 设置单日交易额
     *
     * @param usertcDayAmt 单日交易额
     */
    public void setUsertcDayAmt(String usertcDayAmt) {
        this.usertcDayAmt = usertcDayAmt;
    }

    /**
     * 获取最后交易日期
     *
     * @return USERTC_DAY_AMT_DATE - 最后交易日期
     */
    public Date getUsertcDayAmtDate() {
        return usertcDayAmtDate;
    }

    /**
     * 设置最后交易日期
     *
     * @param usertcDayAmtDate 最后交易日期
     */
    public void setUsertcDayAmtDate(Date usertcDayAmtDate) {
        this.usertcDayAmtDate = usertcDayAmtDate;
    }

    /**
     * 获取单月限额
     *
     * @return USERTC_PER_MONTH_LIMIT - 单月限额
     */
    public String getUsertcPerMonthLimit() {
        return usertcPerMonthLimit;
    }

    /**
     * 设置单月限额
     *
     * @param usertcPerMonthLimit 单月限额
     */
    public void setUsertcPerMonthLimit(String usertcPerMonthLimit) {
        this.usertcPerMonthLimit = usertcPerMonthLimit;
    }

    /**
     * 获取当月交易金额
     *
     * @return USERTC_MONTH_AMT - 当月交易金额
     */
    public String getUsertcMonthAmt() {
        return usertcMonthAmt;
    }

    /**
     * 设置当月交易金额
     *
     * @param usertcMonthAmt 当月交易金额
     */
    public void setUsertcMonthAmt(String usertcMonthAmt) {
        this.usertcMonthAmt = usertcMonthAmt;
    }

    /**
     * 获取上比交易月份
     *
     * @return USERTC_MONTH_AMT_DATE - 上比交易月份
     */
    public String getUsertcMonthAmtDate() {
        return usertcMonthAmtDate;
    }

    /**
     * 设置上比交易月份
     *
     * @param usertcMonthAmtDate 上比交易月份
     */
    public void setUsertcMonthAmtDate(String usertcMonthAmtDate) {
        this.usertcMonthAmtDate = usertcMonthAmtDate == null ? null : usertcMonthAmtDate.trim();
    }

    /**
     * 获取年交易限额
     *
     * @return USERTC_PER_YEAR_LIMIT - 年交易限额
     */
    public String getUsertcPerYearLimit() {
        return usertcPerYearLimit;
    }

    /**
     * 设置年交易限额
     *
     * @param usertcPerYearLimit 年交易限额
     */
    public void setUsertcPerYearLimit(String usertcPerYearLimit) {
        this.usertcPerYearLimit = usertcPerYearLimit;
    }

    /**
     * 获取当年交易额
     *
     * @return USERTC_YEAR_AMT - 当年交易额
     */
    public String getUsertcYearAmt() {
        return usertcYearAmt;
    }

    /**
     * 设置当年交易额
     *
     * @param usertcYearAmt 当年交易额
     */
    public void setUsertcYearAmt(String usertcYearAmt) {
        this.usertcYearAmt = usertcYearAmt;
    }

    /**
     * 获取上比交易年份
     *
     * @return USERTC_YEAR_AMT_DATE - 上比交易年份
     */
    public String getUsertcYearAmtDate() {
        return usertcYearAmtDate;
    }

    /**
     * 设置上比交易年份
     *
     * @param usertcYearAmtDate 上比交易年份
     */
    public void setUsertcYearAmtDate(String usertcYearAmtDate) {
        this.usertcYearAmtDate = usertcYearAmtDate == null ? null : usertcYearAmtDate.trim();
    }

    /**
     * 获取创建日期
     *
     * @return USERTC_OPEN_DATE - 创建日期
     */
    public Date getUsertcOpenDate() {
        return usertcOpenDate;
    }

    /**
     * 设置创建日期
     *
     * @param usertcOpenDate 创建日期
     */
    public void setUsertcOpenDate(Date usertcOpenDate) {
        this.usertcOpenDate = usertcOpenDate;
    }

    /**
     * 获取最后修改日期
     *
     * @return USERTC_MODIFY_DATE - 最后修改日期
     */
    public Date getUsertcModifyDate() {
        return usertcModifyDate;
    }

    /**
     * 设置最后修改日期
     *
     * @param usertcModifyDate 最后修改日期
     */
    public void setUsertcModifyDate(Date usertcModifyDate) {
        this.usertcModifyDate = usertcModifyDate;
    }

    /**
     * @return USERTC_CLOSE_DATE
     */
    public Date getUsertcCloseDate() {
        return usertcCloseDate;
    }

    /**
     * @param usertcCloseDate
     */
    public void setUsertcCloseDate(Date usertcCloseDate) {
        this.usertcCloseDate = usertcCloseDate;
    }

    /**
     * 获取创建用户
     *
     * @return USERTC_OPEN_USER - 创建用户
     */
    public String getUsertcOpenUser() {
        return usertcOpenUser;
    }

    /**
     * 设置创建用户
     *
     * @param usertcOpenUser 创建用户
     */
    public void setUsertcOpenUser(String usertcOpenUser) {
        this.usertcOpenUser = usertcOpenUser == null ? null : usertcOpenUser.trim();
    }

    /**
     * 获取修改用户
     *
     * @return USERTC_MODIFY_USER - 修改用户
     */
    public String getUsertcModifyUser() {
        return usertcModifyUser;
    }

    /**
     * 设置修改用户
     *
     * @param usertcModifyUser 修改用户
     */
    public void setUsertcModifyUser(String usertcModifyUser) {
        this.usertcModifyUser = usertcModifyUser == null ? null : usertcModifyUser.trim();
    }

    /**
     * @return USERTC_CLOSE_USER
     */
    public String getUsertcCloseUser() {
        return usertcCloseUser;
    }

    /**
     * @param usertcCloseUser
     */
    public void setUsertcCloseUser(String usertcCloseUser) {
        this.usertcCloseUser = usertcCloseUser == null ? null : usertcCloseUser.trim();
    }
}
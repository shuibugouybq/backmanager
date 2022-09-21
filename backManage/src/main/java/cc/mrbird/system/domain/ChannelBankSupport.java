package cc.mrbird.system.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "ft_channel_bank_support")
public class ChannelBankSupport {
    /**
     * 中金快捷 银联代扣 支付宝快捷等
     */
    @Id
    @Column(name = "CHANNEL_ID")
    private String channelId;

    /**
     * 通道业务 00鉴权，01签约，02快捷，03代收，04代付
     */
    @Id
    @Column(name = "CHANNEL_TYPE")
    private String channelType;

    /**
     * 行号
     */
    @Id
    @Column(name = "BANK_ID")
    private String bankId;

    /**
     * 联行号
     */
    @Column(name = "CNAPS")
    private String cnaps;

    /**
     * 支持的卡类型
     */
    @Column(name = "CARD_TYPE_SUPPORTED")
    private String cardTypeSupported;

    /**
     * 单日限额
     */
    @Column(name = "DAY_LIMIT")
    private BigDecimal dayLimit;

    /**
     * 单笔限额
     */
    @Column(name = "PER_LIMIT")
    private BigDecimal perLimit;

    /**
     * 年限额
     */
    @Column(name = "YEAR_LIMIT")
    private BigDecimal yearLimit;

    /**
     * 0:关闭 1:开启 2:维护中
     */
    @Column(name = "OPEN_FLAG")
    private String openFlag;

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
     * 获取中金快捷 银联代扣 支付宝快捷等
     *
     * @return CHANNEL_ID - 中金快捷 银联代扣 支付宝快捷等
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * 设置中金快捷 银联代扣 支付宝快捷等
     *
     * @param channelId 中金快捷 银联代扣 支付宝快捷等
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    /**
     * 获取通道业务 00鉴权，01签约，02快捷，03代收，04代付
     *
     * @return CHANNEL_TYPE - 通道业务 00鉴权，01签约，02快捷，03代收，04代付
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * 设置通道业务 00鉴权，01签约，02快捷，03代收，04代付
     *
     * @param channelType 通道业务 00鉴权，01签约，02快捷，03代收，04代付
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }

    /**
     * 获取行号
     *
     * @return BANK_ID - 行号
     */
    public String getBankId() {
        return bankId;
    }

    /**
     * 设置行号
     *
     * @param bankId 行号
     */
    public void setBankId(String bankId) {
        this.bankId = bankId == null ? null : bankId.trim();
    }

    /**
     * 获取联行号
     *
     * @return CNAPS - 联行号
     */
    public String getCnaps() {
        return cnaps;
    }

    /**
     * 设置联行号
     *
     * @param cnaps 联行号
     */
    public void setCnaps(String cnaps) {
        this.cnaps = cnaps == null ? null : cnaps.trim();
    }

    /**
     * 获取支持的卡类型
     *
     * @return CARD_TYPE_SUPPORTED - 支持的卡类型
     */
    public String getCardTypeSupported() {
        return cardTypeSupported;
    }

    /**
     * 设置支持的卡类型
     *
     * @param cardTypeSupported 支持的卡类型
     */
    public void setCardTypeSupported(String cardTypeSupported) {
        this.cardTypeSupported = cardTypeSupported == null ? null : cardTypeSupported.trim();
    }

    /**
     * 获取单日限额
     *
     * @return DAY_LIMIT - 单日限额
     */
    public BigDecimal getDayLimit() {
        return dayLimit;
    }

    /**
     * 设置单日限额
     *
     * @param dayLimit 单日限额
     */
    public void setDayLimit(BigDecimal dayLimit) {
        this.dayLimit = dayLimit;
    }

    /**
     * 获取单笔限额
     *
     * @return PER_LIMIT - 单笔限额
     */
    public BigDecimal getPerLimit() {
        return perLimit;
    }

    /**
     * 设置单笔限额
     *
     * @param perLimit 单笔限额
     */
    public void setPerLimit(BigDecimal perLimit) {
        this.perLimit = perLimit;
    }

    /**
     * 获取年限额
     *
     * @return YEAR_LIMIT - 年限额
     */
    public BigDecimal getYearLimit() {
        return yearLimit;
    }

    /**
     * 设置年限额
     *
     * @param yearLimit 年限额
     */
    public void setYearLimit(BigDecimal yearLimit) {
        this.yearLimit = yearLimit;
    }

    /**
     * 获取0:关闭 1:开启 2:维护中
     *
     * @return OPEN_FLAG - 0:关闭 1:开启 2:维护中
     */
    public String getOpenFlag() {
        return openFlag;
    }

    /**
     * 设置0:关闭 1:开启 2:维护中
     *
     * @param openFlag 0:关闭 1:开启 2:维护中
     */
    public void setOpenFlag(String openFlag) {
        this.openFlag = openFlag == null ? null : openFlag.trim();
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
}
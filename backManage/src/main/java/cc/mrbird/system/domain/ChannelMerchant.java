package cc.mrbird.system.domain;

import javax.persistence.*;

@Table(name = "ft_channel_merchant")
public class ChannelMerchant {
    /**
     * 系统自动产生
     */
    @Id
    @Column(name = "MER_ID")
    private String merId;

    /**
     * 银行号
     */
    @Id
    @Column(name = "BANK_ID")
    private String bankId;

    /**
     * 商户状态 0－正常
1-冻结
2－销户
系统默认为1

     */
    @Column(name = "MER_STATUS")
    private String merStatus;

    /**
     * 指定路由的编码
     */
    @Column(name = "CHANNEL_ID")
    private String channelId;

    /**
     * 指定通道业务
     */
    @Column(name = "CHANNEL_TYPE")
    private String channelType;

    /**
     * 获取系统自动产生
     *
     * @return MER_ID - 系统自动产生
     */
    public String getMerId() {
        return merId;
    }

    /**
     * 设置系统自动产生
     *
     * @param merId 系统自动产生
     */
    public void setMerId(String merId) {
        this.merId = merId == null ? null : merId.trim();
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
     * 获取商户状态 0－正常
1-冻结
2－销户
系统默认为1

     *
     * @return MER_STATUS - 商户状态 0－正常
1-冻结
2－销户
系统默认为1

     */
    public String getMerStatus() {
        return merStatus;
    }

    /**
     * 设置商户状态 0－正常
1-冻结
2－销户
系统默认为1

     *
     * @param merStatus 商户状态 0－正常
1-冻结
2－销户
系统默认为1

     */
    public void setMerStatus(String merStatus) {
        this.merStatus = merStatus == null ? null : merStatus.trim();
    }

    /**
     * 获取指定路由的编码
     *
     * @return CHANNEL_ID - 指定路由的编码
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * 设置指定路由的编码
     *
     * @param channelId 指定路由的编码
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    /**
     * 获取指定通道业务
     *
     * @return CHANNEL_TYPE - 指定通道业务
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * 设置指定通道业务
     *
     * @param channelType 指定通道业务
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }
}
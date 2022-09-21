package cc.mrbird.system.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "ft_channel_result")
public class ChannelResult {
    /**
     * 指定通道业务 与交易表trans_type一致
     */
    @Id
    @Column(name = "CHANNEL_TYPE")
    private String channelType;

    /**
     * 渠道号:00-核心;01贷记卡核心;02-中金支付等
     */
    @Id
    @Column(name = "CHANNEL_ID")
    private String channelId;

    /**
     * 分数
     */
    @Column(name = "ITEM_SCORE")
    private String itemScore;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_DATE_TIME")
    private Date updateDateTime;

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
     * 获取指定通道业务 与交易表trans_type一致
     *
     * @return CHANNEL_TYPE - 指定通道业务 与交易表trans_type一致
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * 设置指定通道业务 与交易表trans_type一致
     *
     * @param channelType 指定通道业务 与交易表trans_type一致
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }

    /**
     * 获取渠道号:00-核心;01贷记卡核心;02-中金支付等
     *
     * @return CHANNEL_ID - 渠道号:00-核心;01贷记卡核心;02-中金支付等
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * 设置渠道号:00-核心;01贷记卡核心;02-中金支付等
     *
     * @param channelId 渠道号:00-核心;01贷记卡核心;02-中金支付等
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    /**
     * 获取分数
     *
     * @return ITEM_SCORE - 分数
     */
    public String getItemScore() {
        return itemScore;
    }

    /**
     * 设置分数
     *
     * @param itemScore 分数
     */
    public void setItemScore(String itemScore) {
        this.itemScore = itemScore;
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_DATE_TIME - 更新时间
     */
    public Date getUpdateDateTime() {
        return updateDateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateDateTime 更新时间
     */
    public void setUpdateDateTime(Date updateDateTime) {
        this.updateDateTime = updateDateTime;
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
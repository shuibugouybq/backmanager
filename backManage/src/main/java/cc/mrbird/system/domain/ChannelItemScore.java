package cc.mrbird.system.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "ft_channel_item_score")
public class ChannelItemScore {
    /**
     * 打分类型
     */
    @Id
    @Column(name = "SCORE_TYPE")
    private String scoreType;

    /**
     * 通道号:00-核心;01贷记卡核心;02-中金支付等
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
     * 通道时间
     */
    @Column(name = "CHANNEL_DATE_TIME")
    private String channelDateTime;

    /**
     * 通道得分
     */
    @Column(name = "FRACTIONS")
    private String fractions;

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
     * 获取打分类型
     *
     * @return SCORE_TYPE - 打分类型
     */
    public String getScoreType() {
        return scoreType;
    }

    /**
     * 设置打分类型
     *
     * @param scoreType 打分类型
     */
    public void setScoreType(String scoreType) {
        this.scoreType = scoreType == null ? null : scoreType.trim();
    }

    /**
     * 获取通道号:00-核心;01贷记卡核心;02-中金支付等
     *
     * @return CHANNEL_ID - 通道号:00-核心;01贷记卡核心;02-中金支付等
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * 设置通道号:00-核心;01贷记卡核心;02-中金支付等
     *
     * @param channelId 通道号:00-核心;01贷记卡核心;02-中金支付等
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
     * 获取通道时间
     *
     * @return CHANNEL_DATE_TIME - 通道时间
     */
    public String getChannelDateTime() {
        return channelDateTime;
    }

    /**
     * 设置通道时间
     *
     * @param channelDateTime 通道时间
     */
    public void setChannelDateTime(String channelDateTime) {
        this.channelDateTime = channelDateTime;
    }

    /**
     * 获取通道得分
     *
     * @return FRACTIONS - 通道得分
     */
    public String getFractions() {
        return fractions;
    }

    /**
     * 设置通道得分
     *
     * @param fractions 通道得分
     */
    public void setFractions(String fractions) {
        this.fractions = fractions;
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
package cc.mrbird.system.domain;

import javax.persistence.*;

@Table(name = "ft_channel_pay_type")
public class ChannelPayType {
    /**
     * 通道号 00-核心;01贷记卡核心;02-中金支付等
     */
    @Id
    @Column(name = "CHANNEL_ID")
    private String channelId;

    /**
     * 通道业务 00代表签约，01绑定协议，02代收，03代付
     */
    @Column(name = "CHANNEL_TYPE")
    private String channelType;

    /**
     * 通道业务名称
     */
    @Column(name = "CHANNEL_NAME")
    private String channelName;

    /**
     * 通道开放起始时间
     */
    @Column(name = "CHANNEL_BEGIN_TIME")
    private String channelBeginTime;

    /**
     * 通道开放结束时间
     */
    @Column(name = "CHANNEL_END_TIME")
    private String channelEndTime;

    /**
     * 支持银行卡类型  D表示借记卡C代表贷记卡，倘若均支持用|隔开
     */
    @Column(name = "CARD_TYPE")
    private String cardType;

    /**
     * 支持的地区，不写默认是全国
     */
    @Column(name = "AREA")
    private String area;

    /**
     * 优先级 0：最高1高2中3低
     */
    @Column(name = "PRIORITY")
    private String priority;

    /**
     * 支持银行列表  用|隔开支持的银行，存银行的卡bin
     */
    @Column(name = "BANK_LIST")
    private String bankList;

    /**
     * 获取通道号 00-核心;01贷记卡核心;02-中金支付等
     *
     * @return CHANNEL_ID - 通道号 00-核心;01贷记卡核心;02-中金支付等
     */
    public String getChannelId() {
        return channelId;
    }

    /**
     * 设置通道号 00-核心;01贷记卡核心;02-中金支付等
     *
     * @param channelId 通道号 00-核心;01贷记卡核心;02-中金支付等
     */
    public void setChannelId(String channelId) {
        this.channelId = channelId == null ? null : channelId.trim();
    }

    /**
     * 获取通道业务 00代表签约，01绑定协议，02代收，03代付
     *
     * @return CHANNEL_TYPE - 通道业务 00代表签约，01绑定协议，02代收，03代付
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * 设置通道业务 00代表签约，01绑定协议，02代收，03代付
     *
     * @param channelType 通道业务 00代表签约，01绑定协议，02代收，03代付
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }

    /**
     * 获取通道业务名称
     *
     * @return CHANNEL_NAME - 通道业务名称
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * 设置通道业务名称
     *
     * @param channelName 通道业务名称
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    /**
     * 获取通道开放起始时间
     *
     * @return CHANNEL_BEGIN_TIME - 通道开放起始时间
     */
    public String getChannelBeginTime() {
        return channelBeginTime;
    }

    /**
     * 设置通道开放起始时间
     *
     * @param channelBeginTime 通道开放起始时间
     */
    public void setChannelBeginTime(String channelBeginTime) {
        this.channelBeginTime = channelBeginTime;
    }

    /**
     * 获取通道开放结束时间
     *
     * @return CHANNEL_END_TIME - 通道开放结束时间
     */
    public String getChannelEndTime() {
        return channelEndTime;
    }

    /**
     * 设置通道开放结束时间
     *
     * @param channelEndTime 通道开放结束时间
     */
    public void setChannelEndTime(String channelEndTime) {
        this.channelEndTime = channelEndTime;
    }

    /**
     * 获取支持银行卡类型  D表示借记卡C代表贷记卡，倘若均支持用|隔开
     *
     * @return CARD_TYPE - 支持银行卡类型  D表示借记卡C代表贷记卡，倘若均支持用|隔开
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * 设置支持银行卡类型  D表示借记卡C代表贷记卡，倘若均支持用|隔开
     *
     * @param cardType 支持银行卡类型  D表示借记卡C代表贷记卡，倘若均支持用|隔开
     */
    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    /**
     * 获取支持的地区，不写默认是全国
     *
     * @return AREA - 支持的地区，不写默认是全国
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置支持的地区，不写默认是全国
     *
     * @param area 支持的地区，不写默认是全国
     */
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    /**
     * 获取优先级 0：最高1高2中3低
     *
     * @return PRIORITY - 优先级 0：最高1高2中3低
     */
    public String getPriority() {
        return priority;
    }

    /**
     * 设置优先级 0：最高1高2中3低
     *
     * @param priority 优先级 0：最高1高2中3低
     */
    public void setPriority(String priority) {
        this.priority = priority == null ? null : priority.trim();
    }

    /**
     * 获取支持银行列表  用|隔开支持的银行，存银行的卡bin
     *
     * @return BANK_LIST - 支持银行列表  用|隔开支持的银行，存银行的卡bin
     */
    public String getBankList() {
        return bankList;
    }

    /**
     * 设置支持银行列表  用|隔开支持的银行，存银行的卡bin
     *
     * @param bankList 支持银行列表  用|隔开支持的银行，存银行的卡bin
     */
    public void setBankList(String bankList) {
        this.bankList = bankList == null ? null : bankList.trim();
    }
}
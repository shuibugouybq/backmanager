package cc.mrbird.system.domain;

import javax.persistence.*;

@Table(name = "ft_channel")
public class ChannelInfo {
    /**
     * 中金快捷 银联代扣 支付宝快捷等
     */
    @Id
    @Column(name = "CHANNEL_ID")
    private String channelId;

    /**
     * 支持的业务，00代表签约，01绑定协议，02代收，03代付，04快捷支付
     */
    @Id
    @Column(name = "CHANNEL_TYPE")
    private String channelType;

    /**
     * core  unionpay 
     */
    @Column(name = "PARENT_CHANNEL_ID")
    private String parentChannelId;

    /**
     * 通道状态 0：开通
1：关闭

     */
    @Column(name = "CHANNEL_STATUS")
    private String channelStatus;

    /**
     * 通道名称
     */
    @Column(name = "CHANNEL_NAME")
    private String channelName;

    /**
     * 通道描述
     */
    @Column(name = "CHANNEL_DESC")
    private String channelDesc;

    /**
     * 通道IP地址列表
     */
    @Column(name = "CHANNEL_IP_LIST")
    private String channelIpList;

    /**
     * 开通日期
     */
    @Column(name = "CHANNEL_OPEN_DATE")
    private String channelOpenDate;

    /**
     * 开通人
     */
    @Column(name = "CHANNEL_OPEN_USER")
    private String channelOpenUser;

    /**
     * 关闭日期
     */
    @Column(name = "CHANNEL_CLOSE_DATE")
    private String channelCloseDate;

    /**
     * 关闭人
     */
    @Column(name = "CHANNEL_CLOSE_USER")
    private String channelCloseUser;

    /**
     * 修改日期
     */
    @Column(name = "CHANNEL_MODIFY_DATE")
    private String channelModifyDate;

    /**
     * 修改人
     */
    @Column(name = "CHANNEL_MODIFY_USER")
    private String channelModifyUser;

    /**
     * 到帐时效
     */
    @Column(name = "CHANNEL_ARR_DATE")
    private String channelArrDate;

    /**
     * 结算周期 T,T+1
     */
    @Column(name = "SETTLE_TIME")
    private String settleTime;

    @Column(name = "REMARK1")
    private String remark1;

    @Column(name = "REMARK2")
    private String remark2;

    @Column(name = "REMARK3")
    private String remark3;

    @Column(name = "REMARK4")
    private String remark4;

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
     * 获取支持的业务，00代表签约，01绑定协议，02代收，03代付，04快捷支付
     *
     * @return CHANNEL_TYPE - 支持的业务，00代表签约，01绑定协议，02代收，03代付，04快捷支付
     */
    public String getChannelType() {
        return channelType;
    }

    /**
     * 设置支持的业务，00代表签约，01绑定协议，02代收，03代付，04快捷支付
     *
     * @param channelType 支持的业务，00代表签约，01绑定协议，02代收，03代付，04快捷支付
     */
    public void setChannelType(String channelType) {
        this.channelType = channelType == null ? null : channelType.trim();
    }

    /**
     * 获取core  unionpay 
     *
     * @return PARENT_CHANNEL_ID - core  unionpay 
     */
    public String getParentChannelId() {
        return parentChannelId;
    }

    /**
     * 设置core  unionpay 
     *
     * @param parentChannelId core  unionpay 
     */
    public void setParentChannelId(String parentChannelId) {
        this.parentChannelId = parentChannelId == null ? null : parentChannelId.trim();
    }

    /**
     * 获取通道状态 0：开通
1：关闭

     *
     * @return CHANNEL_STATUS - 通道状态 0：开通
1：关闭

     */
    public String getChannelStatus() {
        return channelStatus;
    }

    /**
     * 设置通道状态 0：开通
1：关闭

     *
     * @param channelStatus 通道状态 0：开通
1：关闭

     */
    public void setChannelStatus(String channelStatus) {
        this.channelStatus = channelStatus == null ? null : channelStatus.trim();
    }

    /**
     * 获取通道名称
     *
     * @return CHANNEL_NAME - 通道名称
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * 设置通道名称
     *
     * @param channelName 通道名称
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName == null ? null : channelName.trim();
    }

    /**
     * 获取通道描述
     *
     * @return CHANNEL_DESC - 通道描述
     */
    public String getChannelDesc() {
        return channelDesc;
    }

    /**
     * 设置通道描述
     *
     * @param channelDesc 通道描述
     */
    public void setChannelDesc(String channelDesc) {
        this.channelDesc = channelDesc == null ? null : channelDesc.trim();
    }

    /**
     * 获取通道IP地址列表
     *
     * @return CHANNEL_IP_LIST - 通道IP地址列表
     */
    public String getChannelIpList() {
        return channelIpList;
    }

    /**
     * 设置通道IP地址列表
     *
     * @param channelIpList 通道IP地址列表
     */
    public void setChannelIpList(String channelIpList) {
        this.channelIpList = channelIpList == null ? null : channelIpList.trim();
    }

    /**
     * 获取开通日期
     *
     * @return CHANNEL_OPEN_DATE - 开通日期
     */
    public String getChannelOpenDate() {
        return channelOpenDate;
    }

    /**
     * 设置开通日期
     *
     * @param channelOpenDate 开通日期
     */
    public void setChannelOpenDate(String channelOpenDate) {
        this.channelOpenDate = channelOpenDate == null ? null : channelOpenDate.trim();
    }

    /**
     * 获取开通人
     *
     * @return CHANNEL_OPEN_USER - 开通人
     */
    public String getChannelOpenUser() {
        return channelOpenUser;
    }

    /**
     * 设置开通人
     *
     * @param channelOpenUser 开通人
     */
    public void setChannelOpenUser(String channelOpenUser) {
        this.channelOpenUser = channelOpenUser == null ? null : channelOpenUser.trim();
    }

    /**
     * 获取关闭日期
     *
     * @return CHANNEL_CLOSE_DATE - 关闭日期
     */
    public String getChannelCloseDate() {
        return channelCloseDate;
    }

    /**
     * 设置关闭日期
     *
     * @param channelCloseDate 关闭日期
     */
    public void setChannelCloseDate(String channelCloseDate) {
        this.channelCloseDate = channelCloseDate == null ? null : channelCloseDate.trim();
    }

    /**
     * 获取关闭人
     *
     * @return CHANNEL_CLOSE_USER - 关闭人
     */
    public String getChannelCloseUser() {
        return channelCloseUser;
    }

    /**
     * 设置关闭人
     *
     * @param channelCloseUser 关闭人
     */
    public void setChannelCloseUser(String channelCloseUser) {
        this.channelCloseUser = channelCloseUser == null ? null : channelCloseUser.trim();
    }

    /**
     * 获取修改日期
     *
     * @return CHANNEL_MODIFY_DATE - 修改日期
     */
    public String getChannelModifyDate() {
        return channelModifyDate;
    }

    /**
     * 设置修改日期
     *
     * @param channelModifyDate 修改日期
     */
    public void setChannelModifyDate(String channelModifyDate) {
        this.channelModifyDate = channelModifyDate == null ? null : channelModifyDate.trim();
    }

    /**
     * 获取修改人
     *
     * @return CHANNEL_MODIFY_USER - 修改人
     */
    public String getChannelModifyUser() {
        return channelModifyUser;
    }

    /**
     * 设置修改人
     *
     * @param channelModifyUser 修改人
     */
    public void setChannelModifyUser(String channelModifyUser) {
        this.channelModifyUser = channelModifyUser == null ? null : channelModifyUser.trim();
    }

    /**
     * 获取到帐时效
     *
     * @return CHANNEL_ARR_DATE - 到帐时效
     */
    public String getChannelArrDate() {
        return channelArrDate;
    }

    /**
     * 设置到帐时效
     *
     * @param channelArrDate 到帐时效
     */
    public void setChannelArrDate(String channelArrDate) {
        this.channelArrDate = channelArrDate == null ? null : channelArrDate.trim();
    }

    /**
     * 获取结算周期 T,T+1
     *
     * @return SETTLE_TIME - 结算周期 T,T+1
     */
    public String getSettleTime() {
        return settleTime;
    }

    /**
     * 设置结算周期 T,T+1
     *
     * @param settleTime 结算周期 T,T+1
     */
    public void setSettleTime(String settleTime) {
        this.settleTime = settleTime == null ? null : settleTime.trim();
    }

    /**
     * @return REMARK1
     */
    public String getRemark1() {
        return remark1;
    }

    /**
     * @param remark1
     */
    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    /**
     * @return REMARK2
     */
    public String getRemark2() {
        return remark2;
    }

    /**
     * @param remark2
     */
    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    /**
     * @return REMARK3
     */
    public String getRemark3() {
        return remark3;
    }

    /**
     * @param remark3
     */
    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }

    /**
     * @return REMARK4
     */
    public String getRemark4() {
        return remark4;
    }

    /**
     * @param remark4
     */
    public void setRemark4(String remark4) {
        this.remark4 = remark4 == null ? null : remark4.trim();
    }

    /**
     * @return REMARK5
     */
    public String getRemark5() {
        return remark5;
    }

    /**
     * @param remark5
     */
    public void setRemark5(String remark5) {
        this.remark5 = remark5 == null ? null : remark5.trim();
    }
}
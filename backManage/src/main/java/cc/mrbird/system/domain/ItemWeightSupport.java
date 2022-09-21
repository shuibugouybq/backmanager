package cc.mrbird.system.domain;

import javax.persistence.*;

@Table(name = "ft_item_weight")
public class ItemWeightSupport {
    /**
     * id
     */
    @Id
    @Column(name = "ID")
    private String id;

    /**
     * 通道 00-核心;01贷记卡核心;02-中金支付等
     */
    @Id
    @Column(name = "CHANNEL_ID")
    private String channelId;

    /**
     * 服务项id
     */
    @Column(name = "ITEM_ID")
    private String itemId;

    /**
     * 百分比
     */
    @Column(name = "ITEM_WEIGHT")
    private String itemWeight;

    /**
     * 默认分数
     */
    @Column(name = "SCORE")
    private String score;

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
     * 获取id
     *
     * @return ID - id
     */
    public String getId() {
		return id;
	}
    /**
     * 设置	id
     *
     * @param id id
     */
	public void setId(String id) {
		this.id = id;
	}
	/**
     * 获取通道  00-核心;01贷记卡核心;02-中金支付等
     *
     * @return CHANNEL_ID - 通道  00-核心;01贷记卡核心;02-中金支付等
     */
	public String getChannelId() {
		return channelId;
	}
    /**
     * 设置通道  00-核心;01贷记卡核心;02-中金支付等
     *
     * @param channelId 通道  00-核心;01贷记卡核心;02-中金支付等
     */
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	/**
     * 获取服务项id
     *
     * @return ITEM_ID - 服务项id
     */
	public String getItemId() {
		return itemId;
	}
    /**
     * 设置服务项id
     *
     * @param itemId 服务项id
     */
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	/**
     * 获取百分比
     *
     * @return ITEM_WEIGHT - 百分比
     */
	public String getItemWeight() {
		return itemWeight;
	}
    /**
     * 设置百分比行号
     *
     * @param itemWeight 百分比
     */
	public void setItemWeight(String itemWeight) {
		this.itemWeight = itemWeight;
	}
	/**
     * 获取默认分数
     *
     * @return SCORE - 默认分数
     */
	public String getScore() {
		return score;
	}
    /**
     * 设置默认分数
     *
     * @param score 默认分数
     */
	public void setScore(String score) {
		this.score = score;
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
		this.remark1 = remark1;
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
		this.remark2 = remark2;
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
		this.remark3 = remark3;
	}
	/**
     * 获取预留4	
     *
     * @return REMARK4 - 预留4	行号
     */
	public String getRemark4() {
		return remark4;
	}
    /**
     * 设置预留4	行号
     *
     * @param remark4  预留4	
     */
	public void setRemark4(String remark4) {
		this.remark4 = remark4;
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
		this.remark5 = remark5;
	}

}
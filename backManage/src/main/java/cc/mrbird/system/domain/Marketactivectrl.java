package cc.mrbird.system.domain;

import javax.persistence.*;

@Table(name = "market_active_ctrl")
public class Marketactivectrl {
    /**
     *营销活动ID
     */
    @Id
    @Column(name = "MARKETACTIVEID")
    private String marketActiveID;

    /**
     * 用户卡类型
     */
    @Id
    @Column(name = "USERCARDTYPCD")
    private String userCardTypCd;

    /**
     * 卡等级
     */
    @Column(name = "CARDRANK")
    private String cardRank;

    /**
     * 支付产品
     */
    @Column(name = "PAYPRODUCT")
    private String payProduct;

    /**
     * 渠道
     */
    @Column(name = "CHANNELNBR")
    private String channelNBR;

	public String getMarketActiveID() {
		return marketActiveID;
	}

	public void setMarketActiveID(String marketActiveID) {
		this.marketActiveID = marketActiveID;
	}

	public String getUserCardTypCd() {
		return userCardTypCd;
	}

	public void setUserCardTypCd(String userCardTypCd) {
		this.userCardTypCd = userCardTypCd;
	}

	public String getCardRank() {
		return cardRank;
	}

	public void setCardRank(String cardRank) {
		this.cardRank = cardRank;
	}

	public String getPayProduct() {
		return payProduct;
	}

	public void setPayProduct(String payProduct) {
		this.payProduct = payProduct;
	}

	public String getChannelNBR() {
		return channelNBR;
	}

	public void setChannelNBR(String channelNBR) {
		this.channelNBR = channelNBR;
	}

    
    

//    /**
//     * 预留1
//     */
//    @Column(name = "REMARK1")
//    private String remark1;
//
//    /**
//     * 预留2
//     */
//    @Column(name = "REMARK2")
//    private String remark2;
//
//    /**
//     * 预留3
//     */
//    @Column(name = "REMARK3")
//    private String remark3;


//	public String getRemark1() {
//		return remark1;
//	}
//
//	public void setRemark1(String remark1) {
//		this.remark1 = remark1;
//	}
//
//	public String getRemark2() {
//		return remark2;
//	}
//
//	public void setRemark2(String remark2) {
//		this.remark2 = remark2;
//	}
//
//	public String getRemark3() {
//		return remark3;
//	}
//
//	public void setRemark3(String remark3) {
//		this.remark3 = remark3;
//	}

   
}
package cc.mrbird.system.domain;

import javax.persistence.*;

@Table(name = "market_ingactivities_rule")
public class MarketingActivitiesRule {
    /**
     *营销活动ID
     */
    @Id
    @Column(name = "MARKETACTIVEID")
    private String marketActiveID;

    /**
     * 商户号
     */
    @Column(name = "MERNBR")
    private String merNBR;

    /**
     * 门店号
     */
    @Column(name = "SHOPNUMBER")
    private String shopNumber;

    /**
     * 商品号
     */
    @Column(name = "PRODUCTID")
    private String productId;

    /**
     * 营销活动名称
     */
    @Column(name = "MARKETACTIVENAME")
    private String marketActiveName;
    
    /**
     * 营销活动类型
     */
    @Column(name = "MARKETACTIVETYPE")
    private String marketActiveType;
    
//    /**
//     * 营销费用成本方？？？没找到
//     */
//    @Column(name = "CHANNELNBR")
//    private String channelNBR;
    
    /**
     * 营销活动开始时间
     */
    @Column(name = "MARKETACTIVESTARTDATE")
    private String marketActivesStartDate;
    
    /**
     * 营销活动结束时间
     */
    @Column(name = "MARKETACTIVEENDDATE")
    private String marketActivesEndDate;

	public String getMarketActiveID() {
		return marketActiveID;
	}

	public void setMarketActiveID(String marketActiveID) {
		this.marketActiveID = marketActiveID;
	}

	public String getMerNBR() {
		return merNBR;
	}

	public void setMerNBR(String merNBR) {
		this.merNBR = merNBR;
	}

	public String getShopNumber() {
		return shopNumber;
	}

	public void setShopNumber(String shopNumber) {
		this.shopNumber = shopNumber;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getMarketActiveName() {
		return marketActiveName;
	}

	public void setMarketActiveName(String marketActiveName) {
		this.marketActiveName = marketActiveName;
	}

	public String getMarketActiveType() {
		return marketActiveType;
	}

	public void setMarketActiveType(String marketActiveType) {
		this.marketActiveType = marketActiveType;
	}

	public String getMarketActivesStartDate() {
		return marketActivesStartDate;
	}

	public void setMarketActivesStartDate(String marketActivesStartDate) {
		this.marketActivesStartDate = marketActivesStartDate;
	}

	public String getMarketActivesEndDate() {
		return marketActivesEndDate;
	}

	public void setMarketActivesEndDate(String marketActivesEndDate) {
		this.marketActivesEndDate = marketActivesEndDate;
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
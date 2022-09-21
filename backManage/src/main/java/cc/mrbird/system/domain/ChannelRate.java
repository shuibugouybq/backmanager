package cc.mrbird.system.domain;

import java.math.BigDecimal;
import javax.persistence.*;

@Table(name = "ft_channel_rate")
public class ChannelRate {
    /**
     * 编号
     */
    @Id
    @Column(name = "RATE_ID")
    private String rateId;

    /**
     * 第三方公司编号
     */
    @Column(name = "COMPANY_ID")
    private String companyId;

    /**
     * 第三方公司名称
     */
    @Column(name = "COMPANY_NAME")
    private String companyName;

    /**
     * 1.网上支付、
2.pos、
3.预付卡...

     */
    @Column(name = "RATE_PAYMENT")
    private String ratePayment;

    /**
     * 单笔和总额的金额体现
     */
    @Column(name = "RATE_AMOUNT")
    private BigDecimal rateAmount;

    /**
     * 1.每笔
2.总笔
1.每笔
2.总笔

     */
    @Column(name = "RATE_UNIT")
    private String rateUnit;

    /**
     * 收费标准
     */
    @Column(name = "PRICE")
    private String price;

    /**
     * 单笔费率
     */
    @Column(name = "SINGLE_RATE")
    private String singleRate;

    /**
     * 总额费率
     */
    @Column(name = "ALL_RATE")
    private String allRate;

    /**
     * 阶梯费率1
     */
    @Column(name = "LADDER_PRICE1")
    private String ladderPrice1;

    /**
     * 阶梯费率区间1
     */
    @Column(name = "LADDER_INTERVAL1")
    private String ladderInterval1;

    /**
     * 阶梯费率2
     */
    @Column(name = "LADDER_PRICE2")
    private String ladderPrice2;

    /**
     * 阶梯费率区间2
     */
    @Column(name = "LADDER_INTERVAL2")
    private String ladderInterval2;

    /**
     * 阶梯费率3
     */
    @Column(name = "LADDER_PRICE3")
    private String ladderPrice3;

    /**
     * 阶梯费率区间3
     */
    @Column(name = "LADDER_INTERVAL3")
    private String ladderInterval3;

    /**
     * 阶梯费率4
     */
    @Column(name = "LADDER_PRICE4")
    private String ladderPrice4;

    /**
     * 阶梯费率区间4
     */
    @Column(name = "LADDER_INTERVAL4")
    private String ladderInterval4;

    /**
     * 阶梯费率5
     */
    @Column(name = "LADDER_PRICE5")
    private String ladderPrice5;

    /**
     * 阶梯费率区间5
     */
    @Column(name = "LADDER_INTERVAL5")
    private String ladderInterval5;

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
     * 获取编号
     *
     * @return RATE_ID - 编号
     */
    public String getRateId() {
        return rateId;
    }

    /**
     * 设置编号
     *
     * @param rateId 编号
     */
    public void setRateId(String rateId) {
        this.rateId = rateId == null ? null : rateId.trim();
    }

    /**
     * 获取第三方公司编号
     *
     * @return COMPANY_ID - 第三方公司编号
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * 设置第三方公司编号
     *
     * @param companyId 第三方公司编号
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    /**
     * 获取第三方公司名称
     *
     * @return COMPANY_NAME - 第三方公司名称
     */
    public String getCompanyName() {
        return companyName;
    }

    /**
     * 设置第三方公司名称
     *
     * @param companyName 第三方公司名称
     */
    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    /**
     * 获取1.网上支付、
2.pos、
3.预付卡...

     *
     * @return RATE_PAYMENT - 1.网上支付、
2.pos、
3.预付卡...

     */
    public String getRatePayment() {
        return ratePayment;
    }

    /**
     * 设置1.网上支付、
2.pos、
3.预付卡...

     *
     * @param ratePayment 1.网上支付、
2.pos、
3.预付卡...

     */
    public void setRatePayment(String ratePayment) {
        this.ratePayment = ratePayment == null ? null : ratePayment.trim();
    }

    /**
     * 获取单笔和总额的金额体现
     *
     * @return RATE_AMOUNT - 单笔和总额的金额体现
     */
    public BigDecimal getRateAmount() {
        return rateAmount;
    }

    /**
     * 设置单笔和总额的金额体现
     *
     * @param rateAmount 单笔和总额的金额体现
     */
    public void setRateAmount(BigDecimal rateAmount) {
        this.rateAmount = rateAmount;
    }

    /**
     * 获取1.每笔
2.总笔
1.每笔
2.总笔

     *
     * @return RATE_UNIT - 1.每笔
2.总笔
1.每笔
2.总笔

     */
    public String getRateUnit() {
        return rateUnit;
    }

    /**
     * 设置1.每笔
2.总笔
1.每笔
2.总笔

     *
     * @param rateUnit 1.每笔
2.总笔
1.每笔
2.总笔

     */
    public void setRateUnit(String rateUnit) {
        this.rateUnit = rateUnit == null ? null : rateUnit.trim();
    }

    /**
     * 获取收费标准
     *
     * @return PRICE - 收费标准
     */
    public String getPrice() {
        return price;
    }

    /**
     * 设置收费标准
     *
     * @param price 收费标准
     */
    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    /**
     * 获取单笔费率
     *
     * @return SINGLE_RATE - 单笔费率
     */
    public String getSingleRate() {
        return singleRate;
    }

    /**
     * 设置单笔费率
     *
     * @param singleRate 单笔费率
     */
    public void setSingleRate(String singleRate) {
        this.singleRate = singleRate == null ? null : singleRate.trim();
    }

    /**
     * 获取总额费率
     *
     * @return ALL_RATE - 总额费率
     */
    public String getAllRate() {
        return allRate;
    }

    /**
     * 设置总额费率
     *
     * @param allRate 总额费率
     */
    public void setAllRate(String allRate) {
        this.allRate = allRate == null ? null : allRate.trim();
    }

    /**
     * 获取阶梯费率1
     *
     * @return LADDER_PRICE1 - 阶梯费率1
     */
    public String getLadderPrice1() {
        return ladderPrice1;
    }

    /**
     * 设置阶梯费率1
     *
     * @param ladderPrice1 阶梯费率1
     */
    public void setLadderPrice1(String ladderPrice1) {
        this.ladderPrice1 = ladderPrice1 == null ? null : ladderPrice1.trim();
    }

    /**
     * 获取阶梯费率区间1
     *
     * @return LADDER_INTERVAL1 - 阶梯费率区间1
     */
    public String getLadderInterval1() {
        return ladderInterval1;
    }

    /**
     * 设置阶梯费率区间1
     *
     * @param ladderInterval1 阶梯费率区间1
     */
    public void setLadderInterval1(String ladderInterval1) {
        this.ladderInterval1 = ladderInterval1 == null ? null : ladderInterval1.trim();
    }

    /**
     * 获取阶梯费率2
     *
     * @return LADDER_PRICE2 - 阶梯费率2
     */
    public String getLadderPrice2() {
        return ladderPrice2;
    }

    /**
     * 设置阶梯费率2
     *
     * @param ladderPrice2 阶梯费率2
     */
    public void setLadderPrice2(String ladderPrice2) {
        this.ladderPrice2 = ladderPrice2 == null ? null : ladderPrice2.trim();
    }

    /**
     * 获取阶梯费率区间2
     *
     * @return LADDER_INTERVAL2 - 阶梯费率区间2
     */
    public String getLadderInterval2() {
        return ladderInterval2;
    }

    /**
     * 设置阶梯费率区间2
     *
     * @param ladderInterval2 阶梯费率区间2
     */
    public void setLadderInterval2(String ladderInterval2) {
        this.ladderInterval2 = ladderInterval2 == null ? null : ladderInterval2.trim();
    }

    /**
     * 获取阶梯费率3
     *
     * @return LADDER_PRICE3 - 阶梯费率3
     */
    public String getLadderPrice3() {
        return ladderPrice3;
    }

    /**
     * 设置阶梯费率3
     *
     * @param ladderPrice3 阶梯费率3
     */
    public void setLadderPrice3(String ladderPrice3) {
        this.ladderPrice3 = ladderPrice3 == null ? null : ladderPrice3.trim();
    }

    /**
     * 获取阶梯费率区间3
     *
     * @return LADDER_INTERVAL3 - 阶梯费率区间3
     */
    public String getLadderInterval3() {
        return ladderInterval3;
    }

    /**
     * 设置阶梯费率区间3
     *
     * @param ladderInterval3 阶梯费率区间3
     */
    public void setLadderInterval3(String ladderInterval3) {
        this.ladderInterval3 = ladderInterval3 == null ? null : ladderInterval3.trim();
    }

    /**
     * 获取阶梯费率4
     *
     * @return LADDER_PRICE4 - 阶梯费率4
     */
    public String getLadderPrice4() {
        return ladderPrice4;
    }

    /**
     * 设置阶梯费率4
     *
     * @param ladderPrice4 阶梯费率4
     */
    public void setLadderPrice4(String ladderPrice4) {
        this.ladderPrice4 = ladderPrice4 == null ? null : ladderPrice4.trim();
    }

    /**
     * 获取阶梯费率区间4
     *
     * @return LADDER_INTERVAL4 - 阶梯费率区间4
     */
    public String getLadderInterval4() {
        return ladderInterval4;
    }

    /**
     * 设置阶梯费率区间4
     *
     * @param ladderInterval4 阶梯费率区间4
     */
    public void setLadderInterval4(String ladderInterval4) {
        this.ladderInterval4 = ladderInterval4 == null ? null : ladderInterval4.trim();
    }

    /**
     * 获取阶梯费率5
     *
     * @return LADDER_PRICE5 - 阶梯费率5
     */
    public String getLadderPrice5() {
        return ladderPrice5;
    }

    /**
     * 设置阶梯费率5
     *
     * @param ladderPrice5 阶梯费率5
     */
    public void setLadderPrice5(String ladderPrice5) {
        this.ladderPrice5 = ladderPrice5 == null ? null : ladderPrice5.trim();
    }

    /**
     * 获取阶梯费率区间5
     *
     * @return LADDER_INTERVAL5 - 阶梯费率区间5
     */
    public String getLadderInterval5() {
        return ladderInterval5;
    }

    /**
     * 设置阶梯费率区间5
     *
     * @param ladderInterval5 阶梯费率区间5
     */
    public void setLadderInterval5(String ladderInterval5) {
        this.ladderInterval5 = ladderInterval5 == null ? null : ladderInterval5.trim();
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
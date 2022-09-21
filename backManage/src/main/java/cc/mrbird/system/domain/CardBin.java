package cc.mrbird.system.domain;

import javax.persistence.*;

@Table(name = "ft_cardbin")
public class CardBin {
    /**
     * 行号
     */
    @Id
    @Column(name = "BANK_ID")
    private String bankId;

    /**
     * 卡bin
     */
    @Id
    @Column(name = "CARD_BIN")
    private String cardBin;

    /**
     * 卡名
     */
    @Column(name = "CARD_NAME")
    private String cardName;

    /**
     * 1:借记卡 2:贷记卡3:准贷记卡4：预付费卡'
     */
    @Column(name = "CARD_TYPE")
    private String cardType;

    /**
     * 卡长度
     */
    @Column(name = "CARD_LENGTH")
    private String cardLength;

    /**
     * 卡bin长度
     */
    @Column(name = "BIN_LENGTH")
    private String binLength;

    /**
     * 银行名
     */
    @Column(name = "BANK_NAME")
    private String bankName;

    /**
     * 状态
     */
    @Column(name = "STATUS")
    private String status;

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
     * 获取卡bin
     *
     * @return CARD_BIN - 卡bin
     */
    public String getCardBin() {
        return cardBin;
    }

    /**
     * 设置卡bin
     *
     * @param cardBin 卡bin
     */
    public void setCardBin(String cardBin) {
        this.cardBin = cardBin == null ? null : cardBin.trim();
    }

    /**
     * 获取卡名
     *
     * @return CARD_NAME - 卡名
     */
    public String getCardName() {
        return cardName;
    }

    /**
     * 设置卡名
     *
     * @param cardName 卡名
     */
    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    /**
     * 获取1:借记卡 2:贷记卡3:准贷记卡4：预付费卡'
     *
     * @return CARD_TYPE - 1:借记卡 2:贷记卡3:准贷记卡4：预付费卡'
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * 设置1:借记卡 2:贷记卡3:准贷记卡4：预付费卡'
     *
     * @param cardType 1:借记卡 2:贷记卡3:准贷记卡4：预付费卡'
     */
    public void setCardType(String cardType) {
        this.cardType = cardType == null ? null : cardType.trim();
    }

    /**
     * 获取卡长度
     *
     * @return CARD_LENGTH - 卡长度
     */
    public String getCardLength() {
        return cardLength;
    }

    /**
     * 设置卡长度
     *
     * @param cardLength 卡长度
     */
    public void setCardLength(String cardLength) {
        this.cardLength = cardLength == null ? null : cardLength.trim();
    }

    /**
     * 获取卡bin长度
     *
     * @return BIN_LENGTH - 卡bin长度
     */
    public String getBinLength() {
        return binLength;
    }

    /**
     * 设置卡bin长度
     *
     * @param binLength 卡bin长度
     */
    public void setBinLength(String binLength) {
        this.binLength = binLength == null ? null : binLength.trim();
    }

    /**
     * 获取银行名
     *
     * @return BANK_NAME - 银行名
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置银行名
     *
     * @param bankName 银行名
     */
    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    /**
     * 获取状态
     *
     * @return STATUS - 状态
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
}
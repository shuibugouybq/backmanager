package cc.mrbird.system.domain;

import javax.persistence.*;

@Table(name = "user_black_white_list")
public class UserBlackWhiteList {
    @Id
    private String cardno;

    private String status;

    /**
     * @return cardno
     */
    public String getCardno() {
        return cardno;
    }

    /**
     * @param cardno
     */
    public void setCardno(String cardno) {
        this.cardno = cardno == null ? null : cardno.trim();
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}
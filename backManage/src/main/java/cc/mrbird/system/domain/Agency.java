package cc.mrbird.system.domain;

import javax.persistence.*;

public class Agency {
    @Id
    @Column(name = "AGENCYNBR")
    private String agencynbr;

    @Column(name = "AGENCYNAME")
    private String agencyname;

    @Column(name = "AGENCYTELPHONE")
    private String agencytelphone;

    @Column(name = "AGENCYADDRESS")
    private String agencyaddress;

    @Column(name = "AGENCYMAIL")
    private String agencymail;

    @Column(name = "AGENCYSERVICEPHONE")
    private String agencyservicephone;

    @Column(name = "AGENCYLICENSEID")
    private String agencylicenseid;

    @Column(name = "AGENCYPORATIONNAME")
    private String agencyporationname;

    @Column(name = "AGENCYPORATIONPAPERTYP")
    private String agencyporationpapertyp;

    @Column(name = "AGENCYPORATIONPAPERNBR")
    private String agencyporationpapernbr;

    @Column(name = "AGENCYREMARK")
    private String agencyremark;

    @Column(name = "AGENCYSETTLEACCT")
    private String agencysettleacct;

    @Column(name = "AGENCYPROFITNBR")
    private String agencyprofitnbr;

    /**
     * @return AGENCYNBR
     */
    public String getAgencynbr() {
        return agencynbr;
    }

    /**
     * @param agencynbr
     */
    public void setAgencynbr(String agencynbr) {
        this.agencynbr = agencynbr == null ? null : agencynbr.trim();
    }

    /**
     * @return AGENCYNAME
     */
    public String getAgencyname() {
        return agencyname;
    }

    /**
     * @param agencyname
     */
    public void setAgencyname(String agencyname) {
        this.agencyname = agencyname == null ? null : agencyname.trim();
    }

    /**
     * @return AGENCYTELPHONE
     */
    public String getAgencytelphone() {
        return agencytelphone;
    }

    /**
     * @param agencytelphone
     */
    public void setAgencytelphone(String agencytelphone) {
        this.agencytelphone = agencytelphone == null ? null : agencytelphone.trim();
    }

    /**
     * @return AGENCYADDRESS
     */
    public String getAgencyaddress() {
        return agencyaddress;
    }

    /**
     * @param agencyaddress
     */
    public void setAgencyaddress(String agencyaddress) {
        this.agencyaddress = agencyaddress == null ? null : agencyaddress.trim();
    }

    /**
     * @return AGENCYMAIL
     */
    public String getAgencymail() {
        return agencymail;
    }

    /**
     * @param agencymail
     */
    public void setAgencymail(String agencymail) {
        this.agencymail = agencymail == null ? null : agencymail.trim();
    }

    /**
     * @return AGENCYSERVICEPHONE
     */
    public String getAgencyservicephone() {
        return agencyservicephone;
    }

    /**
     * @param agencyservicephone
     */
    public void setAgencyservicephone(String agencyservicephone) {
        this.agencyservicephone = agencyservicephone == null ? null : agencyservicephone.trim();
    }

    /**
     * @return AGENCYLICENSEID
     */
    public String getAgencylicenseid() {
        return agencylicenseid;
    }

    /**
     * @param agencylicenseid
     */
    public void setAgencylicenseid(String agencylicenseid) {
        this.agencylicenseid = agencylicenseid == null ? null : agencylicenseid.trim();
    }

    /**
     * @return AGENCYPORATIONNAME
     */
    public String getAgencyporationname() {
        return agencyporationname;
    }

    /**
     * @param agencyporationname
     */
    public void setAgencyporationname(String agencyporationname) {
        this.agencyporationname = agencyporationname == null ? null : agencyporationname.trim();
    }

    /**
     * @return AGENCYPORATIONPAPERTYP
     */
    public String getAgencyporationpapertyp() {
        return agencyporationpapertyp;
    }

    /**
     * @param agencyporationpapertyp
     */
    public void setAgencyporationpapertyp(String agencyporationpapertyp) {
        this.agencyporationpapertyp = agencyporationpapertyp == null ? null : agencyporationpapertyp.trim();
    }

    /**
     * @return AGENCYPORATIONPAPERNBR
     */
    public String getAgencyporationpapernbr() {
        return agencyporationpapernbr;
    }

    /**
     * @param agencyporationpapernbr
     */
    public void setAgencyporationpapernbr(String agencyporationpapernbr) {
        this.agencyporationpapernbr = agencyporationpapernbr == null ? null : agencyporationpapernbr.trim();
    }

    /**
     * @return AGENCYREMARK
     */
    public String getAgencyremark() {
        return agencyremark;
    }

    /**
     * @param agencyremark
     */
    public void setAgencyremark(String agencyremark) {
        this.agencyremark = agencyremark == null ? null : agencyremark.trim();
    }

    /**
     * @return AGENCYSETTLEACCT
     */
    public String getAgencysettleacct() {
        return agencysettleacct;
    }

    /**
     * @param agencysettleacct
     */
    public void setAgencysettleacct(String agencysettleacct) {
        this.agencysettleacct = agencysettleacct == null ? null : agencysettleacct.trim();
    }

    /**
     * @return AGENCYPROFITNBR
     */
    public String getAgencyprofitnbr() {
        return agencyprofitnbr;
    }

    /**
     * @param agencyprofitnbr
     */
    public void setAgencyprofitnbr(String agencyprofitnbr) {
        this.agencyprofitnbr = agencyprofitnbr == null ? null : agencyprofitnbr.trim();
    }
}
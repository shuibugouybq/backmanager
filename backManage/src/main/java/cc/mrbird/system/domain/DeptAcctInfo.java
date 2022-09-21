package cc.mrbird.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "dept_acct_info")
public class DeptAcctInfo {
    @Id
    @Column(name = "DEPTNBR")
    private String deptnbr;

    @Id
    @Column(name = "INNERACCTCFMMODE")
    private String inneracctcfmmode;

    @Column(name = "ACCTNBR")
    private String acctnbr;

    @Column(name = "ACCTNAME")
    private String acctname;

    @Column(name = "ACCTKINDCD")
    private String acctkindcd;

    @Column(name = "ACCTTYPCD")
    private String accttypcd;

    @Column(name = "ACCTDEPTNBR")
    private String acctdeptnbr;

    @Column(name = "ACCTBANKNBR")
    private String acctbanknbr;

    @Column(name = "FEEACCTNBR")
    private String feeacctnbr;

    @Column(name = "FEEACCTKIND")
    private String feeacctkind;

    @Column(name = "FEEACCTTPYCD")
    private String feeaccttpycd;

    @Column(name = "FEEACCTNAME")
    private String feeacctname;

    @Column(name = "VIRTUALTELLERNBR")
    private String virtualtellernbr;

    @Column(name = "ACCTYESTERDAYBAL")
    private BigDecimal acctyesterdaybal;

    @Column(name = "ACCTDAYBAL")
    private BigDecimal acctdaybal;

    @Column(name = "OPERATOR")
    private String operator;

    @Column(name = "OPERATEDATE")
    private Date operatedate;

    @Column(name = "TELLERDEPTNBR")
    private String tellerdeptnbr;

    @Column(name = "POINTREACCTDEPTNBR")
    private String pointreacctdeptnbr;

    @Column(name = "FEESPENDACCTNBR")
    private String feespendacctnbr;

    @Column(name = "FEESPENDACCTNAME")
    private String feespendacctname;

    @Column(name = "FEESPENDACCTKIND")
    private String feespendacctkind;

    @Column(name = "FEESPENDACCTTPYCD")
    private String feespendaccttpycd;

    /**
     * @return DEPTNBR
     */
    public String getDeptnbr() {
        return deptnbr;
    }

    /**
     * @param deptnbr
     */
    public void setDeptnbr(String deptnbr) {
        this.deptnbr = deptnbr == null ? null : deptnbr.trim();
    }

    /**
     * @return INNERACCTCFMMODE
     */
    public String getInneracctcfmmode() {
        return inneracctcfmmode;
    }

    /**
     * @param inneracctcfmmode
     */
    public void setInneracctcfmmode(String inneracctcfmmode) {
        this.inneracctcfmmode = inneracctcfmmode == null ? null : inneracctcfmmode.trim();
    }

    /**
     * @return ACCTNBR
     */
    public String getAcctnbr() {
        return acctnbr;
    }

    /**
     * @param acctnbr
     */
    public void setAcctnbr(String acctnbr) {
        this.acctnbr = acctnbr == null ? null : acctnbr.trim();
    }

    /**
     * @return ACCTNAME
     */
    public String getAcctname() {
        return acctname;
    }

    /**
     * @param acctname
     */
    public void setAcctname(String acctname) {
        this.acctname = acctname == null ? null : acctname.trim();
    }

    /**
     * @return ACCTKINDCD
     */
    public String getAcctkindcd() {
        return acctkindcd;
    }

    /**
     * @param acctkindcd
     */
    public void setAcctkindcd(String acctkindcd) {
        this.acctkindcd = acctkindcd == null ? null : acctkindcd.trim();
    }

    /**
     * @return ACCTTYPCD
     */
    public String getAccttypcd() {
        return accttypcd;
    }

    /**
     * @param accttypcd
     */
    public void setAccttypcd(String accttypcd) {
        this.accttypcd = accttypcd == null ? null : accttypcd.trim();
    }

    /**
     * @return ACCTDEPTNBR
     */
    public String getAcctdeptnbr() {
        return acctdeptnbr;
    }

    /**
     * @param acctdeptnbr
     */
    public void setAcctdeptnbr(String acctdeptnbr) {
        this.acctdeptnbr = acctdeptnbr == null ? null : acctdeptnbr.trim();
    }

    /**
     * @return ACCTBANKNBR
     */
    public String getAcctbanknbr() {
        return acctbanknbr;
    }

    /**
     * @param acctbanknbr
     */
    public void setAcctbanknbr(String acctbanknbr) {
        this.acctbanknbr = acctbanknbr == null ? null : acctbanknbr.trim();
    }

    /**
     * @return FEEACCTNBR
     */
    public String getFeeacctnbr() {
        return feeacctnbr;
    }

    /**
     * @param feeacctnbr
     */
    public void setFeeacctnbr(String feeacctnbr) {
        this.feeacctnbr = feeacctnbr == null ? null : feeacctnbr.trim();
    }

    /**
     * @return FEEACCTKIND
     */
    public String getFeeacctkind() {
        return feeacctkind;
    }

    /**
     * @param feeacctkind
     */
    public void setFeeacctkind(String feeacctkind) {
        this.feeacctkind = feeacctkind == null ? null : feeacctkind.trim();
    }

    /**
     * @return FEEACCTTPYCD
     */
    public String getFeeaccttpycd() {
        return feeaccttpycd;
    }

    /**
     * @param feeaccttpycd
     */
    public void setFeeaccttpycd(String feeaccttpycd) {
        this.feeaccttpycd = feeaccttpycd == null ? null : feeaccttpycd.trim();
    }

    /**
     * @return FEEACCTNAME
     */
    public String getFeeacctname() {
        return feeacctname;
    }

    /**
     * @param feeacctname
     */
    public void setFeeacctname(String feeacctname) {
        this.feeacctname = feeacctname == null ? null : feeacctname.trim();
    }

    /**
     * @return VIRTUALTELLERNBR
     */
    public String getVirtualtellernbr() {
        return virtualtellernbr;
    }

    /**
     * @param virtualtellernbr
     */
    public void setVirtualtellernbr(String virtualtellernbr) {
        this.virtualtellernbr = virtualtellernbr == null ? null : virtualtellernbr.trim();
    }

    /**
     * @return ACCTYESTERDAYBAL
     */
    public BigDecimal getAcctyesterdaybal() {
        return acctyesterdaybal;
    }

    /**
     * @param acctyesterdaybal
     */
    public void setAcctyesterdaybal(BigDecimal acctyesterdaybal) {
        this.acctyesterdaybal = acctyesterdaybal;
    }

    /**
     * @return ACCTDAYBAL
     */
    public BigDecimal getAcctdaybal() {
        return acctdaybal;
    }

    /**
     * @param acctdaybal
     */
    public void setAcctdaybal(BigDecimal acctdaybal) {
        this.acctdaybal = acctdaybal;
    }

    /**
     * @return OPERATOR
     */
    public String getOperator() {
        return operator;
    }

    /**
     * @param operator
     */
    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    /**
     * @return OPERATEDATE
     */
    public Date getOperatedate() {
        return operatedate;
    }

    /**
     * @param operatedate
     */
    public void setOperatedate(Date operatedate) {
        this.operatedate = operatedate;
    }

    /**
     * @return TELLERDEPTNBR
     */
    public String getTellerdeptnbr() {
        return tellerdeptnbr;
    }

    /**
     * @param tellerdeptnbr
     */
    public void setTellerdeptnbr(String tellerdeptnbr) {
        this.tellerdeptnbr = tellerdeptnbr == null ? null : tellerdeptnbr.trim();
    }

    /**
     * @return POINTREACCTDEPTNBR
     */
    public String getPointreacctdeptnbr() {
        return pointreacctdeptnbr;
    }

    /**
     * @param pointreacctdeptnbr
     */
    public void setPointreacctdeptnbr(String pointreacctdeptnbr) {
        this.pointreacctdeptnbr = pointreacctdeptnbr == null ? null : pointreacctdeptnbr.trim();
    }

    /**
     * @return FEESPENDACCTNBR
     */
    public String getFeespendacctnbr() {
        return feespendacctnbr;
    }

    /**
     * @param feespendacctnbr
     */
    public void setFeespendacctnbr(String feespendacctnbr) {
        this.feespendacctnbr = feespendacctnbr == null ? null : feespendacctnbr.trim();
    }

    /**
     * @return FEESPENDACCTNAME
     */
    public String getFeespendacctname() {
        return feespendacctname;
    }

    /**
     * @param feespendacctname
     */
    public void setFeespendacctname(String feespendacctname) {
        this.feespendacctname = feespendacctname == null ? null : feespendacctname.trim();
    }

    /**
     * @return FEESPENDACCTKIND
     */
    public String getFeespendacctkind() {
        return feespendacctkind;
    }

    /**
     * @param feespendacctkind
     */
    public void setFeespendacctkind(String feespendacctkind) {
        this.feespendacctkind = feespendacctkind == null ? null : feespendacctkind.trim();
    }

    /**
     * @return FEESPENDACCTTPYCD
     */
    public String getFeespendaccttpycd() {
        return feespendaccttpycd;
    }

    /**
     * @param feespendaccttpycd
     */
    public void setFeespendaccttpycd(String feespendaccttpycd) {
        this.feespendaccttpycd = feespendaccttpycd == null ? null : feespendaccttpycd.trim();
    }
}
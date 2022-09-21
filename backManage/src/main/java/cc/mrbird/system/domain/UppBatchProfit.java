package cc.mrbird.system.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "upp_batch_profit")
public class UppBatchProfit {
    /**
     * 分润流水号
     */
    @Id
    @Column(name = "PROFIT_SEQNO")
    private String profitSeqno;

    /**
     * 顺序号
     */
    @Id
    @Column(name = "PROFIT_ORDER")
    private String profitOrder;

    /**
     * 分润机构
     */
    @Column(name = "PROFIT_DEPTID")
    private String profitDeptid;

    /**
     * 分润模式R :百分比
     */
    @Column(name = "PROFIT_MODE")
    private String profitMode;

    /**
     * 比例
     */
    @Column(name = "PROFIT_SCALE")
    private String profitScale;

    /**
     * 修改时间
     */
    @Column(name = "GMT_MODIFIED")
    private String gmtModified;

    /**
     * 创建时间
     */
    @Column(name = "GMT_CREATE")
    private String gmtCreate;

    /**
     * 分润帐号
     */
    @Column(name = "PROFIT_ACCTNO")
    private String profitAcctno;

    /**
     * 分润帐号类型 02-对公客户 03-内部客户 01-对私客户
     */
    @Column(name = "PROFIT_ACCTNO_TYPE")
    private String profitAcctnoType;

    /**
     * 分润帐号名称
     */
    @Column(name = "PROFIT_ACCTNO_NAME")
    private String profitAcctnoName;

    /**
     * 分润是否兜底 1:兜底 0:未兜底
     */
    @Column(name = "IS_LAST")
    private String isLast;

    /**
     * 法人代码
     */
    @Column(name = "CORPORATION_CODE")
    private String corporationCode;

    /**
     * 法人机构号
     */
    @Column(name = "DEPT_ID")
    private String deptId;

    /**
     * 获取分润流水号
     *
     * @return PROFIT_SEQNO - 分润流水号
     */
    public String getProfitSeqno() {
        return profitSeqno;
    }

    /**
     * 设置分润流水号
     *
     * @param profitSeqno 分润流水号
     */
    public void setProfitSeqno(String profitSeqno) {
        this.profitSeqno = profitSeqno == null ? null : profitSeqno.trim();
    }

    /**
     * 获取顺序号
     *
     * @return PROFIT_ORDER - 顺序号
     */
    public String getProfitOrder() {
        return profitOrder;
    }

    /**
     * 设置顺序号
     *
     * @param profitOrder 顺序号
     */
    public void setProfitOrder(String profitOrder) {
        this.profitOrder = profitOrder;
    }

    /**
     * 获取分润机构
     *
     * @return PROFIT_DEPTID - 分润机构
     */
    public String getProfitDeptid() {
        return profitDeptid;
    }

    /**
     * 设置分润机构
     *
     * @param profitDeptid 分润机构
     */
    public void setProfitDeptid(String profitDeptid) {
        this.profitDeptid = profitDeptid == null ? null : profitDeptid.trim();
    }

    /**
     * 获取分润模式R :百分比
     *
     * @return PROFIT_MODE - 分润模式R :百分比
     */
    public String getProfitMode() {
        return profitMode;
    }

    /**
     * 设置分润模式R :百分比
     *
     * @param profitMode 分润模式R :百分比
     */
    public void setProfitMode(String profitMode) {
        this.profitMode = profitMode == null ? null : profitMode.trim();
    }

    /**
     * 获取比例
     *
     * @return PROFIT_SCALE - 比例
     */
    public String getProfitScale() {
        return profitScale;
    }

    /**
     * 设置比例
     *
     * @param profitScale 比例
     */
    public void setProfitScale(String profitScale) {
        this.profitScale = profitScale == null ? null : profitScale.trim();
    }

    /**
     * 获取修改时间
     *
     * @return GMT_MODIFIED - 修改时间
     */
    public String getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置修改时间
     *
     * @param gmtModified 修改时间
     */
    public void setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 获取创建时间
     *
     * @return GMT_CREATE - 创建时间
     */
    public String getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取分润帐号
     *
     * @return PROFIT_ACCTNO - 分润帐号
     */
    public String getProfitAcctno() {
        return profitAcctno;
    }

    /**
     * 设置分润帐号
     *
     * @param profitAcctno 分润帐号
     */
    public void setProfitAcctno(String profitAcctno) {
        this.profitAcctno = profitAcctno == null ? null : profitAcctno.trim();
    }

    /**
     * 获取分润帐号类型 02-对公客户 03-内部客户 01-对私客户
     *
     * @return PROFIT_ACCTNO_TYPE - 分润帐号类型 02-对公客户 03-内部客户 01-对私客户
     */
    public String getProfitAcctnoType() {
        return profitAcctnoType;
    }

    /**
     * 设置分润帐号类型 02-对公客户 03-内部客户 01-对私客户
     *
     * @param profitAcctnoType 分润帐号类型 02-对公客户 03-内部客户 01-对私客户
     */
    public void setProfitAcctnoType(String profitAcctnoType) {
        this.profitAcctnoType = profitAcctnoType == null ? null : profitAcctnoType.trim();
    }

    /**
     * 获取分润帐号名称
     *
     * @return PROFIT_ACCTNO_NAME - 分润帐号名称
     */
    public String getProfitAcctnoName() {
        return profitAcctnoName;
    }

    /**
     * 设置分润帐号名称
     *
     * @param profitAcctnoName 分润帐号名称
     */
    public void setProfitAcctnoName(String profitAcctnoName) {
        this.profitAcctnoName = profitAcctnoName == null ? null : profitAcctnoName.trim();
    }

    /**
     * 获取分润是否兜底 1:兜底 0:未兜底
     *
     * @return IS_LAST - 分润是否兜底 1:兜底 0:未兜底
     */
    public String getIsLast() {
        return isLast;
    }

    /**
     * 设置分润是否兜底 1:兜底 0:未兜底
     *
     * @param isLast 分润是否兜底 1:兜底 0:未兜底
     */
    public void setIsLast(String isLast) {
        this.isLast = isLast;
    }

    /**
     * 获取法人代码
     *
     * @return CORPORATION_CODE - 法人代码
     */
    public String getCorporationCode() {
        return corporationCode;
    }

    /**
     * 设置法人代码
     *
     * @param corporationCode 法人代码
     */
    public void setCorporationCode(String corporationCode) {
        this.corporationCode = corporationCode == null ? null : corporationCode.trim();
    }

    /**
     * 获取法人机构号
     *
     * @return DEPT_ID - 法人机构号
     */
    public String getDeptId() {
        return deptId;
    }

    /**
     * 设置法人机构号
     *
     * @param deptId 法人机构号
     */
    public void setDeptId(String deptId) {
        this.deptId = deptId == null ? null : deptId.trim();
    }
}
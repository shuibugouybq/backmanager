package cc.mrbird.system.domain;

import javax.persistence.*;

@Table(name = "upp_batch_batchctrl")
public class UppBatchctrl {
    /**
     * 机构编号
     */
    @Id
    @Column(name = "BP_DEPARTMENTID")
    private String bpDepartmentid;

    /**
     * 模值
     */
    @Id
    @Column(name = "SHARDING_KEY")
    private String shardingKey;

    /**
     * 清算日期
     */
    @Column(name = "BP_CLEARDATE")
    private String bpCleardate;

    /**
     * 步骤
     */
    @Column(name = "BP_PHASE")
    private String bpPhase;

    /**
     * 状态
     */
    @Column(name = "BP_STATUS")
    private String bpStatus;

    /**
     * 创建时间
     */
    @Column(name = "GMT_CREATE")
    private String gmtCreate;

    /**
     * 修改时间
     */
    @Column(name = "GMT_MODIFIED")
    private String gmtModified;

    /**
     * 获取机构编号
     *
     * @return BP_DEPARTMENTID - 机构编号
     */
    public String getBpDepartmentid() {
        return bpDepartmentid;
    }

    /**
     * 设置机构编号
     *
     * @param bpDepartmentid 机构编号
     */
    public void setBpDepartmentid(String bpDepartmentid) {
        this.bpDepartmentid = bpDepartmentid == null ? null : bpDepartmentid.trim();
    }

    /**
     * 获取模值
     *
     * @return SHARDING_KEY - 模值
     */
    public String getShardingKey() {
        return shardingKey;
    }

    /**
     * 设置模值
     *
     * @param shardingKey 模值
     */
    public void setShardingKey(String shardingKey) {
        this.shardingKey = shardingKey;
    }

    /**
     * 获取清算日期
     *
     * @return BP_CLEARDATE - 清算日期
     */
    public String getBpCleardate() {
        return bpCleardate;
    }

    /**
     * 设置清算日期
     *
     * @param bpCleardate 清算日期
     */
    public void setBpCleardate(String bpCleardate) {
        this.bpCleardate = bpCleardate;
    }

    /**
     * 获取步骤
     *
     * @return BP_PHASE - 步骤
     */
    public String getBpPhase() {
        return bpPhase;
    }

    /**
     * 设置步骤
     *
     * @param bpPhase 步骤
     */
    public void setBpPhase(String bpPhase) {
        this.bpPhase = bpPhase;
    }

    /**
     * 获取状态
     *
     * @return BP_STATUS - 状态
     */
    public String getBpStatus() {
        return bpStatus;
    }

    /**
     * 设置状态
     *
     * @param bpStatus 状态
     */
    public void setBpStatus(String bpStatus) {
        this.bpStatus = bpStatus == null ? null : bpStatus.trim();
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
}
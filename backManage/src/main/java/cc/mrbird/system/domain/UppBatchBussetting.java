package cc.mrbird.system.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "upp_batch_bussetting")
public class UppBatchBussetting {
    /**
     * 通道编号
     */
    @Id
    @Column(name = "BUS_DEPARTMENTID")
    private String busDepartmentid;

    /**
     * 模值
     */
    @Id
    @Column(name = "SHARDING_KEY")
    private String shardingKey;

    /**
     * 前一清算日期
     */
    @Column(name = "BUS_PRECLEARDATE")
    private String busPrecleardate;

    /**
     * 清算日期
     */
    @Column(name = "BUS_CLEARDATE")
    private String busCleardate;

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
     * 获取通道编号
     *
     * @return BUS_DEPARTMENTID - 通道编号
     */
    public String getBusDepartmentid() {
        return busDepartmentid;
    }

    /**
     * 设置通道编号
     *
     * @param busDepartmentid 通道编号
     */
    public void setBusDepartmentid(String busDepartmentid) {
        this.busDepartmentid = busDepartmentid == null ? null : busDepartmentid.trim();
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
     * 获取前一清算日期
     *
     * @return BUS_PRECLEARDATE - 前一清算日期
     */
    public String getBusPrecleardate() {
        return busPrecleardate;
    }

    /**
     * 设置前一清算日期
     *
     * @param busPrecleardate 前一清算日期
     */
    public void setBusPrecleardate(String busPrecleardate) {
        this.busPrecleardate = busPrecleardate;
    }

    /**
     * 获取清算日期
     *
     * @return BUS_CLEARDATE - 清算日期
     */
    public String getBusCleardate() {
        return busCleardate;
    }

    /**
     * 设置清算日期
     *
     * @param busCleardate 清算日期
     */
    public void setBusCleardate(String busCleardate) {
        this.busCleardate = busCleardate;
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
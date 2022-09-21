package cc.mrbird.system.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "upp_batch_process")
public class UppBatchProcess {
    /**
     * 通道号
     */
    @Id
    @Column(name = "DEPARTMENT_ID")
    private String departmentId;

    /**
     * 分库分表的值
     */
    @Id
    @Column(name = "SHARDING_KEY")
    private String shardingKey;

    /**
     * 状态 0:待清算  1:清算完成 2:清算异常 3清算完成
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
     * 获取通道号
     *
     * @return DEPARTMENT_ID - 通道号
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置通道号
     *
     * @param departmentId 通道号
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
    }

    /**
     * 获取分库分表的值
     *
     * @return SHARDING_KEY - 分库分表的值
     */
    public String getShardingKey() {
        return shardingKey;
    }

    /**
     * 设置分库分表的值
     *
     * @param shardingKey 分库分表的值
     */
    public void setShardingKey(String shardingKey) {
        this.shardingKey = shardingKey;
    }

    /**
     * 获取状态 0:待清算  1:清算完成 2:清算异常 3清算完成
     *
     * @return BP_STATUS - 状态 0:待清算  1:清算完成 2:清算异常 3清算完成
     */
    public String getBpStatus() {
        return bpStatus;
    }

    /**
     * 设置状态 0:待清算  1:清算完成 2:清算异常 3清算完成
     *
     * @param bpStatus 状态 0:待清算  1:清算完成 2:清算异常 3清算完成
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
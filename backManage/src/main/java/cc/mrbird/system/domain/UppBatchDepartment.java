package cc.mrbird.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "upp_batch_department")
public class UppBatchDepartment {
    /**
     * 通道Id
     */
    @Id
    @Column(name = "DEPARTMENT_ID")
    private String departmentId;

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
     * 通道名称
     */
    @Column(name = "DEPARTMENT_NAME")
    private String departmentName;

    /**
     * 通道状态
     */
    @Column(name = "DEPARTMENT_STATUS")
    private String departmentStatus;

    /**
     * 机构类型
     */
    @Column(name = "DEPARTMENT_TYPE")
    private String departmentType;

    /**
     * 记录下一清算日期
     */
    @Column(name = "DEPARTMENT_NEXTDATE")
    private String departmentNextdate;

    /**
     * 清算日期
     */
    @Column(name = "DEPARTMENT_DATE")
    private String departmentDate;

    /**
     * 23点清算标识 1是 0否
     */
    @Column(name = "SETT_23FLAG")
    private BigDecimal sett23flag;

    /**
     * 是否需要客户签约1:需要0:不需要
     */
    @Column(name = "IS_SIGN")
    private String isSign;

    /**
     * 通道类型
     */
    @Column(name = "TRANS_TYPE")
    private String transType;

    /**
     * 获取通道Id
     *
     * @return DEPARTMENT_ID - 通道Id
     */
    public String getDepartmentId() {
        return departmentId;
    }

    /**
     * 设置通道Id
     *
     * @param departmentId 通道Id
     */
    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId == null ? null : departmentId.trim();
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

    /**
     * 获取通道名称
     *
     * @return DEPARTMENT_NAME - 通道名称
     */
    public String getDepartmentName() {
        return departmentName;
    }

    /**
     * 设置通道名称
     *
     * @param departmentName 通道名称
     */
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }

    /**
     * 获取通道状态
     *
     * @return DEPARTMENT_STATUS - 通道状态
     */
    public String getDepartmentStatus() {
        return departmentStatus;
    }

    /**
     * 设置通道状态
     *
     * @param departmentStatus 通道状态
     */
    public void setDepartmentStatus(String departmentStatus) {
        this.departmentStatus = departmentStatus == null ? null : departmentStatus.trim();
    }

    /**
     * 获取机构类型
     *
     * @return DEPARTMENT_TYPE - 机构类型
     */
    public String getDepartmentType() {
        return departmentType;
    }

    /**
     * 设置机构类型
     *
     * @param departmentType 机构类型
     */
    public void setDepartmentType(String departmentType) {
        this.departmentType = departmentType == null ? null : departmentType.trim();
    }

    /**
     * 获取记录下一清算日期
     *
     * @return DEPARTMENT_NEXTDATE - 记录下一清算日期
     */
    public String getDepartmentNextdate() {
        return departmentNextdate;
    }

    /**
     * 设置记录下一清算日期
     *
     * @param departmentNextdate 记录下一清算日期
     */
    public void setDepartmentNextdate(String departmentNextdate) {
        this.departmentNextdate = departmentNextdate;
    }

    /**
     * 获取清算日期
     *
     * @return DEPARTMENT_DATE - 清算日期
     */
    public String getDepartmentDate() {
        return departmentDate;
    }

    /**
     * 设置清算日期
     *
     * @param departmentDate 清算日期
     */
    public void setDepartmentDate(String departmentDate) {
        this.departmentDate = departmentDate;
    }

    /**
     * 获取23点清算标识 1是 0否
     *
     * @return SETT_23FLAG - 23点清算标识 1是 0否
     */
    public BigDecimal getSett23flag() {
        return sett23flag;
    }

    /**
     * 设置23点清算标识 1是 0否
     *
     * @param sett23flag 23点清算标识 1是 0否
     */
    public void setSett23flag(BigDecimal sett23flag) {
        this.sett23flag = sett23flag;
    }

    /**
     * 获取是否需要客户签约1:需要0:不需要
     *
     * @return IS_SIGN - 是否需要客户签约1:需要0:不需要
     */
    public String getIsSign() {
        return isSign;
    }

    /**
     * 设置是否需要客户签约1:需要0:不需要
     *
     * @param isSign 是否需要客户签约1:需要0:不需要
     */
    public void setIsSign(String isSign) {
        this.isSign = isSign;
    }

    /**
     * 获取通道类型
     *
     * @return TRANS_TYPE - 通道类型
     */
    public String getTransType() {
        return transType;
    }

    /**
     * 设置通道类型
     *
     * @param transType 通道类型
     */
    public void setTransType(String transType) {
        this.transType = transType == null ? null : transType.trim();
    }
}
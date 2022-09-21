package cc.mrbird.system.domain;

import javax.persistence.*;

@Table(name = "ft_param")
public class Param {
    /**
     * 参数编号
     */
    @Id
    @GeneratedValue(generator = "JDBC")
    @Column(name = "ID")
    private String id;

    @Column(name = "CREATE_TIME")
    private String createTime;

    /**
     * 更新时间
     */
    @Column(name = "UPDATE_TIME")
    private String updateTime;

    /**
     * 版本号
     */
    @Column(name = "VERSION")
    private String version;

    /**
     * 软删除
     */
    @Column(name = "SOFT_DELETE")
    private String softDelete;

    @Column(name = "MER_ID")
    private String merId;

    /**
     * 父id
     */
    @Column(name = "PARENT_PARMA_ID")
    private String parentParmaId;

    @Column(name = "PARAM_TYPE")
    private String paramType;

    /**
     * 参数id
     */
    @Column(name = "PARAM_ID")
    private String paramId;

    /**
     * 参数值
     */
    @Column(name = "PARAM_VALUE")
    private String paramValue;

    /**
     * 参数名
     */
    @Column(name = "PARAM_NAME")
    private String paramName;

    /**
     * 获取参数编号
     *
     * @return ID - 参数编号
     */
    public String getId() {
        return id;
    }

    /**
     * 设置参数编号
     *
     * @param id 参数编号
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return CREATE_TIME
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return UPDATE_TIME - 更新时间
     */
    public String getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取版本号
     *
     * @return VERSION - 版本号
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置版本号
     *
     * @param version 版本号
     */
    public void setVersion(String version) {
        this.version = version == null ? null : version.trim();
    }

    /**
     * 获取软删除
     *
     * @return SOFT_DELETE - 软删除
     */
    public String getSoftDelete() {
        return softDelete;
    }

    /**
     * 设置软删除
     *
     * @param softDelete 软删除
     */
    public void setSoftDelete(String softDelete) {
        this.softDelete = softDelete == null ? null : softDelete.trim();
    }

    /**
     * @return MER_ID
     */
    public String getMerId() {
        return merId;
    }

    /**
     * @param merId
     */
    public void setMerId(String merId) {
        this.merId = merId == null ? null : merId.trim();
    }

    /**
     * 获取父id
     *
     * @return PARENT_PARMA_ID - 父id
     */
    public String getParentParmaId() {
        return parentParmaId;
    }

    /**
     * 设置父id
     *
     * @param parentParmaId 父id
     */
    public void setParentParmaId(String parentParmaId) {
        this.parentParmaId = parentParmaId == null ? null : parentParmaId.trim();
    }

    /**
     * @return PARAM_TYPE
     */
    public String getParamType() {
        return paramType;
    }

    /**
     * @param paramType
     */
    public void setParamType(String paramType) {
        this.paramType = paramType == null ? null : paramType.trim();
    }

    /**
     * 获取参数id
     *
     * @return PARAM_ID - 参数id
     */
    public String getParamId() {
        return paramId;
    }

    /**
     * 设置参数id
     *
     * @param paramId 参数id
     */
    public void setParamId(String paramId) {
        this.paramId = paramId == null ? null : paramId.trim();
    }

    /**
     * 获取参数值
     *
     * @return PARAM_VALUE - 参数值
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * 设置参数值
     *
     * @param paramValue 参数值
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    /**
     * 获取参数名
     *
     * @return PARAM_NAME - 参数名
     */
    public String getParamName() {
        return paramName;
    }

    /**
     * 设置参数名
     *
     * @param paramName 参数名
     */
    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }
}
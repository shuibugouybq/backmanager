package cc.mrbird.system.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "upp_marketing_dayset")
public class UppMarketingDayset {
    /**
     * 结算流水
     */
    @Column(name = "TRANS_SETTSEQNO")
    private String transSettseqno;

    /**
     * 清算日期
     */
    @Column(name = "TRANS_CLEARDATE")
    private Date transCleardate;

    /**
     * 结算状态
     */
    @Column(name = "TRANS_SETTSTATUS")
    private String transSettstatus;

    /**
     * 付款账号
     */
    @Column(name = "TRANS_PAYACCTNO")
    private String transPayacctno;

    /**
     * 收款账号
     */
    @Column(name = "TRANS_RCVACCTNO")
    private String transRcvacctno;

    /**
     * 抵扣金额
     */
    @Column(name = "TRANS_AMT")
    private BigDecimal transAmt;

    /**
     * 营销渠道
     */
    @Column(name = "POINT_CHANNEL")
    private String pointChannel;

    /**
     * 修改时间
     */
    @Column(name = "GMT_MODIFIED")
    private Date gmtModified;

    /**
     * 创建时间
     */
    @Column(name = "GMT_CREATE")
    private Date gmtCreate;

    /**
     * 分区分盘
     */
    @Column(name = "SHARDING_KEY")
    private String shardingKey;

    /**
     * 付款账户类型
     */
    @Column(name = "TRANS_PAYACCTNO_TYPE")
    private String transPayacctnoType;

    /**
     * 收款账户类型
     */
    @Column(name = "TRANS_RCVACCTNO_TYPE")
    private String transRcvacctnoType;

    /**
     * 付款账户名
     */
    @Column(name = "TRANS_PAYACCTNAME")
    private String transPayacctname;

    /**
     * 收款账户名
     */
    @Column(name = "TRANS_RCVACCTNAME")
    private String transRcvacctname;

    @Column(name = "REMARK1")
    private String remark1;

    @Column(name = "REMARK2")
    private String remark2;

    @Column(name = "REMARK3")
    private String remark3;

    @Column(name = "REMARK4")
    private String remark4;

    @Column(name = "REMARK5")
    private String remark5;

    /**
     * 获取结算流水
     *
     * @return TRANS_SETTSEQNO - 结算流水
     */
    public String getTransSettseqno() {
        return transSettseqno;
    }

    /**
     * 设置结算流水
     *
     * @param transSettseqno 结算流水
     */
    public void setTransSettseqno(String transSettseqno) {
        this.transSettseqno = transSettseqno == null ? null : transSettseqno.trim();
    }

    /**
     * 获取清算日期
     *
     * @return TRANS_CLEARDATE - 清算日期
     */
    public Date getTransCleardate() {
        return transCleardate;
    }

    /**
     * 设置清算日期
     *
     * @param transCleardate 清算日期
     */
    public void setTransCleardate(Date transCleardate) {
        this.transCleardate = transCleardate;
    }

    /**
     * 获取结算状态
     *
     * @return TRANS_SETTSTATUS - 结算状态
     */
    public String getTransSettstatus() {
        return transSettstatus;
    }

    /**
     * 设置结算状态
     *
     * @param transSettstatus 结算状态
     */
    public void setTransSettstatus(String transSettstatus) {
        this.transSettstatus = transSettstatus == null ? null : transSettstatus.trim();
    }

    /**
     * 获取付款账号
     *
     * @return TRANS_PAYACCTNO - 付款账号
     */
    public String getTransPayacctno() {
        return transPayacctno;
    }

    /**
     * 设置付款账号
     *
     * @param transPayacctno 付款账号
     */
    public void setTransPayacctno(String transPayacctno) {
        this.transPayacctno = transPayacctno == null ? null : transPayacctno.trim();
    }

    /**
     * 获取收款账号
     *
     * @return TRANS_RCVACCTNO - 收款账号
     */
    public String getTransRcvacctno() {
        return transRcvacctno;
    }

    /**
     * 设置收款账号
     *
     * @param transRcvacctno 收款账号
     */
    public void setTransRcvacctno(String transRcvacctno) {
        this.transRcvacctno = transRcvacctno == null ? null : transRcvacctno.trim();
    }

    /**
     * 获取抵扣金额
     *
     * @return TRANS_AMT - 抵扣金额
     */
    public BigDecimal getTransAmt() {
        return transAmt;
    }

    /**
     * 设置抵扣金额
     *
     * @param transAmt 抵扣金额
     */
    public void setTransAmt(BigDecimal transAmt) {
        this.transAmt = transAmt;
    }

    /**
     * 获取营销渠道
     *
     * @return POINT_CHANNEL - 营销渠道
     */
    public String getPointChannel() {
        return pointChannel;
    }

    /**
     * 设置营销渠道
     *
     * @param pointChannel 营销渠道
     */
    public void setPointChannel(String pointChannel) {
        this.pointChannel = pointChannel == null ? null : pointChannel.trim();
    }

    /**
     * 获取修改时间
     *
     * @return GMT_MODIFIED - 修改时间
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * 设置修改时间
     *
     * @param gmtModified 修改时间
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * 获取创建时间
     *
     * @return GMT_CREATE - 创建时间
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * 设置创建时间
     *
     * @param gmtCreate 创建时间
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * 获取分区分盘
     *
     * @return SHARDING_KEY - 分区分盘
     */
    public String getShardingKey() {
        return shardingKey;
    }

    /**
     * 设置分区分盘
     *
     * @param shardingKey 分区分盘
     */
    public void setShardingKey(String shardingKey) {
        this.shardingKey = shardingKey == null ? null : shardingKey.trim();
    }

    /**
     * 获取付款账户类型
     *
     * @return TRANS_PAYACCTNO_TYPE - 付款账户类型
     */
    public String getTransPayacctnoType() {
        return transPayacctnoType;
    }

    /**
     * 设置付款账户类型
     *
     * @param transPayacctnoType 付款账户类型
     */
    public void setTransPayacctnoType(String transPayacctnoType) {
        this.transPayacctnoType = transPayacctnoType == null ? null : transPayacctnoType.trim();
    }

    /**
     * 获取收款账户类型
     *
     * @return TRANS_RCVACCTNO_TYPE - 收款账户类型
     */
    public String getTransRcvacctnoType() {
        return transRcvacctnoType;
    }

    /**
     * 设置收款账户类型
     *
     * @param transRcvacctnoType 收款账户类型
     */
    public void setTransRcvacctnoType(String transRcvacctnoType) {
        this.transRcvacctnoType = transRcvacctnoType == null ? null : transRcvacctnoType.trim();
    }

    /**
     * 获取付款账户名
     *
     * @return TRANS_PAYACCTNAME - 付款账户名
     */
    public String getTransPayacctname() {
        return transPayacctname;
    }

    /**
     * 设置付款账户名
     *
     * @param transPayacctname 付款账户名
     */
    public void setTransPayacctname(String transPayacctname) {
        this.transPayacctname = transPayacctname == null ? null : transPayacctname.trim();
    }

    /**
     * 获取收款账户名
     *
     * @return TRANS_RCVACCTNAME - 收款账户名
     */
    public String getTransRcvacctname() {
        return transRcvacctname;
    }

    /**
     * 设置收款账户名
     *
     * @param transRcvacctname 收款账户名
     */
    public void setTransRcvacctname(String transRcvacctname) {
        this.transRcvacctname = transRcvacctname == null ? null : transRcvacctname.trim();
    }

    /**
     * @return REMARK1
     */
    public String getRemark1() {
        return remark1;
    }

    /**
     * @param remark1
     */
    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    /**
     * @return REMARK2
     */
    public String getRemark2() {
        return remark2;
    }

    /**
     * @param remark2
     */
    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }

    /**
     * @return REMARK3
     */
    public String getRemark3() {
        return remark3;
    }

    /**
     * @param remark3
     */
    public void setRemark3(String remark3) {
        this.remark3 = remark3 == null ? null : remark3.trim();
    }

    /**
     * @return REMARK4
     */
    public String getRemark4() {
        return remark4;
    }

    /**
     * @param remark4
     */
    public void setRemark4(String remark4) {
        this.remark4 = remark4 == null ? null : remark4.trim();
    }

    /**
     * @return REMARK5
     */
    public String getRemark5() {
        return remark5;
    }

    /**
     * @param remark5
     */
    public void setRemark5(String remark5) {
        this.remark5 = remark5 == null ? null : remark5.trim();
    }
}
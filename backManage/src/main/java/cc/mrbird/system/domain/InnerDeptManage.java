package cc.mrbird.system.domain;

import javax.persistence.*;

@Table(name = "dept_info")
public class InnerDeptManage {
    /**
     * 部门号
     */
    @Id
    @Column(name = "DEPTNBR")
    private String deptnbr;

    /**
     * 部门名
     */
    @Id
    @Column(name = "DEPTNAME")
    private String deptname;

    /**
     * 部门级别
     */
    @Column(name = "DEPTLEVEL")
    private String deptlevel;

    /**
     * 上级部门
     */
    @Column(name = "SUPERDEPTNBR")
    private String superdeptnbr;

    /**
     * 打开日期
     */
    @Column(name = "OPENDATE")
    private String opendate;

    /**
     * 打开人员编号
     */
    @Column(name = "OPENUSERNBR")
    private String openusernbr;

    /**
     * 关闭日期
     */
    @Column(name = "CLOSEDATE")
    private String closedate;
    
    /**
     * 关闭人员编号
     */
    @Column(name = "CLOSEUSERNBR")
    private String closeusernbr;
    
    /**
     * 修改日期
     */
    @Column(name = "MODIFYDATE")
    private String modifydate;
    
    /**
     * 修改人编号
     */
    @Column(name = "MODIFYUSERNBR")
    private String modifyusernbr;
    
    /**
     * 部门状态
     */
    @Column(name = "DEPTSTATUS")
    private String deptstatus;

	public String getDeptnbr() {
		return deptnbr;
	}

	public void setDeptnbr(String deptnbr) {
		this.deptnbr = deptnbr;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getDeptlevel() {
		return deptlevel;
	}

	public void setDeptlevel(String deptlevel) {
		this.deptlevel = deptlevel;
	}

	public String getSuperdeptnbr() {
		return superdeptnbr;
	}

	public void setSuperdeptnbr(String superdeptnbr) {
		this.superdeptnbr = superdeptnbr;
	}

	public String getOpendate() {
		return opendate;
	}

	public void setOpendate(String opendate) {
		this.opendate = opendate;
	}

	public String getOpenusernbr() {
		return openusernbr;
	}

	public void setOpenusernbr(String openusernbr) {
		this.openusernbr = openusernbr;
	}

	public String getClosedate() {
		return closedate;
	}

	public void setClosedate(String closedate) {
		this.closedate = closedate;
	}

	public String getCloseusernbr() {
		return closeusernbr;
	}

	public void setCloseusernbr(String closeusernbr) {
		this.closeusernbr = closeusernbr;
	}

	public String getModifydate() {
		return modifydate;
	}

	public void setModifydate(String modifydate) {
		this.modifydate = modifydate;
	}

	public String getModifyusernbr() {
		return modifyusernbr;
	}

	public void setModifyusernbr(String modifyusernbr) {
		this.modifyusernbr = modifyusernbr;
	}

	public String getDeptstatus() {
		return deptstatus;
	}

	public void setDeptstatus(String deptstatus) {
		this.deptstatus = deptstatus;
	}
    

//    /**
//     * 预留1
//     */
//    @Column(name = "REMARK1")
//    private String remark1;
//
//    /**
//     * 预留2
//     */
//    @Column(name = "REMARK2")
//    private String remark2;
//
//    /**
//     * 预留3
//     */
//    @Column(name = "REMARK3")
//    private String remark3;


//	public String getRemark1() {
//		return remark1;
//	}
//
//	public void setRemark1(String remark1) {
//		this.remark1 = remark1;
//	}
//
//	public String getRemark2() {
//		return remark2;
//	}
//
//	public void setRemark2(String remark2) {
//		this.remark2 = remark2;
//	}
//
//	public String getRemark3() {
//		return remark3;
//	}
//
//	public void setRemark3(String remark3) {
//		this.remark3 = remark3;
//	}

   
}
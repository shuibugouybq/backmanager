package cc.mrbird.system.domain;

import javax.persistence.*;

//@Table(name = "mer_warn_info")
public class MerRiskLevel {
	/**
     * 商户编号
     */
    @Id
    @Column(name = "MER_ID")
    private String merId;

    /**
     * 商户名称
     */
    @Id
    @Column(name = "MER_NAME")
    private String merName;

    /**
     * 商户营业执照号
     */
    @Column(name = "MER_BUSINESSLICENSEID")
    private String merBusinessLicenseId;

    /**
     * 商户法人代表名称
     */
    @Column(name = "MER_CORPORATIONNAME")
    private String merCorporationName;

    /**
     * 商户法人代表身份证件号
     */
    @Column(name = "MER_CORPORATIONPAPERID")
    private String merCorporationPaperId;

    /**
     * 预警处理时间
     */
    @Column(name = "warndatetime")
    private String warndatetime;

    /**
     * 预警处理人员
     */
    @Column(name = "warndealman")
    private String warndealman;
    
    /**
     * 商户处理结果
     */
    @Column(name = "merdealresult")
    private String merdealresult;
    
    /**
     * 风险等级
     */
    @Column(name = "rislevel")
    private String rislevel;

	public String getMerId() {
		return merId;
	}

	public void setMerId(String merId) {
		this.merId = merId;
	}

	public String getMerName() {
		return merName;
	}

	public void setMerName(String merName) {
		this.merName = merName;
	}

	public String getMerBusinessLicenseId() {
		return merBusinessLicenseId;
	}

	public void setMerBusinessLicenseId(String merBusinessLicenseId) {
		this.merBusinessLicenseId = merBusinessLicenseId;
	}

	public String getMerCorporationName() {
		return merCorporationName;
	}

	public void setMerCorporationName(String merCorporationName) {
		this.merCorporationName = merCorporationName;
	}

	public String getMerCorporationPaperId() {
		return merCorporationPaperId;
	}

	public void setMerCorporationPaperId(String merCorporationPaperId) {
		this.merCorporationPaperId = merCorporationPaperId;
	}

	public String getWarndatetime() {
		return warndatetime;
	}

	public void setWarndatetime(String warndatetime) {
		this.warndatetime = warndatetime;
	}

	public String getWarndealman() {
		return warndealman;
	}

	public void setWarndealman(String warndealman) {
		this.warndealman = warndealman;
	}

	public String getMerdealresult() {
		return merdealresult;
	}

	public void setMerdealresult(String merdealresult) {
		this.merdealresult = merdealresult;
	}

	public String getRislevel() {
		return rislevel;
	}

	public void setRislevel(String rislevel) {
		this.rislevel = rislevel;
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
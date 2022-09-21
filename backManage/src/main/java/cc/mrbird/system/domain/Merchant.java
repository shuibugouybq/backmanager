package cc.mrbird.system.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
@Table(name = "ft_merchant")
public class Merchant implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5896080607563588938L;

	/**
	 * 商户号
	 */
	@Id
	@Column(name = "MER_ID")
	private String merId;

	/**
	 * 商户状态:0,正常;1,停用,2:注销
	 */
	@Column(name = "MER_STATUS")
	private String merStatus;

	/**
	 * 商户客户号
	 */
	@Column(name = "MER_CIFNO")
	private String merCifno;

	/**
	 * 商户类型
	 */
	@Column(name = "MER_TYPE")
	private String merType;

	/**
	 * 管理机构机构号
	 */
	@Column(name = "MER_MGMTDEPTID")
	private String merMgmtdeptid;

	/**
	 * 商户名称
	 */
	@Column(name = "MER_NAME")
	private String merName;

	/**
	 * 开户机构号
	 */
	@Column(name = "MER_OPENDEPTID")
	private String merOpendeptid;

	/**
	 * 发展行机构号
	 */
	@Column(name = "MER_DEVELOPDEPTID")
	private String merDevelopdeptid;

	/**
	 * 服务类型
	 */
	@Column(name = "MER_SERVICETYPE")
	private String merServicetype;

	/**
	 * 结算账户
	 */
	@Column(name = "MER_SETTACCTNO")
	private String merSettacctno;

	/**
	 * 结算账户名称
	 */
	@Column(name = "MER_SETTACCTNAME")
	private String merSettacctname;

	/**
	 * 结算账户签约号
	 */
	@Column(name = "MER_SETTACCTSIGNNO")
	private String merSettacctsignno;

	/**
	 * 手续费结算账号
	 */
	@Column(name = "MER_FEEACCTNO")
	private String merFeeacctno;

	/**
	 * 手续费结算账户名称
	 */
	@Column(name = "MER_FEEACCTNAME")
	private String merFeeacctname;

	/**
	 * 手续费结算账户签约号
	 */
	@Column(name = "MER_FEEACCTSIGNNO")
	private String merFeeacctsignno;

	/**
	 * 保证金账户
	 */
	@Column(name = "MER_BAILACCTNO")
	private String merBailacctno;

	/**
	 * 保证金金额
	 */
	@Column(name = "MER_BAILAMT")
	private String merBailamt;

	/**
	 * 备付金账户
	 */
	@Column(name = "MER_THIDPARTACCTNO")
	private String merThidpartacctno;

	/**
	 * 联系人姓名
	 */
	@Column(name = "MER_LINKMANNAME")
	private String merLinkmanname;

	/**
	 * 联系人固定电话
	 */
	@Column(name = "MER_LINKMANTEL")
	private String merLinkmantel;

	/**
	 * 联系人手机号
	 */
	@Column(name = "MER_LINKMANPHONE")
	private String merLinkmanphone;

	/**
	 * 联系人e-mail
	 */
	@Column(name = "MER_LINKMANEMAIL")
	private String merLinkmanemail;

	/**
	 * 商户电话
	 */
	@Column(name = "MER_TEL")
	private String merTel;

	/**
	 * 商户传真
	 */
	@Column(name = "MER_FAX")
	private String merFax;

	/**
	 * 商户地址
	 */
	@Column(name = "MER_ADDR")
	private String merAddr;

	/**
	 * 商户邮编
	 */
	@Column(name = "MER_POSTALCODE")
	private String merPostalcode;

	/**
	 * 网站地址
	 */
	@Column(name = "MER_SITECODE")
	private String merSitecode;

	/**
	 * 网站名称
	 */
	@Column(name = "MER_SITENAME")
	private String merSitename;

	/**
	 * 商户区域地址
	 */
	@Column(name = "MER_DOMAIN")
	private String merDomain;

	/**
	 * 营业范围
	 */
	@Column(name = "MER_WORKSCOP")
	private String merWorkscop;

	/**
	 * 通知地址
	 */
	@Column(name = "MER_REPURL")
	private String merRepurl;

	/**
	 * 清算方式
	 */
	@Column(name = "MER_CLEARMODE")
	private String merClearmode;

	/**
	 * 结算方式
	 */
	@Column(name = "MER_SETTMODE")
	private String merSettmode;

	/**
	 * 结算周期
	 */
	@Column(name = "MER_SETTPERIOD")
	private String merSettperiod;

	/**
	 * 手续费结算周期
	 */
	@Column(name = "MER_FEESETTPERIOD")
	private String merFeesettperiod;

	/**
	 * mer_serviceamt
	 */
	@Column(name = "MER_SERVICEAMT")
	private String merServiceamt;

	/**
	 * mer_serviceamtrcvdate
	 */
	@Column(name = "MER_SERVICEAMTRCVDATE")
	private String merServiceamtrcvdate;

	/**
	 * 证书编号
	 */
	@Column(name = "MER_CERTSN")
	private String merCertsn;

	/**
	 * 证书上传日期
	 */
	@Column(name = "MER_CERTUPLOADDATE")
	private String merCertuploaddate;

	/**
	 * 商户建立日期
	 */
	@Column(name = "MER_OPENDATE")
	private String merOpendate;

	/**
	 * 商户建立操作员
	 */
	@Column(name = "MER_OPENUSER")
	private String merOpenuser;

	/**
	 * 商户修改日期
	 */
	@Column(name = "MER_MODIFYDATE")
	private String merModifydate;

	/**
	 * 商户修改操作员
	 */
	@Column(name = "MER_MODIFYUSER")
	private String merModifyuser;

	/**
	 * 商户关闭日期
	 */
	@Column(name = "MER_CLOSEDATE")
	private String merClosedate;

	/**
	 * 商户手续费结算模式
	 */
	@Column(name = "MER_FEEMODE")
	private String merFeemode;

	/**
	 * 商户手续费率
	 */
	@Column(name = "MER_FEEAMT")
	private String merFeeamt;

	/**
	 * 商户手续费返还标识
	 */
	@Column(name = "MER_FEERETURNFLAG")
	private String merFeereturnflag;

	/**
	 * 商户关闭操作员
	 */
	@Column(name = "MER_CLOSEUSER")
	private String merCloseuser;

	/**
	 * 商户订单机构号
	 */
	@Column(name = "MER_ORDERDEPTID")
	private String merOrderdeptid;

	/**
	 * 商户公司名称
	 */
	@Column(name = "MER_COMPANYNAME")
	private String merCompanyname;

	/**
	 * 商户验证标识
	 */
	@Column(name = "MER_AUTHCHECKFLAG")
	private String merAuthcheckflag;

	/**
	 * 商户激活标识
	 */
	@Column(name = "MER_ACTIVEFLAG")
	private String merActiveflag;

	/**
	 * 商户支付开放标识
	 */
	@Column(name = "MER_PAYOPENFLAG")
	private String merPayopenflag;

	/**
	 * 法人名称
	 */
	@Column(name = "MER_CORPORATIONNAME")
	private String merCorporationname;

	/**
	 * 法人证件类型
	 */
	@Column(name = "MER_CORPORATIONPAPERTYPE")
	private String merCorporationpapertype;

	/**
	 * 法人证件号
	 */
	@Column(name = "MER_CORPORATIONPAPERID")
	private String merCorporationpaperid;

	/**
	 * mer_corporationidtype
	 */
	@Column(name = "MER_CORPORATIONIDTYPE")
	private String merCorporationidtype;

	/**
	 * mer_corporationidno
	 */
	@Column(name = "MER_CORPORATIONIDNO")
	private String merCorporationidno;

	/**
	 * 最低手续费
	 */
	@Column(name = "MER_FEEMINAMT")
	private String merFeeminamt;

	/**
	 * 最高手续费
	 */
	@Column(name = "MER_FEEMAXAMT")
	private String merFeemaxamt;

	/**
	 * 商户账户类型
	 */
	@Column(name = "MER_ACCTTYPE")
	private String merAccttype;

	/**
	 * 商户原机构号
	 */
	@Column(name = "MER_ORGDEPTID")
	private String merOrgdeptid;

	/**
	 * 营业执照编号
	 */
	@Column(name = "MER_BUSINESSLICENSEID")
	private String merBusinesslicenseid;

	/**
	 * 分润协议号
	 */
	@Column(name = "PROFIT_SEQNO")
	private String profitSeqno;

	/**
	 * 商户编号
	 */
	@Column(name = "MER_INSTID")
	private String merInstid;

	/**
	 * 商户结算账户类型
	 */
	@Column(name = "MER_SETTACCTTYPE")
	private String merSettaccttype;

	/**
	 * 商户手续费账户类型
	 */
	@Column(name = "MER_FEEACCTTYPE")
	private String merFeeaccttype;

	/**
	 * 商户保证金账户类型
	 */
	@Column(name = "MER_BAILACCTTYPE")
	private String merBailaccttype;

	/**
	 * 商户简称
	 */
	@Column(name = "MER_BRIEFNAME")
	private String merBriefname;

	/**
	 * 营业标识
	 */
	@Column(name = "MER_IFONLINE")
	private String merIfonline;

	/**
	 * 注册法人
	 */
	@Column(name = "MER_REGCAPITAL")
	private String merRegcapital;

	/**
	 * 税务登记号
	 */
	@Column(name = "MER_TAXREGID")
	private String merTaxregid;

	/**
	 * 营业执照有效期
	 */
	@Column(name = "MER_BUSINESSOPENDATE")
	private String merBusinessopendate;

	/**
	 * 商户所有权
	 */
	@Column(name = "MER_PROPERTY")
	private String merProperty;

	/**
	 * 商户网站地址
	 */
	@Column(name = "MER_SITEIPORT")
	private String merSiteiport;

	/**
	 * 是否是虚拟商品
	 */
	@Column(name = "MER_IFVIRTRUALGOODS")
	private String merIfvirtrualgoods;

	/**
	 * 特殊行业许可证
	 */
	@Column(name = "MER_SPECIALLICENSE")
	private String merSpeciallicense;

	/**
	 * 许可证
	 */
	@Column(name = "MER_LICENESE")
	private String merLicenese;

	/**
	 * mer_if2levelmer
	 */
	@Column(name = "MER_IF2LEVELMER")
	private String merIf2levelmer;

	/**
	 * mer_ifinnersett
	 */
	@Column(name = "MER_IFINNERSETT")
	private String merIfinnersett;

	/**
	 * 技术联系人名称
	 */
	@Column(name = "MER_TECHLINKNAME")
	private String merTechlinkname;

	/**
	 * 技术联系人电话
	 */
	@Column(name = "MER_TECHLINKMANTEL")
	private String merTechlinkmantel;

	/**
	 * 技术联系人手机
	 */
	@Column(name = "MER_TECHLINKMANPHONE")
	private String merTechlinkmanphone;

	/**
	 * 技术联系人e-mail
	 */
	@Column(name = "MER_TECHLINKMANEMAIL")
	private String merTechlinkmanemail;

	/**
	 * 结算账户机构号
	 */
	@Column(name = "MER_SETTACDEPTID")
	private String merSettacdeptid;

	/**
	 * mer_ifinnercif
	 */
	@Column(name = "MER_IFINNERCIF")
	private String merIfinnercif;

	/**
	 * mer_ciflevel
	 */
	@Column(name = "MER_CIFLEVEL")
	private String merCiflevel;

	/**
	 * mer_comproperties
	 */
	@Column(name = "MER_COMPROPERTIES")
	private String merComproperties;

	/**
	 * 营业执照号
	 */
	@Column(name = "COM_BUSSINESSLICENSEID")
	private String comBussinesslicenseid;

	/**
	 * 公司税务登记号
	 */
	@Column(name = "COM_TAXREGID")
	private String comTaxregid;

	/**
	 * 公司地址
	 */
	@Column(name = "COM_ADDR")
	private String comAddr;

	/**
	 * 公司邮编
	 */
	@Column(name = "COM_ZIPCODE")
	private String comZipcode;

	/**
	 * 公司联系人手机号
	 */
	@Column(name = "COM_PHONE")
	private String comPhone;

	/**
	 * 公司传真
	 */
	@Column(name = "COM_FAX")
	private String comFax;

	/**
	 * 商户级别
	 */
	@Column(name = "MER_LEVEL")
	private String merLevel;

	/**
	 * 商户交易类型
	 */
	@Column(name = "MER_TRANSTYPE")
	private String merTranstype;

	/**
	 * 商户现在
	 */
	@Column(name = "MER_LIMIT")
	private String merLimit;

	/**
	 * 结算类型 01 结算至门店 02 结算至商户
	 */
	@Column(name = "SETTLEMENT_TYPE")
	private String settlementType;

	/**
	 * 商户二维码
	 */
	@Column(name = "QR_CODE")
	private String qrCode;

	/**
	 * 代理商id
	 */
	@Column(name = "AGENT_ID")
	private String agentId;

	/**
	 * 微信id
	 */
	@Column(name = "MER_WXID")
	private String merWxid;

	/**
	 * subappid
	 */
	@Column(name = "SUB_APPID")
	private String subAppid;

	/**
	 * js_api_path
	 */
	@Column(name = "JS_API_PATH")
	private String jsApiPath;

	/**
	 * sub_scribe_appid
	 */
	@Column(name = "SUB_SCRIBE_APPID")
	private String subScribeAppid;

	/**
	 * wx_status
	 */
	@Column(name = "WX_STATUS")
	private String wxStatus;

	/**
	 * 协议状态
	 */
	@Column(name = "PROTOCAL_STATUS")
	private String protocalStatus;

	/**
	 * 签约日期
	 */
	@Column(name = "PROTOCAL_SIGN_DATE")
	private String protocalSignDate;

	/**
	 * 密钥id
	 */
	@Column(name = "KEY_ID")
	private String keyId;

	/**
	 * 商户证书
	 */
	@Column(name = "MER_CERT")
	private String merCert;

	/**
	 * 公司备注
	 */
	@Column(name = "COM_REMARK")
	private String comRemark;

	/**
	 * 证件正面
	 */
	@Column(name = "CERT_FRONT_PICTURE")
	private byte[] certFrontPicture;

	/**
	 * 证件背面
	 */
	@Column(name = "CERT_BACK_PICTURE")
	private byte[] certBackPicture;

	/**
	 * 营业执照照片
	 */
	@Column(name = "COM_BUSSINESSLICENSE_PICTURE")
	private byte[] comBussinesslicensePicture;

	/**
	 * 原始证件照片
	 */
	@Column(name = "ORG_CERT_PICTURE")
	private byte[] orgCertPicture;

	/**
	 * 税务登记证照片
	 */
	@Column(name = "TAX_PICTURE")
	private byte[] taxPicture;

	/**
	 * 获取商户号
	 * @return  MER_ID - 商户号
	 */
	public String getMerId() {
		return merId;
	}

	/**
	 * 设置商户号
	 * @param merId  商户号
	 */
	public void setMerId(String merId) {
		this.merId = merId == null ? null : merId.trim();
	}

	/**
	 * 获取商户状态:0,正常;1,停用,2:注销
	 * @return  MER_STATUS - 商户状态:0,正常;1,停用,2:注销
	 */
	public String getMerStatus() {
		return merStatus;
	}

	/**
	 * 设置商户状态:0,正常;1,停用,2:注销
	 * @param merStatus  商户状态:0,正常;1,停用,2:注销
	 */
	public void setMerStatus(String merStatus) {
		this.merStatus = merStatus == null ? null : merStatus.trim();
	}

	/**
	 * 获取商户客户号
	 * @return  MER_CIFNO - 商户客户号
	 */
	public String getMerCifno() {
		return merCifno;
	}

	/**
	 * 设置商户客户号
	 * @param merCifno  商户客户号
	 */
	public void setMerCifno(String merCifno) {
		this.merCifno = merCifno == null ? null : merCifno.trim();
	}

	/**
	 * 获取商户类型
	 * @return  MER_TYPE - 商户类型
	 */
	public String getMerType() {
		return merType;
	}

	/**
	 * 设置商户类型
	 * @param merType  商户类型
	 */
	public void setMerType(String merType) {
		this.merType = merType == null ? null : merType.trim();
	}

	/**
	 * 获取管理机构机构号
	 * @return  MER_MGMTDEPTID - 管理机构机构号
	 */
	public String getMerMgmtdeptid() {
		return merMgmtdeptid;
	}

	/**
	 * 设置管理机构机构号
	 * @param merMgmtdeptid  管理机构机构号
	 */
	public void setMerMgmtdeptid(String merMgmtdeptid) {
		this.merMgmtdeptid = merMgmtdeptid == null ? null : merMgmtdeptid.trim();
	}

	/**
	 * 获取商户名称
	 * @return  MER_NAME - 商户名称
	 */
	public String getMerName() {
		return merName;
	}

	/**
	 * 设置商户名称
	 * @param merName  商户名称
	 */
	public void setMerName(String merName) {
		this.merName = merName == null ? null : merName.trim();
	}

	/**
	 * 获取开户机构号
	 * @return  MER_OPENDEPTID - 开户机构号
	 */
	public String getMerOpendeptid() {
		return merOpendeptid;
	}

	/**
	 * 设置开户机构号
	 * @param merOpendeptid  开户机构号
	 */
	public void setMerOpendeptid(String merOpendeptid) {
		this.merOpendeptid = merOpendeptid == null ? null : merOpendeptid.trim();
	}

	/**
	 * 获取发展行机构号
	 * @return  MER_DEVELOPDEPTID - 发展行机构号
	 */
	public String getMerDevelopdeptid() {
		return merDevelopdeptid;
	}

	/**
	 * 设置发展行机构号
	 * @param merDevelopdeptid  发展行机构号
	 */
	public void setMerDevelopdeptid(String merDevelopdeptid) {
		this.merDevelopdeptid = merDevelopdeptid == null ? null : merDevelopdeptid.trim();
	}

	/**
	 * 获取服务类型
	 * @return  MER_SERVICETYPE - 服务类型
	 */
	public String getMerServicetype() {
		return merServicetype;
	}

	/**
	 * 设置服务类型
	 * @param merServicetype  服务类型
	 */
	public void setMerServicetype(String merServicetype) {
		this.merServicetype = merServicetype == null ? null : merServicetype.trim();
	}

	/**
	 * 获取结算账户
	 * @return  MER_SETTACCTNO - 结算账户
	 */
	public String getMerSettacctno() {
		return merSettacctno;
	}

	/**
	 * 设置结算账户
	 * @param merSettacctno  结算账户
	 */
	public void setMerSettacctno(String merSettacctno) {
		this.merSettacctno = merSettacctno == null ? null : merSettacctno.trim();
	}

	/**
	 * 获取结算账户名称
	 * @return  MER_SETTACCTNAME - 结算账户名称
	 */
	public String getMerSettacctname() {
		return merSettacctname;
	}

	/**
	 * 设置结算账户名称
	 * @param merSettacctname  结算账户名称
	 */
	public void setMerSettacctname(String merSettacctname) {
		this.merSettacctname = merSettacctname == null ? null : merSettacctname.trim();
	}

	/**
	 * 获取结算账户签约号
	 * @return  MER_SETTACCTSIGNNO - 结算账户签约号
	 */
	public String getMerSettacctsignno() {
		return merSettacctsignno;
	}

	/**
	 * 设置结算账户签约号
	 * @param merSettacctsignno  结算账户签约号
	 */
	public void setMerSettacctsignno(String merSettacctsignno) {
		this.merSettacctsignno = merSettacctsignno == null ? null : merSettacctsignno.trim();
	}

	/**
	 * 获取手续费结算账号
	 * @return  MER_FEEACCTNO - 手续费结算账号
	 */
	public String getMerFeeacctno() {
		return merFeeacctno;
	}

	/**
	 * 设置手续费结算账号
	 * @param merFeeacctno  手续费结算账号
	 */
	public void setMerFeeacctno(String merFeeacctno) {
		this.merFeeacctno = merFeeacctno == null ? null : merFeeacctno.trim();
	}

	/**
	 * 获取手续费结算账户名称
	 * @return  MER_FEEACCTNAME - 手续费结算账户名称
	 */
	public String getMerFeeacctname() {
		return merFeeacctname;
	}

	/**
	 * 设置手续费结算账户名称
	 * @param merFeeacctname  手续费结算账户名称
	 */
	public void setMerFeeacctname(String merFeeacctname) {
		this.merFeeacctname = merFeeacctname == null ? null : merFeeacctname.trim();
	}

	/**
	 * 获取手续费结算账户签约号
	 * @return  MER_FEEACCTSIGNNO - 手续费结算账户签约号
	 */
	public String getMerFeeacctsignno() {
		return merFeeacctsignno;
	}

	/**
	 * 设置手续费结算账户签约号
	 * @param merFeeacctsignno  手续费结算账户签约号
	 */
	public void setMerFeeacctsignno(String merFeeacctsignno) {
		this.merFeeacctsignno = merFeeacctsignno == null ? null : merFeeacctsignno.trim();
	}

	/**
	 * 获取保证金账户
	 * @return  MER_BAILACCTNO - 保证金账户
	 */
	public String getMerBailacctno() {
		return merBailacctno;
	}

	/**
	 * 设置保证金账户
	 * @param merBailacctno  保证金账户
	 */
	public void setMerBailacctno(String merBailacctno) {
		this.merBailacctno = merBailacctno == null ? null : merBailacctno.trim();
	}

	/**
	 * 获取保证金金额
	 * @return  MER_BAILAMT - 保证金金额
	 */
	public String getMerBailamt() {
		return merBailamt;
	}

	/**
	 * 设置保证金金额
	 * @param merBailamt  保证金金额
	 */
	public void setMerBailamt(String merBailamt) {
		this.merBailamt = merBailamt;
	}

	/**
	 * 获取备付金账户
	 * @return  MER_THIDPARTACCTNO - 备付金账户
	 */
	public String getMerThidpartacctno() {
		return merThidpartacctno;
	}

	/**
	 * 设置备付金账户
	 * @param merThidpartacctno  备付金账户
	 */
	public void setMerThidpartacctno(String merThidpartacctno) {
		this.merThidpartacctno = merThidpartacctno == null ? null : merThidpartacctno.trim();
	}

	/**
	 * 获取联系人姓名
	 * @return  MER_LINKMANNAME - 联系人姓名
	 */
	public String getMerLinkmanname() {
		return merLinkmanname;
	}

	/**
	 * 设置联系人姓名
	 * @param merLinkmanname  联系人姓名
	 */
	public void setMerLinkmanname(String merLinkmanname) {
		this.merLinkmanname = merLinkmanname == null ? null : merLinkmanname.trim();
	}

	/**
	 * 获取联系人固定电话
	 * @return  MER_LINKMANTEL - 联系人固定电话
	 */
	public String getMerLinkmantel() {
		return merLinkmantel;
	}

	/**
	 * 设置联系人固定电话
	 * @param merLinkmantel  联系人固定电话
	 */
	public void setMerLinkmantel(String merLinkmantel) {
		this.merLinkmantel = merLinkmantel == null ? null : merLinkmantel.trim();
	}

	/**
	 * 获取联系人手机号
	 * @return  MER_LINKMANPHONE - 联系人手机号
	 */
	public String getMerLinkmanphone() {
		return merLinkmanphone;
	}

	/**
	 * 设置联系人手机号
	 * @param merLinkmanphone  联系人手机号
	 */
	public void setMerLinkmanphone(String merLinkmanphone) {
		this.merLinkmanphone = merLinkmanphone == null ? null : merLinkmanphone.trim();
	}

	/**
	 * 获取联系人e-mail
	 * @return  MER_LINKMANEMAIL - 联系人e-mail
	 */
	public String getMerLinkmanemail() {
		return merLinkmanemail;
	}

	/**
	 * 设置联系人e-mail
	 * @param merLinkmanemail  联系人e-mail
	 */
	public void setMerLinkmanemail(String merLinkmanemail) {
		this.merLinkmanemail = merLinkmanemail == null ? null : merLinkmanemail.trim();
	}

	/**
	 * 获取商户电话
	 * @return  MER_TEL - 商户电话
	 */
	public String getMerTel() {
		return merTel;
	}

	/**
	 * 设置商户电话
	 * @param merTel  商户电话
	 */
	public void setMerTel(String merTel) {
		this.merTel = merTel == null ? null : merTel.trim();
	}

	/**
	 * 获取商户传真
	 * @return  MER_FAX - 商户传真
	 */
	public String getMerFax() {
		return merFax;
	}

	/**
	 * 设置商户传真
	 * @param merFax  商户传真
	 */
	public void setMerFax(String merFax) {
		this.merFax = merFax == null ? null : merFax.trim();
	}

	/**
	 * 获取商户地址
	 * @return  MER_ADDR - 商户地址
	 */
	public String getMerAddr() {
		return merAddr;
	}

	/**
	 * 设置商户地址
	 * @param merAddr  商户地址
	 */
	public void setMerAddr(String merAddr) {
		this.merAddr = merAddr == null ? null : merAddr.trim();
	}

	/**
	 * 获取商户邮编
	 * @return  MER_POSTALCODE - 商户邮编
	 */
	public String getMerPostalcode() {
		return merPostalcode;
	}

	/**
	 * 设置商户邮编
	 * @param merPostalcode  商户邮编
	 */
	public void setMerPostalcode(String merPostalcode) {
		this.merPostalcode = merPostalcode == null ? null : merPostalcode.trim();
	}

	/**
	 * 获取网站地址
	 * @return  MER_SITECODE - 网站地址
	 */
	public String getMerSitecode() {
		return merSitecode;
	}

	/**
	 * 设置网站地址
	 * @param merSitecode  网站地址
	 */
	public void setMerSitecode(String merSitecode) {
		this.merSitecode = merSitecode == null ? null : merSitecode.trim();
	}

	/**
	 * 获取网站名称
	 * @return  MER_SITENAME - 网站名称
	 */
	public String getMerSitename() {
		return merSitename;
	}

	/**
	 * 设置网站名称
	 * @param merSitename  网站名称
	 */
	public void setMerSitename(String merSitename) {
		this.merSitename = merSitename == null ? null : merSitename.trim();
	}

	/**
	 * 获取商户区域地址
	 * @return  MER_DOMAIN - 商户区域地址
	 */
	public String getMerDomain() {
		return merDomain;
	}

	/**
	 * 设置商户区域地址
	 * @param merDomain  商户区域地址
	 */
	public void setMerDomain(String merDomain) {
		this.merDomain = merDomain == null ? null : merDomain.trim();
	}

	/**
	 * 获取营业范围
	 * @return  MER_WORKSCOP - 营业范围
	 */
	public String getMerWorkscop() {
		return merWorkscop;
	}

	/**
	 * 设置营业范围
	 * @param merWorkscop  营业范围
	 */
	public void setMerWorkscop(String merWorkscop) {
		this.merWorkscop = merWorkscop == null ? null : merWorkscop.trim();
	}

	/**
	 * 获取通知地址
	 * @return  MER_REPURL - 通知地址
	 */
	public String getMerRepurl() {
		return merRepurl;
	}

	/**
	 * 设置通知地址
	 * @param merRepurl  通知地址
	 */
	public void setMerRepurl(String merRepurl) {
		this.merRepurl = merRepurl == null ? null : merRepurl.trim();
	}

	/**
	 * 获取清算方式
	 * @return  MER_CLEARMODE - 清算方式
	 */
	public String getMerClearmode() {
		return merClearmode;
	}

	/**
	 * 设置清算方式
	 * @param merClearmode  清算方式
	 */
	public void setMerClearmode(String merClearmode) {
		this.merClearmode = merClearmode == null ? null : merClearmode.trim();
	}

	/**
	 * 获取结算方式
	 * @return  MER_SETTMODE - 结算方式
	 */
	public String getMerSettmode() {
		return merSettmode;
	}

	/**
	 * 设置结算方式
	 * @param merSettmode  结算方式
	 */
	public void setMerSettmode(String merSettmode) {
		this.merSettmode = merSettmode == null ? null : merSettmode.trim();
	}

	/**
	 * 获取结算周期
	 * @return  MER_SETTPERIOD - 结算周期
	 */
	public String getMerSettperiod() {
		return merSettperiod;
	}

	/**
	 * 设置结算周期
	 * @param merSettperiod  结算周期
	 */
	public void setMerSettperiod(String merSettperiod) {
		this.merSettperiod = merSettperiod == null ? null : merSettperiod.trim();
	}

	/**
	 * 获取手续费结算周期
	 * @return  MER_FEESETTPERIOD - 手续费结算周期
	 */
	public String getMerFeesettperiod() {
		return merFeesettperiod;
	}

	/**
	 * 设置手续费结算周期
	 * @param merFeesettperiod  手续费结算周期
	 */
	public void setMerFeesettperiod(String merFeesettperiod) {
		this.merFeesettperiod = merFeesettperiod == null ? null : merFeesettperiod.trim();
	}

	/**
	 * 获取mer_serviceamt
	 * @return  MER_SERVICEAMT - mer_serviceamt
	 */
	public String getMerServiceamt() {
		return merServiceamt;
	}

	/**
	 * 设置mer_serviceamt
	 * @param merServiceamt  mer_serviceamt
	 */
	public void setMerServiceamt(String merServiceamt) {
		this.merServiceamt = merServiceamt;
	}

	/**
	 * 获取mer_serviceamtrcvdate
	 * @return  MER_SERVICEAMTRCVDATE - mer_serviceamtrcvdate
	 */
	public String getMerServiceamtrcvdate() {
		return merServiceamtrcvdate;
	}

	/**
	 * 设置mer_serviceamtrcvdate
	 * @param merServiceamtrcvdate  mer_serviceamtrcvdate
	 */
	public void setMerServiceamtrcvdate(String merServiceamtrcvdate) {
		this.merServiceamtrcvdate = merServiceamtrcvdate;
	}

	/**
	 * 获取证书编号
	 * @return  MER_CERTSN - 证书编号
	 */
	public String getMerCertsn() {
		return merCertsn;
	}

	/**
	 * 设置证书编号
	 * @param merCertsn  证书编号
	 */
	public void setMerCertsn(String merCertsn) {
		this.merCertsn = merCertsn == null ? null : merCertsn.trim();
	}

	/**
	 * 获取证书上传日期
	 * @return  MER_CERTUPLOADDATE - 证书上传日期
	 */
	public String getMerCertuploaddate() {
		return merCertuploaddate;
	}

	/**
	 * 设置证书上传日期
	 * @param merCertuploaddate  证书上传日期
	 */
	public void setMerCertuploaddate(String merCertuploaddate) {
		this.merCertuploaddate = merCertuploaddate;
	}

	/**
	 * 获取商户建立日期
	 * @return  MER_OPENDATE - 商户建立日期
	 */
	public String getMerOpendate() {
		return merOpendate;
	}

	/**
	 * 设置商户建立日期
	 * @param merOpendate  商户建立日期
	 */
	public void setMerOpendate(String merOpendate) {
		this.merOpendate = merOpendate;
	}

	/**
	 * 获取商户建立操作员
	 * @return  MER_OPENUSER - 商户建立操作员
	 */
	public String getMerOpenuser() {
		return merOpenuser;
	}

	/**
	 * 设置商户建立操作员
	 * @param merOpenuser  商户建立操作员
	 */
	public void setMerOpenuser(String merOpenuser) {
		this.merOpenuser = merOpenuser == null ? null : merOpenuser.trim();
	}

	/**
	 * 获取商户修改日期
	 * @return  MER_MODIFYDATE - 商户修改日期
	 */
	public String getMerModifydate() {
		return merModifydate;
	}

	/**
	 * 设置商户修改日期
	 * @param merModifydate  商户修改日期
	 */
	public void setMerModifydate(String merModifydate) {
		this.merModifydate = merModifydate;
	}

	/**
	 * 获取商户修改操作员
	 * @return  MER_MODIFYUSER - 商户修改操作员
	 */
	public String getMerModifyuser() {
		return merModifyuser;
	}

	/**
	 * 设置商户修改操作员
	 * @param merModifyuser  商户修改操作员
	 */
	public void setMerModifyuser(String merModifyuser) {
		this.merModifyuser = merModifyuser == null ? null : merModifyuser.trim();
	}

	/**
	 * 获取商户关闭日期
	 * @return  MER_CLOSEDATE - 商户关闭日期
	 */
	public String getMerClosedate() {
		return merClosedate;
	}

	/**
	 * 设置商户关闭日期
	 * @param merClosedate  商户关闭日期
	 */
	public void setMerClosedate(String merClosedate) {
		this.merClosedate = merClosedate;
	}

	/**
	 * 获取商户手续费结算模式
	 * @return  MER_FEEMODE - 商户手续费结算模式
	 */
	public String getMerFeemode() {
		return merFeemode;
	}

	/**
	 * 设置商户手续费结算模式
	 * @param merFeemode  商户手续费结算模式
	 */
	public void setMerFeemode(String merFeemode) {
		this.merFeemode = merFeemode == null ? null : merFeemode.trim();
	}

	/**
	 * 获取商户手续费率
	 * @return  MER_FEEAMT - 商户手续费率
	 */
	public String getMerFeeamt() {
		return merFeeamt;
	}

	/**
	 * 设置商户手续费率
	 * @param merFeeamt  商户手续费率
	 */
	public void setMerFeeamt(String merFeeamt) {
		this.merFeeamt = merFeeamt == null ? null : merFeeamt.trim();
	}

	/**
	 * 获取商户手续费返还标识
	 * @return  MER_FEERETURNFLAG - 商户手续费返还标识
	 */
	public String getMerFeereturnflag() {
		return merFeereturnflag;
	}

	/**
	 * 设置商户手续费返还标识
	 * @param merFeereturnflag  商户手续费返还标识
	 */
	public void setMerFeereturnflag(String merFeereturnflag) {
		this.merFeereturnflag = merFeereturnflag == null ? null : merFeereturnflag.trim();
	}

	/**
	 * 获取商户关闭操作员
	 * @return  MER_CLOSEUSER - 商户关闭操作员
	 */
	public String getMerCloseuser() {
		return merCloseuser;
	}

	/**
	 * 设置商户关闭操作员
	 * @param merCloseuser  商户关闭操作员
	 */
	public void setMerCloseuser(String merCloseuser) {
		this.merCloseuser = merCloseuser == null ? null : merCloseuser.trim();
	}

	/**
	 * 获取商户订单机构号
	 * @return  MER_ORDERDEPTID - 商户订单机构号
	 */
	public String getMerOrderdeptid() {
		return merOrderdeptid;
	}

	/**
	 * 设置商户订单机构号
	 * @param merOrderdeptid  商户订单机构号
	 */
	public void setMerOrderdeptid(String merOrderdeptid) {
		this.merOrderdeptid = merOrderdeptid == null ? null : merOrderdeptid.trim();
	}

	/**
	 * 获取商户公司名称
	 * @return  MER_COMPANYNAME - 商户公司名称
	 */
	public String getMerCompanyname() {
		return merCompanyname;
	}

	/**
	 * 设置商户公司名称
	 * @param merCompanyname  商户公司名称
	 */
	public void setMerCompanyname(String merCompanyname) {
		this.merCompanyname = merCompanyname == null ? null : merCompanyname.trim();
	}

	/**
	 * 获取商户验证标识
	 * @return  MER_AUTHCHECKFLAG - 商户验证标识
	 */
	public String getMerAuthcheckflag() {
		return merAuthcheckflag;
	}

	/**
	 * 设置商户验证标识
	 * @param merAuthcheckflag  商户验证标识
	 */
	public void setMerAuthcheckflag(String merAuthcheckflag) {
		this.merAuthcheckflag = merAuthcheckflag == null ? null : merAuthcheckflag.trim();
	}

	/**
	 * 获取商户激活标识
	 * @return  MER_ACTIVEFLAG - 商户激活标识
	 */
	public String getMerActiveflag() {
		return merActiveflag;
	}

	/**
	 * 设置商户激活标识
	 * @param merActiveflag  商户激活标识
	 */
	public void setMerActiveflag(String merActiveflag) {
		this.merActiveflag = merActiveflag == null ? null : merActiveflag.trim();
	}

	/**
	 * 获取商户支付开放标识
	 * @return  MER_PAYOPENFLAG - 商户支付开放标识
	 */
	public String getMerPayopenflag() {
		return merPayopenflag;
	}

	/**
	 * 设置商户支付开放标识
	 * @param merPayopenflag  商户支付开放标识
	 */
	public void setMerPayopenflag(String merPayopenflag) {
		this.merPayopenflag = merPayopenflag == null ? null : merPayopenflag.trim();
	}

	/**
	 * 获取法人名称
	 * @return  MER_CORPORATIONNAME - 法人名称
	 */
	public String getMerCorporationname() {
		return merCorporationname;
	}

	/**
	 * 设置法人名称
	 * @param merCorporationname  法人名称
	 */
	public void setMerCorporationname(String merCorporationname) {
		this.merCorporationname = merCorporationname == null ? null : merCorporationname.trim();
	}

	/**
	 * 获取法人证件类型
	 * @return  MER_CORPORATIONPAPERTYPE - 法人证件类型
	 */
	public String getMerCorporationpapertype() {
		return merCorporationpapertype;
	}

	/**
	 * 设置法人证件类型
	 * @param merCorporationpapertype  法人证件类型
	 */
	public void setMerCorporationpapertype(String merCorporationpapertype) {
		this.merCorporationpapertype = merCorporationpapertype == null ? null : merCorporationpapertype.trim();
	}

	/**
	 * 获取法人证件号
	 * @return  MER_CORPORATIONPAPERID - 法人证件号
	 */
	public String getMerCorporationpaperid() {
		return merCorporationpaperid;
	}

	/**
	 * 设置法人证件号
	 * @param merCorporationpaperid  法人证件号
	 */
	public void setMerCorporationpaperid(String merCorporationpaperid) {
		this.merCorporationpaperid = merCorporationpaperid == null ? null : merCorporationpaperid.trim();
	}

	/**
	 * 获取mer_corporationidtype
	 * @return  MER_CORPORATIONIDTYPE - mer_corporationidtype
	 */
	public String getMerCorporationidtype() {
		return merCorporationidtype;
	}

	/**
	 * 设置mer_corporationidtype
	 * @param merCorporationidtype  mer_corporationidtype
	 */
	public void setMerCorporationidtype(String merCorporationidtype) {
		this.merCorporationidtype = merCorporationidtype == null ? null : merCorporationidtype.trim();
	}

	/**
	 * 获取mer_corporationidno
	 * @return  MER_CORPORATIONIDNO - mer_corporationidno
	 */
	public String getMerCorporationidno() {
		return merCorporationidno;
	}

	/**
	 * 设置mer_corporationidno
	 * @param merCorporationidno  mer_corporationidno
	 */
	public void setMerCorporationidno(String merCorporationidno) {
		this.merCorporationidno = merCorporationidno == null ? null : merCorporationidno.trim();
	}

	/**
	 * 获取最低手续费
	 * @return  MER_FEEMINAMT - 最低手续费
	 */
	public String getMerFeeminamt() {
		return merFeeminamt;
	}

	/**
	 * 设置最低手续费
	 * @param merFeeminamt  最低手续费
	 */
	public void setMerFeeminamt(String merFeeminamt) {
		this.merFeeminamt = merFeeminamt;
	}

	/**
	 * 获取最高手续费
	 * @return  MER_FEEMAXAMT - 最高手续费
	 */
	public String getMerFeemaxamt() {
		return merFeemaxamt;
	}

	/**
	 * 设置最高手续费
	 * @param merFeemaxamt  最高手续费
	 */
	public void setMerFeemaxamt(String merFeemaxamt) {
		this.merFeemaxamt = merFeemaxamt;
	}

	/**
	 * 获取商户账户类型
	 * @return  MER_ACCTTYPE - 商户账户类型
	 */
	public String getMerAccttype() {
		return merAccttype;
	}

	/**
	 * 设置商户账户类型
	 * @param merAccttype  商户账户类型
	 */
	public void setMerAccttype(String merAccttype) {
		this.merAccttype = merAccttype == null ? null : merAccttype.trim();
	}

	/**
	 * 获取商户原机构号
	 * @return  MER_ORGDEPTID - 商户原机构号
	 */
	public String getMerOrgdeptid() {
		return merOrgdeptid;
	}

	/**
	 * 设置商户原机构号
	 * @param merOrgdeptid  商户原机构号
	 */
	public void setMerOrgdeptid(String merOrgdeptid) {
		this.merOrgdeptid = merOrgdeptid == null ? null : merOrgdeptid.trim();
	}

	/**
	 * 获取营业执照编号
	 * @return  MER_BUSINESSLICENSEID - 营业执照编号
	 */
	public String getMerBusinesslicenseid() {
		return merBusinesslicenseid;
	}

	/**
	 * 设置营业执照编号
	 * @param merBusinesslicenseid  营业执照编号
	 */
	public void setMerBusinesslicenseid(String merBusinesslicenseid) {
		this.merBusinesslicenseid = merBusinesslicenseid.trim();
	}

	/**
	 * 获取分润协议号
	 * @return  PROFIT_SEQNO - 分润协议号
	 */
	public String getProfitSeqno() {
		return profitSeqno;
	}

	/**
	 * 设置分润协议号
	 * @param profitSeqno  分润协议号
	 */
	public void setProfitSeqno(String profitSeqno) {
		this.profitSeqno = profitSeqno == null ? null : profitSeqno.trim();
	}

	/**
	 * 获取商户编号
	 * @return  MER_INSTID - 商户编号
	 */
	public String getMerInstid() {
		return merInstid;
	}

	/**
	 * 设置商户编号
	 * @param merInstid  商户编号
	 */
	public void setMerInstid(String merInstid) {
		this.merInstid = merInstid == null ? null : merInstid.trim();
	}

	/**
	 * 获取商户结算账户类型
	 * @return  MER_SETTACCTTYPE - 商户结算账户类型
	 */
	public String getMerSettaccttype() {
		return merSettaccttype;
	}

	/**
	 * 设置商户结算账户类型
	 * @param merSettaccttype  商户结算账户类型
	 */
	public void setMerSettaccttype(String merSettaccttype) {
		this.merSettaccttype = merSettaccttype == null ? null : merSettaccttype.trim();
	}

	/**
	 * 获取商户手续费账户类型
	 * @return  MER_FEEACCTTYPE - 商户手续费账户类型
	 */
	public String getMerFeeaccttype() {
		return merFeeaccttype;
	}

	/**
	 * 设置商户手续费账户类型
	 * @param merFeeaccttype  商户手续费账户类型
	 */
	public void setMerFeeaccttype(String merFeeaccttype) {
		this.merFeeaccttype = merFeeaccttype == null ? null : merFeeaccttype.trim();
	}

	/**
	 * 获取商户保证金账户类型
	 * @return  MER_BAILACCTTYPE - 商户保证金账户类型
	 */
	public String getMerBailaccttype() {
		return merBailaccttype;
	}

	/**
	 * 设置商户保证金账户类型
	 * @param merBailaccttype  商户保证金账户类型
	 */
	public void setMerBailaccttype(String merBailaccttype) {
		this.merBailaccttype = merBailaccttype == null ? null : merBailaccttype.trim();
	}

	/**
	 * 获取商户简称
	 * @return  MER_BRIEFNAME - 商户简称
	 */
	public String getMerBriefname() {
		return merBriefname;
	}

	/**
	 * 设置商户简称
	 * @param merBriefname  商户简称
	 */
	public void setMerBriefname(String merBriefname) {
		this.merBriefname = merBriefname == null ? null : merBriefname.trim();
	}

	/**
	 * 获取营业标识
	 * @return  MER_IFONLINE - 营业标识
	 */
	public String getMerIfonline() {
		return merIfonline;
	}

	/**
	 * 设置营业标识
	 * @param merIfonline  营业标识
	 */
	public void setMerIfonline(String merIfonline) {
		this.merIfonline = merIfonline == null ? null : merIfonline.trim();
	}

	/**
	 * 获取注册法人
	 * @return  MER_REGCAPITAL - 注册法人
	 */
	public String getMerRegcapital() {
		return merRegcapital;
	}

	/**
	 * 设置注册法人
	 * @param merRegcapital  注册法人
	 */
	public void setMerRegcapital(String merRegcapital) {
		this.merRegcapital = merRegcapital;
	}

	/**
	 * 获取税务登记号
	 * @return  MER_TAXREGID - 税务登记号
	 */
	public String getMerTaxregid() {
		return merTaxregid;
	}

	/**
	 * 设置税务登记号
	 * @param merTaxregid  税务登记号
	 */
	public void setMerTaxregid(String merTaxregid) {
		this.merTaxregid = merTaxregid == null ? null : merTaxregid.trim();
	}

	/**
	 * 获取营业执照有效期
	 * @return  MER_BUSINESSOPENDATE - 营业执照有效期
	 */
	public String getMerBusinessopendate() {
		return merBusinessopendate;
	}

	/**
	 * 设置营业执照有效期
	 * @param merBusinessopendate  营业执照有效期
	 */
	public void setMerBusinessopendate(String merBusinessopendate) {
		this.merBusinessopendate = merBusinessopendate;
	}

	/**
	 * 获取商户所有权
	 * @return  MER_PROPERTY - 商户所有权
	 */
	public String getMerProperty() {
		return merProperty;
	}

	/**
	 * 设置商户所有权
	 * @param merProperty  商户所有权
	 */
	public void setMerProperty(String merProperty) {
		this.merProperty = merProperty == null ? null : merProperty.trim();
	}

	/**
	 * 获取商户网站地址
	 * @return  MER_SITEIPORT - 商户网站地址
	 */
	public String getMerSiteiport() {
		return merSiteiport;
	}

	/**
	 * 设置商户网站地址
	 * @param merSiteiport  商户网站地址
	 */
	public void setMerSiteiport(String merSiteiport) {
		this.merSiteiport = merSiteiport == null ? null : merSiteiport.trim();
	}

	/**
	 * 获取是否是虚拟商品
	 * @return  MER_IFVIRTRUALGOODS - 是否是虚拟商品
	 */
	public String getMerIfvirtrualgoods() {
		return merIfvirtrualgoods;
	}

	/**
	 * 设置是否是虚拟商品
	 * @param merIfvirtrualgoods  是否是虚拟商品
	 */
	public void setMerIfvirtrualgoods(String merIfvirtrualgoods) {
		this.merIfvirtrualgoods = merIfvirtrualgoods == null ? null : merIfvirtrualgoods.trim();
	}

	/**
	 * 获取特殊行业许可证
	 * @return  MER_SPECIALLICENSE - 特殊行业许可证
	 */
	public String getMerSpeciallicense() {
		return merSpeciallicense;
	}

	/**
	 * 设置特殊行业许可证
	 * @param merSpeciallicense  特殊行业许可证
	 */
	public void setMerSpeciallicense(String merSpeciallicense) {
		this.merSpeciallicense = merSpeciallicense == null ? null : merSpeciallicense.trim();
	}

	/**
	 * 获取许可证
	 * @return  MER_LICENESE - 许可证
	 */
	public String getMerLicenese() {
		return merLicenese;
	}

	/**
	 * 设置许可证
	 * @param merLicenese  许可证
	 */
	public void setMerLicenese(String merLicenese) {
		this.merLicenese = merLicenese == null ? null : merLicenese.trim();
	}

	/**
	 * 获取mer_if2levelmer
	 * @return  MER_IF2LEVELMER - mer_if2levelmer
	 */
	public String getMerIf2levelmer() {
		return merIf2levelmer;
	}

	/**
	 * 设置mer_if2levelmer
	 * @param merIf2levelmer  mer_if2levelmer
	 */
	public void setMerIf2levelmer(String merIf2levelmer) {
		this.merIf2levelmer = merIf2levelmer == null ? null : merIf2levelmer.trim();
	}

	/**
	 * 获取mer_ifinnersett
	 * @return  MER_IFINNERSETT - mer_ifinnersett
	 */
	public String getMerIfinnersett() {
		return merIfinnersett;
	}

	/**
	 * 设置mer_ifinnersett
	 * @param merIfinnersett  mer_ifinnersett
	 */
	public void setMerIfinnersett(String merIfinnersett) {
		this.merIfinnersett = merIfinnersett == null ? null : merIfinnersett.trim();
	}

	/**
	 * 获取技术联系人名称
	 * @return  MER_TECHLINKNAME - 技术联系人名称
	 */
	public String getMerTechlinkname() {
		return merTechlinkname;
	}

	/**
	 * 设置技术联系人名称
	 * @param merTechlinkname  技术联系人名称
	 */
	public void setMerTechlinkname(String merTechlinkname) {
		this.merTechlinkname = merTechlinkname == null ? null : merTechlinkname.trim();
	}

	/**
	 * 获取技术联系人电话
	 * @return  MER_TECHLINKMANTEL - 技术联系人电话
	 */
	public String getMerTechlinkmantel() {
		return merTechlinkmantel;
	}

	/**
	 * 设置技术联系人电话
	 * @param merTechlinkmantel  技术联系人电话
	 */
	public void setMerTechlinkmantel(String merTechlinkmantel) {
		this.merTechlinkmantel = merTechlinkmantel == null ? null : merTechlinkmantel.trim();
	}

	/**
	 * 获取技术联系人手机
	 * @return  MER_TECHLINKMANPHONE - 技术联系人手机
	 */
	public String getMerTechlinkmanphone() {
		return merTechlinkmanphone;
	}

	/**
	 * 设置技术联系人手机
	 * @param merTechlinkmanphone  技术联系人手机
	 */
	public void setMerTechlinkmanphone(String merTechlinkmanphone) {
		this.merTechlinkmanphone = merTechlinkmanphone == null ? null : merTechlinkmanphone.trim();
	}

	/**
	 * 获取技术联系人e-mail
	 * @return  MER_TECHLINKMANEMAIL - 技术联系人e-mail
	 */
	public String getMerTechlinkmanemail() {
		return merTechlinkmanemail;
	}

	/**
	 * 设置技术联系人e-mail
	 * @param merTechlinkmanemail  技术联系人e-mail
	 */
	public void setMerTechlinkmanemail(String merTechlinkmanemail) {
		this.merTechlinkmanemail = merTechlinkmanemail == null ? null : merTechlinkmanemail.trim();
	}

	/**
	 * 获取结算账户机构号
	 * @return  MER_SETTACDEPTID - 结算账户机构号
	 */
	public String getMerSettacdeptid() {
		return merSettacdeptid;
	}

	/**
	 * 设置结算账户机构号
	 * @param merSettacdeptid  结算账户机构号
	 */
	public void setMerSettacdeptid(String merSettacdeptid) {
		this.merSettacdeptid = merSettacdeptid == null ? null : merSettacdeptid.trim();
	}

	/**
	 * 获取mer_ifinnercif
	 * @return  MER_IFINNERCIF - mer_ifinnercif
	 */
	public String getMerIfinnercif() {
		return merIfinnercif;
	}

	/**
	 * 设置mer_ifinnercif
	 * @param merIfinnercif  mer_ifinnercif
	 */
	public void setMerIfinnercif(String merIfinnercif) {
		this.merIfinnercif = merIfinnercif == null ? null : merIfinnercif.trim();
	}

	/**
	 * 获取mer_ciflevel
	 * @return  MER_CIFLEVEL - mer_ciflevel
	 */
	public String getMerCiflevel() {
		return merCiflevel;
	}

	/**
	 * 设置mer_ciflevel
	 * @param merCiflevel  mer_ciflevel
	 */
	public void setMerCiflevel(String merCiflevel) {
		this.merCiflevel = merCiflevel == null ? null : merCiflevel.trim();
	}

	/**
	 * 获取mer_comproperties
	 * @return  MER_COMPROPERTIES - mer_comproperties
	 */
	public String getMerComproperties() {
		return merComproperties;
	}

	/**
	 * 设置mer_comproperties
	 * @param merComproperties  mer_comproperties
	 */
	public void setMerComproperties(String merComproperties) {
		this.merComproperties = merComproperties == null ? null : merComproperties.trim();
	}

	/**
	 * 获取营业执照号
	 * @return  COM_BUSSINESSLICENSEID - 营业执照号
	 */
	public String getComBussinesslicenseid() {
		return comBussinesslicenseid;
	}

	/**
	 * 设置营业执照号
	 * @param comBussinesslicenseid  营业执照号
	 */
	public void setComBussinesslicenseid(String comBussinesslicenseid) {
		this.comBussinesslicenseid = comBussinesslicenseid == null ? null : comBussinesslicenseid.trim();
	}

	/**
	 * 获取公司税务登记号
	 * @return  COM_TAXREGID - 公司税务登记号
	 */
	public String getComTaxregid() {
		return comTaxregid;
	}

	/**
	 * 设置公司税务登记号
	 * @param comTaxregid  公司税务登记号
	 */
	public void setComTaxregid(String comTaxregid) {
		this.comTaxregid = comTaxregid == null ? null : comTaxregid.trim();
	}

	/**
	 * 获取公司地址
	 * @return  COM_ADDR - 公司地址
	 */
	public String getComAddr() {
		return comAddr;
	}

	/**
	 * 设置公司地址
	 * @param comAddr  公司地址
	 */
	public void setComAddr(String comAddr) {
		this.comAddr = comAddr == null ? null : comAddr.trim();
	}

	/**
	 * 获取公司邮编
	 * @return  COM_ZIPCODE - 公司邮编
	 */
	public String getComZipcode() {
		return comZipcode;
	}

	/**
	 * 设置公司邮编
	 * @param comZipcode  公司邮编
	 */
	public void setComZipcode(String comZipcode) {
		this.comZipcode = comZipcode == null ? null : comZipcode.trim();
	}

	/**
	 * 获取公司联系人手机号
	 * @return  COM_PHONE - 公司联系人手机号
	 */
	public String getComPhone() {
		return comPhone;
	}

	/**
	 * 设置公司联系人手机号
	 * @param comPhone  公司联系人手机号
	 */
	public void setComPhone(String comPhone) {
		this.comPhone = comPhone == null ? null : comPhone.trim();
	}

	/**
	 * 获取公司传真
	 * @return  COM_FAX - 公司传真
	 */
	public String getComFax() {
		return comFax;
	}

	/**
	 * 设置公司传真
	 * @param comFax  公司传真
	 */
	public void setComFax(String comFax) {
		this.comFax = comFax == null ? null : comFax.trim();
	}

	/**
	 * 获取商户级别
	 * @return  MER_LEVEL - 商户级别
	 */
	public String getMerLevel() {
		return merLevel;
	}

	/**
	 * 设置商户级别
	 * @param merLevel  商户级别
	 */
	public void setMerLevel(String merLevel) {
		this.merLevel = merLevel == null ? null : merLevel.trim();
	}

	/**
	 * 获取商户交易类型
	 * @return  MER_TRANSTYPE - 商户交易类型
	 */
	public String getMerTranstype() {
		return merTranstype;
	}

	/**
	 * 设置商户交易类型
	 * @param merTranstype  商户交易类型
	 */
	public void setMerTranstype(String merTranstype) {
		this.merTranstype = merTranstype == null ? null : merTranstype.trim();
	}

	/**
	 * 获取商户现在
	 * @return  MER_LIMIT - 商户现在
	 */
	public String getMerLimit() {
		return merLimit;
	}

	/**
	 * 设置商户现在
	 * @param merLimit  商户现在
	 */
	public void setMerLimit(String merLimit) {
		this.merLimit = merLimit;
	}

	/**
	 * 获取结算类型 01 结算至门店 02 结算至商户
	 * @return  SETTLEMENT_TYPE - 结算类型 01 结算至门店 02 结算至商户
	 */
	public String getSettlementType() {
		return settlementType;
	}

	/**
	 * 设置结算类型 01 结算至门店 02 结算至商户
	 * @param settlementType  结算类型 01 结算至门店 02 结算至商户
	 */
	public void setSettlementType(String settlementType) {
		this.settlementType = settlementType == null ? null : settlementType.trim();
	}

	/**
	 * 获取商户二维码
	 * @return  QR_CODE - 商户二维码
	 */
	public String getQrCode() {
		return qrCode;
	}

	/**
	 * 设置商户二维码
	 * @param qrCode  商户二维码
	 */
	public void setQrCode(String qrCode) {
		this.qrCode = qrCode == null ? null : qrCode.trim();
	}

	/**
	 * 获取代理商id
	 * @return  AGENT_ID - 代理商id
	 */
	public String getAgentId() {
		return agentId;
	}

	/**
	 * 设置代理商id
	 * @param agentId  代理商id
	 */
	public void setAgentId(String agentId) {
		this.agentId = agentId == null ? null : agentId.trim();
	}

	/**
	 * 获取微信id
	 * @return  MER_WXID - 微信id
	 */
	public String getMerWxid() {
		return merWxid;
	}

	/**
	 * 设置微信id
	 * @param merWxid  微信id
	 */
	public void setMerWxid(String merWxid) {
		this.merWxid = merWxid == null ? null : merWxid.trim();
	}

	/**
	 * 获取subappid
	 * @return  SUB_APPID - subappid
	 */
	public String getSubAppid() {
		return subAppid;
	}

	/**
	 * 设置subappid
	 * @param subAppid  subappid
	 */
	public void setSubAppid(String subAppid) {
		this.subAppid = subAppid == null ? null : subAppid.trim();
	}

	/**
	 * 获取js_api_path
	 * @return  JS_API_PATH - js_api_path
	 */
	public String getJsApiPath() {
		return jsApiPath;
	}

	/**
	 * 设置js_api_path
	 * @param jsApiPath  js_api_path
	 */
	public void setJsApiPath(String jsApiPath) {
		this.jsApiPath = jsApiPath == null ? null : jsApiPath.trim();
	}

	/**
	 * 获取sub_scribe_appid
	 * @return  SUB_SCRIBE_APPID - sub_scribe_appid
	 */
	public String getSubScribeAppid() {
		return subScribeAppid;
	}

	/**
	 * 设置sub_scribe_appid
	 * @param subScribeAppid  sub_scribe_appid
	 */
	public void setSubScribeAppid(String subScribeAppid) {
		this.subScribeAppid = subScribeAppid == null ? null : subScribeAppid.trim();
	}

	/**
	 * 获取wx_status
	 * @return  WX_STATUS - wx_status
	 */
	public String getWxStatus() {
		return wxStatus;
	}

	/**
	 * 设置wx_status
	 * @param wxStatus  wx_status
	 */
	public void setWxStatus(String wxStatus) {
		this.wxStatus = wxStatus == null ? null : wxStatus.trim();
	}

	/**
	 * 获取协议状态
	 * @return  PROTOCAL_STATUS - 协议状态
	 */
	public String getProtocalStatus() {
		return protocalStatus;
	}

	/**
	 * 设置协议状态
	 * @param protocalStatus  协议状态
	 */
	public void setProtocalStatus(String protocalStatus) {
		this.protocalStatus = protocalStatus == null ? null : protocalStatus.trim();
	}

	/**
	 * 获取签约日期
	 * @return  PROTOCAL_SIGN_DATE - 签约日期
	 */
	public String getProtocalSignDate() {
		return protocalSignDate;
	}

	/**
	 * 设置签约日期
	 * @param protocalSignDate  签约日期
	 */
	public void setProtocalSignDate(String protocalSignDate) {
		this.protocalSignDate = protocalSignDate;
	}

	/**
	 * 获取密钥id
	 * @return  KEY_ID - 密钥id
	 */
	public String getKeyId() {
		return keyId;
	}

	/**
	 * 设置密钥id
	 * @param keyId  密钥id
	 */
	public void setKeyId(String keyId) {
		this.keyId = keyId == null ? null : keyId.trim();
	}

	/**
	 * 获取商户证书
	 * @return  MER_CERT - 商户证书
	 */
	public String getMerCert() {
		return merCert;
	}

	/**
	 * 设置商户证书
	 * @param merCert  商户证书
	 */
	public void setMerCert(String merCert) {
		this.merCert = merCert == null ? null : merCert.trim();
	}

	/**
	 * 获取公司备注
	 * @return  COM_REMARK - 公司备注
	 */
	public String getComRemark() {
		return comRemark;
	}

	/**
	 * 设置公司备注
	 * @param comRemark  公司备注
	 */
	public void setComRemark(String comRemark) {
		this.comRemark = comRemark == null ? null : comRemark.trim();
	}

	/**
	 * 获取证件正面
	 * @return  CERT_FRONT_PICTURE - 证件正面
	 */
	public byte[] getCertFrontPicture() {
		return certFrontPicture;
	}

	/**
	 * 设置证件正面
	 * @param certFrontPicture  证件正面
	 */
	public void setCertFrontPicture(byte[] certFrontPicture) {
		this.certFrontPicture = certFrontPicture;
	}

	/**
	 * 获取证件背面
	 * @return  CERT_BACK_PICTURE - 证件背面
	 */
	public byte[] getCertBackPicture() {
		return certBackPicture;
	}

	/**
	 * 设置证件背面
	 * @param certBackPicture  证件背面
	 */
	public void setCertBackPicture(byte[] certBackPicture) {
		this.certBackPicture = certBackPicture;
	}

	/**
	 * 获取营业执照照片
	 * @return  COM_BUSSINESSLICENSE_PICTURE - 营业执照照片
	 */
	public byte[] getComBussinesslicensePicture() {
		return comBussinesslicensePicture;
	}

	/**
	 * 设置营业执照照片
	 * @param comBussinesslicensePicture  营业执照照片
	 */
	public void setComBussinesslicensePicture(byte[] comBussinesslicensePicture) {
		this.comBussinesslicensePicture = comBussinesslicensePicture;
	}

	/**
	 * 获取原始证件照片
	 * @return  ORG_CERT_PICTURE - 原始证件照片
	 */
	public byte[] getOrgCertPicture() {
		return orgCertPicture;
	}

	/**
	 * 设置原始证件照片
	 * @param orgCertPicture  原始证件照片
	 */
	public void setOrgCertPicture(byte[] orgCertPicture) {
		this.orgCertPicture = orgCertPicture;
	}

	/**
	 * 获取税务登记证照片
	 * @return  TAX_PICTURE - 税务登记证照片
	 */
	public byte[] getTaxPicture() {
		return taxPicture;
	}

	/**
	 * 设置税务登记证照片
	 * @param taxPicture  税务登记证照片
	 */
	public void setTaxPicture(byte[] taxPicture) {
		this.taxPicture = taxPicture;
	}

}

package com.csair.b2c.cloud.test.sys.model;


import java.io.Serializable;

public class InsuranceInfoBean implements Serializable{
    private static final long serialVersionUID = -7579991402058047996L;
	private String _id;
	private String name;	//保险产品名称
	private Integer price;	//保险费用（元）
	private Integer dRatio;	//国内展示几率（%）
	private Integer iRatio;		//国际展示几率（%）
	private Integer unReturnAmount;		//最低可退金额（元）
	private String inUsed;				//是否使用（1是；0否）
	private String limitDay;		//航班起飞前保险购买的限制天数 如果不填，则为不限制
	private String type;			//保险类型（a:航空综合险,b:机票退改险,ab:综合+退改）
	private String prodCode;	//产品代码
	private String scope;			//使用范围
	private Integer ratio;  				//展示几率
	private String exp;			//保险组合
	private String corpAbbr; 			//公司缩写代号
	private String corpNameZh;				//公司中文名 长度64 (新增)
	private String detailDescUrlZh;			//中文详细说明链接  长度200 (新增)
	private String detailDescUrlEn;			//英文详细说明链接 长度200 (新增)
	private String claimsDescZh;			//保险理赔说明中文 长度400 (新增) 
	private String claimsDescEn;			//保险理赔说明英文 长度400 (新增)
	private String detailDescUrlZhH5;		//H5端保险说明中文链接配置(新增)
	private String detailDescUrlEnH5;		//H5端保险说明英文链接配置(新增)
	
	public String get_id() {
		return _id;
	}
	public void set_id(String _id) {
		this._id = _id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getdRatio() {
		return dRatio;
	}
	public void setdRatio(Integer dRatio) {
		this.dRatio = dRatio;
	}
	public Integer getiRatio() {
		return iRatio;
	}
	public void setiRatio(Integer iRatio) {
		this.iRatio = iRatio;
	}
	public Integer getUnReturnAmount() {
		return unReturnAmount;
	}
	public void setUnReturnAmount(Integer unReturnAmount) {
		this.unReturnAmount = unReturnAmount;
	}
	public String getInUsed() {
		return inUsed;
	}
	public void setInUsed(String inUsed) {
		this.inUsed = inUsed;
	}
	public String getLimitDay() {
		return limitDay;
	}
	public void setLimitDay(String limitDay) {
		this.limitDay = limitDay;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProdCode() {
		return prodCode;
	}
	public void setProdCode(String prodCode) {
		this.prodCode = prodCode;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public Integer getRatio() {
		return ratio;
	}
	public void setRatio(Integer ratio) {
		this.ratio = ratio;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public String getCorpAbbr() {
		return corpAbbr;
	}
	public void setCorpAbbr(String corpAbbr) {
		this.corpAbbr = corpAbbr;
	}
	public String getCorpNameZh() {
		return corpNameZh;
	}
	public void setCorpNameZh(String corpNameZh) {
		this.corpNameZh = corpNameZh;
	}
	public String getDetailDescUrlZh() {
		return detailDescUrlZh;
	}
	public void setDetailDescUrlZh(String detailDescUrlZh) {
		this.detailDescUrlZh = detailDescUrlZh;
	}
	public String getDetailDescUrlEn() {
		return detailDescUrlEn;
	}
	public void setDetailDescUrlEn(String detailDescUrlEn) {
		this.detailDescUrlEn = detailDescUrlEn;
	}
	public String getClaimsDescZh() {
		return claimsDescZh;
	}
	public void setClaimsDescZh(String claimsDescZh) {
		this.claimsDescZh = claimsDescZh;
	}
	public String getClaimsDescEn() {
		return claimsDescEn;
	}
	public void setClaimsDescEn(String claimsDescEn) {
		this.claimsDescEn = claimsDescEn;
	}
	public String getDetailDescUrlZhH5() {
		return detailDescUrlZhH5;
	}
	public void setDetailDescUrlZhH5(String detailDescUrlZhH5) {
		this.detailDescUrlZhH5 = detailDescUrlZhH5;
	}
	public String getDetailDescUrlEnH5() {
		return detailDescUrlEnH5;
	}
	public void setDetailDescUrlEnH5(String detailDescUrlEnH5) {
		this.detailDescUrlEnH5 = detailDescUrlEnH5;
	}
	@Override
	public String toString() {
		return "InsuranceInfoBean [_id=" + _id + ", name=" + name + ", price="
				+ price + ", dRatio=" + dRatio + ", iRatio=" + iRatio
				+ ", unReturnAmount=" + unReturnAmount + ", inUsed=" + inUsed
				+ ", limitDay=" + limitDay + ", type=" + type + ", prodCode="
				+ prodCode + ", scope=" + scope + ", ratio=" + ratio + ", exp="
				+ exp + ", corpAbbr=" + corpAbbr + ", corpNameZh=" + corpNameZh
				+ ", detailDescUrlZh=" + detailDescUrlZh + ", detailDescUrlEn="
				+ detailDescUrlEn + ", claimsDescZh=" + claimsDescZh
				+ ", claimsDescEn=" + claimsDescEn + ", detailDescUrlZhH5="
				+ detailDescUrlZhH5 + ", detailDescUrlEnH5="
				+ detailDescUrlEnH5 + "]";
	}
	
	

	


	
}

package com.csair.b2c.test.mybatis.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Products implements Serializable {
	@Id
	@Column(name = "prod_id")
	private String prodId;
	@Column(name = "prod_name")
	private String prodName;
	@Column(name = "prod_desc")
	private String prodDesc;
	@OneToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="vend_id")
	private Vendors vendor;

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

	public Vendors getVendor() {
		return vendor;
	}

	public void setVendor(Vendors vendor) {
		this.vendor = vendor;
	}

}

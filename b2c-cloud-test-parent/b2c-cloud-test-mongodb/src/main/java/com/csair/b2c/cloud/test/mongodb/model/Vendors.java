package com.csair.b2c.cloud.test.mongodb.model;

import java.io.Serializable;
import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Vendors implements Serializable {
	private static final long serialVersionUID = -1219927190152277820L;
	private String vendId;
	private String vendName;
	private String vendCountry;
	private String vendState;
	private Date registerTime;
	private double rateScore;

	public String getVendId() {
		return vendId;
	}

	public void setVendId(String vendId) {
		this.vendId = vendId;
	}

	public String getVendName() {
		return vendName;
	}

	public void setVendName(String vendName) {
		this.vendName = vendName;
	}

	public String getVendCountry() {
		return vendCountry;
	}

	public void setVendCountry(String vendCountry) {
		this.vendCountry = vendCountry;
	}

	public String getVendState() {
		return vendState;
	}

	public void setVendState(String vendState) {
		this.vendState = vendState;
	}

	public Date getRegisterTime() {
		return registerTime;
	}

	public void setRegisterTime(Date registerTime) {
		this.registerTime = registerTime;
	}

	public double getRateScore() {
		return rateScore;
	}

	public void setRateScore(double rateScore) {
		this.rateScore = rateScore;
	}

}

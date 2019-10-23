package com.csair.b2c.security.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown=true)
public class SessionValue implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2532054471887043201L;
	private String typeName;
	private Object value;

	

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	
	public SessionValue() {
	}
	public SessionValue(Object value, String defaultTypeName) {
		this.typeName = defaultTypeName;
		this.value = value;
	}
}

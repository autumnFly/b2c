package com.csair.b2c.cloud.test.sys.model;

import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Created on 2018/7/5.
 *
 * @author yudong
 */
public class B2cPolicyInfo {
    private String insuranceType;
    private String policyNo;
    private String validateCode;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getPolicyNo() {
        return policyNo;
    }

    public void setPolicyNo(String policyNo) {
        this.policyNo = policyNo;
    }

    public String getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(String validateCode) {
        this.validateCode = validateCode;
    }
}


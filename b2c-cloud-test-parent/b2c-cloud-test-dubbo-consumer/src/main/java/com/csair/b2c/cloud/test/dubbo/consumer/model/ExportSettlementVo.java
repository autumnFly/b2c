package com.csair.b2c.cloud.test.dubbo.consumer.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created on 2018/11/22.<br/>
 *
 * @author yudong
 */
public class ExportSettlementVo implements Serializable {
    private static final long serialVersionUID = 60173060617354160L;
    private String companyName;
    private String paybillCode;
    private String settlementPeriod;
    private Date confirmTime;

    private String bankAccountName;
    private String bankName;
    private String bankAccount;

    @Override
    public String toString() {
        return "ExportSettlementVo{" +
                "companyName='" + companyName + '\'' +
                ", paybillCode='" + paybillCode + '\'' +
                ", settlementPeriod='" + settlementPeriod + '\'' +
                ", confirmTime=" + confirmTime +
                ", bankAccountName='" + bankAccountName + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankAccount='" + bankAccount + '\'' +
                '}';
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPaybillCode() {
        return paybillCode;
    }

    public void setPaybillCode(String paybillCode) {
        this.paybillCode = paybillCode;
    }

    public String getSettlementPeriod() {
        return settlementPeriod;
    }

    public void setSettlementPeriod(String settlementPeriod) {
        this.settlementPeriod = settlementPeriod;
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getBankAccountName() {
        return bankAccountName;
    }

    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount;
    }
}

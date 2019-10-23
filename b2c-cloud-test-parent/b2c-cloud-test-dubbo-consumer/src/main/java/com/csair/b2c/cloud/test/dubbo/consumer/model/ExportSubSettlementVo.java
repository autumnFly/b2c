package com.csair.b2c.cloud.test.dubbo.consumer.model;

import java.io.Serializable;

/**
 * 此类使用反射方式取字段值,会用到字段位置.如需加字段请在最后加<br/>
 * Created on 2018/11/22.<br/>
 *
 * @author yudong
 */
public class ExportSubSettlementVo implements Serializable {
    private static final long serialVersionUID = -5326817989269369109L;
    private String subfamilyName;
    private Double serviceRate;
    private Integer settlementClothNum;
    private Long serviceSettlementBase;
    private Long serviceMoney;

    @Override
    public String toString() {
        return "ExportSubSettlementVo{" +
                "subfamilyName='" + subfamilyName + '\'' +
                ", serviceRate=" + serviceRate +
                ", settlementClothNum=" + settlementClothNum +
                ", serviceSettlementBase=" + serviceSettlementBase +
                ", serviceMoney=" + serviceMoney +
                '}';
    }

    public String getSubfamilyName() {
        return subfamilyName;
    }

    public void setSubfamilyName(String subfamilyName) {
        this.subfamilyName = subfamilyName;
    }

    public Double getServiceRate() {
        return serviceRate;
    }

    public void setServiceRate(Double serviceRate) {
        this.serviceRate = serviceRate;
    }

    public Integer getSettlementClothNum() {
        return settlementClothNum;
    }

    public void setSettlementClothNum(Integer settlementClothNum) {
        this.settlementClothNum = settlementClothNum;
    }

    public Long getServiceSettlementBase() {
        return serviceSettlementBase;
    }

    public void setServiceSettlementBase(Long serviceSettlementBase) {
        this.serviceSettlementBase = serviceSettlementBase;
    }

    public Long getServiceMoney() {
        return serviceMoney;
    }

    public void setServiceMoney(Long serviceMoney) {
        this.serviceMoney = serviceMoney;
    }
}

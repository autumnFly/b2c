package com.csair.b2c.cloud.test.dubbo.consumer.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 此类使用反射方式取字段值,会用到字段位置.如需加字段请在最后加<br/>
 * Created on 2018/11/21.<br/>
 *
 * @author yudong
 */
public class ExportPaybillVo implements Serializable {
    private static final long serialVersionUID = -1457557573355404358L;
    private String clothesCode;
    private String typeName;
    private String washResult;
    private Integer actualUnitPrice;
    private Integer actualSettlePrice;
    private Integer serviceSettlementBase;
    private String backOrderCode;
    private String backTypeName;
    private String orderCode;
    private String orderStatusName;
    private String billSettlementStatusName;
    private String customerName;
    private String customerPhone;
    private String backName;
    private String backPhone;
    private String backAddress;
    private Date payTime;
    private Date clothesReceiveTime;
    private Date  signTime;
    private String companyName;
    private String subfamilyName;
    private String province;
    private String city;
    private String county;
    private String pointsName;

    // 检查结果
    private Integer checkResult;
    private Integer backType;
    private String backProvince;
    private String backCity;
    private String backCounty;
    private String address;
    private String orderStatus;
    private Integer billSettlementStatus;
    private Integer goodsCooperationPrice;


    @Override
    public String toString() {
        return "ExportPaybillVo{" +
                "clothesCode='" + clothesCode + '\'' +
                ", typeName='" + typeName + '\'' +
                ", washResult='" + washResult + '\'' +
                ", actualUnitPrice=" + actualUnitPrice +
                ", actualSettlePrice=" + actualSettlePrice +
                ", serviceSettlementBase=" + serviceSettlementBase +
                ", backOrderCode='" + backOrderCode + '\'' +
                ", backTypeName='" + backTypeName + '\'' +
                ", orderCode='" + orderCode + '\'' +
                ", orderStatusName='" + orderStatusName + '\'' +
                ", billSettlementStatusName='" + billSettlementStatusName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", customerPhone='" + customerPhone + '\'' +
                ", backName='" + backName + '\'' +
                ", backPhone='" + backPhone + '\'' +
                ", backAddress='" + backAddress + '\'' +
                ", payTime=" + payTime +
                ", clothesReceiveTime=" + clothesReceiveTime +
                ", signTime=" + signTime +
                ", companyName='" + companyName + '\'' +
                ", subfamilyName='" + subfamilyName + '\'' +
                ", province='" + province + '\'' +
                ", city='" + city + '\'' +
                ", county='" + county + '\'' +
                ", address='" + address + '\'' +
                ", pointsName='" + pointsName + '\'' +
                ", checkResult=" + checkResult +
                ", backType=" + backType +
                ", orderStatus='" + orderStatus + '\'' +
                ", billSettlementStatus=" + billSettlementStatus +
                ", goodsCooperationPrice=" + goodsCooperationPrice +
                ", backProvince='" + backProvince + '\'' +
                ", backCity='" + backCity + '\'' +
                ", backCounty='" + backCounty + '\'' +
                '}';
    }

    public String getClothesCode() {
        return clothesCode;
    }

    public void setClothesCode(String clothesCode) {
        this.clothesCode = clothesCode;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getWashResult() {
        return washResult;
    }

    public void setWashResult(String washResult) {
        this.washResult = washResult;
    }

    public Integer getActualUnitPrice() {
        return actualUnitPrice;
    }

    public void setActualUnitPrice(Integer actualUnitPrice) {
        this.actualUnitPrice = actualUnitPrice;
    }

    public Integer getActualSettlePrice() {
        return actualSettlePrice;
    }

    public void setActualSettlePrice(Integer actualSettlePrice) {
        this.actualSettlePrice = actualSettlePrice;
    }

    public Integer getServiceSettlementBase() {
        return serviceSettlementBase;
    }

    public void setServiceSettlementBase(Integer serviceSettlementBase) {
        this.serviceSettlementBase = serviceSettlementBase;
    }

    public String getBackOrderCode() {
        return backOrderCode;
    }

    public void setBackOrderCode(String backOrderCode) {
        this.backOrderCode = backOrderCode;
    }

    public String getBackTypeName() {
        return backTypeName;
    }

    public void setBackTypeName(String backTypeName) {
        this.backTypeName = backTypeName;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public String getOrderStatusName() {
        return orderStatusName;
    }

    public void setOrderStatusName(String orderStatusName) {
        this.orderStatusName = orderStatusName;
    }

    public String getBillSettlementStatusName() {
        return billSettlementStatusName;
    }

    public void setBillSettlementStatusName(String billSettlementStatusName) {
        this.billSettlementStatusName = billSettlementStatusName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getBackName() {
        return backName;
    }

    public void setBackName(String backName) {
        this.backName = backName;
    }

    public String getBackPhone() {
        return backPhone;
    }

    public void setBackPhone(String backPhone) {
        this.backPhone = backPhone;
    }

    public String getBackAddress() {
        return backAddress;
    }

    public void setBackAddress(String backAddress) {
        this.backAddress = backAddress;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getClothesReceiveTime() {
        return clothesReceiveTime;
    }

    public void setClothesReceiveTime(Date clothesReceiveTime) {
        this.clothesReceiveTime = clothesReceiveTime;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getSubfamilyName() {
        return subfamilyName;
    }

    public void setSubfamilyName(String subfamilyName) {
        this.subfamilyName = subfamilyName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPointsName() {
        return pointsName;
    }

    public void setPointsName(String pointsName) {
        this.pointsName = pointsName;
    }

    public Integer getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(Integer checkResult) {
        this.checkResult = checkResult;
    }

    public Integer getBackType() {
        return backType;
    }

    public void setBackType(Integer backType) {
        this.backType = backType;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getBillSettlementStatus() {
        return billSettlementStatus;
    }

    public void setBillSettlementStatus(Integer billSettlementStatus) {
        this.billSettlementStatus = billSettlementStatus;
    }

    public Integer getGoodsCooperationPrice() {
        return goodsCooperationPrice;
    }

    public void setGoodsCooperationPrice(Integer goodsCooperationPrice) {
        this.goodsCooperationPrice = goodsCooperationPrice;
    }

    public String getBackProvince() {
        return backProvince;
    }

    public void setBackProvince(String backProvince) {
        this.backProvince = backProvince;
    }

    public String getBackCity() {
        return backCity;
    }

    public void setBackCity(String backCity) {
        this.backCity = backCity;
    }

    public String getBackCounty() {
        return backCounty;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBackCounty(String backCounty) {

        this.backCounty = backCounty;
    }
}


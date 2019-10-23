package com.csair.b2c.test.mybatis.model;

/**
 * Created on 2018/12/21.<br/>
 *
 * @author yudong
 */
public class CouponInfo {
    private String orderId;
    private String couponCode;
    private String couponSName;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getCouponSName() {
        return couponSName;
    }

    public void setCouponSName(String couponSName) {
        this.couponSName = couponSName;
    }
}

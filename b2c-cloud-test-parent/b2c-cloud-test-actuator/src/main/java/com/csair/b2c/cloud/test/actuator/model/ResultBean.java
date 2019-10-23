package com.csair.b2c.cloud.test.actuator.model;

import java.io.Serializable;

public class ResultBean<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private boolean isSuccess;
    private int responseCode;
    private String responseMsg;
    private T data;
    private int total = 0;

    public ResultBean() {
        super();
        this.isSuccess = Boolean.FALSE;
        this.responseCode = -1;
        this.responseMsg = "网络繁忙，敬请稍后再试";
    }

    public ResultBean(T data) {
        super();
        this.isSuccess = Boolean.TRUE;
        this.responseCode = 0;
        this.responseMsg = "请求成功";
        this.data = data;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean getIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMsg() {
        return responseMsg;
    }

    public void setResponseMsg(String responseMsg) {
        this.responseMsg = responseMsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

}

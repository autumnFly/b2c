package com.csair.b2c.cloud.test.actuator.model;

import java.util.List;

/**
 * Created on 2018/10/27.<br/>
 *
 * @author yudong
 */
public class FileBean {

    private List<String> pathOrBase64Datas;
    private Integer maxNum;
    private Integer currentNum;

    public List<String> getPathOrBase64Datas() {
        return pathOrBase64Datas;
    }

    public void setPathOrBase64Datas(List<String> pathOrBase64Datas) {
        this.pathOrBase64Datas = pathOrBase64Datas;
    }

    public Integer getMaxNum() {
        return maxNum;
    }

    public void setMaxNum(Integer maxNum) {
        this.maxNum = maxNum;
    }

    public Integer getCurrentNum() {
        return currentNum;
    }

    public void setCurrentNum(Integer currentNum) {
        this.currentNum = currentNum;
    }
}

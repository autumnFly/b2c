package cn.com.bluemoon.common.planner.po;

import lombok.Data;

import java.util.Date;

@Data
public class MallWashPersonInfo {
    private Long id;

    private String angelCode;

    private String angelName;

    private Byte type;

    private Long phone;

    private Integer cityCode;

    private String cityName;

    private Integer provinceCode;

    private String provinceName;

    private Byte status;

    private Integer countyCount;

    private String createCode;

    private String createName;

    private Date createTime;

    private String opCode;

    private String opName;

    private Date opTime;

    private Byte delFlag;

}
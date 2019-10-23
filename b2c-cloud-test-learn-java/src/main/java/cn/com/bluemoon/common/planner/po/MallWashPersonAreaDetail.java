package cn.com.bluemoon.common.planner.po;

import lombok.Data;

import java.util.Date;

@Data
public class MallWashPersonAreaDetail {
    private Long id;

    private Integer provinceCode;

    private String provinceName;

    private Integer cityCode;

    private String cityName;

    private Integer countyCode;

    private String countyName;

    private String createCode;

    private String createName;

    private Date createTime;

    private Byte delFlag;

}
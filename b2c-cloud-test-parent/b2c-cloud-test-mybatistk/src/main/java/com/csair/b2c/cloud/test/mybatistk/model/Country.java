package com.csair.b2c.cloud.test.mybatistk.model;

import com.csair.b2c.cloud.test.mybatistk.enums.StatusEnum;
import com.csair.b2c.cloud.test.mybatistk.enums.VisibleEnum;
import com.csair.b2c.cloud.test.mybatistk.handler.VisibleEnumHandler;
import org.apache.ibatis.type.JdbcType;
import tk.mybatis.mapper.annotation.ColumnType;
import tk.mybatis.mapper.annotation.NameStyle;
import tk.mybatis.mapper.code.Style;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * Created on 2018/11/15.<br/>
 *
 * @author yudong
 */
@NameStyle(Style.camelhump)
@Table(name = "mall_enterprise_country")
public class Country {
    @Id
    @GeneratedValue(generator = "JDBC")
    private Long id;
    @Transient
    private String countryarea;
    private String countryname;
    private String countrycode;
    @Column(name = "`show`")
    @ColumnType(column = "`show`", jdbcType = JdbcType.INTEGER, typeHandler = VisibleEnumHandler.class)
    private VisibleEnum visibleEnum;
    @Column(name = "status")
    private StatusEnum statusEnum;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryarea() {
        return countryarea;
    }

    public void setCountryarea(String countryarea) {
        this.countryarea = countryarea;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public VisibleEnum getVisibleEnum() {
        return visibleEnum;
    }

    public void setVisibleEnum(VisibleEnum visibleEnum) {
        this.visibleEnum = visibleEnum;
    }

    public void setCountrycode(String countrycode) {

        this.countrycode = countrycode;
    }

    public StatusEnum getStatusEnum() {
        return statusEnum;
    }

    public void setStatusEnum(StatusEnum statusEnum) {
        this.statusEnum = statusEnum;
    }
}

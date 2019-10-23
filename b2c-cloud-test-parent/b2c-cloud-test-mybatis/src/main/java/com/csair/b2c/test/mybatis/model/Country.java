package com.csair.b2c.test.mybatis.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author yudong
 */
@Data
public class Country implements Serializable {
    private static final long serialVersionUID = 8965340608576090416L;
    private Short countryId;

    private String country;

    private Date lastUpdate;
}
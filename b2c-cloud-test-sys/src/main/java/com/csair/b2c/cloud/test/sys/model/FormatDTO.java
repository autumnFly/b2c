package com.csair.b2c.cloud.test.sys.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.util.Date;

/**
 * Created on 2018/8/17.<br/>
 *
 * @author yudong
 */
public class FormatDTO {
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birth;
    @NumberFormat(pattern = "#,###.##")
    private double salary;

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

package com.csair.b2c.test.mybatis.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Vendors implements Serializable {
    @Id
    @Column(name = "vend_id")
    private String vendId;
    @Column(name = "vend_name")
    private String vendName;
    @Column(name = "vend_country")
    private String vendCountry;
    @Column(name = "vend_state")
    private String vendState;

    public String getVendId() {
        return vendId;
    }

    public void setVendId(String vendId) {
        this.vendId = vendId;
    }

    public String getVendName() {
        return vendName;
    }

    public void setVendName(String vendName) {
        this.vendName = vendName;
    }

    public String getVendCountry() {
        return vendCountry;
    }

    public void setVendCountry(String vendCountry) {
        this.vendCountry = vendCountry;
    }

    public String getVendState() {
        return vendState;
    }

    public void setVendState(String vendState) {
        this.vendState = vendState;
    }

}

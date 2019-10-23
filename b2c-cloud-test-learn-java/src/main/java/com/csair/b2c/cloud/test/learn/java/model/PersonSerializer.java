package com.csair.b2c.cloud.test.learn.java.model;

import com.csair.b2c.cloud.test.learn.java.jackson.OptimizedBooleanSerializer;
import com.csair.b2c.cloud.test.learn.java.validation.CarChecks;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.Valid;
import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yu on 2018/3/22.
 */
public class PersonSerializer {

    public long personId = 0;
    public String name = "John";
    @JsonSerialize(using = OptimizedBooleanSerializer.class)
    public boolean enabled = true;

    public long getPersonId() {
        return personId;
    }

    public void setPersonId(long personId) {
        this.personId = personId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}

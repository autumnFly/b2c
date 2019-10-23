package com.csair.b2c.cloud.test.user.jmx;

import org.springframework.jmx.export.annotation.ManagedAttribute;
import org.springframework.jmx.export.annotation.ManagedOperation;
import org.springframework.jmx.export.annotation.ManagedResource;
import org.springframework.stereotype.Component;

/**
 * Created on 2019/4/14.<br/>
 *
 * @author yudong
 */
@Component
@ManagedResource(objectName = "user:mbean=MBeanTest")
public class MBeanTest {
    private String name;
    private int age;

    @ManagedAttribute
    public String getName() {
        return name;
    }

    @ManagedAttribute
    public void setName(String name) {
        this.name = name;
    }

    @ManagedOperation
    public int getAge() {
        return age;
    }

    @ManagedOperation
    public void setAge(int age) {
        this.age = age;
    }
}

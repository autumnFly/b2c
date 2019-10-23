package com.csair.b2c.cloud.test.annotation.processor;

import com.csair.b2c.cloud.test.annotation.processor.annotation.GenerateGetMethod;

/**
 * Created on 2019/1/9.<br/>
 *
 * @author yudong
 */
@GenerateGetMethod
public class GenerateGetMethodAnnotationTest {

    private String name;
    private int age;

    public GenerateGetMethodAnnotationTest(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

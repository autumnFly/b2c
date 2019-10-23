package com.csair.b2c.cloud.test.pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.csair.b2c")
@ServletComponentScan("com.csair.b2c")
public class PatternApplication {

    public static void main(String[] args) {
        SpringApplication.run(PatternApplication.class, args);
    }

}

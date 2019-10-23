package com.csair.b2c.cloud.test.hystrix.service;

import org.springframework.stereotype.Service;

/**
 * Created by yu on 2018/4/30.
 */
@Service
public class VersionFeignHystrix implements VersionFeignService {
    @Override
    public String versionZuul() {
        return "{\"success\":false}";
    }
}

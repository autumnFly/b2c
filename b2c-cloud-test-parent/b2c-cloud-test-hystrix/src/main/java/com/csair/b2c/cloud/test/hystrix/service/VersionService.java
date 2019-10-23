package com.csair.b2c.cloud.test.hystrix.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.csair.b2c.cloud.test.common.constant.ProjectConst;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author yu
 */
@Service
public class VersionService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addFallback")
    public String versionZuul() {
        return restTemplate.getForEntity(
                ProjectConst.ZUUL_SERVICE_PREFIX + "/info",
                String.class).getBody();
    }

    public String addFallback() {
        return "{\"success\":false}";
    }
}

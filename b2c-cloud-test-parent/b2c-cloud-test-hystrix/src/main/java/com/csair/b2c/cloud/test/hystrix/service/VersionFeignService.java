package com.csair.b2c.cloud.test.hystrix.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

import com.csair.b2c.cloud.test.common.constant.ProjectConst;

/**
 * @author yu
 */
@FeignClient(value = ProjectConst.ZUUL_SERVICE_PREFIX_NO_SUFFIX
        , fallback = VersionFeignHystrix.class)
public interface VersionFeignService {

    @RequestMapping("/info")
    String versionZuul();

}

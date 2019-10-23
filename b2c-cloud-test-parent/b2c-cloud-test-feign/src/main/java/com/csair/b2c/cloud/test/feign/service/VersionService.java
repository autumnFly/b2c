package com.csair.b2c.cloud.test.feign.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 这里服务名不区分大小写
 * Created by yu on 2018/4/30.
 */
// @FeignClient(ProjectConst.CONFIG_SERVICE_PREFIX)
public interface VersionService {

    @RequestMapping(method = RequestMethod.GET, value = "/info")
    String configVersion();

}

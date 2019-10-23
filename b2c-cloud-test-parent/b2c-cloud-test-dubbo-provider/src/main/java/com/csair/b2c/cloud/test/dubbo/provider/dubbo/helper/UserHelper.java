package com.csair.b2c.cloud.test.dubbo.provider.dubbo.helper;

import com.csair.b2c.cloud.test.dubbo.provider.api.service.DynamicExecuteDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author yudong
 * @date 2019/5/22
 */
@Component
public class UserHelper {

    @Autowired
    private DynamicExecuteDubboService dynamicExecuteDubboService;

}

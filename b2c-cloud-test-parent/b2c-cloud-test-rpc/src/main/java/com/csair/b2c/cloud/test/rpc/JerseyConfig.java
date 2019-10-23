package com.csair.b2c.cloud.test.rpc;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.web.filter.RequestContextFilter;

/**
 * Created on 2018/9/7.<br/>
 *
 * @author yudong
 */
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        register(RequestContextFilter.class);
        packages("com.csair.b2c.cloud.test.rpc.controller");
    }
}

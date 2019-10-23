package com.csair.com.cloud.test.boot.endpoint;

import java.util.Map;

/**
 * Created on 2018/8/25.<br/>
 *
 * @author yudong
 */
public interface EnvProps {

    String name();

    Map<String, ?> props();
}

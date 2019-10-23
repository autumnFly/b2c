package com.csair.b2c.cloud.test.sys.introducer;

import org.springframework.web.client.RestClientException;

/**
 * Created on 2018/8/25.<br/>
 *
 * @author yudong
 */
public interface RestOperationsTime {
    <T> T getForObjectTime(String url, Class<T> responseType, Object... uriVariables) throws RestClientException;
}

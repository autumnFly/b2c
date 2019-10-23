package com.csair.b2c.cloud.test.sys.introducer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

/**
 * Created on 2018/8/25.<br/>
 *
 * @author yudong
 */
public class RestTemplateTime implements RestOperationsTime {
    Logger logger = LoggerFactory.getLogger(getClass());


    @Override
    public <T> T getForObjectTime(String url, Class<T> responseType, Object... uriVariables) throws RestClientException {
        long start = System.currentTimeMillis();
        T obj = new RestTemplate().getForObject(url, responseType, uriVariables);
        logger.info("url:{},time:{}ms", url, System.currentTimeMillis() - start);
        return obj;
    }
}

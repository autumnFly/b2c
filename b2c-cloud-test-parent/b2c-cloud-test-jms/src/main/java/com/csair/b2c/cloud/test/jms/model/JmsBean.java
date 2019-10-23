package com.csair.b2c.cloud.test.jms.model;

import com.csair.b2c.cloud.test.annotation.processor.annotation.GenerateGetMethod;

/**
 * Created on 2019/1/12.<br/>
 *
 * @author yudong
 */
@GenerateGetMethod
public class JmsBean {
    private Integer sendTimes;
    private Integer retryTimes;
    private String jmsCode;

    public JmsBean(Integer sendTimes, Integer retryTimes, String jmsCode) {
        this.sendTimes = sendTimes;
        this.retryTimes = retryTimes;
        this.jmsCode = jmsCode;
    }
}

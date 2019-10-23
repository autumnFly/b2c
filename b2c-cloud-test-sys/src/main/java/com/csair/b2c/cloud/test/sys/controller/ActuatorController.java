package com.csair.b2c.cloud.test.sys.controller;

import com.alibaba.fastjson.JSONObject;
import com.csair.b2c.cloud.test.sys.introducer.RestOperationsTime;
import com.csair.b2c.cloud.test.sys.model.FormatDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 * Created on 2018/8/15.<br/>
 *
 * @author yudong
 */
@RestController
@RequestMapping(value = "act")
public class ActuatorController {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    @Qualifier("restTemplateOut")
    private RestTemplate restTemplate;

    @RequestMapping(value = "format", method = {RequestMethod.GET})
    public String format(FormatDTO formatDTO,UriComponentsBuilder ucb) {

        logger.info("format path:{}", ucb.path("/act/rest").queryParam("name","yu").build());

        logger.info("format req:{}", JSONObject.toJSONString(formatDTO, true));
        String res = JSONObject.toJSONString(formatDTO, true);
        logger.info("format res:{}", res);
        return res;
    }

    @RequestMapping(value = "rest", method = {RequestMethod.GET})
    public String rest() {
        String s = restTemplate.getForObject("http://localhost:8761/eureka/apps", String.class);
        logger.info("rest res:{}", s);
        RestOperationsTime restOperationsTime = (RestOperationsTime) restTemplate;
        s = restOperationsTime.getForObjectTime("http://localhost:8761/eureka/apps", String.class);
        logger.info("rest res:{}", s);
        return s;
    }

}

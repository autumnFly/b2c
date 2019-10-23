package com.csair.b2c.test.mybatis.controller;

import com.fasterxml.jackson.databind.JsonNode;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * Created by yu on 2018/4/13.
 */
@Controller
@RequestMapping("/order")
public class OrderController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private HttpServletRequest request;
    @Autowired
    private HttpSession session;

    @RequestMapping("/getWelcome")
    public String getOrder() {
        return "Hello World";
    }

    @RequestMapping("/getOrder")
    public String getOrder(@RequestBody JsonNode jsonNode) {
        logger.info("order controller getOrder");
        return jsonNode.toString();
    }
}

package com.csair.b2c.cloud.test.actuator.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/actuator")
public class ActuatorController {

    Logger logger = LoggerFactory.getLogger(getClass());

    String eurekaHost = "http://eureka.dev.csair.com";
    String actuatorPort = "8500";

    @RequestMapping(value = "/log", method = {RequestMethod.GET})
    @ResponseBody
    public String log() {
        logger.info("this is controller log");
        return "hello world";
    }

    @RequestMapping(value = "/index", method = {RequestMethod.GET})
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("eurekaHost", eurekaHost);
        modelAndView.addObject("actuatorPort", actuatorPort);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(value = "/order", method = {RequestMethod.GET})
    public String add(Model model) {
        model.addAttribute("eurekaHost", eurekaHost);
        model.addAttribute("actuatorPort", actuatorPort);
        return "order/order";
    }

}

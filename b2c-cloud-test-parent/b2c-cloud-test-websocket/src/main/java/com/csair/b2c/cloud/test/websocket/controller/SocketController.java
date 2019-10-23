package com.csair.b2c.cloud.test.websocket.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

@Controller
public class SocketController {
    @RequestMapping(value = "/websocket", method = {RequestMethod.GET})
    public String websocket(Model model) {
        model.addAttribute("view", "thymeleaf");
        return "/websocket";
    }

    @ResponseBody
    @RequestMapping(value = "/JSLogger", method = {RequestMethod.GET})
    public String JSLogger(String level, String msg, String stack) {
        try {
            System.out.println(level + ":" + msg + " " + URLDecoder.decode(stack, "UTF-8"));
        } catch (Exception e) {
        }
        return "success";
    }

    @ResponseBody
    @CrossOrigin
    @RequestMapping(value = "/person", method = {RequestMethod.GET}, produces = MediaType.APPLICATION_XML_VALUE)
    public String person() {
        return "<root><person><name>liang yudong</name><age>23</age></person></root>";
    }

    @ResponseBody
    @RequestMapping("createSid")
    public String createSid(String callback) {
        Map<String,Object> map=new HashMap<>();
        map.put("name","liangyudong");
        map.put("age",23);
        return String.format("%s(%s)",callback, JSONObject.toJSONString(map));
    }

}


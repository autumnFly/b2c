package com.csair.b2c.cloud.test.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.csair.b2c.cloud.test.dubbo.provider.api.model.User;
import com.csair.b2c.cloud.test.dubbo.provider.api.service.UserDubboService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created on 2018/10/11.<br/>
 *
 * @author yudong
 */
@RestController
@RequestMapping("/user")
public class UserController {

    // @Reference(version = "1.0.0", timeout = 6000)
    private UserDubboService userDubboService;

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        List<User> users = userDubboService.queryAll();
        System.out.println(JSONObject.toJSONString(users, true));
        return users;
    }
}

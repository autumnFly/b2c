package org.javamaster.b2c.dubbo.client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import lombok.extern.slf4j.Slf4j;
import org.javamaster.b2c.dubbo.server.api.dto.UserDto;
import org.javamaster.b2c.dubbo.server.api.service.UserDubboService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created on 2018/10/11.<br/>
 *
 * @author yudong
 */
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference(version = "1.0.0", timeout = 6000)
    private UserDubboService userDubboService;

    @GetMapping("/getAllUsers")
    public List<UserDto> getAllUsers() {
        List<UserDto> users = userDubboService.queryAll();
        log.info(users.toString());
        return users;
    }
}

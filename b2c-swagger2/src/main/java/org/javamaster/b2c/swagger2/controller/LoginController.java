package org.javamaster.b2c.swagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.javamaster.b2c.swagger2.model.Result;
import org.javamaster.b2c.swagger2.model.User;
import org.javamaster.b2c.swagger2.model.UserReqVo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yudong
 * @date 2019/12/19
 */
@Api(value = "登录相关", basePath = "/home")
@RestController
@RequestMapping("/home")
public class LoginController {


    @ApiOperation("登录")
    @GetMapping("/login")
    public Result<User> login(UserReqVo userReqVo) {
        User user = new User();
        user.setUsername(userReqVo.getUsername());
        return new Result<>(user);
    }

}

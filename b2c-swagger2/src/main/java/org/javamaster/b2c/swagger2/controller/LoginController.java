package org.javamaster.b2c.swagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.javamaster.b2c.swagger2.model.Result;
import org.javamaster.b2c.swagger2.model.User;
import org.javamaster.b2c.swagger2.model.UserReqVo;
import org.javamaster.b2c.swagger2.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private LoginService loginService;

    @ApiOperation("登录")
    @GetMapping("/login")
    public Result<User> login(UserReqVo userReqVo) {
        return new Result<>(loginService.login(userReqVo));
    }

    @ApiOperation("登录")
    @GetMapping(value = "/login1")
    public Result<User> login1(UserReqVo userReqVo, String appType) {
        return new Result<>(loginService.login(userReqVo, appType));
    }

    @ApiOperation("登录")
    @GetMapping(value = "/login2")
    public Result<User> login2(UserReqVo userReqVo, Integer appType) {
        return new Result<>(loginService.login(userReqVo, appType));
    }

}

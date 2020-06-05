package org.javamaster.b2c.spring.aop.controller;

import org.javamaster.b2c.spring.aop.service.SpringService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yudong
 * @date 2020/6/4
 */
@RestController
@RequestMapping
public class SpringController {

    @Autowired
    private SpringService springService;

    @GetMapping("/test")
    public String test() {
        return springService.test();
    }

    @GetMapping("/test1")
    public String test1() {
        return springService.test1("hello world");
    }
}

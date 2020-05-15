package com.csair.b2c.test.mybatis.controller;

import com.csair.b2c.test.mybatis.service.TransactionTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author yudong
 * @date 2020/5/14
 */
@Controller
@RequestMapping("/trans")
public class TransController {

    @Autowired
    private TransactionTestService transactionTestService;

    @ResponseBody
    @GetMapping(value = "/handlerRecord")
    public int handlerRecord() {
        return transactionTestService.handlerRecord();
    }

    @ResponseBody
    @GetMapping(value = "/transactionResearch")
    public int transactionResearch() {
        return transactionTestService.transactionResearch();
    }

}

package com.csair.b2c.test.mybatis.controller;

import com.alibaba.fastjson.JSONObject;
import com.csair.b2c.cloud.test.common.model.Result;
import com.csair.b2c.test.mybatis.enums.DelFlagEnum;
import com.csair.b2c.test.mybatis.mapper.mysql.ExamMapper;
import com.csair.b2c.test.mybatis.model.Exam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author yudong
 * @date 2018/4/13
 */
@Controller
@RequestMapping("/exam")
public class ExamController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    private ExamMapper examMapper;

    @RequestMapping(value = "/getAll", method = RequestMethod.POST)
    @ResponseBody
    public Result<List<Exam>> getAllExam(@RequestBody Exam exam) {
        logger.info("req exam:{}", JSONObject.toJSONString(exam, true));
        Result<List<Exam>> result = new Result<>(examMapper.select(exam));
        result.setErrorMsg("请求成功");
        return result;
    }
}

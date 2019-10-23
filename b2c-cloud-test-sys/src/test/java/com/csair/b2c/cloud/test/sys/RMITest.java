package com.csair.b2c.cloud.test.sys;

import com.alibaba.fastjson.JSONObject;
import com.csair.b2c.cloud.test.model.service.BookService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created on 2018/8/26.<br/>
 *
 * @author yudong
 */
public class RMITest extends CommonTestCode {

    @Autowired
    private BookService bookService;

    @Test
    public void testRMI() throws Exception {
        System.out.println(JSONObject.toJSONString(bookService.getAllBooks()));
    }
}

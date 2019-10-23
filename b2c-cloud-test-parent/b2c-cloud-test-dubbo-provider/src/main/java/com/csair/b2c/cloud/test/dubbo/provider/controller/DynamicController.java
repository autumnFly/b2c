package com.csair.b2c.cloud.test.dubbo.provider.controller;

// import com.csair.b2c.cloud.test.learn.java.utils.DynamicUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.net.URLDecoder;

/**
 * Created on 2019/1/25.<br/>
 *
 * @author yudong
 */
@RestController
@RequestMapping("/dynamic")
public class DynamicController {

    @RequestMapping(value = "/cae", method = {RequestMethod.POST})
    public Object compilerAndExecute(String code) throws Exception {
        // return DynamicUtils.compileAndExecute(URLDecoder.decode(code, "UTF-8"));
        return null;
    }

    @RequestMapping(value = "/e", method = {RequestMethod.POST})
    public Object excecuteClassByteCode(@RequestPart("file") MultipartFile[] multipartFile) throws Exception {
        // return DynamicUtils.execute(multipartFile[0].getBytes());
        return null;
    }

}

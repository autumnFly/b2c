package org.javamaster.b2c.swagger2.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.ResourceUtils;
import org.springframework.util.StreamUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @author yudong
 * @date 2019/12/19
 */
@Api(value = "主入口", basePath = "/home")
@CrossOrigin
@RestController
@RequestMapping("/home")
public class HomeController {

    @ApiOperation("获取应用名")
    @ApiResponses({
            @ApiResponse(code = 200, message = "应用名")
    })
    @GetMapping("/getName")
    public String getName() {
        return "b2c-swagger2";
    }

    @ResponseBody
    @RequestMapping(value = "/export", method = RequestMethod.POST)
    public ResponseEntity<byte[]> exportCommunicationRecord(@RequestBody List<Integer> list, HttpServletResponse response) throws Exception {
        System.out.println(list);
        File file = ResourceUtils.getFile("classpath:衣物沟通记录20011708585101.xls");
        byte[] bytes = StreamUtils.copyToByteArray(new FileInputStream(file));
        HttpHeaders headers = new HttpHeaders();
        //设置下载的excel文件名全称
        String fileName = file.getName();
        headers.setContentDispositionFormData("attachment", URLEncoder.encode(fileName, StandardCharsets.UTF_8.name()));
        //设置返回下载的文件类型
        headers.setContentType(new MediaType("application", "vnd.ms-excel"));
        response.setHeader("Pragma", "No-cache");
        response.setHeader("Cache-Control", "No-cache");
        response.setDateHeader("Expires", 0);
        response.setHeader("Access-Control-Expose-Headers", "Content-Disposition");
        return new ResponseEntity<>(bytes, headers, HttpStatus.OK);
    }
}

package com.csair.b2c.cloud.test.dubbo.provider;

import com.alibaba.fastjson.JSONObject;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.net.URLEncoder;
import java.nio.file.Files;

/**
 * Created on 2019/1/25.<br/>
 *
 * @author yudong
 */
public class DynamicControllerTest extends CommonTestCode {
    @Test
    public void test() throws Exception {
        String code = "package com.csair.b2c.cloud.test.dubbo.provider.dubbo.impl;\n" +
                "\n" +
                "import com.csair.b2c.cloud.test.common.util.SpringUtils;\n" +
                "import com.csair.b2c.cloud.test.dubbo.provider.api.service.UserDubboService;\n" +
                "\n" +
                "public class DynamicTestClass {\n" +
                "\n" +
                "    public Object compileAndExecute() {\n" +
                "        UserDubboService userDubboService = SpringUtils.getBean(UserDubboService.class);\n" +
                "        return userDubboService.queryAll();\n" +
                "    }\n" +
                "}\n";

        mockMvc.perform(MockMvcRequestBuilders.post("/dynamiccompiler/cae")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED).param("code", URLEncoder.encode(code, "UTF-8")))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

    @Test
    public void test1() throws Exception {
        File file = ResourceUtils.getFile("classpath:com-csair-b2c-cloud-test-dubbo-provider-dubbo-impl-DynamicTestClass.class");
        MockMultipartFile mockMultipartFile = new MockMultipartFile("file", "classFile.class", ",multipart/form-data", Files.readAllBytes(file.toPath()));
        MockMultipartFile mockMultipartFile1 = new MockMultipartFile("file", "classFile1.class", ",multipart/form-data", Files.readAllBytes(file.toPath()));
        mockMvc.perform(MockMvcRequestBuilders.fileUpload("/dynamiccompiler/e")
                .file(mockMultipartFile)
                .file(mockMultipartFile1))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }
}

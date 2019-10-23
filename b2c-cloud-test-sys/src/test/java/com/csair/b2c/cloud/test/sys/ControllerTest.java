package com.csair.b2c.cloud.test.sys;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * Created on 2018/8/20.<br/>
 *
 * @author yudong
 */
public class ControllerTest extends CommonTestCode {

    @Test
    public void testFormat() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/act/format")
                .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                .param("birth", "2000-05-14")
                .param("salary", "9000.52")
                .param("type", "a")
                .param("personnelName", "端午三")
                .param("certificateType", "01")
                .param("certificateNo", "440281199405144814"))
                .andDo(MockMvcResultHandlers.print())
                .andExpect(MockMvcResultMatchers.status().isOk());
    }

}

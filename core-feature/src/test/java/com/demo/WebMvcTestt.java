package com.demo;

import com.demo.controller.TestController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/27
 */
@WebMvcTest(TestController.class)
public class WebMvcTestt {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testWithMockMvc() throws Exception {
        /**
         * 发送 GET 请求 url=http://localhost:port/test/str
         * 并期望响应状态为 OK
         */
        mvc.perform(MockMvcRequestBuilders.get("/test/str"))
                .andExpect(MockMvcResultMatchers.status().isOk());
        // 期望返回的内容为 expectedContent
        // .andExpect(MockMvcResultMatchers.content().string("expectedContent"));
    }

}

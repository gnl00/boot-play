package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/26
 */

@SpringBootTest // 默认 WebEnvironment.NONE 即默认不启动 Web 环境
@AutoConfigureMockMvc
public class MockMvcTest {

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

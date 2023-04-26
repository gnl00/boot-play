package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/26
 */
@SpringBootTest
@AutoConfigureMockMvc
public class MVCMockTest {

    @Autowired
    private MockMvc mvc;

    @Test
    public void testWithMockMvc() throws Exception {
    }

}

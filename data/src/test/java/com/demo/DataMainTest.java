package com.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/27
 */
@SpringBootTest
public class DataMainTest {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test1() {}

}

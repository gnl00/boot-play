package com.demo;

import com.demo.dao.TestRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.annotation.Resource;
import java.sql.SQLException;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/27
 */
@SpringBootTest
public class DataMainTest {

    @Autowired
    private TestRepository repository;

    @Test
    public void test1() throws SQLException {
        repository.testDS();
    }



    @Resource(name = "druidJdbcTemplate")
    private JdbcTemplate druidJdbcTemplate;

    @Resource(name = "hikariJdbcTemplate")
    private JdbcTemplate hikariJdbcTemplate;

    @Test
    public void test2() {
        System.out.println(druidJdbcTemplate);
        System.out.println(hikariJdbcTemplate);
    }

}

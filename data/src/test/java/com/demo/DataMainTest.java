package com.demo;

import com.demo.dao.TestRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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

}

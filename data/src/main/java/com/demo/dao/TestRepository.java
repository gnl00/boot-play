package com.demo.dao;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.SQLException;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/29
 */
@Slf4j
@Repository
public class TestRepository {

    @Resource
    private DataSource druidDataSource;

    @Resource
    private DataSource hikariDataSource;

    public void testDS() throws SQLException {
        log.info("druidDataSource == hikariDataSource ==> {}", hikariDataSource == druidDataSource);

        log.info("Druid: {}", druidDataSource.toString());
        log.info("Hikari: {}", hikariDataSource.toString());

        log.info("Druid URL {}", druidDataSource.getConnection().getMetaData().getURL());
        log.info("Hikari URL {}", hikariDataSource.getConnection().getMetaData().getURL());
    }

}

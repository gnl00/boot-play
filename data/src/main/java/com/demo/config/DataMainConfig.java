package com.demo.config;

import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/27
 */
// @Configuration
@Slf4j
public class DataMainConfig {
    @Bean
    public DataSource dataSource() {
        HikariDataSource ds = DataSourceBuilder.create()
                .username("root")
                .url("jdbc:mysql://localhost:3306/db_test")
                .type(HikariDataSource.class).build();
        return null;
    }
}

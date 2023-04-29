package com.demo.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 * 什么时候需要使用多数据源？
 * 1、分库操作（读写库分离、不同业务库分离）
 * 2、多租户系统，一个系统中有多个租户，每个租户有自己的系统
 *
 * @author gnl
 * @since 2023/4/27
 */
// @Configuration
@Slf4j
@Configuration
public class DataMainConfig {
//    @Bean
//    public DataSource dataSource() {
//        HikariDataSource ds = DataSourceBuilder.create()
//                .username("root")
//                .url("jdbc:mysql://localhost:3306/db_test")
//                .type(HikariDataSource.class).build();
//        return ds;
//    }

    @Bean("druidDataSource")
    @ConfigurationProperties("app.ds1")
    public DataSource druidDataSource() {
        DruidDataSource ds = DataSourceBuilder.create()
                .type(DruidDataSource.class)
                .build();
        return ds;
    }

    @Bean("hikariDataSource")
    @ConfigurationProperties("app.ds2")
    public DataSource hikariDataSource() {
        HikariDataSource ds = DataSourceBuilder.create()
                .type(HikariDataSource.class)
                .build();
        return ds;
    }
}

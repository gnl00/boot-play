package com.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;

@Slf4j
// 多数据源配置需要排除 DataSourceAutoConfiguration
// 因为 DataSourceAutoConfiguration 会优先进行单数据源配置
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
// @MapperScan(basePackages = {"com.demo.mapper"})
public class DataMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext ac = SpringApplication.run(DataMain.class, args);

        Arrays.stream(ac.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
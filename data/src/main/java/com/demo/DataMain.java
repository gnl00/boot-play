package com.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.sql.DataSource;
import java.util.Arrays;

@Slf4j
@SpringBootApplication
public class DataMain {
    public static void main(String[] args) {
        ConfigurableApplicationContext ac = SpringApplication.run(DataMain.class, args);

        DataSource ds = ac.getBean("dataSource", DataSource.class);
        log.info("DataSource {}", ds);

        Arrays.stream(ac.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
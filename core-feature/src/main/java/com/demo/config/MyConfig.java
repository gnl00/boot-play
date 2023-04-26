package com.demo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/26
 */
@Component
@ConfigurationProperties(prefix = "mc")
@Data
public class MyConfig {

    private String name;

    private Integer age;

    private String info;

    public MyConfig() {
    }

    public MyConfig(String name, Integer age, String info) {
        this.name = name;
        this.age = age;
        this.info = info;
    }
}

package com.demo.config;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/27
 */
@AutoConfiguration
public class MyAutoConfiguration {

    @Configuration
    @ConditionalOnClass(ConfigOnClass.class)
    public static class SomeAutoConfiguration {}

    @ConditionalOnMissingBean
    @Bean
    public AutoConfigOne autoConfigOne() {
        return new AutoConfigOne();
    }

}

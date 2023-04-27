package com.demo.config;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/27
 */
@AutoConfiguration
@EnableConfigurationProperties(value = {XXXProperties.class})
public class XXXAutoConfiguration {

    @Bean
    @ConditionalOnMissingBean(XXXConfig.class)
    public XXXConfig xxxConfig(XXXProperties props) {
        XXXConfig config = new XXXConfig(props);
        return config;
    }

}

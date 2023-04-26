package com.demo.config;

import com.demo.entity.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/26
 */
@Slf4j
public class ImportConfig222 {
    {
        log.info("Initial ImportConfig222");
    }

    @Bean
    public User user() {
        return new User();
    }
}

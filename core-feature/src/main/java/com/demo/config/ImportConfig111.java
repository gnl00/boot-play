package com.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/26
 */
@Slf4j
@Qualifier("importConfig111")
public class ImportConfig111 {
    {
        log.info("Initial ImportConfig111");
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

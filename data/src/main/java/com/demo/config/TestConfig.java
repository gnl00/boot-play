package com.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/29
 */
@Slf4j
@Configuration
public class TestConfig {

    private TestProperties props;

    public TestConfig(TestProperties props) {

        log.info("TestConfig props {}", props);

        this.props = props;
    }

}

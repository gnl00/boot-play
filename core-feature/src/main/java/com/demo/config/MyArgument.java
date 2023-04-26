package com.demo.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/26
 */
@Slf4j
@Component
public class MyArgument {

    public MyArgument(ApplicationArguments args) {
        for (String arg : args.getSourceArgs()) {
            log.info("Argument: {}", arg);
        }
    }
}

package com.demo.config;

import com.demo.exception.InvalidIFOException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/26
 */
@Slf4j
@Configuration
@Import(value = {ImportConfig111.class, ImportConfig222.class})
public class MainConfig {

    {
        log.info("Initial MainConfig");
    }

    public void testInvalidIFOException() {
        throw new InvalidIFOException("aaa");
    }

    {
        // testInvalidIFOException();
    }

}

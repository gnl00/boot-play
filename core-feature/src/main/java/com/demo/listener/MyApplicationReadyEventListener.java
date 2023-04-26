package com.demo.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/26
 */
@Component
@Slf4j
public class MyApplicationReadyEventListener implements ApplicationListener<ApplicationReadyEvent> {

    {
        log.info("Initial MyApplicationReadyEventListener");
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        log.info("onApplicationEvent MyApplicationReadyEventListener");
    }
}

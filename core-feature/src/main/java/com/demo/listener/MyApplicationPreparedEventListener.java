package com.demo.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/26
 */
@Slf4j
public class MyApplicationPreparedEventListener implements ApplicationListener<ApplicationPreparedEvent> {

    {
        log.info("Initial MyListener");
    }

    @Override
    public void onApplicationEvent(ApplicationPreparedEvent event) {
        log.info("onApplicationEvent {}", event);
    }
}

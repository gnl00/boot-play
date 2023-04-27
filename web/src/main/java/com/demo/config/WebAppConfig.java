package com.demo.config;

import com.demo.filter.TestFilter;
import com.demo.filter.TestOrderFilter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/27
 */
@Slf4j
@Configuration
public class WebAppConfig implements WebMvcConfigurer {

    @Bean
    public FilterRegistrationBean<TestFilter> testFilterRegistration() {
        FilterRegistrationBean<TestFilter> frb = new FilterRegistrationBean<>();
        frb.setFilter(new TestFilter());
        return frb;
    }

}

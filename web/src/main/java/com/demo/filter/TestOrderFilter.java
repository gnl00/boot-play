package com.demo.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/27
 */

@Slf4j
// @Component
@Order(value = Ordered.HIGHEST_PRECEDENCE + 2)
@WebFilter(urlPatterns = {"/test/*"}, filterName = "testOrderFilter")
public class TestOrderFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("[TestOrderFilter] doFilter() ==> request {}", request);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {}
}

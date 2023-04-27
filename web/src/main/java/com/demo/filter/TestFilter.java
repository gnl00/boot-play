package com.demo.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;

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
@Order(value = Ordered.HIGHEST_PRECEDENCE + 1)
@WebFilter(urlPatterns = {"/test/*"})
public class TestFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info("[TestFilter] doFilter() ==> request {}", request);
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {}
}

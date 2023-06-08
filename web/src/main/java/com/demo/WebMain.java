package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationContext;

@ServletComponentScan(basePackages = {"com.demo.filter"})
@SpringBootApplication
public class WebMain {
    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(WebMain.class, args);
    }
}
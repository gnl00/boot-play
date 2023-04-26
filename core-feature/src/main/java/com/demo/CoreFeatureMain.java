package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
public class CoreFeatureMain {
    public static void main(String[] args) {
        ApplicationContext ac = SpringApplication.run(CoreFeatureMain.class, args);

//        ApplicationListener myListener = new MyListener();
//        SpringApplicationBuilder builder = new SpringApplicationBuilder();
//
//        builder.listeners(myListener);
//
//        builder.sources(CoreFeatureMain.class);
//        ApplicationContext ac = builder.run(args);
        System.out.println("Start date: " + ac.getStartupDate());
        // Arrays.stream(ac.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
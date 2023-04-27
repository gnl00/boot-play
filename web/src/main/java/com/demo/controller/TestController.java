package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author gnl
 * @since 2023/4/27
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/str")
    public String str() {
        return "hello world";
    }

}

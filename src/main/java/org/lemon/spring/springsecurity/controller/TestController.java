package org.lemon.spring.springsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String hello() {
        return "hello world";
    }

    @GetMapping("/index/hello")
    public String hello2() {
        return "hello world";
    }
}

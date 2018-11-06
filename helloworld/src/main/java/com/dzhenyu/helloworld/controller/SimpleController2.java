package com.dzhenyu.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController2 {

    @GetMapping("/test2")
    String simpleTest2() {
        return "hello world2";
    }
}

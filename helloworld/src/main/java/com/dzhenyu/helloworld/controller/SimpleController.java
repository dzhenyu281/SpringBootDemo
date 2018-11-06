package com.dzhenyu.helloworld.controller;

import com.dzhenyu.helloworld.HelloworldApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
//@EnableAutoConfiguration
public class SimpleController {

    @RequestMapping("/")
    @ResponseBody
    String sayHello() {
        return "hello world!";
    }

//
//    public static void main(String[] args) {
//        SpringApplication.run(SimpleController.class, args);
//    }
}

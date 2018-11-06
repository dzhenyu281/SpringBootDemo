package com.dzhenyu.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class SimpleController3 {

    @RequestMapping("/test3/index1")
    String simple3Test(HttpServletRequest request) {
        request.setAttribute("testKey", "hello wrold ThymeLeaf");
        return "/indexThy1";
    }

    @RequestMapping("/test3/index2")
    String simple3Test1(HttpServletRequest request) {
        return "/indexThy2";
    }

    public static final String BASE_STATIC_PATH = "/static/";

    @RequestMapping(BASE_STATIC_PATH + "**")
    String getStatic(HttpServletRequest request) {
        String url = request.getRequestURI();
        String resPath = url.substring(url.indexOf(BASE_STATIC_PATH) + BASE_STATIC_PATH.length());
        System.out.println(resPath);
        return "redirect:/" + resPath;
    }
}

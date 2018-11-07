package com.zww.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/*
*author:zhangweiwei10
*time:2018/1/9
*
*/
@RestController
public class TestController {

    @GetMapping("/hi")
    public String home() {
        return "hi ,i am from port";
    }
}

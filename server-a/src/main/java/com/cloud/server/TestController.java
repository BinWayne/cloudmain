package com.cloud.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("/call")
    public String call(){
        System.out.println("invoke");
        return "hello";
    }
}

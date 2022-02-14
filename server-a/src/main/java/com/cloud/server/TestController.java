package com.cloud.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("/call")
    public String call() throws InterruptedException {
        System.out.println("invoke");
        Thread.sleep(6000);
        return "hello";
    }
}

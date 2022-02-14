package com.cloud.server;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping("/call")
    public String call() throws InterruptedException {
        System.out.println("invoke");
        throw new RuntimeException("服务端测试异常！");
        //return "hello";
    }
}

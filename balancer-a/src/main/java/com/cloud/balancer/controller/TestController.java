package com.cloud.balancer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/balancer")
public class TestController {

    @Autowired
    private WebClient.Builder ddd;

    @RequestMapping("/call")
    public String callServer(){
        String result = ddd.build().get().uri("http://server-a/test/call").retrieve().bodyToMono(String.class).block();
        System.out.println(result+"--ss--");
        return "done";
    }
}

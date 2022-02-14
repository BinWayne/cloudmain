package com.cloud.balancer.controller;

import com.cloud.balancer.openfeign.TemplateService;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
@RequestMapping("/balancer")
@Slf4j
public class TestController {



    @Autowired
    private WebClient.Builder ddd;

    @Autowired
    private TemplateService templateService;

    @RequestMapping("/call")
    public String callServer(){
        String result = ddd.build().get().uri("http://server-a/test/call").retrieve().bodyToMono(String.class).block();
        System.out.println(result+"--sss--");
        return "done";
    }

    @RequestMapping("/call2")
    public String callServerByFeign(){
        return templateService.call()+" 333";
    }
}

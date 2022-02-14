package com.cloud.balancer.config;

import feign.Logger;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class WebClientConfig {

    @LoadBalanced
    @Bean
    WebClient.Builder ddd(){
        return WebClient.builder();
    }


    /**
     * 在 HEADERS 级别的基础上，还记录了服务请求和服务响应中的 Body 和
     * metadata
     * ，
     * FULL 级别记录了最完成的调用信息。
     * */
    @Bean
    Logger.Level feignLogger(){
        return Logger.Level.FULL;
    }
}

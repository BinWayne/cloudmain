package com.cloud.balancer.config;


import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.Request;
import org.springframework.cloud.client.loadbalancer.Response;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.loadbalancer.blocking.client.BlockingLoadBalancerClient;
import org.springframework.cloud.loadbalancer.core.ReactorServiceInstanceLoadBalancer;
import reactor.core.publisher.Mono;

public class MyLoadBalancer implements ReactorServiceInstanceLoadBalancer {
    BlockingLoadBalancerClient c;

    @Override
    public Mono<Response<ServiceInstance>> choose(Request request) {
        return null;
    }
}

package com.cloud.balancer;


import com.cloud.balancer.config.ServerConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@LoadBalancerClient(name="server",configuration = ServerConfiguration.class)
@EnableFeignClients(basePackages = {"com.cloud"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);

    }

}

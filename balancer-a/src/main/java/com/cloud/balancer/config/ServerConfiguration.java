package com.cloud.balancer.config;

import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

@Configuration
public class ServerConfiguration {
    @Bean
    @Primary
    ServiceInstanceListSupplier serviceInstanceListSupplier(){
        return new ServiceAInstanceListSuppler("server-a");
    }

    class ServiceAInstanceListSuppler implements ServiceInstanceListSupplier {

        private final String serviceId;

         ServiceAInstanceListSuppler(String serviceId){
            this.serviceId=serviceId;
        }
        @Override
        public String getServiceId() {
            return serviceId;
        }

        @Override
        public Flux<List<ServiceInstance>> get() {
            return Flux.just(Arrays
                    .asList(new DefaultServiceInstance(serviceId + "1", serviceId, "127.0.0.1", 8081, false),
                            new DefaultServiceInstance(serviceId + "2", serviceId, "127.0.0.1", 8082, false),
                            new DefaultServiceInstance(serviceId + "3", serviceId, "127.0.0.1", 8083, false)));
        }
    }
}

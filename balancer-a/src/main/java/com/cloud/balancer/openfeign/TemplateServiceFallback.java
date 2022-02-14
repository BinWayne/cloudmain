package com.cloud.balancer.openfeign;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TemplateServiceFallback implements TemplateService {
    @Override
    public String call() {
        log.info("TemplateServiceFallback..");
        return "call back!!";
    }
}

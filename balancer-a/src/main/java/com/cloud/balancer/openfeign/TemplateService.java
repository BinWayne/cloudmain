package com.cloud.balancer.openfeign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value="server-a",path="/test")
public interface TemplateService {


    @GetMapping("/call")
    public String call();


}

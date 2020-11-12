package com.jw.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "EUREKA-CLIENT-ONE")
public interface ClientInterface {
    @GetMapping("/hello")
    public String hello();

}

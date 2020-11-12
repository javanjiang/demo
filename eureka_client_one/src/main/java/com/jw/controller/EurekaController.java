package com.jw.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EurekaController {

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "this is eureka_one";
    }
}

package com.example.demo.Controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @auther javan
 * @date 2020/10/27 11:10
 */
@RestController
@RequestMapping("/user" )
public class TestController {
    @Autowired
    UserService userService;

    @RequestMapping("/getUserAll")
    public List getUserAll(){
        List userAll = userService.getUserAll();
        return userAll;
    }




}

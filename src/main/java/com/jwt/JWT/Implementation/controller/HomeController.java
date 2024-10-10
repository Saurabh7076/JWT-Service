package com.jwt.JWT.Implementation.controller;

import com.jwt.JWT.Implementation.enities.User;
import com.jwt.JWT.Implementation.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private HomeService homeService;

    @GetMapping("/user")
    public User getUser(){
        return homeService.getUser();
    }
}

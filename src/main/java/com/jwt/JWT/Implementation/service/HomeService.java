package com.jwt.JWT.Implementation.service;

import com.jwt.JWT.Implementation.enities.User;
import org.springframework.stereotype.Service;

@Service
public class HomeService {

    public User getUser(){
        return User.builder().userId(1).userName("Saurabh").userRole("Developer").build();
    }
}

package com.demo2.fctsession.service;

import com.demo2.fctsession.model.LoginRequest;
import com.demo2.fctsession.model.RegisterRequest;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    public String login(LoginRequest loginRequest) {
        System.out.println(loginRequest.getEmail());
        return "hello";
    }

    public String register(RegisterRequest registerRequest){
        return "You are successfully Registered with the email of "+ registerRequest.getEmail();
    }
}

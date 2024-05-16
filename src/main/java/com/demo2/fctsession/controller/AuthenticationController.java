package com.demo2.fctsession.controller;

import com.demo2.fctsession.model.LoginRequest;
import com.demo2.fctsession.model.RegisterRequest;
import com.demo2.fctsession.service.AuthenticationService;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/auth")
@RestController
@CrossOrigin("*")
public class AuthenticationController {

    private AuthenticationService authenticationService;

    public AuthenticationController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest loginRequest){
        String response = authenticationService.login(loginRequest);
        return response;
    }

    @PostMapping("/register")
    public String register(@RequestBody RegisterRequest registerRequest){
           String response = authenticationService.register(registerRequest);
           return response;
    }

}

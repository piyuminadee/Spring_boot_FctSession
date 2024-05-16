package com.demo2.fctsession.model;

public class LoginRequest {
    private String password;

    private String email;

    public String getName() {
        return password;
    }

    public void setName(String name) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LoginRequest(String name, String email) {
        this.password = password;
        this.email = email;
    }
}

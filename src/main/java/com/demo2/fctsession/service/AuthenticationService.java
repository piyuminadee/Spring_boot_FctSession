package com.demo2.fctsession.service;

import com.demo2.fctsession.entity.Customer;
import com.demo2.fctsession.model.LoginRequest;
import com.demo2.fctsession.model.RegisterRequest;
import com.demo2.fctsession.reporsitory.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    private CustomerRepository customerRepository;
    @Autowired
    public AuthenticationService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public String login(LoginRequest loginRequest) {
        System.out.println(loginRequest.getEmail());
        return "hello";
    }

    public String register(RegisterRequest registerRequest){
                                            //hibernate
        Customer customer = new Customer(
                registerRequest.getName(),
                registerRequest.getEmail(),
                registerRequest.getContactNo()
        );
        customerRepository.save(customer);  //hibernate
        return "You are successfully Registered with the email of "+ registerRequest.getEmail();
    }
}

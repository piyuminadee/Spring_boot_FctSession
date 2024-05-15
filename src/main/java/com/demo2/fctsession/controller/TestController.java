package com.demo2.fctsession.controller;

import com.demo2.fctsession.model.FctData;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class TestController {


    @PostMapping("/test")
    public int test(){
        return 45;
    }

    @PostMapping("/login")
    public String loging(){
        return "Login";
    }

    @GetMapping("/cal-add/{input}")
    public int addition(@PathVariable int input){
        return 10+input;
    }

    @GetMapping("/cal-sub")
    public int subtraction(@RequestParam int inp){
        return 10-inp;
    }
    @GetMapping("/cal-divi")
    public int divition(@RequestBody FctData fctData){
        return (10* fctData.getVal1());
    }


}

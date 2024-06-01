package dev.nadeesh.crudoperation;

import org.springframework.stereotype.Controller;

@Controller
public class MainController {
    public String showHomePage(){
        return "index";
    }
}

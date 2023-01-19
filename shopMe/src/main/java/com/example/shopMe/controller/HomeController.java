package com.example.shopMe.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(){
        return "home";
    }
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {
        System.out.println("Inside handeller...");
        return "test";
    }
}

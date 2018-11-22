package com.example.demo.controller;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/login")
@Controller
public class LoginController {
    @Autowired
    private UserService userServivce;

    @RequestMapping(value = "/test")
    public String testF2F() {
        return "login";
    }
}

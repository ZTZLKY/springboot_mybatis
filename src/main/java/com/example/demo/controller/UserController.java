package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import com.example.demo.serviceImpl.UserServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/user")
@RestController
public class UserController {
    @Resource
    UserServiceImpl userService;

    @RequestMapping("/insert")
    public void insert() {
        userService.insert(new User(1, "2", "2"));
        System.out.println(11);
    }
}

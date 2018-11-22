package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@RequestMapping("/login")
@Controller
public class LoginController {
    @Autowired
    private UserService userServivce;

    /**
     * 访问时跳转登录页面
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String index(Model model) {
        model.addAttribute("msg", "");
        return "login";
    }

    @RequestMapping(value = "/login")
    public String login() {
        List<User> users = userServivce.queryAll();
        return "main";
    }
}

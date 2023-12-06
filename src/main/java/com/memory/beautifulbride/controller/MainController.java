package com.memory.beautifulbride.controller;

import com.memory.beautifulbride.entitys.member.dtos.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @GetMapping("/")
    String mainPage() {
        return "index.html";
    }

    @PostMapping("/auth/login")
    void login(Login login) {

    }

    @PostMapping("/auth/signup")
    void signup() {

    }
}

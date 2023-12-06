package com.memory.beautifulbride.controller;

import com.memory.beautifulbride.entitys.member.dtos.Login;
import com.memory.beautifulbride.entitys.member.dtos.LoginDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.memory.beautifulbride.entitys.member.dtos.Login;
import com.memory.beautifulbride.entitys.member.Member;
import com.memory.beautifulbride.service.member.LoginService;


@Controller
public class MainController {
    private LoginService loginService;

    @GetMapping("/")
    String mainPage() {
        return "main.html";
//        return "index.html";
    }

/*    @PostMapping("/auth/login")
    void login(Login login) throws Exception {
        Member member = loginService.login(new LoginDto());
        if (member == null) {
            // 일치 정보 x
            return "redirect:/auth/login";
        } else {

        }
    }*/

    @PostMapping("/auth/login")
    public String login(Login login) throws Exception {
        Member member = loginService.login(new LoginDto());
        if (member == null) {

            return "/login.html";
        } else {
            return "redirect:index.html";
        }
    }

    @PostMapping("/auth/signup")
    void signup() {

    }

//    @PostMapping("/myPage_Select_List")
//    private void
}

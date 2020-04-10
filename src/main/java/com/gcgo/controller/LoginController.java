package com.gcgo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/log")
public class LoginController {
    @RequestMapping("/login")
    public String login(HttpSession httpSession, String username, String password) {
        if (username.equals("admin") && password.equals("admin")) {
            //登陆成功
            System.out.println("登陆成功");
            httpSession.setAttribute("USER_LOGIN", username);
            return "redirect:/resume/findAll";
        } else {
            //登陆失败
            System.out.println("登陆失败，请重新登陆");
            return "login";
        }
    }

    @RequestMapping("/logout")
    public String clientLoginOut(HttpSession httpSession) {
        httpSession.invalidate();
        return "redirect:/resume/findAll";
    }
}

package com.zunchen.tacocloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassNam HomeController
 * @Description TODO
 * @Author Administrator
 * @Date 2020/9/2 9:52
 * @Version 1.0
 */
@Controller
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("login")
    public String login(@RequestParam(value = "") String username, @RequestParam(value = "password") String password){
        return "";
    }
}

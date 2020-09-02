package com.zunchen.tacocloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

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
}

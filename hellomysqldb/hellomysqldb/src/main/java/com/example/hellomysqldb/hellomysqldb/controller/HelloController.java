package com.example.hellomysqldb.hellomysqldb.controller;

import com.example.hellomysqldb.hellomysqldb.entity.Hello;
import com.example.hellomysqldb.hellomysqldb.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @Autowired
    HelloService helloService;
    @GetMapping("/hello")
    public String hello(Model model){
        Hello hello1 = helloService.getMessage(1);
        String str  =hello1.getSname();
        model.addAttribute("message", str);
        return "index";
    }
}

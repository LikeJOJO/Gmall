package com.example.gmalllogger.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class LoggerController {
    @RequestMapping("test")
    public String test01() {
        System.out.println("success");
        return "jiaojiao";
    }
}

package com.example.library.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/test")
    public String testConnection() {
        return "Spring Boot 启动成功! Time: " + new java.util.Date();
    }
}
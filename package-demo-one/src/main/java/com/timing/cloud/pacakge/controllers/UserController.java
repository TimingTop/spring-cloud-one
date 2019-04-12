package com.timing.cloud.pacakge.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user/hi")
    public String sayHi() {

        return "Hi, it is work!";
    }
}

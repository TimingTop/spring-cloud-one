package com.timing.cloud.spring.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/hi")
    public String hi(@RequestParam(required = false, defaultValue = "Timing") String name) {
        return "hi, gateway";
    }

}

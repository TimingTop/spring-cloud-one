package com.timing.cloud.session.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class UserController {
    @GetMapping("/set")
    @ResponseBody
    public Object writeSession(@RequestParam(required = false) String sessionVal, HttpSession httpSession) {
        httpSession.setAttribute("timing", sessionVal);
        return sessionVal;
    }
    @GetMapping("/get")
    @ResponseBody
    public Object readSession(HttpSession httpSession) {
        Object obj = httpSession.getAttribute("timing");
        System.out.println("session timing : " + obj);
        return obj;
    }
}

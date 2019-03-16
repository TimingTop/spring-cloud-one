package com.timing.cloud.dubbo.api.service;

public class HelloImpl implements Hello {
    @Override
    public String say(String msg) {
        System.out.println("Hello, " + msg);

        return msg;
    }
}

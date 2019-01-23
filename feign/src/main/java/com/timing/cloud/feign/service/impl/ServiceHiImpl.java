package com.timing.cloud.feign.service.impl;

import com.timing.cloud.feign.service.ServiceHi;
import org.springframework.stereotype.Component;

@Component
public class ServiceHiImpl implements ServiceHi {

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}

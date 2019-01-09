package com.timing.cloud.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        // eureka server 不兼容 spring boot 2.0 以上
        SpringApplication.run(Application.class, args);
    }
}

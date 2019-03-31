package com.timing.cloud.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "com.timing")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    /*

    项目启动后，
    访问如下接口，就能看到 swagger 文档

    http://localhost:8080/swagger-ui.html#/user-controller/getUserUsingGET



     */
}

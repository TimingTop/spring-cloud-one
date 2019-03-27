package com.timing.cloud.session;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

@SpringBootApplication
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 20)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

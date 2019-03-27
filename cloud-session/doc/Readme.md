# session
## redis
### 启动 redis docker
```
docker pull redis
docker run --name redis001 -p 6379:6379 -d redis

```

### java项目
pom 文件
```xml
 <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
            <version>2.1.3.RELEASE</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.springframework.session/spring-session-data-redis -->
        <dependency>
            <groupId>org.springframework.session</groupId>
            <artifactId>spring-session-data-redis</artifactId>
            <version>2.1.3.RELEASE</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.springframework.boot/spring-boot-starter-data-redis -->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-redis</artifactId>
            <version>2.1.3.RELEASE</version>
        </dependency>
```

java 文件
```java
// Application.java
@SpringBootApplication
@Configuration
@EnableRedisHttpSession(maxInactiveIntervalInSeconds = 20)
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
```

```java
// UserController.java
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
```

> 随便调用一下，然后检查 redis
```
docker exec -it redis bash

redis-cli
keys *

```

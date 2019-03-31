package com.timing.cloud.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Api(description = "User interface")
@RestController
@RequestMapping("/user")
public class UserController {

    @ApiOperation(value="Get User", notes = "Get the User")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public String getUser(@RequestParam("userId") String userId) {
        return "Timing";
    }
}

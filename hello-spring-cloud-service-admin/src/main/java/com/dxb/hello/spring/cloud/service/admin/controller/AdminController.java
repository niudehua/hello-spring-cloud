package com.dxb.hello.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author:deng
 * @date: 2019/4/16
 * @time: 4:08 PM
 * @email 657563945@qq.com
 */
@RestController
public class AdminController {
    @Value("${server.port}")
    private String port;

    @RequestMapping(method = RequestMethod.GET,value = "hi")
    public String sayHi(@RequestParam(value = "message") String message) {
        return String.format("Hi，your message is : %s i am from port : %s", message, port);
    }
}

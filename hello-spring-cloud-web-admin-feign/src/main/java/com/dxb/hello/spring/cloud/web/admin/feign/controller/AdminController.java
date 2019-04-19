package com.dxb.hello.spring.cloud.web.admin.feign.controller;

import com.dxb.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:deng
 * @date: 2019/4/16
 * @time: 8:08 PM
 * @email 657563945@qq.com
 */
@RestController
public class AdminController {
    @Autowired
    AdminService adminService;

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String sayHi(@RequestParam String message) {
        return adminService.SayHi(message);
    }
}

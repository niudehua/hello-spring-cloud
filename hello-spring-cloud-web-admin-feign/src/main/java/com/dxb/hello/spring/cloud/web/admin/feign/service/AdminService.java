package com.dxb.hello.spring.cloud.web.admin.feign.service;

import com.dxb.hello.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


/**
 * @author:deng
 * @date: 2019/4/16
 * @time: 8:05 PM
 * @email 657563945@qq.com
 */
@FeignClient(value = "hello-spring-cloud-service-admin", fallback = AdminServiceHystrix.class)
public interface AdminService {
    @RequestMapping(value = "hi", method = RequestMethod.GET)
    public String SayHi(@RequestParam(value = "message") String message);


}

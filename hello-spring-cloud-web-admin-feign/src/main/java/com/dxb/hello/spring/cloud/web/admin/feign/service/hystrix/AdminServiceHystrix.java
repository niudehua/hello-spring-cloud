package com.dxb.hello.spring.cloud.web.admin.feign.service.hystrix;

import com.dxb.hello.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @author:deng
 * @date: 2019/4/17
 * @time: 1:39 AM
 * @email 657563945@qq.com
 */
@Component
public class AdminServiceHystrix implements AdminService {
    @Override
    public String SayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}

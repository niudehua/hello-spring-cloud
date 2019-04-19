package com.dxb.hello.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.internal.EnableZipkinServer;

/**
 * @author:deng
 * @date: 2019/4/18
 * @time: 10:05 PM
 * @email 657563945@qq.com
 */
@SpringBootApplication
@EnableZipkinServer
@EnableEurekaClient
public class ZipKinApplication {
    public static void main(String[] args) {
        SpringApplication.run(ZipKinApplication.class, args);
    }
}

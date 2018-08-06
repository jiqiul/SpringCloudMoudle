package com.jiqiul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author wos098
 * @create 2018-08-06 12:28
 * @desc 注册中心启动类
 **/
@SpringBootApplication
@EnableEurekaServer
public class SpringCloudRegistry {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudRegistry.class, args);
    }
}

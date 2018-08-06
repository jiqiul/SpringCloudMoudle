package com.jiqiul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author wos098
 * @create 2018-08-06 12:28
 * @desc 注册Application启动类
 **/
@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEureka {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEureka.class, args);
    }
}

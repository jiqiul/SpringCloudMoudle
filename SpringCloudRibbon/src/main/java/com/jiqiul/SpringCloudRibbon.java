package com.jiqiul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * @author wos098
 * @create 2018-08-06 12:28
 * @desc 注册中心启动类
 **/
@SpringBootApplication
@EnableDiscoveryClient
@EnableHystrix
public class SpringCloudRibbon {
    public static void main(String[] args) {
        SpringApplication.run(SpringCloudRibbon.class, args);
    }
}

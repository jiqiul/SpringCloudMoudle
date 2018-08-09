package com.controller;

import com.util.RedisTemplateUtil;
import com.util.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author wos098
 * @create 2018-08-07 14:18
 * @desc 测试类
 **/
@RestController
@EnableAutoConfiguration
@RequestMapping("/es")
public class RedisController {
    @Autowired
    private RedisTemplate redisTemplate;

    @RequestMapping(value = "/getRedis")
    public void getRedis(){
        redisTemplate.opsForValue().set("redis","1111",10L,TimeUnit.MINUTES);
    }
}

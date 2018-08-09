package com.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author wos098
 * @create 2018-08-07 16:46
 * @desc redis工具类
 **/
@Component
public class RedisTemplateUtil {
    @Autowired
    private RedisTemplate redisTemplate;

    public void setData(String key, String value) {
        redisTemplate.opsForValue().set(key, value);
    }

    /**
     * time为0 时永久有效
     * @param key
     * @param value
     * @param time
     * @param timeUnit
     */
    public void setData(String key, String value, Long time, TimeUnit timeUnit) {
        redisTemplate.opsForValue().set(key, value, time, timeUnit);
    }

    public Object getData(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public Boolean hasKey(String key) {
        return redisTemplate.hasKey(key);
    }

    public void delete(String key) {
        redisTemplate.delete(key);
    }
}

package com.jiqiul.user.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCollapser;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.response.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wos098
 * @create 2018-08-06 17:51
 * @desc
 **/
@Service
public class UserService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod  = "error")
    public ResponseMsg searchUser(Long id) {
        Map map = new HashMap(0);
        map.put("id", id);
        return restTemplate.getForObject("http://spring-cloud-eureka/api/findOne?id={id}", ResponseMsg.class, map);
    }

    public ResponseMsg error(Long id) {
        ResponseMsg msg = new ResponseMsg();
        String data = "不存在id为" + id + "的用户";
        msg.setData(data);
        return msg;
    }
}

package com.jiqiul.user.controller;


import com.common.BasicVo;
import com.jiqiul.user.domain.User;
import com.jiqiul.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wos098
 * @create 2018-08-06 9:58
 * @desc 用户数据交互层
 **/
@RestController
@RequestMapping(value = "/api")
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping(value = "/findOne",method = RequestMethod.POST)
    public User findOne(@RequestBody BasicVo vo){
        return service.findOne(vo.getId());
    }
}

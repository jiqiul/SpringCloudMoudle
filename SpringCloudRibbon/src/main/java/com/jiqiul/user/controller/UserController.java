package com.jiqiul.user.controller;

import com.jiqiul.user.service.UserService;
import com.response.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wos098
 * @create 2018-08-06 14:05
 * @desc 用户Ribbon
 **/
@RestController
@RequestMapping(value = "/api")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/searchUser", method = RequestMethod.GET)
    public ResponseMsg searchUser(@RequestParam(name = "id") Long id) {
        return userService.searchUser(id);
    }
}

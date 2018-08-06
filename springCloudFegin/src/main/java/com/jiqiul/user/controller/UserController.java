package com.jiqiul.user.controller;

import com.jiqiul.user.repository.UserRepository;
import com.jiqiul.user.service.UserService;
import com.response.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wos098
 * @create 2018-08-06 16:54
 * @desc 交互层
 **/
@RestController
@RequestMapping("/api")
public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("/findById")
    public ResponseMsg findById(@RequestParam(name = "id") Long id) {
        return service.findById(id);
    }
}

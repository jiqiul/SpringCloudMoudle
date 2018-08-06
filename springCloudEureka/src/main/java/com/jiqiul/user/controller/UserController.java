package com.jiqiul.user.controller;


import com.common.BasicVo;
import com.jiqiul.user.domain.User;
import com.jiqiul.user.service.UserService;
import com.response.ResponseMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/findOne",method = RequestMethod.GET)
    public ResponseMsg findOne(@RequestParam(name = "id") Long id){
        ResponseMsg result = new ResponseMsg();
        result.setData(service.findOne(id).toString());
        return result;
    }
}

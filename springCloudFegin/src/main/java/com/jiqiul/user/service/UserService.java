package com.jiqiul.user.service;

import com.jiqiul.user.repository.UserRepository;
import com.response.ResponseMsg;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wos098
 * @create 2018-08-06 16:52
 * @desc feign Service层
 **/
@Service
public class UserService  {
    @Autowired
    private UserRepository repository;

    public ResponseMsg findById(Long id){
        return repository.findById(id);
    }
}

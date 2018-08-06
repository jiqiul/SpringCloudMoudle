package com.jiqiul.user.service;

import com.jiqiul.user.domain.User;
import com.jiqiul.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author wos098
 * @create 2018-08-06 9:56
 * @desc 用户接口实现类
 **/
@Slf4j
@Service
public class UserService {
    @Autowired
    private UserRepository repository;

    public User findOne(Long id){
        return repository.findOne(id);
    }
}

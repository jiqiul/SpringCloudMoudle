package com.jiqiul.user.service;

import com.jiqiul.user.repository.UserRepository;
import com.response.ResponseMsg;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @author wos098
 * @create 2018-08-06 16:52
 * @desc feign Service层
 **/
@Component
public class UserErrorService implements UserRepository {
    @Override
    public ResponseMsg findById(Long id) {
        ResponseMsg msg = new ResponseMsg();
        String data = "不存在id为" + id + "的用户";
        msg.setData(data);
        return msg;
    }
}

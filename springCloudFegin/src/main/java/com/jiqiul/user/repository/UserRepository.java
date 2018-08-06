package com.jiqiul.user.repository;

import com.jiqiul.user.service.UserErrorService;
import com.jiqiul.user.service.UserService;
import com.response.ResponseMsg;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author wos098
 * @create 2018-08-06 16:46
 * @desc feign 接口类
 **/
@FeignClient(value = "spring-cloud-eureka",fallback = UserErrorService.class)
public interface UserRepository {
    /**
     * 用户接口类
     * @param id
     * @return
     */
    @RequestMapping("/api/findOne")
    public ResponseMsg findById(@RequestParam(name = "id")Long id);
}

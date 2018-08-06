package com.jiqiul.user.repository;

import com.jiqiul.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author wos098
 * @create 2018-08-06 9:54
 * @desc 用户 Jpa接口类
 **/
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}

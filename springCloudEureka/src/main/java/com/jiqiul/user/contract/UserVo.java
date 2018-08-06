package com.jiqiul.user.contract;

import com.common.BasicVo;
import lombok.Data;

/**
 * @author wos098
 * @create 2018-08-06 10:02
 * @desc 用户接受类
 **/
@Data
public class UserVo extends BasicVo {
    private String username;
    private String password;
}

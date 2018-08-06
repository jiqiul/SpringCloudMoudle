package com.jiqiul.user.domain;

import lombok.Data;

import javax.persistence.*;

/**
 * @author wos098
 * @create 2018-08-06 9:50
 * @desc 用户表
 **/
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;
}

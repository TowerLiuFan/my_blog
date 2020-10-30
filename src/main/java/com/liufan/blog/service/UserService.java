package com.liufan.blog.service;

import com.liufan.blog.po.User;

/**
 * @Author: Fan
 * @Date: 2020/10/29 23:18
 */
public interface UserService {

    User checkUser(String username, String password);
}

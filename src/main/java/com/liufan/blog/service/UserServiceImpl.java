package com.liufan.blog.service;

import com.liufan.blog.mapper.UserMapper;
import com.liufan.blog.po.User;
import com.liufan.blog.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: Fan
 * @Date: 2020/10/29 23:19
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public User checkUser(String username, String password) {
        User user = userMapper.checkUser(username, MD5Utils.code(password));
        return user;
    }
}

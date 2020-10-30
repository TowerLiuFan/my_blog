package com.liufan.blog.mapper;

import com.liufan.blog.po.Comment;
import com.liufan.blog.po.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author: Fan
 * @Date: 2020/10/28 20:08
 */
public interface UserMapper {

//    User findByUsernameAndPassword(String username, String password);


    User checkUser(@Param("username") String username, @Param("password") String password);
}

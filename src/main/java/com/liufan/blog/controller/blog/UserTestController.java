package com.liufan.blog.controller.blog;

import com.liufan.blog.mapper.TestMapper;
import com.liufan.blog.po.UserTest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author: Fan
 * @Date: 2020/10/28 20:15
 */
@RestController
public class UserTestController {

    @Resource
    private TestMapper testMapper;

    @PostMapping("/listUser")
    public List<UserTest> getUserList(){
        List<UserTest> userList = testMapper.getUserList();
        return  userList;
    }
}

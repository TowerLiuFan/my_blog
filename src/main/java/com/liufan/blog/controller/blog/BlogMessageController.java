package com.liufan.blog.controller.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 留言页面
 * @Author: Fan
 * @Date: 2020/10/16 23:23
 */
@Controller
public class BlogMessageController {


    @RequestMapping("/message")
    public String toMessagePage(){
        return "blog/message";
    }
}

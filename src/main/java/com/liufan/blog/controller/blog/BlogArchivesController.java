package com.liufan.blog.controller.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 归档页面
 * @Author: Fan
 * @Date: 2020/10/16 23:19
 */
@Controller
public class BlogArchivesController {

    @RequestMapping("/archives")
    public String toArchivesPage(){
        return "blog/archives";
    }
}

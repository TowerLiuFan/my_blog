package com.liufan.blog.controller.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 更新页面
 * @Author: Fan
 * @Date: 2020/10/16 23:09
 */
@Controller
public class BlogUpdateController {

    @RequestMapping("/update")
    public String toUpdatePage(){
        return "blog/update";
    }
}

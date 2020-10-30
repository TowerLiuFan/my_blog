package com.liufan.blog.controller.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 链接页面
 * @Author: Fan
 * @Date: 2020/10/16 23:18
 */
@Controller
public class BlogLinkController {

    @RequestMapping("/link")
    public String toLinkPage(){
        return "blog/link";
    }
}

package com.liufan.blog.controller.blog;

import com.liufan.blog.po.Blog;
import com.liufan.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

;


/**
 * @Author: Fan
 * @Date: 2020/10/20 22:56
 */
@Controller
public class BlogDetailController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/detail/{id}")
    public String toDetailPage(@PathVariable("id") Long id, Model model) {
        Blog blog = blogService.getAndConvert(id);
        model.addAttribute("blog", blog);
        return "blog/detail";
    }
}

package com.liufan.blog.controller.blog;

import com.liufan.blog.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 首页
 *
 * @Author: Fan
 * @Date: 2020/10/16 22:56
 */

@Controller
public class BlogIndexController {

    @Autowired
    private BlogService blogService;

    @RequestMapping("/index")
    public String toIndexPage(@PageableDefault(size = 8, sort = {"updateTime"}, direction = Sort.Direction.DESC) Pageable pageable,
                              Model model) {
        model.addAttribute("page", blogService.findAll(null));
        return "blog/index";
    }
}

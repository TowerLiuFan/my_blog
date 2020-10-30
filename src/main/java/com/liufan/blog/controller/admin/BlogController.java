package com.liufan.blog.controller.admin;

import com.liufan.blog.po.Blog;
import com.liufan.blog.po.Type;
import com.liufan.blog.service.BlogService;
import com.liufan.blog.service.TypeService;
import com.liufan.blog.service.UserService;
import com.liufan.blog.vo.BlogQuery;
import com.liufan.blog.vo.MyPageVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by limi on 2017/10/15.
 */
@Controller
@RequestMapping("/admin")
public class BlogController {

    private static final String INPUT = "admin/blogs-input";
    private static final String LIST = "admin/blogs";
    private static final String REDIRECT_LIST = "redirect:/admin/blogs";


    @Autowired
    private BlogService blogService;
    @Autowired
    private TypeService typeService;
    @Autowired
    private UserService userService;


    @GetMapping("/blogList")
    public String blogList(BlogQuery blog, Model model) {
        MyPageVO<Blog> page = blogService.findAll(blog);
        List<Type> typeList = typeService.findAll();
        model.addAttribute("types", typeList);
        model.addAttribute("page", page);
        return LIST;
    }


}

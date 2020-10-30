package com.liufan.blog.service;

import com.liufan.blog.po.Blog;
import com.liufan.blog.vo.BlogQuery;
import com.liufan.blog.vo.MyPageVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

/**
 * Created by limi on 2017/10/20.
 */
public interface BlogService {

    MyPageVO<Blog> findAll(BlogQuery blog);

    Blog getAndConvert(Long id);
}

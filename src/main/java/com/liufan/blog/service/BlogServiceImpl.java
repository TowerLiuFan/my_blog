package com.liufan.blog.service;

import com.liufan.blog.handler.NotFoundException;
import com.liufan.blog.mapper.BlogMapper;
import com.liufan.blog.po.Blog;
import com.liufan.blog.po.Type;
import com.liufan.blog.util.MarkdownUtils;
import com.liufan.blog.util.MyBeanUtils;
import com.liufan.blog.vo.BlogQuery;
import com.liufan.blog.vo.MyPageVO;
import com.liufan.blog.vo.PageVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.persistence.criteria.*;
import java.util.*;

/**
 *
 */
@Service
public class BlogServiceImpl implements BlogService {



    @Resource
    private BlogMapper blogMapper;




    @Override
    public MyPageVO<Blog> findAll(BlogQuery blog) {
        MyPageVO<Blog> pageVo = new MyPageVO<>();
        List<Blog> blogList = blogMapper.findAll(blog);
        pageVo.setContent(blogList);
        pageVo.setPage(new PageVO());
        pageVo.setTotalPages(blogList.size());
        return pageVo;
    }

    @Override
    public Blog getAndConvert(Long id) {
        Blog blog = blogMapper.getOne(id);
        if (blog == null) {
            throw new NotFoundException("该博客不存在");
        }
        Blog b = new Blog();
        BeanUtils.copyProperties(blog,b);
        String content = b.getContent();
        b.setContent(MarkdownUtils.markdownToHtmlExtensions(content));
        // todo 浏览次数+1
        return b;
    }


}

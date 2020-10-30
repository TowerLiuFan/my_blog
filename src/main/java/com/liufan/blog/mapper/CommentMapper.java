package com.liufan.blog.mapper;

import com.liufan.blog.po.Comment;
import com.liufan.blog.po.UserTest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author: Fan
 * @Date: 2020/10/28 20:08
 */
public interface CommentMapper {

    List<Comment> findByBlogIdAndParentCommentNull(Long blogId, Sort sort);

    @Query("select b from Comment b where b.id = ?1")
    Comment getOne(Long id);
}

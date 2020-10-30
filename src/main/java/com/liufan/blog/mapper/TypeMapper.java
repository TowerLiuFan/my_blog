package com.liufan.blog.mapper;

import com.liufan.blog.po.Blog;
import com.liufan.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author: Fan
 * @Date: 2020/10/28 20:56
 */
public interface TypeMapper {

    Type findByName(String name);

    List<Type> findAll();


    @Query("select t from Type t")
    List<Type> findTop(Pageable pageable);

    @Query("select t from Type t where t.id = ?1")
    Type getOne(Long id);
}

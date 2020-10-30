package com.liufan.blog.mapper;

import com.liufan.blog.po.Tag;
import com.liufan.blog.po.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author: Fan
 * @Date: 2020/10/28 20:08
 */
public interface TagMapper {

    Tag findByName(String name);

    @Query("select t from Tag t")
    List<Tag> findTop(Pageable pageable);

    @Query("select t from Tag t where t.id = ?1")
    Tag getOne(Long id);
}

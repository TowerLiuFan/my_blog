package com.liufan.blog.service;

import com.liufan.blog.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface TypeService {

    List<Type> findAll();

}

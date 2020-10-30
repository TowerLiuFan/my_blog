package com.liufan.blog.service;

import com.liufan.blog.handler.NotFoundException;
import com.liufan.blog.mapper.TypeMapper;
import com.liufan.blog.po.Type;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by limi on 2017/10/16.
 */
@Service
public class TypeServiceImpl implements TypeService {


    @Resource
    private TypeMapper typeMapper;


    @Override
    public List<Type> findAll() {
        List<Type> typeList = typeMapper.findAll();
        return typeList;
    }


}

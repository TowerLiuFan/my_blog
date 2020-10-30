package com.liufan.blog.vo;

import lombok.Data;

import java.util.List;

/**
 * @Author: Fan
 * @Date: 2020/10/29 20:42
 */
@Data
public class MyPageVO<T> {
    private Integer totalPages;

    private List<T> content;

    private PageVO page;
}

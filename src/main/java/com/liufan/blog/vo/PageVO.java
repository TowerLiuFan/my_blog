package com.liufan.blog.vo;

import lombok.Data;

/**
 * @Author: Fan
 * @Date: 2020/10/29 21:15
 */
@Data
public class PageVO {
    private Integer page;
    private Integer size = 8;
}

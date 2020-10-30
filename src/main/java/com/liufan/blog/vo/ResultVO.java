package com.liufan.blog.vo;

import lombok.Getter;
import org.springframework.data.domain.Pageable;

/**
 * @Author: Fan
 * @Date: 2020/10/29 20:28
 */
@Getter
public class ResultVO<T> {

    private int code;

    private String msg;

    private T data;

    public ResultVO(T data){
        this(200,"SUCCESS",data);
    }

    public ResultVO(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}

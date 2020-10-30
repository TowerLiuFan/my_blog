package com.liufan.blog.po;

import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;



@Data
public class Type {
    private Long id;
    private String name;
    private List<Blog> blogs = new ArrayList<>();

}

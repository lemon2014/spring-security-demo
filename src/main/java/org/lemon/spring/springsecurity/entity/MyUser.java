package org.lemon.spring.springsecurity.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "users")
public class MyUser {
    private Integer id;
    private String username;
    private String password;
}

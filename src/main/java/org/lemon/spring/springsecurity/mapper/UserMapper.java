package org.lemon.spring.springsecurity.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.lemon.spring.springsecurity.entity.MyUser;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper extends BaseMapper<MyUser> {
}

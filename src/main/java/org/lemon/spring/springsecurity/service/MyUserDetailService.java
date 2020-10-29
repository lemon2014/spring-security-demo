package org.lemon.spring.springsecurity.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.lemon.spring.springsecurity.entity.MyUser;
import org.lemon.spring.springsecurity.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 实现通过本地的数据库进行用户验证
 */
@Service
public class MyUserDetailService implements UserDetailsService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<MyUser> wrapper = new QueryWrapper<>();
        wrapper.eq("username", username);
        MyUser myUser = userMapper.selectOne(wrapper);
        if (null == myUser) {
            throw new UsernameNotFoundException("用户名不存在");
        }

        //设置用户的权限信息，临时写死
        List<GrantedAuthority> auths = AuthorityUtils.commaSeparatedStringToAuthorityList("role");
        return new User(myUser.getUsername(), myUser.getPassword(), auths);
    }
}

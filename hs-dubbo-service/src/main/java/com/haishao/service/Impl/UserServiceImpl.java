package com.haishao.service.Impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.haishao.entity.User;
import com.haishao.mapper.UserMapper;
import com.haishao.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author haishao
 * @time 2024-04-24-16:34
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int register(User user) {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String now = simpleDateFormat.format(date);
        user.setCreateTime(now);
        int row = userMapper.register(user);
        return row;
    }
}

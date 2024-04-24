package com.haishao.mapper;

import com.haishao.entity.User;

/**
 * @author haishao
 * @time 2024-04-24-00:15
 */
public interface UserMapper {
    /**
     * 注册用户
     *
     * @param user
     * @return
     */
    int register(User user);
}

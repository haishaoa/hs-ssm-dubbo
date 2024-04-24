package com.haishao.service;

import com.haishao.entity.User;

/**
 * @author haishao
 * @time 2024-04-24-16:29
 */
public interface UserService {
    /**
     * 注册用户接口
     *
     * @param user
     * @return
     */
    int register(User user);
}

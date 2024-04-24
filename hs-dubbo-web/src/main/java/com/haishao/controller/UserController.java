package com.haishao.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.haishao.entity.User;
import com.haishao.service.UserService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author haishao
 * @time 2024-04-24-17:49
 */
@RestController
public class UserController {
    @Reference
    private UserService userService;

    @RequestMapping("/reg")
    public String register(@RequestBody User user) {
        System.out.println("用户开始注册。。。");
        try {
            userService.register(user);
            return "注册成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "注册失败";
        }
    }
}

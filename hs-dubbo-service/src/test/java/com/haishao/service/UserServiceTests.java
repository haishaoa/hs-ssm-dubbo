package com.haishao.service;

import com.haishao.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author haishao
 * @time 2024-04-24-16:47
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/spring-*.xml"})
public class UserServiceTests {
    @Autowired
    private UserService userService;

    @Test
    public void register() {
        User user = new User("jack", "321", "135145531435",
                new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        int row = userService.register(user);
        System.out.println(row);
    }
}

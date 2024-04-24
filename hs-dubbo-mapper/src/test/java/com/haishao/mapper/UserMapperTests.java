package com.haishao.mapper;

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
 * @time 2024-04-24-01:20
 */
//表示将当前类作为一个单元测试类
@RunWith(SpringJUnit4ClassRunner.class)
//表示加载spring/spring-mapper.xml文件
@ContextConfiguration(locations = {"classpath:spring/spring-mapper.xml"})
public class UserMapperTests {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void register() {
        User user = new User("tom", "123", "12321313", new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
        int row = userMapper.register(user);
        System.out.println("row=" + row);
    }
}

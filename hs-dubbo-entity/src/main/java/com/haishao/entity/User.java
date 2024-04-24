package com.haishao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.ibatis.annotations.Insert;

import java.io.Serializable;

/**
 * @author haishao
 * @time 2024-04-24-00:02
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private Insert id;
    private String username;
    private String password;
    private String phone;
    private String createTime;

    public User(String username, String password, String phone, String createTime) {
        this.username = username;
        this.password = password;
        this.phone = phone;
        this.createTime = createTime;
    }
}

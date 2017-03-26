package com.service;

import com.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by LK on 2016/8/4.
 */
public abstract interface UserMng {
    public List<User> getAllUser();

    public User getUserById(Integer id);

    public User getUserByUserName(String userName);
}

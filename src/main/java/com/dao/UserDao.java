package com.dao;

import com.entity.User;

import java.util.List;

/**
 * Created by LK on 2016/8/4.
 */
public abstract interface UserDao {
    public List<User> getAllUser();

    public User getUserById(Integer id);

    public User getUserByUserName(String userName);
}

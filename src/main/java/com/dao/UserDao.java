package com.dao;

import com.entity.User;

import java.util.List;

/**
 * Created by LK on 2016/8/4.
 */
public interface UserDao {
    List<User> getAllUser();

    User getUserById(Integer id);

    User getUserByUserName(String userName);

    void addUser(User user);
}

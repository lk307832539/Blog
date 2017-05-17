package com.service.impl;

import com.dao.UserDao;
import com.entity.User;
import com.service.UserMng;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LK on 2016/8/4.
 */
@Service
public class UserMngImpl implements UserMng {

    @Resource
    private UserDao userDao;

    public List<User> getAllUser() {
        return this.userDao.getAllUser();
    }

    public User getUserById(Integer id) {
        return this.userDao.getUserById(id);
    }

    @Override
    public User getUserByUserName(String userName) {
        return this.userDao.getUserByUserName(userName);
    }
}

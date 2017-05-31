package com.service.impl;

import com.dao.UserDao;
import com.entity.User;
import com.service.UserMng;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LK on 2016/8/4.
 */
@Service
@Transactional
public class UserMngImpl implements UserMng {

    @Resource
    private UserDao userDao;

    @Override
    public List<User> getAllUser() {
        return this.userDao.getAllUser();
    }

    @Override
    public User getUserById(Integer id) {
        return this.userDao.getUserById(id);
    }

    @Override
    public User getUserByUserName(String userName) {
        return this.userDao.getUserByUserName(userName);
    }
}

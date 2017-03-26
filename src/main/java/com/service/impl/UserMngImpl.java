package com.service.impl;

import com.dao.UserDao;
import com.dao.impl.UserDaoImpl;
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
        List<User> list = this.userDao.getAllUser();
        return list;
    }

    public User getUserById(Integer id) {
        User user = this.userDao.getUserById(id);
        return user;
    }

    @Override
    public User getUserByUserName(String userName) {
        User user = this.userDao.getUserByUserName(userName);
        return user;
    }
}

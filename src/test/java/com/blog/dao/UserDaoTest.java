package com.blog.dao;

import com.blog.entity.User;
import com.blog.entity.UserExt;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@Disabled
public class UserDaoTest {

    @Resource
    private UserDao userDao;
    @Resource
    private UserExtDao userExtDao;

    @Test
    @Disabled
    public void save() {
        User user = new User();

        UserExt userExt = new UserExt();

        user.setUserName("admin1");
        user.setPassword("password");
        user.setUserExt(userExt);

        userDao.save(user);
    }

}

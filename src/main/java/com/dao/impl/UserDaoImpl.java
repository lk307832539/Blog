package com.dao.impl;

import com.dao.UserDao;
import com.entity.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LK on 2016/8/4.
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Resource
    private SessionFactory sessionFactory;

    public List<User> getAllUser() {
        String hql = "from User";
        Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
        List<User> list = query.list();
        return list;
    }

    public User getUserById(Integer id) {
        String hql = "from User where User.id =?";
        Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter(0,id);
        return (User) query.uniqueResult();
    }

    @Override
    public User getUserByUserName(String userName) {
        String hql = "from User u where u.userName =:userName";
        Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
        query.setParameter("userName", userName);
        return (User) query.uniqueResult();
    }
}

package com.dao.impl;

import com.dao.UserDao;
import com.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LK on 2016/8/4.
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Resource
    private SessionFactory sessionFactory;

    private Session getSession() {
        Session session;
        try {
            session = sessionFactory.getCurrentSession();
        } catch (Exception e) {
            session = sessionFactory.openSession();
        }
        return session;
    }

    public List<User> getAllUser() {
        String hql = "from User";
        Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
        return (List<User>) query.list();
    }

    public User getUserById(Integer id) {
        String hql = "from User where User.id =?";
        Query query = this.getSession().createQuery(hql);
        query.setParameter(0, id);
        return (User) query.uniqueResult();
    }

    @Override
    public User getUserByUserName(String userName) {
        String hql = "from User u where u.userName =:userName";
        Query query = this.getSession().createQuery(hql);
        query.setParameter("userName", userName);
        return (User) query.uniqueResult();
    }

    @Override
    public void addUser(User user) {
        getSession().save(user);
    }
}

package com.dao.impl;

import com.dao.ContentExtDao;
import com.entity.ContentExt;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by LK on 2017/5/29.
 */
@Repository
@Transactional
public class ContentExtDaoImpl implements ContentExtDao {
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

    @Override
    public ContentExt save(ContentExt contentExt) {
        this.getSession().save(contentExt);
        this.getSession().flush();
        return contentExt;
    }
}

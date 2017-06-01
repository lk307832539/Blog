package com.dao.impl;

import com.dao.ContentDao;
import com.entity.Content;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LK on 2017/5/17.
 */
@Repository
@Transactional
public class ContentDaoImpl implements ContentDao {
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
    public List<Content> getList() {
        String hql = "from Content";
        Query query = this.getSession().createQuery(hql);
        return (List<Content>) query.list();
    }

    @Override
    public Content save(Content content) {
        this.getSession().save(content);
        this.getSession().flush();
        return content;
    }

    @Override
    public Content getContentById(Integer id) {
        String hql = "from Content where id =:id ";
        Query query = this.getSession().createQuery(hql);
        query.setParameter("id", id);
        return (Content) query.uniqueResult();
    }
}

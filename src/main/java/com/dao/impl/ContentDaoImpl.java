package com.dao.impl;

import com.dao.ContentDao;
import com.entity.Content;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LK on 2017/5/17.
 */
@Repository
public class ContentDaoImpl implements ContentDao {
    @Resource
    private SessionFactory sessionFactory;

    @Override
    public List<Content> getContentList() {
        String hql = "from Content";
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        return (List<Content>) query.list();
    }
}

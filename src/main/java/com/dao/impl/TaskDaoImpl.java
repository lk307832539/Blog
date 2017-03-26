package com.dao.impl;

import com.dao.TaskDao;
import com.entity.Task;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LK on 2016/8/23.
 */
@Repository
public class TaskDaoImpl implements TaskDao {
    @Resource
    private SessionFactory sessionFactory;

    @Override
    public List<Task> getAllTask() {
        String hql = "from Task";
        Query query = this.sessionFactory.getCurrentSession().createQuery(hql);
        List<Task> list = query.list();
        return list;
    }
}

package com.service.impl;

import com.dao.TaskDao;
import com.entity.Task;
import com.service.TaskMng;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by LK on 2016/8/23.
 */
@Service
public class TaskMngImpl implements TaskMng {

    @Resource
    private TaskDao taskDao;

    @Override
    public List<Task> getAllTask() {
        List<Task> list = this.taskDao.getAllTask();
        return list;
    }
}

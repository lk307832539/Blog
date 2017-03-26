package com.action;

import com.entity.Task;
import com.entity.User;
import com.service.TaskMng;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by LK on 2016/8/21.
 */
@Controller
public class TaskAction {
    @Resource
    private TaskMng taskMng;

    @RequestMapping("getTaskList")
    public String getTaskList(HttpServletRequest request, HttpServletResponse response, ModelMap model) {

        User user = (User) request.getSession().getAttribute("user");
        if (user==null){
            return "/index";
        }
        List<Task> list = this.taskMng.getAllTask();
        return "/taskList";
    }
}

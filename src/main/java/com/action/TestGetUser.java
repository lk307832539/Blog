package com.action;

import com.entity.User;
import com.service.UserMng;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by LK on 2016/8/14.
 */
@Controller
public class TestGetUser {
    @Resource
    private UserMng userMng;

    @RequestMapping("showMessage")
    public String showMessage(HttpServletRequest request, HttpServletResponse response, ModelMap model){
        List<User> list=this.userMng.getAllUser();
        model.addAttribute("list",list);
        return "/showMessage";
    }
}

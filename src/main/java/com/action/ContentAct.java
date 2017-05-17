package com.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by LK on 2017/5/9.
 */
@Controller
@RequestMapping(value = "/content")
public class ContentAct {
    @RequestMapping(value = "/add")
    public String addNewContent(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        return "content/add";
    }

    @RequestMapping(value = "/list")
    public String contentList(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        return "content/list";
    }

}

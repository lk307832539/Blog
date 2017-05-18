package com.action;

import com.entity.Content;
import com.service.ContentMng;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by LK on 2017/5/9.
 */
@Controller
@RequestMapping(value = "/content")
public class ContentAct {
    @Resource
    private ContentMng contentMng;

    @RequestMapping(value = "/add")
    public String addNewContent(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        return "content/add";
    }

    @RequestMapping(value = "/list")
    public String contentList(HttpServletRequest request, HttpServletResponse response, ModelMap model) {
        List<Content> list = contentMng.getContentList();

        model.addAttribute("contentList", list);
        return "content/list";
    }

}

package com.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by LK on 2016/8/31.
 */
@Controller
public class IndexAct {
    @RequestMapping(value = {"/","/index.do"}, method = RequestMethod.GET)
    public String index(HttpServletRequest request, HttpServletResponse response, ModelMap model){
        return "index/index";
    }
}

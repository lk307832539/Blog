package com.action.ueditor;

import com.baidu.ueditor.ActionEnter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Ueditor
 * Created by LK on 2017/5/21.
 */
@Controller
@RequestMapping(value = "/ueditor")
public class UeditorAct {

    @RequestMapping(value = "/init")
    public void addNewContent(HttpServletRequest request, HttpServletResponse response, ModelMap model) throws IOException {
        String rootPath = "/";
        response.getWriter().write(new ActionEnter(request, rootPath).exec());
    }

}

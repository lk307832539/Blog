package com.action.ueditor;

import com.ueditor.ActionEnter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

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
    public void initUeditor(String action, HttpServletRequest request, HttpServletResponse response, ModelMap model) throws IOException {
        if ("config".equals(action)) {
            String rootPath = getClass().getResource("/").getPath();
            String configStr = new ActionEnter(request, rootPath).exec();
            response.getWriter().write(configStr);
        } else if ("uploadimage".equals(action)) {
            //不需要在spring配置文件中配置multipartResolver文件上传
            /*CommonsMultipartResolver resolver = new CommonsMultipartResolver(request.getSession().getServletContext());
            resolver.setDefaultEncoding("utf-8");
            MultipartHttpServletRequest multiRequest = resolver.resolveMultipart(request);*/

            //在spring配置文件中配置multipartResolver文件上传
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
            MultipartFile file = multiRequest.getFile("upfile");
            file.getName();
            file.getOriginalFilename();
            file.getInputStream();


        } else {

        }
    }
}

# 博客系统

写一个自己使用的博客系统，尝试将自己的笔记和学习内容进行输出


### 2017/05/26 xml中配置multipartResolver并使用MultipartHttpServletRequest来获取MultipartFile的值为空
这是在整合ueditor遇到关于SpringMVC上传的问题，在spring的配置文件中配置了 文件上传解析器multipartResolver，在程序中使用MultipartHttpServletRequest来获取MultipartFile的值为空。

1、配置xml文件中配置文件上传解析器
```
<bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
    <property name="defaultEncoding" value="utf-8"></property>
    <property name="maxUploadSize" value="10485760000"></property>
    <property name="maxInMemorySize" value="40960"></property>
</bean>
```
并在代码中将request强转为MultipartHttpServletRequest
```
MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
MultipartFile file = multiRequest.getFile("upfile");
```

2、不进行xml文件配置，直接使用CommonsMultipartResolver从request中获取上传文件
```
CommonsMultipartResolver resolver = new CommonsMultipartResolver(request.getSession().getServletContext());
resolver.setDefaultEncoding("utf-8");
MultipartHttpServletRequest multiRequest = resolver.resolveMultipart(request);
MultipartFile file = multiRequest.getFile("upfile");
```


参考[http://www.cnblogs.com/yskcoder/p/4718198.html](http://www.cnblogs.com/yskcoder/p/4718198.html)
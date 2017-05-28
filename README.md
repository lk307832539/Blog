# 博客系统

写一个自己使用的博客系统，尝试将自己的笔记和学习内容进行输出，并记录遇到的坑

### 2017/05/28 在使用MultipartFile的transferTo方法，给定的路径没有建立文件夹时会包IO异常，需要先建立相关文件夹
1、设置基本的文件信息
```java
SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
String fileName = file.getOriginalFilename();
String fileExt = fileName.substring(fileName.lastIndexOf(".")).toLowerCase();
String name = String.valueOf(System.currentTimeMillis()) + fileExt;
String filePath = request.getServletContext().getRealPath("/") + "/upload/image/" + df.format(new Date());
```
2、建立相关文件夹
```java
File folder = new File(filePath);
if (!folder.exists()) {
    folder.mkdirs();
}
```
3、将缓存中的文件保存到指定路径中
```java
File dest = new File(filePath, name);
file.transferTo(dest);
```
---

### 2017/05/26 xml中配置multipartResolver并使用MultipartHttpServletRequest来获取MultipartFile的值为空
这是在整合ueditor遇到关于SpringMVC上传的问题，在spring的配置文件中配置了 文件上传解析器multipartResolver，在程序中使用MultipartHttpServletRequest来获取MultipartFile的值为空。

1、配置xml文件中配置文件上传解析器
```java
<bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
    <property name="defaultEncoding" value="utf-8"></property>
    <property name="maxUploadSize" value="10485760000"></property>
    <property name="maxInMemorySize" value="40960"></property>
</bean>
```
并在代码中将request强转为MultipartHttpServletRequest
```java
MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
MultipartFile file = multiRequest.getFile("upfile");
```

2、不进行xml文件配置，直接使用CommonsMultipartResolver从request中获取上传文件
```java
CommonsMultipartResolver resolver = new CommonsMultipartResolver(request.getSession().getServletContext());
resolver.setDefaultEncoding("utf-8");
MultipartHttpServletRequest multiRequest = resolver.resolveMultipart(request);
MultipartFile file = multiRequest.getFile("upfile");
```


参考[http://www.cnblogs.com/yskcoder/p/4718198.html](http://www.cnblogs.com/yskcoder/p/4718198.html)

---
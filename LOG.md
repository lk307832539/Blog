# 博客系统

写一个自己使用的博客系统，尝试将自己的笔记和学习内容进行输出，并记录遇到的坑

### 2022/04/28
使用configurationprocessor中的json包，打成jar包后无法运行,不可以使用原生依赖的json jar包
```xml
<dependency>
    <groupId>org.json</groupId>
    <artifactId>json</artifactId>
    <version>20220320</version>
</dependency>
```
```java
import org.springframework.boot.configurationprocessor.json.JSONException;
//更换为
import org.json.JSONException;
```

原因参考[https://github.com/spring-projects/spring-boot/issues/24244](https://github.com/spring-projects/spring-boot/issues/24244)

### 2022/04/25
重启启动项目，将项目转为SpringBoot的，以之前的项目为模版更新。

### 2017/05/31 在保存内容执行flush()时候报no transaction is in progress错误
在对数据进行保存执行save()方法正常，但是执行flush()后报javax.persistence.TransactionRequiredException:no transaction is in progress
经过查找是因为spring的配置文件和springmvc的配置文件都对com下面的内容进行了扫描,分开后执行正常（留个待填的坑）
重新修改applicationContext.xml和dispatcher-servlet.xml,顺便将以前不清楚的部分都分开，如视图都放在dispatcher-servlet.xml中
1、applicationContext.xml
```xml
<context:component-scan base-package="com">
    <context:exclude-filter type="regex" expression="com.action.*" />
</context:component-scan>
```
2、dispatcher-servlet.xml
```
<context:component-scan base-package="com.action"/>
```
---

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

原因参考[http://www.cnblogs.com/yskcoder/p/4718198.html](http://www.cnblogs.com/yskcoder/p/4718198.html)

---

package com.yang.config;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

//web容器配置类
//public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    //加载springmvc配置类，产生springmvc容器（本质还是spring容器）
//    protected WebApplicationContext createServletApplicationContext() {
//        //初始化WebApplicationContext对象
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        //加载指定配置类
//        ctx.register(SpringMvcConfig.class);
//        return ctx;
//    }
//
//    //设置由springmvc控制器处理的请求映射路径
//    protected String[] getServletMappings() {
//        return new String[]{"/"};
//    }
//
//    //加载spring配置类
//    protected WebApplicationContext createRootApplicationContext() {
//        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
//        ctx.register(SpringConfig.class);
//
//        return ctx;
//    }
//}


//    对于上述的配置方式，Spring还提供了一种更简单的配置方式，可以不用再去创建`AnnotationConfigWebApplicationContext`对象，不用手动`register`对应的配置类，如何实现?
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}

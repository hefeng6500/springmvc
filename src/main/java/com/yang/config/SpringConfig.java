package com.yang.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration("com.yang")
//方式一：修改Spring配置类，设定扫描范围为精准范围。
//@ComponentScan({"com.yang.service", "com.yang.dao"})
//方式二:修改Spring配置类，设定扫描范围为com.itheima,排除掉controller包中的bean
@ComponentScan(value = "com.yang", excludeFilters = @ComponentScan.Filter(
        type = FilterType.ANNOTATION,
        classes = Controller.class
))
public class SpringConfig {
}

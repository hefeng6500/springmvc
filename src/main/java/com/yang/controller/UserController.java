package com.yang.controller;

import com.yang.domain.User;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/toJsonList")
    @ResponseBody
    public List<User> toJsonList(){
        System.out.println("返回json集合数据");
        User user1 = new User();
        user1.setName("传智播客");
        user1.setAge(15);

        User user2 = new User();
        user2.setName("黑马程序员");
        user2.setAge(12);

        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);

        return userList;
    }

//    响应POJO对象
    @RequestMapping("/toJsonPOJO")
    @ResponseBody
    public User toJsonPOJO(){
        System.out.println("返回json对象数据");
        User user = new User();
        user.setName("itcast");
        user.setAge(15);
        return user;
    }

    @RequestMapping("/toText")
    //注意此处该注解就不能省略，如果省略了,会把response text当前页面名称去查找，如果没有回报404错误
    @ResponseBody
    public String toText(){
        System.out.println("返回纯文本数据");
        return "response text";
    }
    @RequestMapping("/toJumpPage")
    //注意
    //1.此处不能添加@ResponseBody,如果加了该注入，会直接将page.jsp当字符串返回前端
    //2.方法需要返回String
    public String toJumpPage(){
        System.out.println("跳转页面");
        return "page.jsp";
    }

    @RequestMapping("/dataParam2")
    @ResponseBody
    public String dataParam(Date date,
                            @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1,
                            @DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss") Date date2) {
        System.out.println("参数传递 date ==> " + date);
        System.out.println("参数传递 date1(yyyy-MM-dd) ==> " + date1);
        System.out.println("参数传递 date2(yyyy/MM/dd HH:mm:ss) ==> " + date2);
        return "{'module':'data param'}";
    }

    @RequestMapping("/dataParam")
    @ResponseBody
    public String dataParam(Date date, @DateTimeFormat(pattern = "yyyy-MM-dd") Date date1) {
        System.out.println("参数传递 date ==> " + date);
        System.out.println("参数传递 date1(yyyy-MM-dd) ==> " + date1);
        return "{'module':'data param'}";
    }

    @RequestMapping("/listPojoParamForJson")
    @ResponseBody
    public String listPojoParamForJson(@RequestBody List<User> list) {
        System.out.println("list pojo(json)参数传递 list ==> " + list);
        return "{'module':'list pojo for json param'}";
    }

    //使用@RequestBody注解将外部传递的json数组数据映射到形参的集合对象中作为数据
    @RequestMapping("/listParamForJson")
    @ResponseBody
    public String listParamForJson(@RequestBody User user) {
        System.out.println("pojo(json)参数传递 user ==> " + user);
        return "{'module':'list common for json param'}";
    }

    //集合参数：同名请求参数可以使用@RequestParam注解映射到对应名称的集合对象中作为数据
    @RequestMapping("/listParam")
    @ResponseBody
    public String listParam(@RequestParam List<String> likes) {
        System.out.println("集合参数传递 likes ==> " + likes);
        return "{'module':'list param'}";
    }

    //数组参数：同名请求参数可以直接映射到对应名称的形参数组对象中
    @RequestMapping("/arrayParam")
    @ResponseBody
    public String arrayParam(String[] likes) {
        System.out.println("数组参数传递 likes ==> " + Arrays.toString(likes));
        return "{'module':'array param'}";
    }

    @RequestMapping("/pojoParam")
    @ResponseBody
    public String pojoParam(User user) {
        System.out.println("pojo参数传递 user ==> " + user);
        return "{'module':'pojo param'}";
    }

    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(@RequestParam("name") String userName, int age) {
        System.out.println("普通参数传递 name ==> " + userName);
        System.out.println("普通参数传递 age ==> " + age);

        return "{'module':'commonParam'}";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        System.out.println("user save ...");
        return "{'info':'springmvc'}";
    }
}

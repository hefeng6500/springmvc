package com.yang.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/commonParam")
    @ResponseBody
    public String commonParam(@RequestParam("name") String userName , int age){
        System.out.println("普通参数传递 name ==> "+userName);
        System.out.println("普通参数传递 age ==> "+age);

        return "{'module':'commonParam'}";
    }

    @RequestMapping("/save")
    @ResponseBody
    public String save(){
        System.out.println("user save ...");
        return "{'info':'springmvc'}";
    }
}

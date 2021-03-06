package com.atguigu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Controller
public class HelloController {
    @RequestMapping("hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }

    //查出来一些数据，在页面展示
    @RequestMapping("success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("users", Arrays.asList("zhangsan","lisi","wangwu"));
        return "success";
    }

    @RequestMapping("list")
    public String list(Map<String, List<String>> map){
        List<String> list = new ArrayList<String>();
        list.add("你好");
        list.add("世界");
        map.put("list",list);
        return "list";
    }
}

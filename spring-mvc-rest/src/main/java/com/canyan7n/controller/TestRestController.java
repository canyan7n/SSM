package com.canyan7n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :TestRestController
 * @date ：2023/4/7 22:18
 * @description：TODO
 */
@Controller
public class TestRestController {

//    @RequestMapping(value = "/user", method = RequestMethod.GET)
    @GetMapping("/user")
    public String getAllUSer() {
        System.out.println("获取所有用户信息 /user Get");
        return "success";
    }

//    @RequestMapping(value = "/user/{id}",method = RequestMethod.GET)
    @GetMapping("/user/{id}")
    public String getUserById(@PathVariable("id") Integer id){
        System.out.println("根据用户id获取用户信息 /user/"+ id + "  Get");
        return "success";
    }

//    @RequestMapping(value = "/user",method = RequestMethod.POST)
    @PostMapping("/user")
    public String insertUser(){
        System.out.println("添加用户信息 /user Post");
        return "success";
    }

//    @RequestMapping(value = "/user",method = RequestMethod.PUT)
    @PutMapping("/user")
    public String updateUser(){
        System.out.println("修改用户信息 /user PUT");
        return "success";
    }

//    @RequestMapping(value = "/user/{id}",method = RequestMethod.DELETE)
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        System.out.println("删除用户信息 /user/" + id + "   DELETE");
        return "success";
    }
}

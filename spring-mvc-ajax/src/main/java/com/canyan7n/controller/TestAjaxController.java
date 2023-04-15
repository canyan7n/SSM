package com.canyan7n.controller;

import com.canyan7n.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :TestAjaxController
 * @date ：2023/4/9 13:40
 * @description：TODO
 */
@Controller
public class TestAjaxController {
    @RequestMapping("/test/ajax")
    public void testAjax(Integer id, HttpServletResponse response, HttpServletRequest request) throws IOException {
        System.out.println(request.getMethod());
        System.out.println("id=" + id);
        response.getWriter().write("hello,ajax");
    }

    @RequestMapping("/test/requestBody/json")
    /*public void testRequestBody(@RequestBody User user,HttpServletResponse response) throws IOException {
        System.out.println(user);
        response.getWriter().write("hello,json");
    }*/
    public void testRequestBody(@RequestBody Map<String, Object> map, HttpServletResponse response) throws IOException {
        System.out.println(map);
        response.getWriter().write("hello,json");
    }

    @RequestMapping("/test/responseBody")
    @ResponseBody
    public String testResponseBody(){
        return "success";
    }

    @RequestMapping("/test/responseBody/json")
    @ResponseBody
    public List<User> testResponseBodyJson(){
        User user1 = new User(1001,"admins1","123",22,"女");
        User user2 = new User(1002,"admins2","123",22,"女");
        User user3 = new User(1003,"admins3","123",22,"女");
        List<User> list = new ArrayList<>();
        list = Arrays.asList(user1,user2,user3);
        return list;
    }
    /*public Map testResponseBodyJson(){
        User user1 = new User(1001,"admins1","123",22,"女");
        User user2 = new User(1002,"admins2","123",22,"女");
        User user3 = new User(1003,"admins3","123",22,"女");
        Map<String,Object> map = new HashMap<>();
        map.put("1001",user1);
        map.put("1002",user2);
        map.put("1003",user3);
        return map;
    }*/
    /*public User testResponseBodyJson(){
        User user = new User(1002,"admins","123",22,"女");
        return user;
    }*/
}

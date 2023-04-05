package com.canyan7n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :TestParam
 * @date ：2023/4/5 22:18
 * @description：TODO
 */
@Controller
public class TestParam {

    @RequestMapping("test/params")
    public String getParmByServletAPI(HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        System.out.println("username=" + username + ",password=" + password);
        return "success";
    }

//    @RequestMapping("/param")
//    public String getParamByFormal(String username,String password){
//        System.out.println("username=" + username);
//        System.out.println("password=" + password);
//        return "success";
//    }
    @RequestMapping("/params")
    public String getParamByFormal(@RequestParam(value = "username",required = false,defaultValue = "hello")String username, @RequestParam("password") String password){
        System.out.println("username=" + username);
        System.out.println("password=" + password);
        return "success";
    }
}

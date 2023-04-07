package com.canyan7n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :TestRequestMapping
 * @date ：2023/4/5 15:46
 * @description：TODO
 */
@Controller
public class TestRequestMapping {

    @RequestMapping("test/placehold/{username}/{id}")
    public String testplacehold(@PathVariable("username") String username, @PathVariable("id") Integer id){
        System.out.println("id=" + id + ",username=" + username);
        return "success";
    }


}

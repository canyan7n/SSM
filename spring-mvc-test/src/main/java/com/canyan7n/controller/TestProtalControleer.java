package com.canyan7n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :TestProtalControleer
 * @date ：2023/4/7 21:36
 * @description：TODO
 */
@Controller
public class TestProtalControleer {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping(value = {"/hello","/hello1"},
            method = {RequestMethod.POST,RequestMethod.GET},
//                params = {"username","!password","age=21","gender!=男"}
            headers = {"referer"}
    )
    public String hello(){
        return "success";
    }

    @RequestMapping("/**/com")
    public String testant(){
        return "complete";
    }
}

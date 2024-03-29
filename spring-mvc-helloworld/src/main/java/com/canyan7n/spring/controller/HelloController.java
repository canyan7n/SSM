package com.canyan7n.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/9 23:19
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    public String protal(){
        return "index";
    }
    @RequestMapping(value = {"/hello","/hello1"},
                    method = {RequestMethod.POST,RequestMethod.GET},
                    headers = "referer"
//                    ,params = {"user","pwd","age=21","gender!=男","!sex"}
    )
    public String hello(){
        return "success";
    }
    @GetMapping("/com")
    public String com(){
        return "complete";
    }
}


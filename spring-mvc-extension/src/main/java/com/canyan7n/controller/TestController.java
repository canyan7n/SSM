package com.canyan7n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :TestController
 * @date ：2023/4/12 22:21
 * @description：TODO
 */
@Controller
public class TestController {

    @RequestMapping("/test/hello")
    public String testHello(){
        return "success";
    }
}

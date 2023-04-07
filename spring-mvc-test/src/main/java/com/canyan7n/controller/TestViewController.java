package com.canyan7n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :TestViewController
 * @date ：2023/4/7 20:49
 * @description：TODO
 */
@Controller
public class TestViewController {

    @RequestMapping("/test/view/thymeleaf")
    public String testThymeleafView(){
        return "success";
    }

    @RequestMapping("/test/view/forword")
    public String testInternalResourceView(){
        return "forward:/test/model";
    }

    @RequestMapping("/test/view/redirect")
    public String testRedirectView(){
        return "redirect:/test/model";
    }
}

package com.canyan7n.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :TestScopeController
 * @date ：2023/4/6 19:25
 * @description：TODO
 */
@Controller
public class TestScopeController {

    @RequestMapping("/test/mav")
    public ModelAndView testMAV(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("mav","hello,mav");
        mav.setViewName("success");
        return mav;
    }
}

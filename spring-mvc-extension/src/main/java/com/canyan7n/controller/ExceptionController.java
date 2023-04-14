package com.canyan7n.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author ：macheng
 * @version V1.0
 * @ClassName :ExceptionController
 * @date ：2023/4/14 14:39
 * @description：TODO
 */
@ControllerAdvice
public class ExceptionController {
//    设置要处理的异常
    @ExceptionHandler(ArithmeticException.class)
//    形参拿到异常信息
    public ModelAndView handleException(Throwable ex){
        ModelAndView modelAndView = new ModelAndView();
//        向请求域共享数据
        modelAndView.addObject("ex",ex);
//        跳转逻辑视图
        modelAndView.setViewName("error");
        return modelAndView;
    }
}

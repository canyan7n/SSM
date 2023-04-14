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

    @ExceptionHandler(ArithmeticException.class)
    public ModelAndView handleException(Throwable ex){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("ex",ex);
        modelAndView.setViewName("error");
        return modelAndView;
    }

}

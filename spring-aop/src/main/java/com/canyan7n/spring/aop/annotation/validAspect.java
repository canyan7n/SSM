package com.canyan7n.spring.aop.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/9 0:20
 */
@Component
@Aspect
@Order(1)
public class validAspect {

//    @Before("execution(* com.canyan7n.spring.aop.annotation.CalculatorImpl.*(..))")
    @Before("com.canyan7n.spring.aop.annotation.LogAspect.pointCut()")
    public void beforeAdvancedMethod(){
        System.out.println("validAspect 前置通知");
    }
}

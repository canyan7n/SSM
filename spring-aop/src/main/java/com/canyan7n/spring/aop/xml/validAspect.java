package com.canyan7n.spring.aop.xml;

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
public class validAspect {
    public void beforeAdvancedMethod(){
        System.out.println("validAspect 前置通知");
    }
}

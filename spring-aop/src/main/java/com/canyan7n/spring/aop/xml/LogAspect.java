package com.canyan7n.spring.aop.xml;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/5 21:46
 */
@Component

public class LogAspect {

    public void pointCut(){}

    /**
     * @author: macheng
     * @param joinPoint
     * @return void
     */
    public void beforeAdvancedMethod(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println("beforeAdvancedCal 方法：" + name + ",参数：" + Arrays.toString(args));
    }

    /**
     * @author: macheng
     * @param joinPoint
     * @return void
     */
    public void afterAdvancedMethod(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("afterAdvancedMethod 方法：" + name + ",参数：" + Arrays.toString(args));
    }

    /**
     * @author: macheng
     * @param joinPoint
     * @param ex
     * @return void
     */
    public void afterThrAdvanceMethod(JoinPoint joinPoint,Throwable ex){
        String name = joinPoint.getSignature().getName();
        System.out.println("afterThrAdvanceMethod 方法：" + name + ",异常：" + ex);
    }

    /**
     * @author: macheng
     * @param joinPoint
     * @return void
     */
    public void afterRunAdvanceMethod(JoinPoint joinPoint,Object result){
        String name = joinPoint.getSignature().getName();
        System.out.println("afterRunAdvanceMethod 方法：" + name + ",结果：" + result);
    }

    /**
     * @author: macheng
     * @param joinPoint
     * @return java.lang.Object
     */
    public Object aroundAdvancedMethod(ProceedingJoinPoint joinPoint){
        Object result = null;
            try {
                System.out.println("aroundAdvancedMethod 前置通知");
                result = joinPoint.proceed();
                System.out.println("aroundAdvancedMethod 返回通知");
            } catch (Throwable e) {
                System.out.println("aroundAdvancedMethod 异常通知");
                throw new RuntimeException(e);
            }finally {
                System.out.println("aroundAdvancedMethod 后置通知");
            }
        return result;
    }
}

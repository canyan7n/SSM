package com.canyan7n.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.weaver.ast.Var;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/5 21:46
 */
@Component
@Aspect//将组件标识为切面
public class LogAspect {
    @Pointcut("execution(* com.canyan7n.spring.aop.annotation.CalculatorImpl.*(..))")
    public void pointCut(){}
    //@Before("execution(public int com.canyan7n.spring.aop.annotation.CalculatorImpl.add(int,int))")
    //@Before("execution(* com.canyan7n.spring.aop.annotation.Calculator.*(..))")
    @Before("pointCut()")
    public void beforeAdvancedMethod(JoinPoint joinPoint){
        Object[] args = joinPoint.getArgs();
        String name = joinPoint.getSignature().getName();
        System.out.println("beforeAdvancedCal 方法：" + name + "参数：" + Arrays.toString(args));
    }

    //@After("execution(* com.canyan7n.spring.aop.annotation.CalculatorImpl.*(..))")
    @After("pointCut()")
    public void afterAdvancedMethod(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("afterAdvancedMethod 方法：" + name + "参数：" + Arrays.toString(args));
    }
}

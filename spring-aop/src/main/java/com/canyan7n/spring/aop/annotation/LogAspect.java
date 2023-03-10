package com.canyan7n.spring.aop.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.weaver.ast.Var;
import org.springframework.stereotype.Component;

import javax.crypto.interfaces.PBEKey;
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
        System.out.println("afterAdvancedMethod 方法：" + name + ",参数：" + Arrays.toString(args));
    }

    @AfterThrowing("pointCut()")
    public void afterThrAdvanceMethod(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("afterThrAdvanceMethod 方法：" + name);
    }

    @AfterReturning("pointCut()")
    public void afterRunAdvanceMethod(JoinPoint joinPoint){
        String name = joinPoint.getSignature().getName();
        System.out.println("afterRunAdvanceMethod 方法：" + name);
    }

    @Around("pointCut()")
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

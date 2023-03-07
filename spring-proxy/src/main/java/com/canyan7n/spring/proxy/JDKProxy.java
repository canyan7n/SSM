package com.canyan7n.spring.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/6 22:26
 */
public class JDKProxy implements InvocationHandler{

    private Calculator calculator;
    public Object getProxy(Object target){

        this.calculator = (Calculator) target;
        System.out.println("动态代理里面：" + this);

        ClassLoader loader = JDKProxy.class.getClassLoader();
        Class[] interfaces = CalculatorImpl.class.getInterfaces();
//        InvocationHandler h = new InvocationHandler() {
//            @Override
//            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//                System.out.println("前置");
//                Object obj = method.invoke(target, args);
//                System.out.println("后置");
//                return obj;
//            }
//        };

        return Proxy.newProxyInstance(loader,interfaces,this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable{
        System.out.println("前置");
                Object obj = method.invoke(calculator, args);
                System.out.println("后置");
                return obj;
    }
}

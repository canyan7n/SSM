package com.canyan7n.spring.proxy;

import org.junit.Test;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/3 21:02
 */
public class StaticProxyTest {

    @Test
    public void testStaticProxy(){
        CalculatorStaticProxy calculatorStaticProxy = new CalculatorStaticProxy(new CalculatorImpl());
        calculatorStaticProxy.add(1,2);
    }

    @Test
    public void testJDKProxy(){
        JDKProxy proxyFactory = new JDKProxy();
        CalculatorImpl calculator = new CalculatorImpl();
        Calculator proxy = (Calculator) proxyFactory.getProxy(calculator);
        proxy.div(12,6);
    }
}

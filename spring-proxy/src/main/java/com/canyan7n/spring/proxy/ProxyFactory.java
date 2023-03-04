package com.canyan7n.spring.proxy;


import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/4 10:58
 */
public class ProxyFactory {

    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxy(){
        /**
         * ClassLoader loader:
         * Class<?>[] interfaces:
         * InvocationHandler h:
         */
        ClassLoader loader = ProxyFactory.class.getClassLoader();
        Class[] interfaces = target.getClass().getInterfaces();
        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                Object result = null;
                try {
                    System.out.println("[日志],方法：" + method.getName() + "，参数：" + Arrays.toString(args));
                    result = method.invoke(target, args);
                    System.out.println("[日志],方法：" + method.getName() + "，结果：" + result);
                    return result;
                }catch (Exception e){
                    System.out.println("[日志],方法：" + method.getName() + "，异常：" + e);
                }finally {
                    System.out.println("[日志],方法：" + method.getName() + "，执行成功");
                }
                return result;
            }
        };
        return Proxy.newProxyInstance(loader,interfaces,h);
    }
}

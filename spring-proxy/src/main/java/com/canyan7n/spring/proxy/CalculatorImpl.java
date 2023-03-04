package com.canyan7n.spring.proxy;

/**
 * @author ：macheng
 * @description：TODO
 * @date ：2023/3/3 20:57
 */
public class CalculatorImpl implements Calculator{

    @Override
    public int add(int i, int j) {
        int result = i + j;
        System.out.println("内部结果：" + result);
        return result;
    }

    @Override
    public int sub(int i, int j) {
        int result = i - j;
        System.out.println("内部结果：" + result);
        return result;
    }

    @Override
    public int mul(int i, int j) {
        int result = i * j;
        System.out.println("内部结果：" + result);
        return result;
    }

    @Override
    public int div(int i, int j) {
        int result = i / j;
        System.out.println("内部结果：" + result);
        return result;
    }
}

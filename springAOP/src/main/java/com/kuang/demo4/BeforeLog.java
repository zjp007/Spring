package com.kuang.demo4;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class BeforeLog implements MethodBeforeAdvice {
    // method：执行的方法
    // args：参数
    // target 目标对象(被代理的类)
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName() + "类" + "执行了" + method.getName() + "方法");
    }
}

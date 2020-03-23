package com.jvm.bytecode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author LiSheng
 * @date 2020/3/21 18:08
 */
public class Client {
    public static void main(String[] args) {
        RealSubject rs = new RealSubject();
        InvocationHandler ds = new DynamicSubject(rs);
        Class<? extends RealSubject> clz = rs.getClass();

        Subject subject = (Subject) Proxy.newProxyInstance(clz.getClassLoader(),
                clz.getInterfaces(),ds);

        subject.request();
        System.out.println(subject.getClass());
        System.out.println(subject.getClass().getSuperclass());
    }
}

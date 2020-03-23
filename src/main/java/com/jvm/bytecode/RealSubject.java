package com.jvm.bytecode;

/**
 * @author LiSheng
 * @date 2020/3/21 17:54
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("From real subject");
    }
}

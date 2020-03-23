package com.jvm.classloader;

/**
 * @author LiSheng
 * @date 2020/3/6 17:06
 */
public class MyTest9 {
}

class Parent{
    static int a = 3;
    static {
        System.out.println("P");
    }
}
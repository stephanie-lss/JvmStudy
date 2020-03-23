package com.jvm.classloader;

import java.util.UUID;

/**
 * @author LiSheng
 * @date 2020/3/5 21:36
 */
public class MyTest3 {
    public static void main(String[] args) {
        System.out.println(MyParent3.str);
    }
}

class MyParent3{
    public static final String str = UUID.randomUUID().toString();
    static {
        System.out.println("MyParent3 static code");
    }
}

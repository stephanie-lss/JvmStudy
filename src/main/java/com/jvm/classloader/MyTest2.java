package com.jvm.classloader;

/**
 * @author LiSheng
 * @date 2020/3/5 21:04
 */
public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(MyParent2.str);
    }
}

class MyParent2{
    public static final String str = "hello world";
    static {
        System.out.println("MyParent2 static block");
    }
}

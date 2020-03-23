package com.jvm.classloader;

/**
 * @author LiSheng
 * @date 2020/3/5 20:38
 */
public class MyTest {
    public static void main(String[] args) {
        System.out.println(MyChild1.str2);
    }
}

class MyParent1 {
    public static String str = "hello world";

    static {
        System.out.println("MyParent1 static block");
    }
}

class MyChild1 extends MyParent1 {
    public static String str2 = "welcome";

    static {
        System.out.println("MyChild1 static block");
    }
}
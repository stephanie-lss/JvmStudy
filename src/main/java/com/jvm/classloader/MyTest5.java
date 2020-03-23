package com.jvm.classloader;

import java.util.Random;

/**
 * @author LiSheng
 * @date 2020/3/5 22:08
 */
public class MyTest5 {
    public static void main(String[] args) {
        System.out.println(MyChild5.b);
    }
}

interface MyParent5 {
    public static final int a = new Random().nextInt(4);
}

interface MyChild5 extends MyParent5 {
    public static final int b = new Random().nextInt(3);
}

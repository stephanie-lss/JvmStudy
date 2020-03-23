package com.jvm.classloader;

/**
 * @author LiSheng
 * @date 2020/3/6 16:55
 */
class FinalTest{
    public static final int x = 3;
    static {
        System.out.println("FinalTest static block");
    }
}

public class MyTest8 {
    public static void main(String[] args) {
        System.out.println(FinalTest.x);
    }
}

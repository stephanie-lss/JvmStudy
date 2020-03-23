package com.jvm.gc;

/**
 * @author LiSheng
 * @date 2020/3/23 16:12
 */
public class MyTest1 {
    public static void main(String[] args) {
        int size = 1024 * 1024;
        byte[] myAllocl = new byte[2 * size];
        byte[] myAlloc2 = new byte[2 * size];
        byte[] myAlloc3 = new byte[2 * size];
        System.out.println("hello world");
    }
}

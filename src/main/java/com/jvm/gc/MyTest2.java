package com.jvm.gc;

/**
 * @author LiSheng
 * @date 2020/3/23 18:23
 */
public class MyTest2 {
    public static void main(String[] args) {
        int size = 1024 * 1024;
        byte[] myAlloc = new byte[5 * size];

        try {
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("hello world");
    }
}

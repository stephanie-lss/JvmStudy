package com.jvm.gc;

/**
 * @author LiSheng
 * @date 2020/3/24 9:24
 */
public class MyTest5 {

    public static void main(String[] args) throws InterruptedException {
        int size = 1024 * 1024;

        byte[] myAlloc1 = new byte[4 * size];
        System.out.println("111111");

        byte[] myAlloc2 = new byte[4 * size];
        System.out.println("222222");

        byte[] myAlloc3 = new byte[4 * size];
        System.out.println("333333");

        Thread.sleep(1000);
        byte[] myAlloc4 = new byte[2 * size];
        System.out.println("444444");
    }
}

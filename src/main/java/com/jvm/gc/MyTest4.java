package com.jvm.gc;

/**
 * @author LiSheng
 * @date 2020/3/23 20:30
 * -verbose:gc -Xmx200M -Xmn50M -XX:TargetSurvivorRatio=60 -XX:+PrintTenuringDistribution -XX:+PrintGCDetails -XX:+PrintGCDateStamps -XX:+UseConcMarkSweepGC -XX:+UseParNewGC -XX:MaxTenuringThreshold=3
 */
public class MyTest4 {

    public static void main(String[] args) throws InterruptedException {
        byte[] byte1 = new byte[512 * 1024];
        byte[] byte2 = new byte[512 * 1024];

        myGc();
        Thread.sleep(1000);
        System.out.println("111111");

        myGc();
        Thread.sleep(1000);
        System.out.println("222222");

        myGc();
        Thread.sleep(1000);
        System.out.println("333333");

        myGc();
        Thread.sleep(1000);
        System.out.println("444444");

        byte[] byte3 = new byte[1024 * 1024];
        byte[] byte4 = new byte[1024 * 1024];
//        byte[] byte5 = new byte[512 * 1024];

        myGc();
        Thread.sleep(1000);
        System.out.println("555555");

        myGc();
        Thread.sleep(1000);
        System.out.println("666666");

        System.out.println("hello world");
    }

    private static void myGc() {
        for (int i = 0; i < 40; i++) {
            byte[] byteArray = new byte[1024 * 1024];
        }
    }
}

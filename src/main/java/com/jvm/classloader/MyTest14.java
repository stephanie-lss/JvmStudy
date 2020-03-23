package com.jvm.classloader;

/**
 * @author LiSheng
 * @date 2020/3/6 21:02
 */
public class MyTest14 {
    public static void main(String[] args) {
        String[] strings = new String[1];
        System.out.println(strings.getClass().getClassLoader());
        MyTest14[] myTest14s = new MyTest14[2];
        System.out.println(myTest14s.getClass().getClassLoader());
        int[] ints = new int[2];
        System.out.println(ints.getClass().getClassLoader());
    }
}

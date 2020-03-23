package com.jvm.classloader;

/**
 * @author LiSheng
 * @date 2020/3/6 10:35
 */
public class MyTest7 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> clazz = Class.forName("java.lang.String");
        ClassLoader classLoader = clazz.getClassLoader();
        System.out.println(classLoader);
        Class<?> clazz2 = Class.forName("classloader.C");
        System.out.println(clazz2.getClassLoader());
    }
}

class C {

}
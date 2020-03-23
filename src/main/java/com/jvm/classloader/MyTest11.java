package com.jvm.classloader;

/**
 * @author LiSheng
 * @date 2020/3/6 17:33
 */
//调用ClassLoader类的loadClass方法加载一个类，并不是对类的主动使用，因此不会导致类的初始化
class CL{
    static {
        System.out.println("Class CL");
    }
}

public class MyTest11 {
    public static void main(String[] args) throws ClassNotFoundException {
        ClassLoader loader = ClassLoader.getSystemClassLoader();

        Class<?> clazz = loader.loadClass("classloader.CL");
        System.out.println(clazz);
        System.out.println("----------");
        clazz = Class.forName("classloader.CL");
        System.out.println(clazz);
    }
}

/*
class classloader.CL
----------
Class CL
class classloader.CL
*/
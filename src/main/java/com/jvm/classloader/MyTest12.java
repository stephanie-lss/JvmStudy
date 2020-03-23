package com.jvm.classloader;

/**
 * @author LiSheng
 * @date 2020/3/6 17:46
 */
public class MyTest12 {
    public static void main(String[] args) {
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();
        System.out.println(classLoader);

        while (null!=classLoader){
            classLoader = classLoader.getParent();
            System.out.println(classLoader);
        }
    }
}

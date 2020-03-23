package com.jvm.classloader;

/**
 * @author LiSheng
 * @date 2020/3/5 21:44
 */
public class MyTest4 {
    public static void main(String[] args) {
        MyParent4 parent4 = new MyParent4();
        MyParent4[] myParent4 = new MyParent4[1];
        MyParent4[][] myParent44 = new MyParent4[1][1];
        System.out.println(myParent4.getClass());
        System.out.println(myParent44.getClass());
        System.out.println(myParent4.getClass().getSuperclass());
        System.out.println(myParent44.getClass().getSuperclass());
    }
}

class MyParent4 {
    static {
        System.out.println("MyParent4 static block");
    }
}

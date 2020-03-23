package com.jvm.classloader;

/**
 * @author LiSheng
 * @date 2020/3/13 21:35
 */
public class MyTest25 implements Runnable {
    private Thread thread;

    public MyTest25() {
        this.thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        ClassLoader classLoader = this.thread.getContextClassLoader();
        this.thread.setContextClassLoader(classLoader);
        System.out.println("Class:" + classLoader);
        System.out.println("Parent:"+classLoader.getParent().getClass());

        ClassLoader classLoader1 = this.getClass().getClassLoader();
        System.out.println(classLoader1);
    }

    public static void main(String[] args) {
        new MyTest25();
    }
}

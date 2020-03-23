package com.jvm.bytecode;

/**
 * @author LiSheng
 * @date 2020/3/18 10:22
 */
public class MyTest2 {

    String str = "Welcome";

    private int x = 5;

    public static Integer in = 10;

    public static void main(String[] args) {
        MyTest2 myTest2 = new MyTest2();

        myTest2.setX(0);

        in = 20;
    }

    private void setX(int x) {
        this.x = x;
    }
}

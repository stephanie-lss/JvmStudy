package com.jvm.bytecode;

/**
 * @author LiSheng
 * @date 2020/3/20 21:04
 */
public class MyTest5 {
    public void test(GrandParent grandParent){
        System.out.println("grandparent");
    }

    public void test(Father father){
        System.out.println("father");
    }

    public void test(Son son){
        System.out.println("son");
    }

    public static void main(String[] args) {
        GrandParent g1 = new Father();
        GrandParent g2 = new Son();

        MyTest5 test5 = new MyTest5();
        test5.test(g1);
        test5.test(g2);
    }
}

class GrandParent {

}

class Father extends GrandParent {

}

class Son extends Father {

}

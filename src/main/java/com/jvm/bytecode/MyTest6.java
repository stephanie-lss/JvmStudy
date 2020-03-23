package com.jvm.bytecode;

/**
 * @author LiSheng
 * @date 2020/3/20 21:20
 */
public class MyTest6 {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        Fruit orange = new Orange();

        apple.test();
        orange.test();

        apple = new Orange();
        apple.test();
    }
}

class Fruit{
    public void test(){
        System.out.println("fruit");
    }
}

class Apple extends Fruit{
    @Override
    public void test() {
        System.out.println("apple");
    }
}

class Orange extends Fruit{
    @Override
    public void test() {
        System.out.println("orange");
    }
}

package com.jvm.bytecode;

import java.util.Date;

/**
 * @author LiSheng
 * @date 2020/3/20 21:50
 */
public class MyTest7 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.test("hello");
        dog.test(new Date());
    }
}

class Animal{
    public void test(String str){
        System.out.println("animal str");
    }

    public void test(Date date){
        System.out.println("animal date");
    }
}

class Dog extends Animal{
    @Override
    public void test(String str) {
        System.out.println("dog str");
    }

    @Override
    public void test(Date date) {
        System.out.println("dog date");
    }
}

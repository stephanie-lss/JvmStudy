package com.jvm.memory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author LiSheng
 * @date 2020/3/22 10:42
 * 堆内存溢出
 */
public class MyTest1 {
    public static void main(String[] args) {
        List<MyTest1> list = new ArrayList<>();
        while (true){
            list.add(new MyTest1());
            System.gc();
        }
    }
}

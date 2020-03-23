package com.jvm.classloader;

import java.sql.Driver;
import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @author LiSheng
 * @date 2020/3/13 21:50
 */
public class MyTest26 {
    public static void main(String[] args) {
        ServiceLoader<Driver> loader = ServiceLoader.load(Driver.class);
        Iterator<Driver> iterator = loader.iterator();
        while (iterator.hasNext()) {
            Driver driver = iterator.next();
            System.out.println("driver:" + driver.getClass() + ".loader:" + driver.getClass().getClassLoader());
        }
        System.out.println("当前线程上下文类加载器:" + Thread.currentThread().getContextClassLoader());
        System.out.println("ServiceLoader的类加载器:" + ServiceLoader.class.getClassLoader());

    }
}

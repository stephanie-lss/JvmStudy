package com.jvm.classloader;

import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;

/**
 * @author LiSheng
 * @date 2020/3/6 20:12
 */
public class MyTest13 {
    public static void main(String[] args) throws IOException {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();

        String resourceName = "classloader/MyTest13.class";

        Enumeration<URL> urls = loader.getResources(resourceName);
        while (urls.hasMoreElements()) {
            URL url = urls.nextElement();
            System.out.println(url);
        }

        System.out.println("-------");
        ClassLoader classLoader = MyTest13.class.getClassLoader();
        System.out.println(classLoader);
    }
}

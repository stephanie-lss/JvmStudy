package com.jvm.classloader;

/**
 * @author LiSheng
 * @date 2020/3/9 16:22
 */
public class MyCat {

    public MyCat() {
        System.out.println("MyCat is loaded by:" + this.getClass().getClassLoader());

        System.out.println("from MyCat:" + MySample.class);
    }
}

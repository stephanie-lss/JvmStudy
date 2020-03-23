package com.jvm.classloader;

/**
 * @author LiSheng
 * @date 2020/3/9 16:25
 */
public class MySample {

    public MySample() {
        System.out.println("MySample is loaded by:" + this.getClass().getClassLoader());

        new MyCat();
    }
}

package com.jvm.classloader;

import java.io.*;

/**
 * @author LiSheng
 * @date 2020/3/6 21:50
 */
public class CustomClassLoader extends ClassLoader {

    private String classLoaderName;
    private final String fileExtension = ".class";
    private String path;

    public CustomClassLoader(String classLoaderName) {
        super();//将系统类加载器当作该类加载器的父加载器
        this.classLoaderName = classLoaderName;
    }

    public CustomClassLoader(ClassLoader parent, String classLoaderName) {
        super(parent);//显式指定该类加载器的父加载器
        this.classLoaderName = classLoaderName;
    }

    @Override
    public String toString() {
        return "[" + this.classLoaderName + "]";
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        System.out.println("classLoaderName：" + classLoaderName);
        System.out.println("className：" + name);
        byte[] b = loadClassData(name);
        return defineClass(name, b, 0, b.length);
    }

    private byte[] loadClassData(String className) {
        InputStream is = null;
        byte[] data = null;
        ByteArrayOutputStream baos = null;

        className = className.replace(".", "/");


        try {
            is = new FileInputStream(new File(this.path + className + this.fileExtension));
            baos = new ByteArrayOutputStream();

            int ch = 0;
            while (-1 != (ch = is.read())) {
                baos.write(ch);
            }

            data = baos.toByteArray();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
                baos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return data;
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        CustomClassLoader customClassLoader = new CustomClassLoader("loader");
//        customClassLoader.setPath("G:\\GitHub\\jvm-study\\build\\classes");
        customClassLoader.setPath("C:\\Users\\lss\\Desktop");
        Class<?> clazz = customClassLoader.loadClass("classloader.MyTest");
        System.out.println("class:" + clazz);
        Object object = clazz.newInstance();
        System.out.println(object);
    }

    private void setPath(String path) {
        this.path = path;
    }
}

package com.jvm.classloader;

/**
 * 关于命名空间的重要说明：
 * 子加载器所加载的类能够访问到父加载器所加载的类
 * 父加载器所加载的类无法访问到子加载器所加载的类
 */
public class MyTest17_1 {
    public static void main(String[] args) throws Exception {
        CustomClassLoader loader1 = new CustomClassLoader("loader1");

        Class<?> clazz = loader1.loadClass("classloader.MySample");
        System.out.println("class:"+clazz.hashCode());

//        Object object = clazz.newInstance();
    }
}
//删除MySample.class 加载MySample类->委托给系统类加载器->classpath中找不到MySample.class文件->CustomClassLoader加载MySample类->加载成功
//                  加载MyCat类->CustomClassLoader加载->委托给系统类加载器加载->加载成功

//删除MyCat.class    加载MySample类->委托给系统类加载器->加载成功
//                  加载MyCat类->系统类加载器加载->classpath中找不到MyCat.class文件->抛出异常

//总结：主要原因在于加载MyCat类的加载器是和MySample的类加载器是一样的


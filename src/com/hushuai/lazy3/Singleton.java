package com.hushuai.lazy3;

/**
 * 静态内部类单例模式
 * 外部类加载不会立即加载静态内部类，当第一次调用getInstance方法时，会触发内部类SingletonType5的主动使用
 * 此时JVM会加载内部类，并对其静态变量进行初始化，也就是执行new Singleton();
 * 而在一个类加载器下，一个类初始化过程只会执行一次
 * 缺点：由于对象创建是有JVM初始化时创建的，无法传递参数
 * created by it_hushuai
 * 2020/11/16 21:57
 */
class Singleton {
    private Singleton(){}

    private static class SingletonType5 {
        private static final Singleton SINGLETON = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonType5.SINGLETON;
    }
}

package com.hushuai.hungry;

/**
 * 饿汉式（静态常量）
 *
 * 优点：写法简单
 *
 * 缺点：在类被主动使用的时候完成实例化，无法达到懒加载的目的，如果对象不使用，会造成内存的浪费
 *
 * 调用列的静态变量会触发类的初始化
 *
 * created by it_hushuai
 * 2020/4/27 22:32
 */
public class SingletonType1 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class Singleton{
    private final static Singleton SINGLETON = new Singleton();

    private Singleton(){
        System.out.println("创建实例");
    }

    static Singleton getInstance(){
        return SINGLETON;
    }
}

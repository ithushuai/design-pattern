package com.hushuai.singleton.lazy;

/**
 * 懒汉式
 * 只有当调用getInstance方法时，才会创建对象,并且如果对象已存在，则不再创建
 * 缺点：同步导致效率低下
 * created by it_hushuai
 * 2020/4/27 22:50
 */
public class SingletonType3{
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class Singleton{
    private static Singleton singleton;

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}

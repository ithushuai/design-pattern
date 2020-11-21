package com.hushuai.singleton.hungry2;

/**
 * 饿汉式（静态代码块）
 * created by it_hushuai
 * 2020/4/27 22:44
 */
public class SingleTonType2 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class Singleton{
    private final static Singleton SINGLETON;

    static{
        SINGLETON = new Singleton();
    }

    private Singleton(){
    }

    public static Singleton getInstance(){
        return SINGLETON;
    }
}

package com.hushuai.lazy4;

/**
 * 枚举单例
 * 枚举类的每个属性都是枚举类的一个对象，这里只定义一个INSTANCE，对象唯一
 * 最为推荐的一种单例写法
 * created by it_hushuai
 * 2020/11/16 22:32
 */
public class SingletonType6 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.INSTANCE;
        Singleton singleton2 = Singleton.INSTANCE;

        System.out.println(singleton1 == singleton2);
    }
}

enum Singleton {

    INSTANCE;

//    INSTANCE("111");
//
//    private String name;
//
//    private Singleton(String name){
//        this.name = name;
//    }
}

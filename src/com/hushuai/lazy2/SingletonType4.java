package com.hushuai.lazy2;

/**
 * 双重校验
 * 降低锁粒度，效率提高
 * created by it_hushuai
 * 2020/4/27 23:06
 */
public class SingletonType4 {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
    }
}

class Singleton{
    /**
     * 解释为什么这里要加volatile
     * volatile能够防止指令重排序
     * 创建对象分为3个步骤
     * 1.为对象分配内存
     * 2.初始化执行构造方法
     * 3.将变量指向创建的对象地址
     * java实际编译运行时，可能会发生指令重排，由1-2-3变为1-3-2执行，1是不会重排的
     * 所以可能出现对象还未创建，就已经将地址赋给变量了，此时变量引用的对象并不完整
     * 若线程1正好执行1-3，而此时线程2判断singleton变量已经有引用了，则直接将singleton的引用返回，而返回的恰恰是那个不完整的对象
     */
    private volatile static Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance(){
        if(singleton == null){
            synchronized (Singleton.class){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}

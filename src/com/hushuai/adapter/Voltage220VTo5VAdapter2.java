package com.hushuai.adapter;

/**
 * 对象适配器模式：
 * 与类适配器模式的区别是：不再继承被适配者，而是内部维护一个或多个被适配者的对象，通过对象获取被适配者的信息
 * 解决了类适配器模式只能适配一个类的问题
 * created by it_hushuai
 * 2020/12/12 21:27
 */
public class Voltage220VTo5VAdapter2 implements Voltage5V {

    private Voltage220V voltage220v;

    public Voltage220VTo5VAdapter2(Voltage220V voltage220v) {
        this.voltage220v = voltage220v;
    }

    @Override
    public int output5v() {
        int src = voltage220v.output220v();// 获得未适配前的电压
        int res = src / 44; // 对电压的适配过程
        return res;
    }
}

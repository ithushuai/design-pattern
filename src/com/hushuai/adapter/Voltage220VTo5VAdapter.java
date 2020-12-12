package com.hushuai.adapter;

/**
 * 类适配器模式：
 * 电压适配器类，需要同时继承或者实现被适配类Voltage220V以及用户要求规范Voltage5V
 * 继承被适配类，才能获得被适配类的接口方法
 * 实现Voltage5V，是为了用户能直接使用适配器
 * 缺点：需要继承被适配者，被适配者的所有方法都会在适配器中暴露
 * created by it_hushuai
 * 2020/12/12 21:27
 */
public class Voltage220VTo5VAdapter extends Voltage220V implements Voltage5V {

    @Override
    public int output5v() {
        int src = output220v();// 获得未适配前的电压
        int res = src / 44; // 对电压的适配过程
        return res;
    }
}

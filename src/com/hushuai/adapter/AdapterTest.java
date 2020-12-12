package com.hushuai.adapter;

/**
 * created by it_hushuai
 * 2020/12/12 21:39
 */
public class AdapterTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.charge(new Voltage220VTo5VAdapter());// 类适配器的使用
        phone.charge(new Voltage220VTo5VAdapter2(new Voltage220V()));// 对象适配器的使用
    }
}

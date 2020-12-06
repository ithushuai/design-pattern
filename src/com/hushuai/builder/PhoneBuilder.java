package com.hushuai.builder;

/**
 * created by it_hushuai
 * 2020/12/6 20:25
 */
public interface PhoneBuilder {

    PhoneBuilder buildScreen(String screen);// 构建屏幕
    PhoneBuilder buildCPU(String cpu);// 构建CPU
    PhoneBuilder buildMemory(int GB);// 构建内存
    Phone build();// 返回对象
}

package com.hushuai.bridge;

/**
 * created by it_hushuai
 * 2020/12/15 22:55
 */
public class Asus implements ComputerBrand {
    @Override
    public void start() {
        System.out.println("华硕笔记本开机");
    }

    @Override
    public void play() {
        System.out.println("华硕笔记本运行");
    }

    @Override
    public void shutdown() {
        System.out.println("华硕笔记本关机");
    }
}

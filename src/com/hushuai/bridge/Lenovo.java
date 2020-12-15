package com.hushuai.bridge;

/**
 * created by it_hushuai
 * 2020/12/15 22:54
 */
public class Lenovo implements ComputerBrand {
    @Override
    public void start() {
        System.out.println("联想笔记本开机");
    }

    @Override
    public void play() {
        System.out.println("联想笔记本运行");
    }

    @Override
    public void shutdown() {
        System.out.println("联想笔记本关机");
    }
}

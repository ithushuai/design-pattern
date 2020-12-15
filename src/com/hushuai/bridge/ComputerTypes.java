package com.hushuai.bridge;

/**
 * 笔记本类型，内部聚合Brand，即桥接
 * created by it_hushuai
 * 2020/12/15 22:41
 */
public abstract class ComputerTypes{
    ComputerBrand brand;

    public ComputerTypes(ComputerBrand brand) {
        this.brand = brand;
    }

    protected void start() {
        this.brand.start();
    }

    protected void play() {
        this.brand.play();
    }

    protected void shutdown() {
        this.brand.shutdown();
    }
}

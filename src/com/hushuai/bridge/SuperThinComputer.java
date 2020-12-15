package com.hushuai.bridge;

/**
 * 超薄本
 * created by it_hushuai
 * 2020/12/15 22:39
 */
public class SuperThinComputer extends ComputerTypes{
    public SuperThinComputer(ComputerBrand brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.print("超薄");
        super.start();
    }

    @Override
    public void play() {
        System.out.print("超薄");
        super.brand.play();
    }

    @Override
    public void shutdown() {
        System.out.print("超薄");
        super.brand.shutdown();
    }
}

package com.hushuai.bridge;

/**
 * created by it_hushuai
 * 2020/12/15 22:59
 */
public class BusinessComputer extends ComputerTypes {
    public BusinessComputer(ComputerBrand brand) {
        super(brand);
    }

    @Override
    protected void start() {
        System.out.print("商务");
        super.start();
    }

    @Override
    protected void play() {
        System.out.print("商务");
        super.play();
    }

    @Override
    protected void shutdown() {
        System.out.print("商务");
        super.shutdown();
    }
}

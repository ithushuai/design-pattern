package com.hushuai.bridge;

/**
 * created by it_hushuai
 * 2020/12/15 23:00
 */
public class GameComputer extends ComputerTypes {
    public GameComputer(ComputerBrand brand) {
        super(brand);
    }

    @Override
    protected void start() {
        System.out.print("游戏");
        super.start();
    }

    @Override
    protected void play() {
        System.out.print("游戏");
        super.play();
    }

    @Override
    protected void shutdown() {
        System.out.print("游戏");
        super.shutdown();
    }
}

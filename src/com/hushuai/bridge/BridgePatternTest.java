package com.hushuai.bridge;

/**
 * 桥接模式，将笔记本的类型和品牌两个维度桥接起来，可以自由组合，无需定义其组合类型，减少类型定义
 * created by it_hushuai
 * 2020/12/15 23:00
 */
public class BridgePatternTest {
    public static void main(String[] args) {
        SuperThinComputer superThinComputer = new SuperThinComputer(new Lenovo());// 超薄本
        superThinComputer.start();
        superThinComputer.play();
        superThinComputer.shutdown();
    }
}

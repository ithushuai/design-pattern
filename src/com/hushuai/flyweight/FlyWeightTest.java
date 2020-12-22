package com.hushuai.flyweight;

/**
 * created by it_hushuai
 * 2020/12/22 22:35
 */
public class FlyWeightTest {
    public static void main(String[] args) {
        ChessmanFactory factory = new ChessmanFactory();
        // 玩家1拿一颗黑子
        Chessman black = factory.getChessman("black");
        // 玩家2拿一颗白子
        Chessman white = factory.getChessman("white");
        // 玩家1再拿一颗黑子
        Chessman black2 = factory.getChessman("black");
        // 玩家2再拿一颗白子
        Chessman white2 = factory.getChessman("white");
        // 判断两次获取的黑子和两次获取的白子是不是一样的
        System.out.println(black == black2);
        System.out.println(white == white2);
    }
}

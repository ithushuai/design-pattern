package com.hushuai.flyweight;

import java.util.HashMap;

/**
 * 五子棋棋子池，池中包含白色棋子和黑色棋子
 * 通过get方法可以获取一个棋子
 * created by it_hushuai
 * 2020/12/22 22:30
 */
public class ChessmanFactory {
    // 包含一个池（map）
    private HashMap<String, Chessman> pool = new HashMap<>();
    // 获取棋子的方法
    public Chessman getChessman(String color) {
        Chessman chessman = pool.get(color);
        if (null == chessman) { // 如果池内没有想要的棋子，则创建，并放入池内
            chessman = new Chessman(color);
            pool.put(color, chessman);
        }
        return chessman;
    }
}

/**
 * 棋子类
 */
class Chessman {
    private String color;

    public Chessman(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

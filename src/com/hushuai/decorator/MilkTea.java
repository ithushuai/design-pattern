package com.hushuai.decorator;

/**
 * 奶茶类，是饮料的一种
 * created by it_hushuai
 * 2020/12/18 21:05
 */
public class MilkTea implements Drink {

    @Override
    public void description() {
        System.out.println("普通奶茶");
    }

    @Override
    public int cost() {
        return 15; // 普通奶茶15元
    }
}

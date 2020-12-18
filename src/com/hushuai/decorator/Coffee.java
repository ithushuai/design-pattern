package com.hushuai.decorator;

/**
 * created by it_hushuai
 * 2020/12/18 21:08
 */
public class Coffee implements Drink{
    @Override
    public void description() {
        System.out.println("普通咖啡");
    }

    @Override
    public int cost() {
        return 20; // 普通咖啡20元
    }
}

package com.hushuai.decorator;

/**
 * 饮料的加冰装饰器
 * created by it_hushuai
 * 2020/12/18 21:21
 */
public class IceDecorator extends DrinkDecorator {
    public IceDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void description() {
        super.description();
        System.out.println("加一份冰块");
    }

    @Override
    public int cost() {
        return super.cost() + 1; // 一份冰块多1元
    }
}

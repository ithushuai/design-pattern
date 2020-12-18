package com.hushuai.decorator;

/**
 * 饮料的加糖装饰器
 * created by it_hushuai
 * 2020/12/18 21:19
 */
public class SugarDecorator extends DrinkDecorator {
    public SugarDecorator(Drink drink) {
        super(drink);
    }

    @Override
    public void description() {
        super.description();
        System.out.println("加一份糖");
    }

    @Override
    public int cost() {
        return super.cost() + 2; // 加一份糖，多两元
    }
}

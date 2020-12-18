package com.hushuai.decorator;

/**
 * 装饰器类，实现或集成被装饰类，内部又维护了一个被装饰类，装饰器类的子类需要重写现有的方法，予以相应增强
 * created by it_hushuai
 * 2020/12/18 21:15
 */
public abstract class DrinkDecorator implements Drink {
    protected Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public void description() {
        drink.description();
    }

    @Override
    public int cost() {
        return drink.cost();
    }
}

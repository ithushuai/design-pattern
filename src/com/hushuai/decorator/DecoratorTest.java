package com.hushuai.decorator;

/**
 * created by it_hushuai
 * 2020/12/18 21:23
 */
public class DecoratorTest {
    public static void main(String[] args) {
        // 一杯什么都没加的普通奶茶
        Drink milkTea = new MilkTea();
        // 输出信息
        milkTea.description();
        System.out.println("裸奶茶售价：" + milkTea.cost() + "元");
        // 给奶茶加一份糖，用糖装饰奶茶
        DrinkDecorator milkTeaWithSugar = new SugarDecorator(milkTea);
        milkTeaWithSugar.description();
        System.out.println("奶茶加一份糖售价：" + milkTeaWithSugar.cost() + "元");

        System.out.println("=======================================");
        Drink coffee = new Coffee();
        coffee.description();
        System.out.println("裸咖啡售价：" + coffee.cost() + "元");
        // 给咖啡加冰块，用冰块修饰咖啡
        DrinkDecorator coffeeWithIce = new IceDecorator(coffee);
        coffeeWithIce.description();
        System.out.println("咖啡加一份冰块售价：" + coffeeWithIce.cost() + "元");
    }
}

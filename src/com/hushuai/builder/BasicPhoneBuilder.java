package com.hushuai.builder;

/**
 * 基本建造者，也可以有其他建造者，区别在于对于创建对象的业务逻辑不通
 * created by it_hushuai
 * 2020/12/6 20:27
 */
public class BasicPhoneBuilder implements PhoneBuilder {
    Phone phone = new Phone();// 创建手机对象，此时的对象是一个最简单的没有任何配置的对象

    @Override
    public PhoneBuilder buildScreen(String screen) {
        phone.screen = screen;
        return this;
    }

    @Override
    public PhoneBuilder buildCPU(String CPU) {
        phone.CPU = CPU;
        return this;
    }

    @Override
    public PhoneBuilder buildMemory(int GB) {
        phone.memory = GB;
        return this;
    }

    @Override
    public Phone build() {
        return this.phone;
    }
}

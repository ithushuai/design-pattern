package com.hushuai.factory.abs;

/**
 * 工厂生成器，通过关键词（品牌）来选择工厂
 * created by it_hushuai
 * 2020/11/21 23:08
 */
public class FactoryProducer {
    public static Abstractory getFactory(String brand) {
        if ("xiaomi".equalsIgnoreCase(brand)) {
            return new XiaomiFactory();
        } else if ("apple".equalsIgnoreCase(brand)) {
            return new AppleFactory();
        } else {
            return null;
        }
    }
}

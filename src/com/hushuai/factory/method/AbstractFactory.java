package com.hushuai.factory.method;

import com.hushuai.factory.Phone;

/**
 * 工厂方法模式：
 * 定义一个手机工厂接口，该接口定义一个工厂应该做什么（生产手机）
 * 需要生产产品时，先实例化专门生产该产品的工厂，再由工厂生产专门的手机
 * 各自产品的供应商，都有各自的工厂
 * created by it_hushuai
 * 2020/11/21 22:59
 */
public interface AbstractFactory {
    Phone makePhone();
}

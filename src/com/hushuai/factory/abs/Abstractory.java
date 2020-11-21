package com.hushuai.factory.abs;

import com.hushuai.factory.Phone;

/**
 * 抽象工厂模式
 * 提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
 * created by it_hushuai
 * 2020/11/21 23:03
 */
public interface Abstractory {

    Phone makePhone();

    PC makePC();
}

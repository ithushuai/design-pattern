package com.hushuai.factory.simple;

import com.hushuai.factory.Iphone;
import com.hushuai.factory.MiPhone;
import com.hushuai.factory.Phone;

/**
 *  * 简单工厂模式：
 *  * 一个强大的工厂，啥都能干，什么类型的产品都能生产
 *  * 缺点：功能不专一，不利于维护
 * created by it_hushuai
 * 2020/11/21 22:56
 */
public class PhoneFactory {
    public Phone makePhone(String name) {
        if ("MiPhone".equalsIgnoreCase(name)) {
            return new MiPhone();
        } else if ("iphone".equalsIgnoreCase(name)) {
            return new Iphone();
        } else {
            return null;
        }
    }
}

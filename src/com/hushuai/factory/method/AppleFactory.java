package com.hushuai.factory.method;

import com.hushuai.factory.Iphone;
import com.hushuai.factory.Phone;

/**
 * created by it_hushuai
 * 2020/11/21 23:01
 */
public class AppleFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new Iphone();
    }
}

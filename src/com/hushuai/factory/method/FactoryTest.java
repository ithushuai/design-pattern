package com.hushuai.factory.method;

import com.hushuai.factory.Phone;

/**
 * created by it_hushuai
 * 2020/11/18 22:34
 */
public class FactoryTest {
    public static void main(String[] args) {
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        Phone miPhone = xiaomiFactory.makePhone();
        miPhone.make();

        AppleFactory appleFactory = new AppleFactory();
        Phone iPhone = appleFactory.makePhone();
        iPhone.make();
    }
}

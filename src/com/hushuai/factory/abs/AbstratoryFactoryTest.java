package com.hushuai.factory.abs;

import com.hushuai.factory.Phone;

/**
 * created by it_hushuai
 * 2020/11/21 23:12
 */
public class AbstratoryFactoryTest {
    public static void main(String[] args) {
        Abstractory xiaomiFactory = FactoryProducer.getFactory("xiaomi");
        if (xiaomiFactory != null) {
            PC pc = xiaomiFactory.makePC();
            pc.make();
            Phone phone = xiaomiFactory.makePhone();
            phone.make();
        }
    }
}

package com.hushuai.factory.simple;

import com.hushuai.factory.Phone;

/**
 * created by it_hushuai
 * 2020/11/18 22:04
 */
public class SimpleFactoryTest {
    public static void main(String[] args) {
        Phone miPhone = new PhoneFactory().makePhone("MiPhone");
        miPhone.make();
    }
}

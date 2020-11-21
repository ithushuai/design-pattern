package com.hushuai.factory;

/**
 * created by it_hushuai
 * 2020/11/21 22:55
 */
public class MiPhone implements Phone {
    @Override
    public void make() {
        System.out.println("制造小米手机");
    }
}

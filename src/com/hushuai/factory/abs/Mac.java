package com.hushuai.factory.abs;

/**
 * created by it_hushuai
 * 2020/11/21 23:05
 */
public class Mac implements PC {
    @Override
    public void make() {
        System.out.println("制造苹果Mac");
    }
}

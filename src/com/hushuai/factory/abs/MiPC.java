package com.hushuai.factory.abs;

/**
 * created by it_hushuai
 * 2020/11/21 23:04
 */
public class MiPC implements PC{

    @Override
    public void make() {
        System.out.println("制造小米笔记本");
    }
}

package com.hushuai.facade;

/**
 * created by it_hushuai
 * 2020/12/20 14:10
 */
public class FacadeTest {
    public static void main(String[] args) {
        BankFacade facade = new BankFacade();
        facade.cash();
        facade.credit();
        facade.fund();
    }
}

package com.hushuai.chain.accept;

import com.hushuai.chain.BankAccept;
import com.hushuai.chain.DrawingRequest;

/**
 * ATM机
 * created by it_hushuai
 * 2020/12/27 0:06
 */
public class ATMAccept extends BankAccept {

    public ATMAccept(String name) {
        super(name);
    }

    @Override
    public void draw(DrawingRequest request) {
        if (request.getNum() < 10000) {
            System.out.println(this.name + "受理了" + request.getName() + "的取款业务");
        } else {
            bankAccept.draw(request);
        }
    }
}

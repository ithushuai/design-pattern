package com.hushuai.chain.accept;

import com.hushuai.chain.BankAccept;
import com.hushuai.chain.DrawingRequest;

/**
 * VIP窗口
 * created by it_hushuai
 * 2020/12/27 0:17
 */
public class VIPAccept extends BankAccept {
    public VIPAccept(String name) {
        super(name);
    }

    @Override
    public void draw(DrawingRequest request) {
        if (request.getNum() > 100000) {
            System.out.println(this.name + "受理了" + request.getName() + "的取款业务");
        } else {
            bankAccept.draw(request);
        }
    }
}

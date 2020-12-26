package com.hushuai.chain.accept;

import com.hushuai.chain.BankAccept;
import com.hushuai.chain.DrawingRequest;

/**
 * 普通现金业务窗口
 * created by it_hushuai
 * 2020/12/27 0:15
 */
public class CommonAccept extends BankAccept {
    public CommonAccept(String name) {
        super(name);
    }

    @Override
    public void draw(DrawingRequest request) {
        if (request.getNum() <= 100000 && request.getNum() > 10000) {
            System.out.println(this.name + "受理了" + request.getName() + "的取款业务");
        } else {
            bankAccept.draw(request);
        }
    }
}

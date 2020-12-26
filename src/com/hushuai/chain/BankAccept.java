package com.hushuai.chain;

/**
 * 模拟一个银行取款的责任链
 * 小额取款在ATM机上办理
 * 中等额度取款需要在现金业务窗口办理
 * 大额度取款则只能在VIP窗口办理
 * created by it_hushuai
 * 2020/12/26 23:47
 */
public abstract class BankAccept {
    public String name; // 当前受理者：ATM，现金业务窗口，VIP窗口

    public BankAccept(String name) {
        this.name = name;
    }

    // 责任链中的下一个元素
    public BankAccept bankAccept;

    public void setNextAccept(BankAccept bankAccept) {
        this.bankAccept = bankAccept;
    }

    public abstract void draw(DrawingRequest request);
}

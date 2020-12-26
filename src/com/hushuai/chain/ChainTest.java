package com.hushuai.chain;

import com.hushuai.chain.accept.ATMAccept;
import com.hushuai.chain.accept.CommonAccept;
import com.hushuai.chain.accept.VIPAccept;

/**
 * created by it_hushuai
 * 2020/12/27 0:04
 */
public class ChainTest {
    public static void main(String[] args) {
        // 创建一个取钱请求
        DrawingRequest request = new DrawingRequest("小明", 30000);
        BankAccept chainAccept = getChainAccept();
        chainAccept.draw(request); // 处理请求
    }

    /**
     * 构造接收者责任链，返回责任链的第一个
     * @return
     */
    public static BankAccept getChainAccept() {
        ATMAccept atmAccept = new ATMAccept("ATM机");
        CommonAccept commonAccept = new CommonAccept("普通现金业务窗口");
        VIPAccept vipAccept = new VIPAccept("VIP窗口");
        atmAccept.setNextAccept(commonAccept);
        commonAccept.setNextAccept(vipAccept);
        return atmAccept;
    }
}

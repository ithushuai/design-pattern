package com.hushuai.chain;

/**
 * created by it_hushuai
 * 2020/12/27 0:00
 */
public class DrawingRequest {
    private String name; // 请求者名称
    public int num; // 需要取的金额

    public DrawingRequest(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}

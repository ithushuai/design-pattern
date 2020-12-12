package com.hushuai.adapter;

/**
 * Phone，使用5v电压充电，phone就相当于使用者，用户
 * created by it_hushuai
 * 2020/12/12 21:22
 */
public class Phone {

    /**
     * 手机充电，需要能输送5v电压电源的充电器
     * @param v
     */
    public void charge(Voltage5V v) {
        if (v.output5v() == 5) {
            System.out.println("电压5v，手机充电");
        } else {
            System.out.println("电压不是5v， 手机不能充电");
        }
    }
}

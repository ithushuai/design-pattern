package com.hushuai.factory.method;

import com.hushuai.factory.MiPhone;
import com.hushuai.factory.Phone;

/**
 * created by it_hushuai
 * 2020/11/21 23:00
 */
public class XiaomiFactory implements AbstractFactory {
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }
}

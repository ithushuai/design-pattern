package com.hushuai.factory.abs;

import com.hushuai.factory.Iphone;
import com.hushuai.factory.Phone;

/**
 * created by it_hushuai
 * 2020/11/21 23:07
 */
public class AppleFactory implements Abstractory {
    @Override
    public Phone makePhone() {
        return new Iphone();
    }

    @Override
    public PC makePC() {
        return new Mac();
    }
}

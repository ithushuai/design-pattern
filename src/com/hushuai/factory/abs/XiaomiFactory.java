package com.hushuai.factory.abs;

import com.hushuai.factory.MiPhone;
import com.hushuai.factory.Phone;

/**
 * created by it_hushuai
 * 2020/11/21 23:06
 */
public class XiaomiFactory implements Abstractory {
    @Override
    public Phone makePhone() {
        return new MiPhone();
    }

    @Override
    public PC makePC() {
        return new MiPC();
    }
}

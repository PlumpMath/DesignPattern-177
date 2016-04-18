package com.sfy.factory.abstractfactory;

/**
 * @Description: SmsSenderFactory.java
 * @Date: 2016/04/18
 * @Author: sunfayun
 * @Version: 1.0
 */
public class SmsSenderFactory implements Provider {

    @Override
    public Sender producer() {
        return new SmsSender();
    }

}
